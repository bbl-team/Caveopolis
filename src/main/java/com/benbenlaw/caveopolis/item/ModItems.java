package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.item.custom.*;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Caveopolis.MOD_ID);

    //New Items

    public static final RegistryObject<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears", () -> new ShearsItem(
            new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).defaultDurability(64)));

    public static final RegistryObject<Item> WHTIE_SPRAY_CAN = ITEMS.register("white_spray_can",
            () -> new WhiteSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> GRAY_SPRAY_CAN = ITEMS.register("gray_spray_can",
            () -> new GraySprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> LIGHT_GRAY_SPRAY_CAN = ITEMS.register("light_gray_spray_can",
            () -> new LightGraySprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> PINK_SPRAY_CAN = ITEMS.register("pink_spray_can",
            () -> new PinkSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> LIME_SPRAY_CAN = ITEMS.register("lime_spray_can",
            () -> new LimeSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> YELLOW_SPRAY_CAN = ITEMS.register("yellow_spray_can",
            () -> new YellowSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> LIGHT_BLUE_SPRAY_CAN = ITEMS.register("light_blue_spray_can",
            () -> new LightBlueSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> MAGENTA_SPRAY_CAN = ITEMS.register("magenta_spray_can",
            () -> new MagentaSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> ORANGE_SPRAY_CAN = ITEMS.register("orange_spray_can",
            () -> new OrangeSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> CYAN_SPRAY_CAN = ITEMS.register("cyan_spray_can",
            () -> new CyanSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> PURPLE_SPRAY_CAN = ITEMS.register("purple_spray_can",
            () -> new PurpleSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> BLUE_SPRAY_CAN = ITEMS.register("blue_spray_can",
            () -> new BlueSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> BROWN_SPRAY_CAN = ITEMS.register("brown_spray_can",
            () -> new BrownSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> GREEN_SPRAY_CAN = ITEMS.register("green_spray_can",
            () -> new GreenSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> RED_SPRAY_CAN = ITEMS.register("red_spray_can",
            () -> new RedSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> BLACK_SPRAY_CAN = ITEMS.register("black_spray_can",
            () -> new BlackSprayCanItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).durability(256)));

    public static final RegistryObject<Item> SPRAY_CAN_REMOVER = ITEMS.register("spray_can_remover",
            () -> new SprayCanRemoverItem(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));





    public static final RegistryObject<Item> STONE_STICK = ITEMS.register("stone_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> MOSSY_STRING = ITEMS.register("mossy_string",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> MOSS_BALL = ITEMS.register("moss_ball",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS).food(
                    new FoodProperties.Builder().nutrition(3).saturationMod(0.2f).build()
            )));

    public static final RegistryObject<Item> BRIGHT_SHARD = ITEMS.register("bright_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> STONE_PEBBLE = ITEMS.register("stone_pebble",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> COBBLESTONE_PEBBLE = ITEMS.register("cobblestone_pebble",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> ANDESITE_PEBBLE = ITEMS.register("andesite_pebble",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> GRANITE_PEBBLE = ITEMS.register("granite_pebble",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> DIORITE_PEBBLE = ITEMS.register("diorite_pebble",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> MIXED_STONE_INGOT = ITEMS.register("mixed_stone_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> IRON_FRAGMENT = ITEMS.register("iron_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> GOLD_FRAGMENT = ITEMS.register("gold_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> LEAD_FRAGMENT = ITEMS.register("lead_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> SILVER_FRAGMENT = ITEMS.register("silver_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> COPPER_FRAGMENT = ITEMS.register("copper_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> TIN_FRAGMENT = ITEMS.register("tin_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> NICKEL_FRAGMENT = ITEMS.register("nickel_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> COAL_FRAGMENT = ITEMS.register("coal_fragment",
            () -> new CoalFragment(true));

    public static final RegistryObject<Item> CHARCOAL_FRAGMENT = ITEMS.register("charcoal_fragment",
            () -> new CoalFragment(true));

    public static final RegistryObject<Item> LAPIS_LAZULI_FRAGMENT = ITEMS.register("lapis_lazuli_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> DIAMOND_FRAGMENT = ITEMS.register("diamond_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> EMERALD_FRAGMENT = ITEMS.register("emerald_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> REDSTONE_FRAGMENT = ITEMS.register("redstone_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> GLOWSTONE_FRAGMENT = ITEMS.register("glowstone_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> QUARTZ_FRAGMENT = ITEMS.register("quartz_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> DEBRIS_FRAGMENT = ITEMS.register("debris_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> BEDROCK_FRAGMENT = ITEMS.register("bedrock_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> MIXED_STONE_FRAGMENT = ITEMS.register("mixed_stone_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> URANIUM_FRAGMENT = ITEMS.register("uranium_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> FLUORITE_FRAGMENT = ITEMS.register("fluorite_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> OSMIUM_FRAGMENT = ITEMS.register("osmium_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));





    public static final RegistryObject<Item> RAW_MIXED_STONE = ITEMS.register("raw_mixed_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> MIXED_STONE_NUGGET = ITEMS.register("mixed_stone_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    public static final RegistryObject<Item> STONE_TORCH = ITEMS.register("stone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.STONE_TORCH.get(), ModBlocks.STONE_WALL_TORCH.get(),
                    new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
