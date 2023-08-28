package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Caveopolis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.BLACK_SPRAY_CAN);
        simpleItem(ModItems.BLUE_SPRAY_CAN);
        simpleItem(ModItems.BROWN_SPRAY_CAN);
        simpleItem(ModItems.PINK_SPRAY_CAN);
        simpleItem(ModItems.PURPLE_SPRAY_CAN);
        simpleItem(ModItems.WHTIE_SPRAY_CAN);
        simpleItem(ModItems.YELLOW_SPRAY_CAN);
        simpleItem(ModItems.LIGHT_GRAY_SPRAY_CAN);
        simpleItem(ModItems.LIGHT_BLUE_SPRAY_CAN);
        simpleItem(ModItems.GRAY_SPRAY_CAN);
        simpleItem(ModItems.MAGENTA_SPRAY_CAN);
        simpleItem(ModItems.RED_SPRAY_CAN);
        simpleItem(ModItems.ORANGE_SPRAY_CAN);
        simpleItem(ModItems.GREEN_SPRAY_CAN);
        simpleItem(ModItems.LIME_SPRAY_CAN);
        simpleItem(ModItems.CYAN_SPRAY_CAN);
        simpleItem(ModItems.GLOWSTONE_SPRAY_CAN);
        simpleItem(ModItems.SPRAY_CAN_REMOVER);
        simpleItem(ModItems.STONE_STICK);
        simpleItem(ModItems.MOSS_BALL);
        simpleItem(ModItems.MOSSY_STRING);
        simpleItem(ModItems.BRIGHT_SHARD);
        simpleItem(ModItems.RAW_MIXED_STONE);
        simpleItem(ModItems.MIXED_STONE_INGOT);
        simpleItem(ModItems.MIXED_STONE_NUGGET);
        simpleTorch(ModBlocks.STONE_TORCH);

        simpleItem(ModItems.BLACK_COLORED_SIGN);
        simpleItem(ModItems.BLACK_COLORED_HANGING_SIGN);

        simpleItem(ModItems.CYAN_COLORED_SIGN);
        simpleItem(ModItems.CYAN_COLORED_HANGING_SIGN);

        simpleItem(ModItems.LIME_COLORED_SIGN);
        simpleItem(ModItems.LIME_COLORED_HANGING_SIGN);

        simpleItem(ModItems.GREEN_COLORED_SIGN);
        simpleItem(ModItems.GREEN_COLORED_HANGING_SIGN);

        simpleItem(ModItems.GRAY_COLORED_SIGN);
        simpleItem(ModItems.GRAY_COLORED_HANGING_SIGN);

        simpleItem(ModItems.LIGHT_GRAY_COLORED_SIGN);
        simpleItem(ModItems.LIGHT_GRAY_COLORED_HANGING_SIGN);

        simpleItem(ModItems.LIGHT_BLUE_COLORED_SIGN);
        simpleItem(ModItems.LIGHT_BLUE_COLORED_HANGING_SIGN);

        simpleItem(ModItems.BLUE_COLORED_SIGN);
        simpleItem(ModItems.BLUE_COLORED_HANGING_SIGN);

        simpleItem(ModItems.PURPLE_COLORED_SIGN);
        simpleItem(ModItems.PURPLE_COLORED_HANGING_SIGN);

        simpleItem(ModItems.MAGENTA_COLORED_SIGN);
        simpleItem(ModItems.MAGENTA_COLORED_HANGING_SIGN);

        simpleItem(ModItems.PINK_COLORED_SIGN);
        simpleItem(ModItems.PINK_COLORED_HANGING_SIGN);

        simpleItem(ModItems.ORANGE_COLORED_SIGN);
        simpleItem(ModItems.ORANGE_COLORED_HANGING_SIGN);

        simpleItem(ModItems.RED_COLORED_SIGN);
        simpleItem(ModItems.RED_COLORED_HANGING_SIGN);

        simpleItem(ModItems.YELLOW_COLORED_SIGN);
        simpleItem(ModItems.YELLOW_COLORED_HANGING_SIGN);

        simpleItem(ModItems.BROWN_COLORED_SIGN);
        simpleItem(ModItems.BROWN_COLORED_HANGING_SIGN);

        simpleItem(ModItems.WHITE_COLORED_SIGN);
        simpleItem(ModItems.WHITE_COLORED_HANGING_SIGN);

        wallItem(ModBlocks.PURPLE_COLORED_COBBLESTONE_WALL, ModBlocks.PURPLE_COLORED_COBBLESTONE);
        wallItem(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.PURPLE_COLORED_STONE_WALL, ModBlocks.PURPLE_COLORED_STONE);
        wallItem(ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL, ModBlocks.PURPLE_COLORED_STONE_BRICKS);

        wallItem(ModBlocks.GREEN_COLORED_COBBLESTONE_WALL, ModBlocks.GREEN_COLORED_COBBLESTONE);
        wallItem(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.GREEN_COLORED_STONE_WALL, ModBlocks.GREEN_COLORED_STONE);
        wallItem(ModBlocks.GREEN_COLORED_STONE_BRICK_WALL, ModBlocks.GREEN_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.CYAN_COLORED_COBBLESTONE_WALL, ModBlocks.CYAN_COLORED_COBBLESTONE);
        wallItem(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.CYAN_COLORED_STONE_WALL, ModBlocks.CYAN_COLORED_STONE);
        wallItem(ModBlocks.CYAN_COLORED_STONE_BRICK_WALL, ModBlocks.CYAN_COLORED_STONE_BRICKS);

        wallItem(ModBlocks.LIME_COLORED_COBBLESTONE_WALL, ModBlocks.LIME_COLORED_COBBLESTONE);
        wallItem(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.LIME_COLORED_STONE_WALL, ModBlocks.LIME_COLORED_STONE);
        wallItem(ModBlocks.LIME_COLORED_STONE_BRICK_WALL, ModBlocks.LIME_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.ORANGE_COLORED_COBBLESTONE_WALL, ModBlocks.ORANGE_COLORED_COBBLESTONE);
        wallItem(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.ORANGE_COLORED_STONE_WALL, ModBlocks.ORANGE_COLORED_STONE);
        wallItem(ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL, ModBlocks.ORANGE_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.RED_COLORED_COBBLESTONE_WALL, ModBlocks.RED_COLORED_COBBLESTONE);
        wallItem(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.RED_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.RED_COLORED_STONE_WALL, ModBlocks.RED_COLORED_STONE);
        wallItem(ModBlocks.RED_COLORED_STONE_BRICK_WALL, ModBlocks.RED_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.MAGENTA_COLORED_COBBLESTONE_WALL, ModBlocks.MAGENTA_COLORED_COBBLESTONE);
        wallItem(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.MAGENTA_COLORED_STONE_WALL, ModBlocks.MAGENTA_COLORED_STONE);
        wallItem(ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL, ModBlocks.MAGENTA_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.YELLOW_COLORED_COBBLESTONE_WALL, ModBlocks.YELLOW_COLORED_COBBLESTONE);
        wallItem(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.YELLOW_COLORED_STONE_WALL, ModBlocks.YELLOW_COLORED_STONE);
        wallItem(ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL, ModBlocks.YELLOW_COLORED_STONE_BRICKS);

        wallItem(ModBlocks.PINK_COLORED_COBBLESTONE_WALL, ModBlocks.PINK_COLORED_COBBLESTONE);
        wallItem(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.PINK_COLORED_STONE_WALL, ModBlocks.PINK_COLORED_STONE);
        wallItem(ModBlocks.PINK_COLORED_STONE_BRICK_WALL, ModBlocks.PINK_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.BLACK_COLORED_COBBLESTONE_WALL, ModBlocks.BLACK_COLORED_COBBLESTONE);
        wallItem(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.BLACK_COLORED_STONE_WALL, ModBlocks.BLACK_COLORED_STONE);
        wallItem(ModBlocks.BLACK_COLORED_STONE_BRICK_WALL, ModBlocks.BLACK_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.WHITE_COLORED_COBBLESTONE_WALL, ModBlocks.WHITE_COLORED_COBBLESTONE);
        wallItem(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.WHITE_COLORED_STONE_WALL, ModBlocks.WHITE_COLORED_STONE);
        wallItem(ModBlocks.WHITE_COLORED_STONE_BRICK_WALL, ModBlocks.WHITE_COLORED_STONE_BRICKS);

        wallItem(ModBlocks.BROWN_COLORED_COBBLESTONE_WALL, ModBlocks.BROWN_COLORED_COBBLESTONE);
        wallItem(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.BROWN_COLORED_STONE_WALL, ModBlocks.BROWN_COLORED_STONE);
        wallItem(ModBlocks.BROWN_COLORED_STONE_BRICK_WALL, ModBlocks.BROWN_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_WALL, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE);
        wallItem(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL, ModBlocks.LIGHT_BLUE_COLORED_STONE);
        wallItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.BLUE_COLORED_COBBLESTONE_WALL, ModBlocks.BLUE_COLORED_COBBLESTONE);
        wallItem(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.BLUE_COLORED_STONE_WALL, ModBlocks.BLUE_COLORED_STONE);
        wallItem(ModBlocks.BLUE_COLORED_STONE_BRICK_WALL, ModBlocks.BLUE_COLORED_STONE_BRICKS);        
        
        wallItem(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_WALL, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE);
        wallItem(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL, ModBlocks.LIGHT_GRAY_COLORED_STONE);
        wallItem(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS);
        
        wallItem(ModBlocks.GRAY_COLORED_COBBLESTONE_WALL, ModBlocks.GRAY_COLORED_COBBLESTONE);
        wallItem(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_WALL, ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS);
        wallItem(ModBlocks.GRAY_COLORED_STONE_WALL, ModBlocks.GRAY_COLORED_STONE);
        wallItem(ModBlocks.GRAY_COLORED_STONE_BRICK_WALL, ModBlocks.GRAY_COLORED_STONE);
        wallItem(ModBlocks.COBBLESTONE_BRICK_WALL, ModBlocks.COBBLESTONE_BRICKS);

        buttonItem(ModBlocks.BROWN_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.BROWN_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.PURPLE_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.WHITE_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.WHITE_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.YELLOW_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.BLUE_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.BLUE_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.GRAY_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.GRAY_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.PINK_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.PINK_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.RED_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.RED_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.BLACK_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.BLACK_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.ORANGE_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.GREEN_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.GREEN_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.LIME_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.LIME_COLORED_WOODEN_PLANKS);
        buttonItem(ModBlocks.CYAN_COLORED_WOODEN_PLANK_BUTTON, ModBlocks.CYAN_COLORED_WOODEN_PLANKS);
        
        buttonItem(ModBlocks.BROWN_COLORED_STONE_BUTTON, ModBlocks.BROWN_COLORED_STONE);
        buttonItem(ModBlocks.MAGENTA_COLORED_STONE_BUTTON, ModBlocks.MAGENTA_COLORED_STONE);
        buttonItem(ModBlocks.PURPLE_COLORED_STONE_BUTTON, ModBlocks.PURPLE_COLORED_STONE);
        buttonItem(ModBlocks.WHITE_COLORED_STONE_BUTTON, ModBlocks.WHITE_COLORED_STONE);
        buttonItem(ModBlocks.YELLOW_COLORED_STONE_BUTTON, ModBlocks.YELLOW_COLORED_STONE);
        buttonItem(ModBlocks.LIGHT_GRAY_COLORED_STONE_BUTTON, ModBlocks.LIGHT_GRAY_COLORED_STONE);
        buttonItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_BUTTON, ModBlocks.LIGHT_BLUE_COLORED_STONE);
        buttonItem(ModBlocks.BLUE_COLORED_STONE_BUTTON, ModBlocks.BLUE_COLORED_STONE);
        buttonItem(ModBlocks.GRAY_COLORED_STONE_BUTTON, ModBlocks.GRAY_COLORED_STONE);
        buttonItem(ModBlocks.PINK_COLORED_STONE_BUTTON, ModBlocks.PINK_COLORED_STONE);
        buttonItem(ModBlocks.RED_COLORED_STONE_BUTTON, ModBlocks.RED_COLORED_STONE);
        buttonItem(ModBlocks.BLACK_COLORED_STONE_BUTTON, ModBlocks.BLACK_COLORED_STONE);
        buttonItem(ModBlocks.ORANGE_COLORED_STONE_BUTTON, ModBlocks.ORANGE_COLORED_STONE);
        buttonItem(ModBlocks.GREEN_COLORED_STONE_BUTTON, ModBlocks.GREEN_COLORED_STONE);
        buttonItem(ModBlocks.LIME_COLORED_STONE_BUTTON, ModBlocks.LIME_COLORED_STONE);
        buttonItem(ModBlocks.CYAN_COLORED_STONE_BUTTON, ModBlocks.CYAN_COLORED_STONE);

        fenceItem(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE, ModBlocks.BROWN_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE, ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE, ModBlocks.PURPLE_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE, ModBlocks.WHITE_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE, ModBlocks.YELLOW_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE, ModBlocks.BLUE_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE, ModBlocks.GRAY_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE, ModBlocks.PINK_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE, ModBlocks.RED_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE, ModBlocks.BLACK_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE, ModBlocks.ORANGE_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE, ModBlocks.GREEN_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE, ModBlocks.LIME_COLORED_WOODEN_PLANKS);
        fenceItem(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE, ModBlocks.CYAN_COLORED_WOODEN_PLANKS);

        simpleBlockItem(ModBlocks.BROWN_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.WHITE_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.BLUE_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.GRAY_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.PINK_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.RED_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.BLACK_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.GREEN_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.LIME_COLORED_WOODEN_PLANK_DOOR);
        simpleBlockItem(ModBlocks.CYAN_COLORED_WOODEN_PLANK_DOOR);

        wallItem(ModBlocks.MARBLE_BRICK_WALL, ModBlocks.MARBLE);
        wallItem(ModBlocks.MARBLE_WALL, ModBlocks.MARBLE_BRICKS);
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Caveopolis.MOD_ID,"item/" + item.getId().getPath()));
    }
    
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Caveopolis.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleTorch(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Caveopolis.MOD_ID,"block/" + block.getId().getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Caveopolis.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    
    private void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(Caveopolis.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Caveopolis.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }



    /*

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Caveopolis.MOD_ID,"item/" + item.getName().getPath()));
    }

     */

}
