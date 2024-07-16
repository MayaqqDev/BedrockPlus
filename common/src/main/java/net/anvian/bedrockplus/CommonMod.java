package net.anvian.bedrockplus;

import net.anvian.bedrockplus.platform.Services;

public class CommonMod {
    public static void init() {
        if (Services.PLATFORM.isModLoaded(Constants.MOD_ID)) {
            Constants.LOG.info("Hello from " + Constants.MOD_ID);
        }
    }
}