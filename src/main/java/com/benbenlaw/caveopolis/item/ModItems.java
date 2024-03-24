package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Caveopolis.MOD_ID);

    //Apples

    public static final RegistryObject<Item> BLACK_APPLE = ITEMS.register("black_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> MAGENTA_APPLE = ITEMS.register("magenta_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> PINK_APPLE = ITEMS.register("pink_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> YELLOW_APPLE = ITEMS.register("yellow_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> LIME_APPLE = ITEMS.register("lime_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> GREEN_APPLE = ITEMS.register("green_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> LIGHT_BLUE_APPLE = ITEMS.register("light_blue_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> CYAN_APPLE = ITEMS.register("cyan_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> ORANGE_APPLE = ITEMS.register("orange_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> RED_APPLE = ITEMS.register("red_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> PURPLE_APPLE = ITEMS.register("purple_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> BROWN_APPLE = ITEMS.register("brown_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));

    public static final RegistryObject<Item> WHITE_APPLE = ITEMS.register("white_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));
    public static final RegistryObject<Item> BLUE_APPLE = ITEMS.register("blue_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));
    public static final RegistryObject<Item> LIGHT_GRAY_APPLE = ITEMS.register("light_gray_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));
    public static final RegistryObject<Item> GRAY_APPLE = ITEMS.register("gray_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE)));






    //New Items

    public static final RegistryObject<Item> GLOWSTONE_SPRAY_CAN = ITEMS.register("glowstone_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> WHITE_SPRAY_CAN = ITEMS.register("white_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> GRAY_SPRAY_CAN = ITEMS.register("gray_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> LIGHT_GRAY_SPRAY_CAN = ITEMS.register("light_gray_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> PINK_SPRAY_CAN = ITEMS.register("pink_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> LIME_SPRAY_CAN = ITEMS.register("lime_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> YELLOW_SPRAY_CAN = ITEMS.register("yellow_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> LIGHT_BLUE_SPRAY_CAN = ITEMS.register("light_blue_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> MAGENTA_SPRAY_CAN = ITEMS.register("magenta_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> ORANGE_SPRAY_CAN = ITEMS.register("orange_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> CYAN_SPRAY_CAN = ITEMS.register("cyan_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> PURPLE_SPRAY_CAN = ITEMS.register("purple_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> BLUE_SPRAY_CAN = ITEMS.register("blue_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> BROWN_SPRAY_CAN = ITEMS.register("brown_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> GREEN_SPRAY_CAN = ITEMS.register("green_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> RED_SPRAY_CAN = ITEMS.register("red_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> BLACK_SPRAY_CAN = ITEMS.register("black_spray_can",
            () -> new ColorSprayCanItem(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> SPRAY_CAN_REMOVER = ITEMS.register("spray_can_remover",
            () -> new ColorSprayCanItem(new Item.Properties()));

    public static final RegistryObject<Item> STONE_STICK = ITEMS.register("stone_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOSSY_STRING = ITEMS.register("mossy_string",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOSS_BALL = ITEMS.register("moss_ball",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().nutrition(3).saturationMod(0.2f).build()
            )));

    public static final RegistryObject<Item> BRIGHT_SHARD = ITEMS.register("bright_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MIXED_STONE_INGOT = ITEMS.register("mixed_stone_ingot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> RAW_MIXED_STONE = ITEMS.register("raw_mixed_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MIXED_STONE_NUGGET = ITEMS.register("mixed_stone_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STONE_TORCH = ITEMS.register("stone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.STONE_TORCH.get(), ModBlocks.STONE_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));


    public static final RegistryObject<Item> BLUE_TORCH = ITEMS.register("blue_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BLUE_TORCH.get(), ModBlocks.BLUE_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> BLACK_TORCH = ITEMS.register("black_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BLACK_TORCH.get(), ModBlocks.BLACK_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> RED_TORCH = ITEMS.register("red_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.RED_TORCH.get(), ModBlocks.RED_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> GREEN_TORCH = ITEMS.register("green_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.GREEN_TORCH.get(), ModBlocks.GREEN_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> BROWN_TORCH = ITEMS.register("brown_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BROWN_TORCH.get(), ModBlocks.BROWN_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> PURPLE_TORCH = ITEMS.register("purple_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PURPLE_TORCH.get(), ModBlocks.PURPLE_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> CYAN_TORCH = ITEMS.register("cyan_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CYAN_TORCH.get(), ModBlocks.CYAN_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> ORANGE_TORCH = ITEMS.register("orange_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.ORANGE_TORCH.get(), ModBlocks.ORANGE_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> LIGHT_BLUE_TORCH = ITEMS.register("light_blue_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.LIGHT_BLUE_TORCH.get(), ModBlocks.LIGHT_BLUE_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> MAGENTA_TORCH = ITEMS.register("magenta_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MAGENTA_TORCH.get(), ModBlocks.MAGENTA_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> PINK_TORCH = ITEMS.register("pink_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PINK_TORCH.get(), ModBlocks.PINK_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> LIME_TORCH = ITEMS.register("lime_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.LIME_TORCH.get(), ModBlocks.LIME_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> YELLOW_TORCH = ITEMS.register("yellow_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.YELLOW_TORCH.get(), ModBlocks.YELLOW_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> LIGHT_GRAY_TORCH = ITEMS.register("light_gray_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.LIGHT_GRAY_TORCH.get(), ModBlocks.LIGHT_GRAY_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> GRAY_TORCH = ITEMS.register("gray_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.GRAY_TORCH.get(), ModBlocks.GRAY_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> WHITE_TORCH = ITEMS.register("white_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WHITE_TORCH.get(), ModBlocks.WHITE_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));





    public static final RegistryObject<Item> BLACK_COLORED_SIGN = ITEMS.register("black_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLACK_COLORED_SIGN.get(), ModBlocks.BLACK_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLACK_COLORED_HANGING_SIGN = ITEMS.register("black_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.BLACK_COLORED_HANGING_SIGN.get(), ModBlocks.BLACK_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> MAGENTA_COLORED_SIGN = ITEMS.register("magenta_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.MAGENTA_COLORED_SIGN.get(), ModBlocks.MAGENTA_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAGENTA_COLORED_HANGING_SIGN = ITEMS.register("magenta_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.MAGENTA_COLORED_HANGING_SIGN.get(), ModBlocks.MAGENTA_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> PINK_COLORED_SIGN = ITEMS.register("pink_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PINK_COLORED_SIGN.get(), ModBlocks.PINK_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> PINK_COLORED_HANGING_SIGN = ITEMS.register("pink_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PINK_COLORED_HANGING_SIGN.get(), ModBlocks.PINK_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> YELLOW_COLORED_SIGN = ITEMS.register("yellow_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.YELLOW_COLORED_SIGN.get(), ModBlocks.YELLOW_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> YELLOW_COLORED_HANGING_SIGN = ITEMS.register("yellow_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.YELLOW_COLORED_HANGING_SIGN.get(), ModBlocks.YELLOW_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> LIME_COLORED_SIGN = ITEMS.register("lime_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LIME_COLORED_SIGN.get(), ModBlocks.LIME_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> LIME_COLORED_HANGING_SIGN = ITEMS.register("lime_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.LIME_COLORED_HANGING_SIGN.get(), ModBlocks.LIME_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> GREEN_COLORED_SIGN = ITEMS.register("green_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GREEN_COLORED_SIGN.get(), ModBlocks.GREEN_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> GREEN_COLORED_HANGING_SIGN = ITEMS.register("green_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.GREEN_COLORED_HANGING_SIGN.get(), ModBlocks.GREEN_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BLUE_COLORED_SIGN = ITEMS.register("blue_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLUE_COLORED_SIGN.get(), ModBlocks.BLUE_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLUE_COLORED_HANGING_SIGN = ITEMS.register("blue_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.BLUE_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> LIGHT_BLUE_COLORED_SIGN = ITEMS.register("light_blue_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LIGHT_BLUE_COLORED_SIGN.get(), ModBlocks.LIGHT_BLUE_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_COLORED_HANGING_SIGN = ITEMS.register("light_blue_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.LIGHT_BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.LIGHT_BLUE_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> LIGHT_GRAY_COLORED_SIGN = ITEMS.register("light_gray_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LIGHT_GRAY_COLORED_SIGN.get(), ModBlocks.LIGHT_GRAY_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_COLORED_HANGING_SIGN = ITEMS.register("light_gray_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.LIGHT_GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.LIGHT_GRAY_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> GRAY_COLORED_SIGN = ITEMS.register("gray_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GRAY_COLORED_SIGN.get(), ModBlocks.GRAY_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> GRAY_COLORED_HANGING_SIGN = ITEMS.register("gray_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.GRAY_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> CYAN_COLORED_SIGN = ITEMS.register("cyan_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CYAN_COLORED_SIGN.get(), ModBlocks.CYAN_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> CYAN_COLORED_HANGING_SIGN = ITEMS.register("cyan_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.CYAN_COLORED_HANGING_SIGN.get(), ModBlocks.CYAN_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ORANGE_COLORED_SIGN = ITEMS.register("orange_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ORANGE_COLORED_SIGN.get(), ModBlocks.ORANGE_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> ORANGE_COLORED_HANGING_SIGN = ITEMS.register("orange_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ORANGE_COLORED_HANGING_SIGN.get(), ModBlocks.ORANGE_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> RED_COLORED_SIGN = ITEMS.register("red_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.RED_COLORED_SIGN.get(), ModBlocks.RED_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> RED_COLORED_HANGING_SIGN = ITEMS.register("red_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.RED_COLORED_HANGING_SIGN.get(), ModBlocks.RED_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> PURPLE_COLORED_SIGN = ITEMS.register("purple_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PURPLE_COLORED_SIGN.get(), ModBlocks.PURPLE_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> PURPLE_COLORED_HANGING_SIGN = ITEMS.register("purple_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PURPLE_COLORED_HANGING_SIGN.get(), ModBlocks.PURPLE_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BROWN_COLORED_SIGN = ITEMS.register("brown_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BROWN_COLORED_SIGN.get(), ModBlocks.BROWN_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> BROWN_COLORED_HANGING_SIGN = ITEMS.register("brown_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.BROWN_COLORED_HANGING_SIGN.get(), ModBlocks.BROWN_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> WHITE_COLORED_SIGN = ITEMS.register("white_colored_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WHITE_COLORED_SIGN.get(), ModBlocks.WHITE_COLORED_WALL_SIGN.get()));
    public static final RegistryObject<Item> WHITE_COLORED_HANGING_SIGN = ITEMS.register("white_colored_hanging_sign",
            () -> new HangingSignItem(ModBlocks.WHITE_COLORED_HANGING_SIGN.get(), ModBlocks.WHITE_COLORED_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
