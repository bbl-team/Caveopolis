package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.core.block.colored.util.ColorMap;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class CaveopolisCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Caveopolis.MOD_ID);

    public static final Supplier<CreativeModeTab> CAVEOPOLIS_TAB = CREATIVE_TABS.register(Caveopolis.MOD_ID, () -> CreativeModeTab.builder()
            .icon(() -> iconWithColor(new ItemStack(CaveopolisItems.COLORED_STONE.get()), "white"))
            .title(Component.translatable("creative." + Caveopolis.MOD_ID + ".tab"))
            .displayItems((parameters, output) -> {
                // List of block types that share similar properties
                List<Supplier<ItemStack>> blocks = Arrays.<Supplier<ItemStack>>asList(

                        //Colored Items
                        () -> new ItemStack(CaveopolisItems.COLORED_APPLE.get()),

                        //Colored Flowers
                        () -> new ItemStack(CaveopolisBlocks.COLORED_POPPY.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_DANDELION.get()),

                        //Colored Polished Stone
                        () -> new ItemStack(CaveopolisBlocks.COLORED_POLISHED_STONE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_POLISHED_STONE_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_POLISHED_STONE_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_POLISHED_STONE_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_POLISHED_STONE_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_POLISHED_STONE_BUTTON.get()),

                        //Colored Stone
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_BUTTON.get()),

                        //Colored Stone Bricks
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_BRICKS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_BRICK_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_BRICK_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_BRICK_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_BRICK_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_BRICK_BUTTON.get()),

                        //Colored Bricks
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRICKS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRICK_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRICK_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRICK_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRICK_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRICK_BUTTON.get()),

                        //Colored Cobblestone
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_BUTTON.get()),

                        //Colored Cobblestone Bricks
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_BUTTON.get()),

                        //Colored Marble
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_BUTTON.get()),

                        //Colored Marble Bricks
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_BRICKS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_BRICK_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_BRICK_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_BRICK_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_BRICK_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_BRICK_BUTTON.get()),

                        //Colored Mosaic
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MOSAIC.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MOSAIC_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MOSAIC_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MOSAIC_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MOSAIC_BUTTON.get()),

                        //Colored Chaotic
                        () -> new ItemStack(CaveopolisBlocks.COLORED_CHAOTIC.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_CHAOTIC_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_CHAOTIC_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.get()),

                        //Colored Triple
                        () -> new ItemStack(CaveopolisBlocks.COLORED_TRIPLE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_TRIPLE_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_TRIPLE_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_TRIPLE_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_TRIPLE_BUTTON.get()),

                        //Colored Braid
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRAID.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRAID_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRAID_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRAID_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRAID_BUTTON.get()),

                        //Colored Encased
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ENCASED.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ENCASED_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ENCASED_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ENCASED_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ENCASED_BUTTON.get()),

                        //Colored Road
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ROAD.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ROAD_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ROAD_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ROAD_WALL.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_ROAD_BUTTON.get()),


                        () -> new ItemStack(CaveopolisBlocks.COLORED_LOG.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_WOOD.get()),
                        () -> new ItemStack(CaveopolisBlocks.STRIPPED_COLORED_LOG.get()),
                        () -> new ItemStack(CaveopolisBlocks.STRIPPED_COLORED_WOOD.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_LEAVES.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_SAPLING.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_PLANKS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_PLANK_STAIRS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_PLANK_SLAB.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_PLANK_PRESSURE_PLATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_PLANK_BUTTON.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_PLANK_FENCE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_PLANK_DOOR.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_BRICKS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_STONE_BRICKS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_DIRT.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE.get()),
                        () -> new ItemStack(CaveopolisBlocks.COLORED_MARBLE_BRICKS.get())
                );

                // Add color variants for each block
                ColorMap.COLOR_MAP.forEach((color, value) -> blocks.forEach(block -> {
                    ItemStack item = block.get();
                    setColorAndLit(item, String.valueOf(color));
                    output.accept(item);
                }));

                // Add spray cans
                Arrays.asList(
                        CaveopolisItems.BLACK_SPRAY_CAN.get(),
                        CaveopolisItems.BLUE_SPRAY_CAN.get(),
                        CaveopolisItems.BROWN_SPRAY_CAN.get(),
                        CaveopolisItems.CYAN_SPRAY_CAN.get(),
                        CaveopolisItems.GRAY_SPRAY_CAN.get(),
                        CaveopolisItems.GREEN_SPRAY_CAN.get(),
                        CaveopolisItems.LIGHT_BLUE_SPRAY_CAN.get(),
                        CaveopolisItems.LIGHT_GRAY_SPRAY_CAN.get(),
                        CaveopolisItems.LIME_SPRAY_CAN.get(),
                        CaveopolisItems.MAGENTA_SPRAY_CAN.get(),
                        CaveopolisItems.ORANGE_SPRAY_CAN.get(),
                        CaveopolisItems.PINK_SPRAY_CAN.get(),
                        CaveopolisItems.PURPLE_SPRAY_CAN.get(),
                        CaveopolisItems.RED_SPRAY_CAN.get(),
                        CaveopolisItems.WHITE_SPRAY_CAN.get(),
                        CaveopolisItems.YELLOW_SPRAY_CAN.get(),
                        CaveopolisItems.GLOWSTONE_SPRAY_CAN.get(),
                        CaveopolisItems.WORKTABLE.get()
                ).forEach(output::accept);
            }).build());

    private static void setColorAndLit(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);

        return item;
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
