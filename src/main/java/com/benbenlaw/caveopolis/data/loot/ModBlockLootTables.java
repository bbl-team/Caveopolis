package com.benbenlaw.caveopolis.data.loot;

import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.BROWN_TORCH.get());
        this.dropSelf(ModBlocks.MAGENTA_TORCH.get());
        this.dropSelf(ModBlocks.PURPLE_TORCH.get());
        this.dropSelf(ModBlocks.WHITE_TORCH.get());
        this.dropSelf(ModBlocks.YELLOW_TORCH.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TORCH.get());
        this.dropSelf(ModBlocks.BLUE_TORCH.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TORCH.get());
        this.dropSelf(ModBlocks.GRAY_TORCH.get());
        this.dropSelf(ModBlocks.PINK_TORCH.get());
        this.dropSelf(ModBlocks.RED_TORCH.get());
        this.dropSelf(ModBlocks.BLACK_TORCH.get());
        this.dropSelf(ModBlocks.GREEN_TORCH.get());
        this.dropSelf(ModBlocks.LIME_TORCH.get());
        this.dropSelf(ModBlocks.CYAN_TORCH.get());
        this.dropSelf(ModBlocks.ORANGE_TORCH.get());


        this.dropSelf(ModBlocks.BROWN_DIRT.get());
        this.dropSelf(ModBlocks.MAGENTA_DIRT.get());
        this.dropSelf(ModBlocks.PURPLE_DIRT.get());
        this.dropSelf(ModBlocks.WHITE_DIRT.get());
        this.dropSelf(ModBlocks.YELLOW_DIRT.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_DIRT.get());
        this.dropSelf(ModBlocks.BLUE_DIRT.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_DIRT.get());
        this.dropSelf(ModBlocks.GRAY_DIRT.get());
        this.dropSelf(ModBlocks.PINK_DIRT.get());
        this.dropSelf(ModBlocks.RED_DIRT.get());
        this.dropSelf(ModBlocks.BLACK_DIRT.get());
        this.dropSelf(ModBlocks.GREEN_DIRT.get());
        this.dropSelf(ModBlocks.LIME_DIRT.get());
        this.dropSelf(ModBlocks.CYAN_DIRT.get());
        this.dropSelf(ModBlocks.ORANGE_DIRT.get());

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

        this.dropSelf(ModBlocks.STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.STONE_TORCH.get());
        this.dropSelf(ModBlocks.SPRAYER.get());
        this.dropSelf(ModBlocks.COLORED_CAVES_PORTAL.get());

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

        this.dropSelf(ModBlocks.BROWN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.RED_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get());
        
        this.dropSelf(ModBlocks.BROWN_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.RED_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.LIME_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_WOODEN_PLANK_BUTTON.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_BUTTON.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_PRESSURE_PLATE.get());
        
        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_BUTTON.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE_GATE.get());


        this.dropSelf(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PINK_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.RED_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.LIME_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_WOODEN_PLANK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_TRAPDOOR.get());

        this.add(ModBlocks.BROWN_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.WHITE_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.BLUE_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.GRAY_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.PINK_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.RED_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.BLACK_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.GREEN_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.LIME_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.CYAN_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);
        this.add(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_DOOR.get(), this::createDoorTable);

        this.dropSelf(ModBlocks.STRIPPED_BROWN_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MAGENTA_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PURPLE_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WHITE_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_YELLOW_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BLUE_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GRAY_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PINK_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_RED_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BLACK_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GREEN_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_LIME_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CYAN_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ORANGE_COLORED_WOOD.get());
        
        this.dropSelf(ModBlocks.STRIPPED_BROWN_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAGENTA_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PURPLE_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WHITE_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_YELLOW_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BLUE_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GRAY_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PINK_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_RED_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BLACK_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GREEN_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LIME_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CYAN_COLORED_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ORANGE_COLORED_LOG.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.PINK_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.RED_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.LIME_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_WOOD.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_WOOD.get());
        
        this.dropSelf(ModBlocks.BROWN_COLORED_LOG.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_LOG.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_LOG.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_LOG.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_LOG.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_LOG.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_LOG.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_LOG.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_LOG.get());
        this.dropSelf(ModBlocks.PINK_COLORED_LOG.get());
        this.dropSelf(ModBlocks.RED_COLORED_LOG.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_LOG.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_LOG.get());
        this.dropSelf(ModBlocks.LIME_COLORED_LOG.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_LOG.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_LOG.get());
        
