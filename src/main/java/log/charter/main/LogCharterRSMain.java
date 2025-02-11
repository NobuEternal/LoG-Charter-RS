package log.charter.main;

import java.io.IOException;

import log.charter.data.config.Config;
import log.charter.data.config.Localization.Label;
import log.charter.gui.CharterFrame;
import log.charter.io.Logger;

public class LogCharterRSMain {
	public static final String VERSION = "0.11.2";
	public static final String VERSION_DATE = "2023.08.14";
	public static final String TITLE = "LoG Charter RS " + VERSION;

	public static void main(final String[] args) throws InterruptedException, IOException {
		Config.init();

		String pathToOpen = Config.lastPath;
		if (args.length > 0) {
			pathToOpen = args[0];
		}

		if (pathToOpen != null && !pathToOpen.isEmpty()) {
			new CharterFrame(LogCharterRSMain.TITLE + " : Loading project...", pathToOpen);
		} else {
			new CharterFrame(LogCharterRSMain.TITLE + " : " + Label.NO_PROJECT.label());
		}

		new Thread(() -> {
			try {
				while (true) {
					Config.save();
					Thread.sleep(1000);
				}
			} catch (final InterruptedException e) {
				Logger.error("Error in config save thread", e);
			}
		}).start();

		Logger.info("Program started");
	}
}
