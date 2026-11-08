// SPDX-License-Identifier: AGPL-3.0-or-later
// Copyright (c) robotsnh and project contributors

package net.robotsnh.minecraft_mods.bed_bomb_blocker.mixin;

// We are using Mojang mappings here instead of community mappings, so class
// names in imports differ from the community mappings.
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.attribute.BedRule;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(BedBlock.class)
public class BedBlockMixin {
        @Unique
       	private static final Logger LOGGER = LoggerFactory.getLogger("bed-bomb-blocker");
        
        @Inject(at = @At("HEAD"), method = "useWithoutItem", cancellable = true)
        private void onBedInteraction(
                BlockState state,
                Level world,
                BlockPos position,
                Player player,
                BlockHitResult hit,
                CallbackInfoReturnable<InteractionResult> cir)
        {
                // This is to ensure the log message isn't printed twice
                if (!world.isClientSide()) {
                        LOGGER.info("Player {} interacted with a bed", player.getName().getString());
                }

                // Now, we check whether beds explode in the player's dimension
                BedRule bedRule = (BedRule) world.environmentAttributes().getValue(EnvironmentAttributes.BED_RULE, position);
                if (bedRule.explodes()) {
                        // Once again, we have to stop the message from being logged twice
                        if (!world.isClientSide()) {
                                // If beds do explode, we need to cancel the explosion and log a message
                                cir.setReturnValue(InteractionResult.SUCCESS);
                                LOGGER.info("Bed explosion by player {} cancelled!", player.getName().getString());
                        }
                }
        }
}
