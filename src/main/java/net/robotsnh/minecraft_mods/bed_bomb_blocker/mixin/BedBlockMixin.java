// SPDX-License-Identifier: AGPL-3.0-or-later
// Copyright (c) robotsnh and project contributors

package net.robotsnh.minecraft_mods.bed_bomb_blocker.mixin;

// We are using Mojang mappings here instead of community mappings, so class
// names in imports differ from the community mappings.
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.attribute.BedRule;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

import net.robotsnh.minecraft_mods.bed_bomb_blocker.BedBombBlocker;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BedBlock.class)
class BedBlockMixin { 
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
                        BedBombBlocker.LOGGER.info("Player {} interacted with a bed", player.getName().getString());
                }

                // Now, we check whether beds explode in the player's dimension
                BedRule bedRule = (BedRule) world.environmentAttributes().getValue(EnvironmentAttributes.BED_RULE, position);
                if (bedRule.explodes()) {
                        // Once again, we have to stop the message from being logged twice
                        if (!world.isClientSide()) {
                                // If beds do explode, we need to cancel the explosion and log a message
                                cir.setReturnValue(InteractionResult.SUCCESS);
                                BedBombBlocker.LOGGER.info("Bed explosion by player {} cancelled!", player.getName().getString());
                                // We also should display a player hotbar message
                                player.displayClientMessage(Component.literal("Beds can't explode in this world!"), true);
                        }
                }
        }
}
