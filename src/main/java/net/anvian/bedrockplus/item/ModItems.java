package net.anvian.bedrockplus.item;

import net.anvian.bedrockplus.BedrockPlusMod;
import net.anvian.bedrockplus.config.ModConfigs;
import net.anvian.bedrockplus.item.armor.ImpureBedrockSmithingTemplateItem;
import net.anvian.bedrockplus.item.armor.ModArmorItem;
import net.anvian.bedrockplus.item.armor.ModArmorMaterials;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BedrockPlusMod.MOD_ID);

    public static final RegistryObject<Item> IMPURE_BEDROCK_INGOT = ITEMS.register("impure_bedrock_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));

    public static final RegistryObject<Item> IMPURE_BEDROCK_SCRAP = ITEMS.register("impure_bedrock_scrap",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));

    public static final RegistryObject<Item> IMPURE_BEDROCK_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("impure_bedrock_upgrade_smithing_template",
            ImpureBedrockSmithingTemplateItem::createImpureBedrockUpgradeTemplate);

    //tools
    public static final RegistryObject<Item> IMPUREBEDROCK_SWORD = ITEMS.register("impurebedrock_sword",
            () -> new SwordItem(ModTiers.IMPURE_BEDROCK, new Item.Properties()
                    .fireResistant()
                    .attributes(SwordItem.createAttributes(
                            ModTiers.IMPURE_BEDROCK,
                            ModConfigs.swordAttackDamage, (float) ModConfigs.swordAttackSpeed)
                    )));
    public static final RegistryObject<Item> IMPUREBEDROCK_PICKAXE = ITEMS.register("impurebedrock_pickaxe",
            () -> new PickaxeItem(ModTiers.IMPURE_BEDROCK, new Item.Properties()
                    .fireResistant()
                    .attributes(PickaxeItem.createAttributes(
                            ModTiers.IMPURE_BEDROCK,
                            ModConfigs.pickaxeAttackDamage, (float) ModConfigs.pickaxeAttackSpeed)
                    )));
    public static final RegistryObject<Item> IMPUREBEDROCK_AXE = ITEMS.register("impurebedrock_axe",
            () -> new AxeItem(ModTiers.IMPURE_BEDROCK, new Item.Properties()
                    .fireResistant()
                    .attributes(AxeItem.createAttributes(
                            ModTiers.IMPURE_BEDROCK,
                            ModConfigs.axeAttackDamage, (float) ModConfigs.axeAttackSpeed)
                    )));
    public static final RegistryObject<Item> IMPUREBEDROCK_SHOVEL = ITEMS.register("impurebedrock_shovel",
            () -> new ShovelItem(ModTiers.IMPURE_BEDROCK, new Item.Properties()
                    .fireResistant()
                    .attributes(ShovelItem.createAttributes(
                            ModTiers.IMPURE_BEDROCK,
                            (float) ModConfigs.shovelAttackDamage, (float) ModConfigs.shovelAttackSpeed)
                    )));
    public static final RegistryObject<Item> IMPUREBEDROCK_HOE = ITEMS.register("impurebedrock_hoe",
            () -> new HoeItem(ModTiers.IMPURE_BEDROCK, new Item.Properties()
                    .fireResistant()
                    .attributes(HoeItem.createAttributes(
                            ModTiers.IMPURE_BEDROCK,
                            (float) ModConfigs.hoeAttackDamage, (float) ModConfigs.hoeAttackSpeed)
                    )));

    //armor
    public static final RegistryObject<Item> IMPURE_BEDROCK_HELMET = ITEMS.register("impurebedrock_helmet",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().stacksTo(1)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_CHESTPLATE = ITEMS.register("impurebedrock_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().stacksTo(1)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_LEGGINGS = ITEMS.register("impurebedrock_leggings",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().stacksTo(1)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_BOOTS = ITEMS.register("impurebedrock_boots",
            () -> new ModArmorItem(ModArmorMaterials.IMPUREBEDROCK, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
