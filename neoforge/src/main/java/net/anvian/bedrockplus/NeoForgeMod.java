package net.anvian.bedrockplus;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoForgeMod {
    public NeoForgeMod(IEventBus eventBus) {
        Constants.LOG.info("Hello from " + Constants.MOD_ID + " (Neoforge)");
        CommonMod.init();

    }
}