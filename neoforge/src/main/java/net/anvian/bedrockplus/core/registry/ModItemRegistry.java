package net.anvian.bedrockplus.core.registry;

import net.anvian.bedrockplus.Constants;
import net.anvian.bedrockplus.core.item.ModItems;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);

    public static final DeferredItem<Item> IMPURE_BEDROCK = ITEMS.register("impure_bedrock", () -> ModItems.IMPURE_BEDROCK);
    public static final DeferredItem<Item> IMPURE_BEDROCK_BLOCK = ITEMS.register("impure_bedrock_block", () -> ModItems.IMPURE_BEDROCK_BLOCK);

    public static final DeferredItem<Item> IMPURE_BEDROCK_INGOT = ITEMS.register("impure_bedrock_ingot", () -> ModItems.IMPURE_BEDROCK_INGOT);
    public static final DeferredItem<Item> IMPURE_BEDROCK_SCRAP = ITEMS.register("impure_bedrock_scrap", () -> ModItems.IMPURE_BEDROCK_SCRAP);
    public static final DeferredItem<Item> IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("impure_bedrock_upgrade_smithing_template", () -> ModItems.IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE);

    public static final DeferredItem<Item> IMPUREBEDROCK_SWORD = ITEMS.register("impurebedrock_sword", () -> ModItems.IMPUREBEDROCK_SWORD);
    public static final DeferredItem<Item> IMPUREBEDROCK_PICKAXE = ITEMS.register("impurebedrock_pickaxe", () -> ModItems.IMPUREBEDROCK_PICKAXE);
    public static final DeferredItem<Item> IMPUREBEDROCK_AXE = ITEMS.register("impurebedrock_axe", () -> ModItems.IMPUREBEDROCK_AXE);
    public static final DeferredItem<Item> IMPUREBEDROCK_SHOVEL = ITEMS.register("impurebedrock_shovel", () -> ModItems.IMPUREBEDROCK_SHOVEL);
    public static final DeferredItem<Item> IMPUREBEDROCK_HOE = ITEMS.register("impurebedrock_hoe", () -> ModItems.IMPUREBEDROCK_HOE);

    public static final DeferredItem<Item> IMPUREBEDROCK_HELMET = ITEMS.register("impurebedrock_helmet", () -> ModItems.IMPURE_BEDROCK_HELMET);
    public static final DeferredItem<Item> IMPUREBEDROCK_CHESTPLATE = ITEMS.register("impurebedrock_chestplate", () -> ModItems.IMPURE_BEDROCK_CHESTPLATE);
    public static final DeferredItem<Item> IMPUREBEDROCK_LEGGINGS = ITEMS.register("impurebedrock_leggings", () -> ModItems.IMPURE_BEDROCK_LEGGINGS);
    public static final DeferredItem<Item> IMPUREBEDROCK_BOOTS = ITEMS.register("impurebedrock_boots", () -> ModItems.IMPURE_BEDROCK_BOOTS);

}
