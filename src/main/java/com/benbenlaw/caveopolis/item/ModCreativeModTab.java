package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Caveopolis.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CAVEOPOLIS_TAB = CREATIVE_MODE_TABS.register("caveopolis", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.STONE_STICK.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.caveopolis"))
            .displayItems((parameters, output) -> {

                output.accept(ModBlocks.STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.SPRAYER.get());

                output.accept(ModBlocks.BLUE_COLORED_STONE.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_WALL.get());


                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.YELLOW_COLORED_STONE.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.RED_COLORED_STONE.get());
                output.accept(ModBlocks.RED_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.RED_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.RED_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.RED_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.RED_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.GRAY_COLORED_STONE.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.GREEN_COLORED_STONE.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.LIME_COLORED_STONE.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.PURPLE_COLORED_STONE.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.MAGENTA_COLORED_STONE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.PINK_COLORED_STONE.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.BLACK_COLORED_STONE.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.WHITE_COLORED_STONE.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.BROWN_COLORED_STONE.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.ORANGE_COLORED_STONE.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.CYAN_COLORED_STONE.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_BRICKS.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_SLAB.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_STAIRS.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_WALL.get());

                output.accept(ModBlocks.COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.COBBLESTONE_BRICK_WALL.get());

                output.accept(ModBlocks.BLUE_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.BLUE_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.BLUE_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.BLUE_COLORED_COBBLESTONE_WALL.get());


                output.accept(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.YELLOW_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.YELLOW_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.YELLOW_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.YELLOW_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.RED_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.RED_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.RED_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.RED_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.GRAY_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.GRAY_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.GRAY_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.GRAY_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.GREEN_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.GREEN_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.GREEN_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.GREEN_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.LIME_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.LIME_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.LIME_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.LIME_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.PURPLE_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.PURPLE_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.PURPLE_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.PURPLE_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.MAGENTA_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.MAGENTA_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.MAGENTA_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.PINK_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.PINK_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.PINK_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.PINK_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.BLACK_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.BLACK_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.BLACK_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.BLACK_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.WHITE_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.WHITE_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.WHITE_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.WHITE_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.BROWN_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.BROWN_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.BROWN_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.BROWN_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.ORANGE_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.ORANGE_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.ORANGE_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.ORANGE_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.CYAN_COLORED_COBBLESTONE.get());
                output.accept(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get());
                output.accept(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_WALL.get());
                output.accept(ModBlocks.CYAN_COLORED_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.CYAN_COLORED_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.CYAN_COLORED_COBBLESTONE_WALL.get());

                output.accept(ModBlocks.BROWN_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.RED_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_PRESSURE_PLATE.get());

                output.accept(ModBlocks.BROWN_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.WHITE_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.RED_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_BUTTON.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_BUTTON.get());
                
                //PLANKS

                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get());
                
                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANK_STAIRS.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANK_STAIRS.get());
                
                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANK_SLAB.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANK_SLAB.get());
                
                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANK_BUTTON.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANK_BUTTON.get());
                
                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
                
                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE_GATE.get());
                
                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE.get());
                
                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANK_TRAPDOOR.get());
                
                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANK_DOOR.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANK_DOOR.get());

                output.accept(ModBlocks.BROWN_COLORED_LOG.get());
                output.accept(ModBlocks.MAGENTA_COLORED_LOG.get());
                output.accept(ModBlocks.PURPLE_COLORED_LOG.get());
                output.accept(ModBlocks.WHITE_COLORED_LOG.get());
                output.accept(ModBlocks.YELLOW_COLORED_LOG.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_LOG.get());
                output.accept(ModBlocks.BLUE_COLORED_LOG.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_LOG.get());
                output.accept(ModBlocks.GRAY_COLORED_LOG.get());
                output.accept(ModBlocks.PINK_COLORED_LOG.get());
                output.accept(ModBlocks.RED_COLORED_LOG.get());
                output.accept(ModBlocks.BLACK_COLORED_LOG.get());
                output.accept(ModBlocks.ORANGE_COLORED_LOG.get());
                output.accept(ModBlocks.GREEN_COLORED_LOG.get());
                output.accept(ModBlocks.LIME_COLORED_LOG.get());
                output.accept(ModBlocks.CYAN_COLORED_LOG.get());

                output.accept(ModBlocks.STRIPPED_BROWN_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_MAGENTA_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_PURPLE_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_WHITE_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_YELLOW_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_BLUE_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_GRAY_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_PINK_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_RED_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_BLACK_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_ORANGE_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_GREEN_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_LIME_COLORED_LOG.get());
                output.accept(ModBlocks.STRIPPED_CYAN_COLORED_LOG.get());

                output.accept(ModBlocks.BROWN_COLORED_WOOD.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOOD.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOOD.get());
                output.accept(ModBlocks.WHITE_COLORED_WOOD.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOOD.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOOD.get());
                output.accept(ModBlocks.BLUE_COLORED_WOOD.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOOD.get());
                output.accept(ModBlocks.GRAY_COLORED_WOOD.get());
                output.accept(ModBlocks.PINK_COLORED_WOOD.get());
                output.accept(ModBlocks.RED_COLORED_WOOD.get());
                output.accept(ModBlocks.BLACK_COLORED_WOOD.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOOD.get());
                output.accept(ModBlocks.GREEN_COLORED_WOOD.get());
                output.accept(ModBlocks.LIME_COLORED_WOOD.get());
                output.accept(ModBlocks.CYAN_COLORED_WOOD.get());

                output.accept(ModBlocks.STRIPPED_BROWN_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_MAGENTA_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_PURPLE_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_WHITE_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_YELLOW_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_BLUE_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_GRAY_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_PINK_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_RED_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_BLACK_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_ORANGE_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_GREEN_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_LIME_COLORED_WOOD.get());
                output.accept(ModBlocks.STRIPPED_CYAN_COLORED_WOOD.get());

                output.accept(ModBlocks.BROWN_COLORED_SIGN.get());
                output.accept(ModBlocks.MAGENTA_COLORED_SIGN.get());
                output.accept(ModBlocks.PURPLE_COLORED_SIGN.get());
                output.accept(ModBlocks.WHITE_COLORED_SIGN.get());
                output.accept(ModBlocks.YELLOW_COLORED_SIGN.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_SIGN.get());
                output.accept(ModBlocks.BLUE_COLORED_SIGN.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_SIGN.get());
                output.accept(ModBlocks.GRAY_COLORED_SIGN.get());
                output.accept(ModBlocks.PINK_COLORED_SIGN.get());
                output.accept(ModBlocks.RED_COLORED_SIGN.get());
                output.accept(ModBlocks.BLACK_COLORED_SIGN.get());
                output.accept(ModBlocks.ORANGE_COLORED_SIGN.get());
                output.accept(ModBlocks.GREEN_COLORED_SIGN.get());
                output.accept(ModBlocks.LIME_COLORED_SIGN.get());
                output.accept(ModBlocks.CYAN_COLORED_SIGN.get());

                output.accept(ModBlocks.BROWN_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.MAGENTA_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.PURPLE_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.WHITE_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.YELLOW_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.BLUE_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.GRAY_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.PINK_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.RED_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.BLACK_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.ORANGE_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.GREEN_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.LIME_COLORED_HANGING_SIGN.get());
                output.accept(ModBlocks.CYAN_COLORED_HANGING_SIGN.get());

                output.accept(ModBlocks.MARBLE.get());
                output.accept(ModBlocks.MARBLE_BRICKS.get());
                output.accept(ModBlocks.MARBLE_BRICK_SLAB.get());
                output.accept(ModBlocks.MARBLE_BRICK_STAIRS.get());
                output.accept(ModBlocks.MARBLE_BRICK_WALL.get());
                output.accept(ModBlocks.MARBLE_SLAB.get());
                output.accept(ModBlocks.MARBLE_STAIRS.get());
                output.accept(ModBlocks.MARBLE_WALL.get());

                //LEAVES

                output.accept(ModBlocks.BROWN_COLORED_LEAVES.get());
                output.accept(ModBlocks.MAGENTA_COLORED_LEAVES.get());
                output.accept(ModBlocks.PURPLE_COLORED_LEAVES.get());
                output.accept(ModBlocks.WHITE_COLORED_LEAVES.get());
                output.accept(ModBlocks.YELLOW_COLORED_LEAVES.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_LEAVES.get());
                output.accept(ModBlocks.BLUE_COLORED_LEAVES.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_LEAVES.get());
                output.accept(ModBlocks.GRAY_COLORED_LEAVES.get());
                output.accept(ModBlocks.PINK_COLORED_LEAVES.get());
                output.accept(ModBlocks.RED_COLORED_LEAVES.get());
                output.accept(ModBlocks.BLACK_COLORED_LEAVES.get());
                output.accept(ModBlocks.ORANGE_COLORED_LEAVES.get());
                output.accept(ModBlocks.GREEN_COLORED_LEAVES.get());
                output.accept(ModBlocks.LIME_COLORED_LEAVES.get());
                output.accept(ModBlocks.CYAN_COLORED_LEAVES.get());

                //CRAFTING TABLE

                output.accept(ModBlocks.WHITE_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.WHITE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.ORANGE_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.YELLOW_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.LIME_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.LIME_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.PINK_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.PINK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.GRAY_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.CYAN_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.CYAN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.PURPLE_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.BLUE_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.BROWN_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.BROWN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.GREEN_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.GREEN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.RED_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.RED_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
                output.accept(ModBlocks.BLACK_COLORED_STONE_CRAFTING_TABLE.get());
                output.accept(ModBlocks.BLACK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());

                //SAPLING

                output.accept(ModBlocks.BROWN_COLORED_SAPLING.get());
                output.accept(ModBlocks.MAGENTA_COLORED_SAPLING.get());
                output.accept(ModBlocks.PURPLE_COLORED_SAPLING.get());
                output.accept(ModBlocks.WHITE_COLORED_SAPLING.get());
                output.accept(ModBlocks.YELLOW_COLORED_SAPLING.get());
                output.accept(ModBlocks.LIGHT_GRAY_COLORED_SAPLING.get());
                output.accept(ModBlocks.BLUE_COLORED_SAPLING.get());
                output.accept(ModBlocks.LIGHT_BLUE_COLORED_SAPLING.get());
                output.accept(ModBlocks.GRAY_COLORED_SAPLING.get());
                output.accept(ModBlocks.PINK_COLORED_SAPLING.get());
                output.accept(ModBlocks.RED_COLORED_SAPLING.get());
                output.accept(ModBlocks.BLACK_COLORED_SAPLING.get());
                output.accept(ModBlocks.ORANGE_COLORED_SAPLING.get());
                output.accept(ModBlocks.GREEN_COLORED_SAPLING.get());
                output.accept(ModBlocks.LIME_COLORED_SAPLING.get());
                output.accept(ModBlocks.CYAN_COLORED_SAPLING.get());

                output.accept(ModItems.BLUE_SPRAY_CAN.get());
                output.accept(ModItems.BROWN_SPRAY_CAN.get());
                output.accept(ModItems.MAGENTA_SPRAY_CAN.get());
                output.accept(ModItems.PURPLE_SPRAY_CAN.get());
                output.accept(ModItems.WHITE_SPRAY_CAN.get());
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