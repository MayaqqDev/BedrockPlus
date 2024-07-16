package net.anvian.bedrockplus.core.registry;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class ModBlockRegistry {
    public static void registerBlocks() {
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "impure_bedrock"), ModBlocks.IMPURE_BEDROCK);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "impure_bedrock_block"), ModBlocks.IMPURE_BEDROCK_BLOCK);
    }
}
