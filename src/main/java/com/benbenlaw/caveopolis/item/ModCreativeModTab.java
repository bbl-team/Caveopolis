package com.benbenlaw.caveopolis.item;


import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Caveopolis.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CAVEOPOLIS_UTILITIES_TAB = CREATIVE_MODE_TABS.register("caveopolis", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.STONE_STICK.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.caveopolis"))
            .displayItems((parameters, output) -> {

                output.accept(ModBlocks.STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.SPRAYER.get());

                output.accept(ModBlocks.BLUE_COLORED_STONE.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.BLUE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_WALL.get());


                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.YELLOW_COLORED_STONE.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.YELLOW_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.RED_COLORED_STONE.get());
                output.accept(ModBlocks.RED_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.RED_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.RED_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.RED_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.RED_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.GRAY_COLORED_STONE.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.GRAY_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.GREEN_COLORED_STONE.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.GREEN_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.LIME_COLORED_STONE.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.LIME_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.PURPLE_COLORED_STONE.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.PURPLE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.MAGENTA_COLORED_STONE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.PINK_COLORED_STONE.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.PINK_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.BLACK_COLORED_STONE.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.BLACK_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.WHITE_COLORED_STONE.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.WHITE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.BROWN_COLORED_STONE.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.BROWN_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.ORANGE_COLORED_STONE.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.ORANGE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.CYAN_COLORED_STONE.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get());;
                output.accept(ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_SLAB.get());;
                output.accept(ModBlocks.CYAN_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.BRIGHT_STONE.get());
                output.accept(ModBlocks.BROWN_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.PURPLE_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.WHITE_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.YELLOW_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.BLUE_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.GRAY_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.PINK_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.RED_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.BLACK_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.ORANGE_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.GREEN_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.LIME_COLORED_BRIGHT_STONE.get());
                output.accept(ModBlocks.CYAN_COLORED_BRIGHT_STONE.get());

                output.accept(ModItems.BLUE_SPRAY_CAN.get());
                output.accept(ModItems.BROWN_SPRAY_CAN.get());
                output.accept(ModItems.MAGENTA_SPRAY_CAN.get());
                output.accept(ModItems.PURPLE_SPRAY_CAN.get());
                output.accept(ModItems.WHTIE_SPRAY_CAN.get());
                output.accept(ModItems.YELLOW_SPRAY_CAN.get());
                output.accept(ModItems.LIGHT_GRAY_SPRAY_CAN.get());
                output.accept(ModItems.LIGHT_BLUE_SPRAY_CAN.get());
                output.accept(ModItems.GRAY_SPRAY_CAN.get());
                output.accept(ModItems.PINK_SPRAY_CAN.get());
                output.accept(ModItems.RED_SPRAY_CAN.get());
                output.accept(ModItems.BLACK_SPRAY_CAN.get());
                output.accept(ModItems.ORANGE_SPRAY_CAN.get());
                output.accept(ModItems.GREEN_SPRAY_CAN.get());
                output.accept(ModItems.LIME_SPRAY_CAN.get());
                output.accept(ModItems.CYAN_SPRAY_CAN.get());
                output.accept(ModItems.GLOWSTONE_SPRAY_CAN.get());
                output.accept(ModItems.SPRAY_CAN_REMOVER.get());

                output.accept(ModItems.STONE_STICK.get());
                output.accept(ModBlocks.STONE_TORCH.get());
                output.accept(ModBlocks.MOSSY_STONE.get());
                output.accept(ModItems.MOSS_BALL.get());
                output.accept(ModItems.MOSSY_STRING.get());
                output.accept(ModBlocks.BRIGHT_STONE_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_BRIGHT_STONE_ORE.get());
                output.accept(ModItems.BRIGHT_SHARD.get());
                output.accept(ModBlocks.MIXED_STONE_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_MIXED_STONE_ORE.get());
                output.accept(ModItems.RAW_MIXED_STONE.get());
                output.accept(ModItems.MIXED_STONE_NUGGET.get());
                output.accept(ModItems.MIXED_STONE_INGOT.get());
                output.accept(ModItems.STONE_TORCH.get());

            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}