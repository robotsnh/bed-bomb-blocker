<!-- SPDX-License-Identifier: AGPL-3.0-or-later -->
<!-- Copyright (c) robotsnh and project contributors -->

# Bed Bomb Blocker
![License: AGPL](https://img.shields.io/badge/license-AGPL-brightgreen)
![Language: Java](https://img.shields.io/badge/language-Java-f89820)
[![OpenSSF Best Practices](https://www.bestpractices.dev/projects/11926/badge)](https://www.bestpractices.dev/projects/11926)

Bed Bomb Blocker is a Fabric server-side mod designed to stop beds from exploding when interacted with in restricted dimensions in the popular game Minecraft.

## Features
- Prevents bed explosions - the mod stops beds from exploding upon interaction in restricted dimensions
- Preserves the bed - the bed remains intact upon interaction, even in restricted dimensions
- No client setup needed - the mod uses completely modless status bar feedback on interaction
- Client- and server-friendly - can also run on the client for testing purposes
- Dynamic dimension support - works with custom modded restricted dimensions where beds explode

## Installation
This mod is server-side, though also works in singleplayer if installed on the client.
Installation steps:
1. Install Fabric Loader (at least `0.18.4`, but comes pre-installed on Fabric servers) on Minecraft 1.21.11 (requires Java 21+).
2. Move the mod's JAR file into your server's `mods/` folder.
3. Start or restart your server. No config needed.
(Note: these steps also work for client-side installation.)

## Building and Development

(Note: you will need a valid Java 21 or newer JVM and `git` installed, as well as a valid shell.)
```bash
git clone https://github.com/robotsnh/bed-bomb-blocker.git
cd bed-bomb-blocker
./gradlew build
```
The compiled JAR file can be then found in `build/libs`.
(Note: you can also run `./gradlew runClient` to start a test client, `./gradlew runServer` to start a test server, or `./gradlew javadoc` to generate documentation.)

## License

This project is licensed under the terms of the GNU Affero General Public License v3.0 or later. See the [LICENSE](LICENSE) file for details.
