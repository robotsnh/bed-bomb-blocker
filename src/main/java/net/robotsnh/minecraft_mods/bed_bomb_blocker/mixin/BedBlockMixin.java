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

	/*
	Our mod's main logic class. It intercepts a block interaction event to stop
	the interaction if the block is a bed and the bed is in the Nether or End.
	*/

	public static Logger LOGGER = LoggerFactory.getLogger("bed-bomb-blocker");

	@Inject(at = @At("HEAD"),
			method = "onUse",
			cancellable = true)
	private void init(CallbackInfoReturnable<InteractionResult> cir) {

		/*
		Our main code injection function. It intercepts a block interaction
		function call, storing it in the local variable `cir`.
		*/

		LOGGER.info("Bed was interacted with!");
	}
}