// SPDX-License-Identifier: AGPL-3.0-or-later
// Copyright (c) robotsnh and project contributors

package net.robotsnh.minecraft_mods.bed_bomb_blocker;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The mod initialization class for the Bed Bomb Blocker mod.
 */
public class BedBombBlocker implements ModInitializer {
	/**
	 * The constructor for the mod initializer.
	 */
	public BedBombBlocker () {
		// Doesn't do anything, just here to stop Javadoc from yelling
		// at us.
	}

	/**
	 * The ID of the mod when using the logger.
	 */
	public static final String MOD_ID = "bed-bomb-blocker";

	/**
	 * The logger is used to write text to the console in a formatted way.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/**
	 * The initializer of the Bed Bomb Blocker mod.
	 * <p>
	 * This function runs when the Bed Bomb Blocker mod is started up.
	 * It logs a message to the command line saying "Initialized the
	 * Bed Bomb Blocker mod!"
	 */
	@Override
	public void onInitialize() {
		LOGGER.info("Initialized the Bed Bomb Blocker mod!");
	}
}
