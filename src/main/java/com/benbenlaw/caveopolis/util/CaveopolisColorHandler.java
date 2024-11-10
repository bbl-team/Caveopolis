package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.block.IColored;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

public class CaveopolisColorHandler {

    @SubscribeEvent
    public void registerBlockColors(final RegisterColorHandlersEvent.Block event) {

        //Colored Stone
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_BUTTON.get());

        //Colored Stone Bricks
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_BRICKS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_BRICK_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_BRICK_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_BRICK_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_BRICK_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_BRICK_BUTTON.get());

        //Colored Cobblestone
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_BUTTON.get());

        //Colored Cobblestone Bricks
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_BUTTON.get());

        //Colored Marble
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_BUTTON.get());

        //Colored Marble Bricks
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_BRICKS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_BRICK_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_BRICK_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_BRICK_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_BRICK_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_BRICK_BUTTON.get());

        //Colored Mosaic
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MOSAIC.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MOSAIC_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MOSAIC_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MOSAIC_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MOSAIC_BUTTON.get());

        //Colored Chaotic
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_CHAOTIC.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_CHAOTIC_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_CHAOTIC_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.get());

        //Colored Triple
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_TRIPLE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_TRIPLE_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_TRIPLE_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_TRIPLE_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_TRIPLE_BUTTON.get());

        //Colored Braid
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_BRAID.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_BRAID_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_BRAID_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_BRAID_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_BRAID_BUTTON.get());

        //Colored Encased
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ENCASED.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ENCASED_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ENCASED_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ENCASED_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ENCASED_BUTTON.get());

        //Colored Road
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ROAD.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ROAD_SLAB.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ROAD_STAIRS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ROAD_WALL.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_ROAD_BUTTON.get());


        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_LOG.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_WOOD.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.STRIPPED_COLORED_LOG.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.STRIPPED_COLORED_WOOD.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_LEAVES.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_PLANKS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_PLANK_FENCE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_PLANK_DOOR.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.get());




        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_BRICKS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_STONE_BRICKS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_DIRT.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE.get());
        event.register(new IColored.BlockColors(), CaveopolisBlocks.COLORED_MARBLE_BRICKS.get());

    }

    @SubscribeEvent
    public void onItemColors(RegisterColorHandlersEvent.Item event) {

        //Colored Stone
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_BUTTON.get().asItem());

        //Colored Stone Bricks
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_BRICKS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_BRICK_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_BRICK_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_BRICK_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_BRICK_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_BRICK_BUTTON.get().asItem());

        //Colored Brick
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRICKS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRICK_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRICK_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRICK_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRICK_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRICK_BUTTON.get().asItem());

        //Colored Cobblestone
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_BUTTON.get().asItem());

        //Colored Cobblestone Bricks
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_BUTTON.get().asItem());

        //Colored Marble
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_BUTTON.get().asItem());

        //Colored Marble Bricks
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_BRICKS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_BRICK_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_BRICK_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_BRICK_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_BRICK_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_BRICK_BUTTON.get().asItem());


        //Colored Mosaic
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MOSAIC.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MOSAIC_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MOSAIC_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MOSAIC_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MOSAIC_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MOSAIC_BUTTON.get().asItem());

        //Colored Chaotic
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_CHAOTIC.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_CHAOTIC_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_CHAOTIC_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_CHAOTIC_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_CHAOTIC_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_CHAOTIC_BUTTON.get().asItem());

        //Colored Triple
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_TRIPLE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_TRIPLE_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_TRIPLE_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_TRIPLE_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_TRIPLE_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_TRIPLE_BUTTON.get().asItem());

        //Colored Braid
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRAID.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRAID_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRAID_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRAID_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRAID_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRAID_BUTTON.get().asItem());

        //Colored Encased
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ENCASED.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ENCASED_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ENCASED_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ENCASED_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ENCASED_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ENCASED_BUTTON.get().asItem());

        //Colored Road
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ROAD.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ROAD_SLAB.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ROAD_STAIRS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ROAD_WALL.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ROAD_PRESSURE_PLATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_ROAD_BUTTON.get().asItem());






        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_LOG.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_WOOD.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.STRIPPED_COLORED_LOG.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.STRIPPED_COLORED_WOOD.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_LEAVES.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_PLANKS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_PLANK_FENCE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_PLANK_FENCE_GATE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_PLANK_DOOR.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_PLANK_TRAPDOOR.get().asItem());



        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_BRICKS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_STONE_BRICKS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_DIRT.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE.get().asItem());
        event.register(new IColored.ItemColors(), CaveopolisItems.COLORED_MARBLE_BRICKS.get().asItem());

    }
}
