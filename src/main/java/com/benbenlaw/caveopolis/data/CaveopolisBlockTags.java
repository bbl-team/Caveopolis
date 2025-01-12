package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CaveopolisBlockTags extends BlockTagsProvider {

    CaveopolisBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Caveopolis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        //Crafting Tables
        tag(Tags.Blocks.PLAYER_WORKSTATIONS_CRAFTING_TABLES)
                .add(CaveopolisBlocks.COLORED_CRAFTING_TABLE.get());

        //Flowers
        tag(BlockTags.FLOWERS)
                .add(CaveopolisBlocks.COLORED_POPPY.get())
                .add(CaveopolisBlocks.COLORED_DANDELION.get());

        //Saplings
        tag(BlockTags.SAPLINGS)
                .add(CaveopolisBlocks.COLORED_SAPLING.get());

        //Hoe
        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(CaveopolisBlocks.COLORED_LEAVES.get());

        //Axe
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(CaveopolisBlocks.COLORED_PLANKS.get())
                .add(CaveopolisBlocks.COLORED_PLANK_FENCE.get())
                .add(CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.get())
                .add(CaveopolisBlocks.COLORED_PLANK_DOOR.get())
                .add(CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.get())
                .add(CaveopolisBlocks.COLORED_LOG.get())
                .add(CaveopolisBlocks.COLORED_WOOD.get())
                .add(CaveopolisBlocks.STRIPPED_COLORED_LOG.get())
                .add(CaveopolisBlocks.STRIPPED_COLORED_WOOD.get())
                .add(CaveopolisBlocks.COLORED_CRAFTING_TABLE.get());

        //Pickaxe
        tag(BlockTags.MINEABLE_WITH_PICKAXE)

                //Colored Cracked Stone Bricks
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICKS.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_BUTTON.get())

                //Colored Prismarine
                .add(CaveopolisBlocks.COLORED_PRISMARINE.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_WALL.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BUTTON.get())

                //Colored Dark Prismarine
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_WALL.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_BUTTON.get())

                //Colored Prismarine Bricks
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICKS.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_BUTTON.get())

                //Colored Tile
                .add(CaveopolisBlocks.COLORED_TILE.get())
                .add(CaveopolisBlocks.COLORED_TILE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_TILE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_TILE_WALL.get())
                .add(CaveopolisBlocks.COLORED_TILE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_TILE_BUTTON.get())

                //Colored Polished Stone
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_WALL.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_BUTTON.get())

                //Colored Stone
                .add(CaveopolisBlocks.COLORED_STONE.get())
                .add(CaveopolisBlocks.COLORED_STONE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_STONE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_STONE_WALL.get())
                .add(CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_STONE_BUTTON.get())

                //Colored Stone Bricks
                .add(CaveopolisBlocks.COLORED_STONE_BRICKS.get())
                .add(CaveopolisBlocks.COLORED_STONE_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_STONE_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_STONE_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_STONE_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_STONE_BRICK_BUTTON.get())

                //Colored Bricks
                .add(CaveopolisBlocks.COLORED_BRICKS.get())
                .add(CaveopolisBlocks.COLORED_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_BRICK_BUTTON.get())

                //Colored Cobblestone
                .add(CaveopolisBlocks.COLORED_COBBLESTONE.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_WALL.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BUTTON.get())

                //Colored Cobblestone Bricks
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_BUTTON.get())

                //Colored Marble
                .add(CaveopolisBlocks.COLORED_MARBLE.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_WALL.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BUTTON.get())

                //Colored Marble Bricks
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICKS.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_BUTTON.get())

                //Colored Mosaic
                .add(CaveopolisBlocks.COLORED_MOSAIC.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_SLAB.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_WALL.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_BUTTON.get())

                //Colored Chaotic
                .add(CaveopolisBlocks.COLORED_CHAOTIC.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_SLAB.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_WALL.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.get())

                //Colored Triple
                .add(CaveopolisBlocks.COLORED_TRIPLE.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_WALL.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_BUTTON.get())

                //Colored Braid
                .add(CaveopolisBlocks.COLORED_BRAID.get())
                .add(CaveopolisBlocks.COLORED_BRAID_SLAB.get())
                .add(CaveopolisBlocks.COLORED_BRAID_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_BRAID_WALL.get())
                .add(CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_BRAID_BUTTON.get())

                //Colored Encased
                .add(CaveopolisBlocks.COLORED_ENCASED.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_SLAB.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_WALL.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_BUTTON.get())

                //Colored Road
                .add(CaveopolisBlocks.COLORED_ROAD.get())
                .add(CaveopolisBlocks.COLORED_ROAD_SLAB.get())
                .add(CaveopolisBlocks.COLORED_ROAD_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_ROAD_WALL.get())
                .add(CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_ROAD_BUTTON.get());

        //Leaves
        tag(BlockTags.LEAVES)
                .add(CaveopolisBlocks.COLORED_LEAVES.get());

        //Logs That Burn
        tag(BlockTags.LOGS_THAT_BURN)
                .add(CaveopolisBlocks.COLORED_LOG.get())
                .add(CaveopolisBlocks.STRIPPED_COLORED_LOG.get())
                .add(CaveopolisBlocks.COLORED_WOOD.get())
                .add(CaveopolisBlocks.STRIPPED_COLORED_WOOD.get());

        //Wooden Doors
        tag(BlockTags.WOODEN_DOORS)
                .add(CaveopolisBlocks.COLORED_PLANK_DOOR.get());

        //Wooden Trapdoors
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.get());

        //Fence Gates
        tag(BlockTags.FENCE_GATES)
                .add(CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.get());

        //Fences
        tag(BlockTags.FENCES)
                .add(CaveopolisBlocks.COLORED_PLANK_FENCE.get());

        //Buttons
        tag(BlockTags.BUTTONS)
                .add(CaveopolisBlocks.COLORED_PLANK_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_STONE_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_STONE_BRICK_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_BRICK_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_BRAID_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_ROAD_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_TILE_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BUTTON.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_BUTTON.get());

        //Walls
        tag(BlockTags.WALLS)
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_WALL.get())
                .add(CaveopolisBlocks.COLORED_STONE_WALL.get())
                .add(CaveopolisBlocks.COLORED_STONE_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_WALL.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_WALL.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_WALL.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_WALL.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_WALL.get())
                .add(CaveopolisBlocks.COLORED_BRAID_WALL.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_WALL.get())
                .add(CaveopolisBlocks.COLORED_ROAD_WALL.get())
                .add(CaveopolisBlocks.COLORED_TILE_WALL.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_WALL.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_WALL.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_WALL.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_WALL.get());


        //Pressure Plates
        tag(BlockTags.PRESSURE_PLATES)
                .add(CaveopolisBlocks.COLORED_PLANK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_STONE_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_TILE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_PRESSURE_PLATE.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_PRESSURE_PLATE.get());

        //Stone
        tag(Tags.Blocks.STONES)
                .add(CaveopolisBlocks.COLORED_STONE.get());

        //Wooden Stairs
        tag(BlockTags.WOODEN_STAIRS)
                .add(CaveopolisBlocks.COLORED_PLANK_STAIRS.get());

        //Stairs
        tag(BlockTags.STAIRS)
                .add(CaveopolisBlocks.COLORED_PLANK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_STONE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_BRAID_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_ROAD_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_TILE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_STAIRS.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_STAIRS.get());


        //Wooden Slab
        tag(BlockTags.WOODEN_SLABS)
                .add(CaveopolisBlocks.COLORED_PLANK_SLAB.get());

        //Slabs
        tag(BlockTags.SLABS)
                .add(CaveopolisBlocks.COLORED_PLANK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_STONE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_MOSAIC_SLAB.get())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_SLAB.get())
                .add(CaveopolisBlocks.COLORED_TRIPLE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_BRAID_SLAB.get())
                .add(CaveopolisBlocks.COLORED_ENCASED_SLAB.get())
                .add(CaveopolisBlocks.COLORED_ROAD_SLAB.get())
                .add(CaveopolisBlocks.COLORED_TILE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_MARBLE_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICK_SLAB.get())
                .add(CaveopolisBlocks.COLORED_DARK_PRISMARINE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_SLAB.get())
                .add(CaveopolisBlocks.COLORED_PRISMARINE_BRICK_SLAB.get());


        //Stone Bricks
        tag(BlockTags.STONE_BRICKS)
                .add(CaveopolisBlocks.COLORED_STONE_BRICKS.get())
                .add(CaveopolisBlocks.COLORED_CRACKED_STONE_BRICKS.get());

        //Planks
        tag(BlockTags.PLANKS)
                .add(CaveopolisBlocks.COLORED_PLANKS.get());

        //Dirt
        tag(BlockTags.DIRT)
                .add(CaveopolisBlocks.COLORED_DIRT.get());

        //Cobblestone
        tag(Tags.Blocks.COBBLESTONES)
                .add(CaveopolisBlocks.COLORED_COBBLESTONE.get());

    }


    @Override
    public String getName() {
        return Caveopolis.MOD_ID + " Block Tags";
    }
}
