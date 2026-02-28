package net.robotsnh.minecraft_mods.bed_bomb_blocker.mixin;

import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.InteractionResult;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mixin(BedBlock.class)
public class BedBlockMixin {
	public static Logger LOGGER = LoggerFactory.getLogger("bed-bomb-blocker");

	@Inject(at = @At("HEAD"),
			method = "onUse",
			cancellable = true)
	private void init(CallbackInfoReturnable<InteractionResult> cir) {
		LOGGER.info("Bed was interacted with!");
	}
}