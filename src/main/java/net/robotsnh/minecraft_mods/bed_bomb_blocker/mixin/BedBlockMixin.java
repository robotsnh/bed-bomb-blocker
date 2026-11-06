// SPDX-License-Identifier: AGPL-3.0-or-later
// Copyright (c) robotsnh and project contributors

package net.robotsnh.minecraft_mods.bed_bomb_blocker.mixin;

// We are using Mojang mappings here instead of community mappings, so class
// names in imports differ from the community mappings.
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BedBlock.class)
public class BedBlockMixin {
        @Inject(at = @At("HEAD"), method = "useWithoutItem")
        private void onBedInteraction(
                BlockState state,
                Level world,
                BlockPos position,
                Player player,
                BlockHitResult hit,
                CallbackInfoReturnable<InteractionResult> cir)
        {

        }
}
