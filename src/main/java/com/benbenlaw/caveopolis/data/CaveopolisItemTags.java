package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
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

        //Flowers
        tag(ItemTags.FLOWERS)
                .add(CaveopolisBlocks.COLORED_POPPY.asItem())
                .add(CaveopolisBlocks.COLORED_DANDELION.asItem());

        //Saplings
        tag(ItemTags.SAPLINGS)
                .add(CaveopolisBlocks.COLORED_SAPLING.asItem());

        tag(Tags.Items.ENCHANTABLES)
                .add(CaveopolisItems.BLACK_SPRAY_CAN.asItem());

        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(CaveopolisItems.BLACK_SPRAY_CAN.get())
                .add(CaveopolisItems.BLUE_SPRAY_CAN.get())
                .add(CaveopolisItems.GREEN_SPRAY_CAN.get())
                .add(CaveopolisItems.RED_SPRAY_CAN.get())
                .add(CaveopolisItems.YELLOW_SPRAY_CAN.get())
                .add(CaveopolisItems.PURPLE_SPRAY_CAN.get())
                .add(CaveopolisItems.ORANGE_SPRAY_CAN.get())
                .add(CaveopolisItems.LIGHT_BLUE_SPRAY_CAN.get())
                .add(CaveopolisItems.LIME_SPRAY_CAN.get())
                .add(CaveopolisItems.PINK_SPRAY_CAN.get())
                .add(CaveopolisItems.CYAN_SPRAY_CAN.get())
                .add(CaveopolisItems.LIGHT_GRAY_SPRAY_CAN.get())
                .add(CaveopolisItems.GRAY_SPRAY_CAN.get())
                .add(CaveopolisItems.BROWN_SPRAY_CAN.get())
                .add(CaveopolisItems.MAGENTA_SPRAY_CAN.get())
                .add(CaveopolisItems.WHITE_SPRAY_CAN.get())
                .add(CaveopolisItems.GLOWSTONE_SPRAY_CAN.get());

        //Leaves
        tag(ItemTags.LEAVES)
                .add(CaveopolisBlocks.COLORED_LEAVES.asItem());

        //Logs
        tag(ItemTags.LOGS_THAT_BURN)
                .add(CaveopolisBlocks.COLORED_LOG.asItem())
                .add(CaveopolisBlocks.STRIPPED_COLORED_LOG.asItem())
                .add(CaveopolisBlocks.COLORED_WOOD.asItem())
                .add(CaveopolisBlocks.STRIPPED_COLORED_WOOD.asItem());

        //Wooden Slabs
        tag(ItemTags.WOODEN_SLABS).add(CaveopolisBlocks.COLORED_PLANK_SLAB.asItem());

        //Wooden Stairs
        tag(ItemTags.WOODEN_STAIRS).add(CaveopolisBlocks.COLORED_PLANK_STAIRS.asItem());

        //Wooden Doors
        tag(ItemTags.WOODEN_DOORS).add(CaveopolisBlocks.COLORED_PLANK_DOOR.asItem());

        //Wooden Trapdoors
        tag(ItemTags.WOODEN_TRAPDOORS).add(CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.asItem());

        //Fence Gates
        tag(ItemTags.FENCE_GATES).add(CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.asItem());

        //Fences
        tag(ItemTags.FENCES).add(CaveopolisBlocks.COLORED_PLANK_FENCE.asItem());

        //Buttons
        tag(ItemTags.BUTTONS)
                .add(CaveopolisBlocks.COLORED_PLANK_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_STONE_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_MOSAIC_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_TRIPLE_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_BRAID_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_ENCASED_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_ROAD_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_COBBLESTONE_BUTTON.asItem())
                .add(CaveopolisBlocks.COLORED_STONE_BRICK_BUTTON.asItem());




        //Walls
        tag(ItemTags.WALLS).add(CaveopolisBlocks.COLORED_STONE_WALL.asItem());

        //Pressure Plates


        //Stone
        tag(Tags.Items.STONES)
                .add(CaveopolisBlocks.COLORED_STONE.asItem());


        //Stairs
        tag(ItemTags.STAIRS)
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_STONE_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_MOSAIC_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_TRIPLE_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_BRAID_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_ENCASED_STAIRS.asItem())
                .add(CaveopolisBlocks.COLORED_ROAD_STAIRS.asItem());

        //Slabs
        tag(ItemTags.SLABS)
                .add(CaveopolisBlocks.COLORED_POLISHED_STONE_SLAB.asItem())
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
