// SPDX-License-Identifier: AGPL-3.0-or-later
// Copyright (c) robotsnh and project contributors

package net.robotsnh.minecraft_mods.bed_bomb_blocker;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bedbombblocker implements ModInitializer {

    /*
    The entrypoint class of our mod, which aims to stop beds from exploding in 
    the Nether/End via code injection into the block interaction method/s.
    */

	public static final String MOD_ID = "bed-bomb-blocker";

	// The logger is used to write text to the console and the log file.
	private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        /*
        An initialization method for our mod. This should print a simple logger
        message.
        */

	}
}