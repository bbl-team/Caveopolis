package com.benbenlaw.caveopolis.data.loot;

import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.BLUE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.BLUE_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_WALL.get());


        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.YELLOW_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.RED_COLORED_STONE.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.RED_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.GRAY_COLORED_STONE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.GRAY_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.GREEN_COLORED_STONE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.GREEN_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.LIME_COLORED_STONE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.LIME_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.PURPLE_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.MAGENTA_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.PINK_COLORED_STONE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.PINK_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.BLACK_COLORED_STONE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.BLACK_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.WHITE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.WHITE_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_STONE.get());
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.BROWN_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_WALL.get());

        this.dropSelf(ModBlocks.CYAN_COLORED_STONE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.CYAN_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_WALL.get());
        
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get());
        this.add(ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get());
        this.add(ModBlocks.ORANGE_COLORED_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_WALL.get());

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
        this.dropSelf(ModBlocks.BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_BRIGHT_STONE.get());

        this.dropSelf(ModBlocks.STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.BRIGHT_STONE.get());
        this.dropSelf(ModBlocks.STONE_TORCH.get());
        this.dropSelf(ModBlocks.SPRAYER.get());

        this.add(ModBlocks.MIXED_STONE_ORE.get(),
                block -> createOreDrop(ModBlocks.MIXED_STONE_ORE.get(), ModItems.RAW_MIXED_STONE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)));

        this.add(ModBlocks.DEEPSLATE_MIXED_STONE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_MIXED_STONE_ORE.get(), ModItems.RAW_MIXED_STONE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)));

        this.add(ModBlocks.BRIGHT_STONE_ORE.get(),
                block -> createOreDrop(ModBlocks.BRIGHT_STONE_ORE.get(), ModItems.BRIGHT_SHARD.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)));

        this.add(ModBlocks.DEEPSLATE_BRIGHT_STONE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_BRIGHT_STONE_ORE.get(), ModItems.BRIGHT_SHARD.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)));

        this.add(ModBlocks.MOSSY_STONE.get(),
                block -> createOreDrop(ModBlocks.MOSSY_STONE.get(), ModItems.MOSS_BALL.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)));

        this.dropSelf(ModBlocks.BLUE_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.BLUE_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_COBBLESTONE_WALL.get());


        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.YELLOW_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.YELLOW_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.RED_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.RED_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.RED_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.GRAY_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.GRAY_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.GREEN_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.GREEN_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.LIME_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.LIME_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.PURPLE_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.PURPLE_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.MAGENTA_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.MAGENTA_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.PINK_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.PINK_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.BLACK_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.BLACK_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.WHITE_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.WHITE_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.BROWN_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.COBBLESTONE_BRICK_WALL.get());

        this.dropSelf(ModBlocks.CYAN_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.CYAN_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.ORANGE_COLORED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get());
        this.add(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_WALL.get());
        this.add(ModBlocks.ORANGE_COLORED_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_COLORED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.RED_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_BRIGHT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_BRIGHT_COBBLESTONE.get());
        
        //PLANKS
        
        this.dropSelf(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.RED_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.RED_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_WOODEN_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_STAIRS.get());

        this.add(ModBlocks.BROWN_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.WHITE_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.BLUE_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.GRAY_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.PINK_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.RED_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.BLACK_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.GREEN_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.LIME_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);
        this.add(ModBlocks.CYAN_COLORED_WOODEN_PLANK_SLAB.get(), this::createSlabItemTable);

    }


    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}