//SIGNS

        this.add(ModBlocks.BLACK_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.BLACK_COLORED_SIGN.get()));
        this.add(ModBlocks.BLACK_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.BLACK_COLORED_SIGN.get()));
        this.add(ModBlocks.BLACK_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BLACK_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.BLACK_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BLACK_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.GREEN_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREEN_COLORED_SIGN.get()));
        this.add(ModBlocks.GREEN_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREEN_COLORED_SIGN.get()));
        this.add(ModBlocks.GREEN_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREEN_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.GREEN_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREEN_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.BROWN_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.BROWN_COLORED_SIGN.get()));
        this.add(ModBlocks.BROWN_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.BROWN_COLORED_SIGN.get()));
        this.add(ModBlocks.BROWN_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BROWN_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.BROWN_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BROWN_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.CYAN_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.CYAN_COLORED_SIGN.get()));
        this.add(ModBlocks.CYAN_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.CYAN_COLORED_SIGN.get()));
        this.add(ModBlocks.CYAN_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CYAN_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.CYAN_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CYAN_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.GRAY_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.GRAY_COLORED_SIGN.get()));
        this.add(ModBlocks.GRAY_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.GRAY_COLORED_SIGN.get()));
        this.add(ModBlocks.GRAY_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GRAY_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.GRAY_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GRAY_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.BLUE_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.BLUE_COLORED_SIGN.get()));
        this.add(ModBlocks.BLUE_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.BLUE_COLORED_SIGN.get()));
        this.add(ModBlocks.BLUE_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BLUE_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.BLUE_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BLUE_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.LIGHT_BLUE_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIGHT_BLUE_COLORED_SIGN.get()));
        this.add(ModBlocks.LIGHT_BLUE_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIGHT_BLUE_COLORED_SIGN.get()));
        this.add(ModBlocks.LIGHT_BLUE_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIGHT_BLUE_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.LIGHT_BLUE_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIGHT_BLUE_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.LIGHT_GRAY_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIGHT_GRAY_COLORED_SIGN.get()));
        this.add(ModBlocks.LIGHT_GRAY_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIGHT_GRAY_COLORED_SIGN.get()));
        this.add(ModBlocks.LIGHT_GRAY_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIGHT_GRAY_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.LIGHT_GRAY_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIGHT_GRAY_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.LIME_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIME_COLORED_SIGN.get()));
        this.add(ModBlocks.LIME_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIME_COLORED_SIGN.get()));
        this.add(ModBlocks.LIME_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIME_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.LIME_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.LIME_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.MAGENTA_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAGENTA_COLORED_SIGN.get()));
        this.add(ModBlocks.MAGENTA_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAGENTA_COLORED_SIGN.get()));
        this.add(ModBlocks.MAGENTA_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAGENTA_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.MAGENTA_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAGENTA_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.ORANGE_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.ORANGE_COLORED_SIGN.get()));
        this.add(ModBlocks.ORANGE_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.ORANGE_COLORED_SIGN.get()));
        this.add(ModBlocks.ORANGE_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.ORANGE_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.ORANGE_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.ORANGE_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.PINK_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINK_COLORED_SIGN.get()));
        this.add(ModBlocks.PINK_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINK_COLORED_SIGN.get()));
        this.add(ModBlocks.PINK_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINK_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.PINK_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINK_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.PURPLE_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_COLORED_SIGN.get()));
        this.add(ModBlocks.PURPLE_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_COLORED_SIGN.get()));
        this.add(ModBlocks.PURPLE_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.PURPLE_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.RED_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.RED_COLORED_SIGN.get()));
        this.add(ModBlocks.RED_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.RED_COLORED_SIGN.get()));
        this.add(ModBlocks.RED_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.RED_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.RED_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.RED_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.WHITE_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.WHITE_COLORED_SIGN.get()));
        this.add(ModBlocks.WHITE_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.WHITE_COLORED_SIGN.get()));
        this.add(ModBlocks.WHITE_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.WHITE_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.WHITE_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.WHITE_COLORED_HANGING_SIGN.get()));

        this.add(ModBlocks.YELLOW_COLORED_SIGN.get(), block ->
                createSingleItemTable(ModItems.YELLOW_COLORED_SIGN.get()));
        this.add(ModBlocks.YELLOW_COLORED_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.YELLOW_COLORED_SIGN.get()));
        this.add(ModBlocks.YELLOW_COLORED_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.YELLOW_COLORED_HANGING_SIGN.get()));
        this.add(ModBlocks.YELLOW_COLORED_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.YELLOW_COLORED_HANGING_SIGN.get()));

        //MARBLE

        this.dropSelf(ModBlocks.MARBLE.get());
        this.dropSelf(ModBlocks.MARBLE_BRICKS.get());
        this.add(ModBlocks.MARBLE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.MARBLE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MARBLE_BRICK_WALL.get());
        this.add(ModBlocks.MARBLE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.MARBLE_WALL.get());

        
        //SAPLINGS

        this.dropSelf(ModBlocks.BROWN_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.PINK_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.RED_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.LIME_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_SAPLING.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_SAPLING.get());
        
        //CRAFTING TABLES

        this.dropSelf(ModBlocks.BROWN_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_CRAFTING_TABLE.get());

        this.dropSelf(ModBlocks.BROWN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.WHITE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.RED_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.BLACK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.LIME_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get());

        this.add(ModBlocks.BROWN_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.BROWN_COLORED_SAPLING.get(), ModItems.BROWN_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.MAGENTA_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.MAGENTA_COLORED_SAPLING.get(), ModItems.MAGENTA_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.PURPLE_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.PURPLE_COLORED_SAPLING.get(), ModItems.PURPLE_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.WHITE_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.WHITE_COLORED_SAPLING.get(), ModItems.WHITE_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.YELLOW_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.YELLOW_COLORED_SAPLING.get(), ModItems.YELLOW_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.LIGHT_GRAY_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.LIGHT_GRAY_COLORED_SAPLING.get(), ModItems.LIGHT_GRAY_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GRAY_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.GRAY_COLORED_SAPLING.get(), ModItems.GRAY_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.LIGHT_BLUE_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.LIGHT_BLUE_COLORED_SAPLING.get(), ModItems.LIGHT_BLUE_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.BLUE_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.BLUE_COLORED_SAPLING.get(), ModItems.BLUE_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.PINK_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.PINK_COLORED_SAPLING.get(), ModItems.PINK_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.RED_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.RED_COLORED_SAPLING.get(), ModItems.RED_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.BLACK_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.BLACK_COLORED_SAPLING.get(), ModItems.BLACK_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GREEN_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.GREEN_COLORED_SAPLING.get(), ModItems.GREEN_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.LIME_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.LIME_COLORED_SAPLING.get(), ModItems.LIME_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.CYAN_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.CYAN_COLORED_SAPLING.get(), ModItems.CYAN_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.ORANGE_COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, ModBlocks.ORANGE_COLORED_SAPLING.get(), ModItems.ORANGE_APPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));

    }


    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    private static final LootItemCondition.Builder HAS_SHEARS_TAG = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Tags.Items.SHEARS));
    private static final LootItemCondition.Builder HAS_SHEARS_OR_SILK_TOUCH = HAS_SHEARS_TAG.or(HAS_SILK_TOUCH);
    private static final LootItemCondition.Builder HAS_NO_SHEARS_OR_SILK_TOUCH = HAS_SHEARS_OR_SILK_TOUCH.invert();
    private static final float[] NORMAL_LEAVES_STICK_CHANCES = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};


    protected LootTable.Builder createColoredLeavesDrops(Block p_249535_, Block p_251505_, Item apple, float... p_250753_) {
        return this.createLeavesDrops(p_249535_, p_251505_, p_250753_).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).when(HAS_NO_SHEARS_OR_SILK_TOUCH).add(this.applyExplosionCondition(p_249535_, LootItem.lootTableItem(apple).when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))));
    }

    protected LootTable.Builder createLeavesDrops(Block p_250088_, Block p_250731_, float... p_248949_) {
        return createSilkTouchOrShearsDispatchTable(p_250088_, this.applyExplosionCondition(p_250088_, LootItem.lootTableItem(p_250731_)).when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, p_248949_))).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).when(HAS_NO_SHEARS_OR_SILK_TOUCH).add(this.applyExplosionDecay(p_250088_, LootItem.lootTableItem(Items.STICK).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))).when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, NORMAL_LEAVES_STICK_CHANCES))));
    }

    protected static LootTable.Builder createSilkTouchOrShearsDispatchTable(Block p_250539_, LootPoolEntryContainer.Builder<?> p_251459_) {
        return createSelfDropDispatchTable(p_250539_, HAS_SHEARS_OR_SILK_TOUCH, p_251459_);
    }


}