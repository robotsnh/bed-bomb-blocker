// SPDX-License-Identifier: AGPL-3.0-or-later
// Copyright (c) robotsnh and project contributors

package net.robotsnh.minecraft_mods.bed_bomb_blocker;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bedbombblocker implements ModInitializer {
	public static final String MOD_ID = "bed-bomb-blocker";

	// The logger is used to write text to the console and the log file.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialized the Bed Bomb Blocker mod!");
	}
}