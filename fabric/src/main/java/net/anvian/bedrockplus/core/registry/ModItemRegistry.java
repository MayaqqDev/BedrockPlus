package net.anvian.bedrockplus.core.registry;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class ModItemRegistry {
    public static void registerItems() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impure_bedrock"), ModItems.IMPURE_BEDROCK);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impure_bedrock_block"), ModItems.IMPURE_BEDROCK_BLOCK);

        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impure_bedrock_ingot"), ModItems.IMPURE_BEDROCK_INGOT);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impure_bedrock_scrap"), ModItems.IMPURE_BEDROCK_SCRAP);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impure_bedrock_upgrade_smithing_template"), ModItems.IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE);

        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impurebedrock_sword"), ModItems.IMPUREBEDROCK_SWORD);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impurebedrock_pickaxe"), ModItems.IMPUREBEDROCK_PICKAXE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impurebedrock_axe"), ModItems.IMPUREBEDROCK_AXE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impurebedrock_shovel"), ModItems.IMPUREBEDROCK_SHOVEL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impurebedrock_hoe"), ModItems.IMPUREBEDROCK_HOE);

        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impurebedrock_helmet"), ModItems.IMPURE_BEDROCK_HELMET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impurebedrock_chestplate"), ModItems.IMPURE_BEDROCK_CHESTPLATE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impurebedrock_leggings"), ModItems.IMPURE_BEDROCK_LEGGINGS);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "impurebedrock_boots"), ModItems.IMPURE_BEDROCK_BOOTS);
    }
}
