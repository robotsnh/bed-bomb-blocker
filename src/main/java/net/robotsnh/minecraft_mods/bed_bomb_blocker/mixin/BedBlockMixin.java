package net.robotsnh.minecraft_mods.bed_bomb_blocker.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.block.BedBlock;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mixin(BedBlock.class)
public class BedBlockMixin {
	public static Logger LOGGER = LoggerFactory.getLogger("bed-bomb-blocker");

	@Inject(at = @At("HEAD"), method = "onUse", CallbackInfoReturnable<ActionResult> cir)
	private void init(CallbackInfo info) {
		LOGGER.info("Bed was interacted with!");
	}
}