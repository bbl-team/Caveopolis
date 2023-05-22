package com.benbenlaw.caveopolis.data.loot;

import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        oreDrops();
    }

    private void oreDrops() {

        this.dropSelf(ModBlocks.BLUE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.BLUE_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_WALL.get());


        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.YELLOW_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.RED_COLORED_STONE.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.RED_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.GRAY_COLORED_STONE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.GRAY_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.GREEN_COLORED_STONE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.GREEN_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.LIME_COLORED_STONE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.LIME_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.PURPLE_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.MAGENTA_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.PINK_COLORED_STONE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.PINK_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.BLACK_COLORED_STONE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.BLACK_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.WHITE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.WHITE_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_STONE.get());
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.BROWN_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.ORANGE_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.CYAN_COLORED_STONE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.CYAN_COLORED_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.RED_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.TOPROCK.get());

        this.dropSelf(ModBlocks.STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.MOSSY_STONE.get());
        this.dropSelf(ModBlocks.BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.STONE_TORCH.get());

        this.add(ModBlocks.MIXED_STONE_ORE.get(), (block) -> createOreDrop(block, ModItems.RAW_MIXED_STONE.get()));
        this.add(ModBlocks.DEEPSLATE_MIXED_STONE_ORE.get(), (block) -> createOreDrop(block, ModItems.RAW_MIXED_STONE.get()));



    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }


}
