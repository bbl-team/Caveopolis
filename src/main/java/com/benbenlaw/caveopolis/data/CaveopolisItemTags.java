package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CaveopolisItemTags extends ItemTagsProvider {

    CaveopolisItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags.contentsGetter(), Caveopolis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        //Leaves
        tag(ItemTags.LEAVES)
                .add(CaveopolisBlocks.COLORED_LEAVES.asItem());

        //Logs
        tag(ItemTags.LOGS)
                .add(CaveopolisBlocks.COLORED_LOG.asItem())
                .add(CaveopolisBlocks.STRIPPED_COLORED_LOG.asItem())
                .add(CaveopolisBlocks.COLORED_WOOD.asItem())
                .add(CaveopolisBlocks.STRIPPED_COLORED_WOOD.asItem());

        //Wooden Doors
        tag(ItemTags.WOODEN_DOORS).add(CaveopolisBlocks.COLORED_PLANK_DOOR.asItem());

        //Wooden Trapdoors
        tag(ItemTags.WOODEN_TRAPDOORS).add(CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.asItem());

        //Fence Gates
        tag(ItemTags.FENCE_GATES).add(CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.asItem());

        //Fences
        tag(ItemTags.FENCES).add(CaveopolisBlocks.COLORED_PLANK_FENCE.asItem());

        //Buttons
        tag(ItemTags.BUTTONS).add(CaveopolisBlocks.COLORED_STONE_BUTTON.asItem());

        //Walls
        tag(ItemTags.WALLS).add(CaveopolisBlocks.COLORED_STONE_WALL.asItem());

        //Pressure Plates


        //Stone
        tag(Tags.Items.STONES)
                .add(CaveopolisBlocks.COLORED_STONE.asItem())
                .add(CaveopolisBlocks.COLORED_MOSAIC.asItem())
                .add(CaveopolisBlocks.COLORED_CHAOTIC.asItem())
                .add(CaveopolisBlocks.COLORED_TRIPLE.asItem())
                .add(CaveopolisBlocks.COLORED_BRAID.asItem())
                .add(CaveopolisBlocks.COLORED_ENCASED.asItem())
                .add(CaveopolisBlocks.COLORED_ROAD.asItem());


        //Stairs
        tag(ItemTags.STAIRS)
                .add(CaveopolisBlocks.COLORED_STONE_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_MOSAIC_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_TRIPLE_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_BRAID_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_ENCASED_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_ROAD_STAIRS.asItem());

        //Slabs
        tag(ItemTags.SLABS)
                .add(CaveopolisBlocks.COLORED_STONE_SLAB.asItem())
                .add(CaveopolisBlocks.COLORED_MOSAIC_SLAB.asItem())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_SLAB.asItem())
                .add(CaveopolisBlocks.COLORED_TRIPLE_SLAB.asItem())
                .add(CaveopolisBlocks.COLORED_BRAID_SLAB.asItem())
                .add(CaveopolisBlocks.COLORED_ENCASED_SLAB.asItem())
                .add(CaveopolisBlocks.COLORED_ROAD_SLAB.asItem());


        //Planks
        tag(ItemTags.PLANKS).add(CaveopolisBlocks.COLORED_PLANKS.asItem());

        //Stone Bricks
        tag(ItemTags.STONE_BRICKS).add(CaveopolisBlocks.COLORED_STONE_BRICKS.asItem());

        //Dirt
        tag(ItemTags.DIRT).add(CaveopolisBlocks.COLORED_DIRT.asItem());

        //Cobblestone
        tag(Tags.Items.COBBLESTONES).add(CaveopolisBlocks.COLORED_COBBLESTONE.asItem());


    }
}
