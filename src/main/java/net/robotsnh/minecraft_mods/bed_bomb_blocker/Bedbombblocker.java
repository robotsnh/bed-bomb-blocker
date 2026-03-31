/*
	A Minecraft mod that prevents beds from exploding in the Nether and the End.
    Copyright (C) <2026> <@robotsnh>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

*/

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