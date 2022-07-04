package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Caveopolis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        withExistingParent("blue_colored_stone", modLoc("block/blue_colored_stone"));
        withExistingParent("blue_colored_stone_bricks", modLoc("block/blue_colored_stone_bricks"));
        withExistingParent("blue_colored_stone_brick_slab", modLoc("block/blue_colored_stone_brick_slab"));
        withExistingParent("blue_colored_stone_brick_stairs", modLoc("block/blue_colored_stone_brick_stairs"));
        withExistingParent("blue_colored_stone_brick_wall", modLoc("block/blue_colored_stone_brick_wall_inventory"));
        withExistingParent("blue_colored_stone_slab", modLoc("block/blue_colored_stone_slab"));
        withExistingParent("blue_colored_stone_stairs", modLoc("block/blue_colored_stone_stairs"));
        withExistingParent("blue_colored_stone_wall", modLoc("block/blue_colored_stone_wall_inventory"));

        withExistingParent("light_blue_colored_stone", modLoc("block/light_blue_colored_stone"));
        withExistingParent("light_blue_colored_stone_bricks", modLoc("block/light_blue_colored_stone_bricks"));
        withExistingParent("light_blue_colored_stone_brick_slab", modLoc("block/light_blue_colored_stone_brick_slab"));
        withExistingParent("light_blue_colored_stone_brick_stairs", modLoc("block/light_blue_colored_stone_brick_stairs"));
        withExistingParent("light_blue_colored_stone_brick_wall", modLoc("block/light_blue_colored_stone_brick_wall_inventory"));
        withExistingParent("light_blue_colored_stone_slab", modLoc("block/light_blue_colored_stone_slab"));
        withExistingParent("light_blue_colored_stone_stairs", modLoc("block/light_blue_colored_stone_stairs"));
        withExistingParent("light_blue_colored_stone_wall", modLoc("block/light_blue_colored_stone_wall_inventory"));

        withExistingParent("yellow_colored_stone", modLoc("block/yellow_colored_stone"));
        withExistingParent("yellow_colored_stone_bricks", modLoc("block/yellow_colored_stone_bricks"));
        withExistingParent("yellow_colored_stone_brick_slab", modLoc("block/yellow_colored_stone_brick_slab"));
        withExistingParent("yellow_colored_stone_brick_stairs", modLoc("block/yellow_colored_stone_brick_stairs"));
        withExistingParent("yellow_colored_stone_brick_wall", modLoc("block/yellow_colored_stone_brick_wall_inventory"));
        withExistingParent("yellow_colored_stone_slab", modLoc("block/yellow_colored_stone_slab"));
        withExistingParent("yellow_colored_stone_stairs", modLoc("block/yellow_colored_stone_stairs"));
        withExistingParent("yellow_colored_stone_wall", modLoc("block/yellow_colored_stone_wall_inventory"));

        withExistingParent("red_colored_stone", modLoc("block/red_colored_stone"));
        withExistingParent("red_colored_stone_bricks", modLoc("block/red_colored_stone_bricks"));
        withExistingParent("red_colored_stone_brick_slab", modLoc("block/red_colored_stone_brick_slab"));
        withExistingParent("red_colored_stone_brick_stairs", modLoc("block/red_colored_stone_brick_stairs"));
        withExistingParent("red_colored_stone_brick_wall", modLoc("block/red_colored_stone_brick_wall_inventory"));
        withExistingParent("red_colored_stone_slab", modLoc("block/red_colored_stone_slab"));
        withExistingParent("red_colored_stone_stairs", modLoc("block/red_colored_stone_stairs"));
        withExistingParent("red_colored_stone_wall", modLoc("block/red_colored_stone_wall_inventory"));

        withExistingParent("gray_colored_stone", modLoc("block/gray_colored_stone"));
        withExistingParent("gray_colored_stone_bricks", modLoc("block/gray_colored_stone_bricks"));
        withExistingParent("gray_colored_stone_brick_slab", modLoc("block/gray_colored_stone_brick_slab"));
        withExistingParent("gray_colored_stone_brick_stairs", modLoc("block/gray_colored_stone_brick_stairs"));
        withExistingParent("gray_colored_stone_brick_wall", modLoc("block/gray_colored_stone_brick_wall_inventory"));
        withExistingParent("gray_colored_stone_slab", modLoc("block/gray_colored_stone_slab"));
        withExistingParent("gray_colored_stone_stairs", modLoc("block/gray_colored_stone_stairs"));
        withExistingParent("gray_colored_stone_wall", modLoc("block/gray_colored_stone_wall_inventory"));

        withExistingParent("green_colored_stone", modLoc("block/green_colored_stone"));
        withExistingParent("green_colored_stone_bricks", modLoc("block/green_colored_stone_bricks"));
        withExistingParent("green_colored_stone_brick_slab", modLoc("block/green_colored_stone_brick_slab"));
        withExistingParent("green_colored_stone_brick_stairs", modLoc("block/green_colored_stone_brick_stairs"));
        withExistingParent("green_colored_stone_brick_wall", modLoc("block/green_colored_stone_brick_wall_inventory"));
        withExistingParent("green_colored_stone_slab", modLoc("block/green_colored_stone_slab"));
        withExistingParent("green_colored_stone_stairs", modLoc("block/green_colored_stone_stairs"));
        withExistingParent("green_colored_stone_wall", modLoc("block/green_colored_stone_wall_inventory"));

        withExistingParent("light_gray_colored_stone", modLoc("block/light_gray_colored_stone"));
        withExistingParent("light_gray_colored_stone_bricks", modLoc("block/light_gray_colored_stone_bricks"));
        withExistingParent("light_gray_colored_stone_brick_slab", modLoc("block/light_gray_colored_stone_brick_slab"));
        withExistingParent("light_gray_colored_stone_brick_stairs", modLoc("block/light_gray_colored_stone_brick_stairs"));
        withExistingParent("light_gray_colored_stone_brick_wall", modLoc("block/light_gray_colored_stone_brick_wall_inventory"));
        withExistingParent("light_gray_colored_stone_slab", modLoc("block/light_gray_colored_stone_slab"));
        withExistingParent("light_gray_colored_stone_stairs", modLoc("block/light_gray_colored_stone_stairs"));
        withExistingParent("light_gray_colored_stone_wall", modLoc("block/light_gray_colored_stone_wall_inventory"));

        withExistingParent("lime_colored_stone", modLoc("block/lime_colored_stone"));
        withExistingParent("lime_colored_stone_bricks", modLoc("block/lime_colored_stone_bricks"));
        withExistingParent("lime_colored_stone_brick_slab", modLoc("block/lime_colored_stone_brick_slab"));
        withExistingParent("lime_colored_stone_brick_stairs", modLoc("block/lime_colored_stone_brick_stairs"));
        withExistingParent("lime_colored_stone_brick_wall", modLoc("block/lime_colored_stone_brick_wall_inventory"));
        withExistingParent("lime_colored_stone_slab", modLoc("block/lime_colored_stone_slab"));
        withExistingParent("lime_colored_stone_stairs", modLoc("block/lime_colored_stone_stairs"));
        withExistingParent("lime_colored_stone_wall", modLoc("block/lime_colored_stone_wall_inventory"));

        withExistingParent("purple_colored_stone", modLoc("block/purple_colored_stone"));
        withExistingParent("purple_colored_stone_bricks", modLoc("block/purple_colored_stone_bricks"));
        withExistingParent("purple_colored_stone_brick_slab", modLoc("block/purple_colored_stone_brick_slab"));
        withExistingParent("purple_colored_stone_brick_stairs", modLoc("block/purple_colored_stone_brick_stairs"));
        withExistingParent("purple_colored_stone_brick_wall", modLoc("block/purple_colored_stone_brick_wall_inventory"));
        withExistingParent("purple_colored_stone_slab", modLoc("block/purple_colored_stone_slab"));
        withExistingParent("purple_colored_stone_stairs", modLoc("block/purple_colored_stone_stairs"));
        withExistingParent("purple_colored_stone_wall", modLoc("block/purple_colored_stone_wall_inventory"));

        withExistingParent("magenta_colored_stone", modLoc("block/magenta_colored_stone"));
        withExistingParent("magenta_colored_stone_bricks", modLoc("block/magenta_colored_stone_bricks"));
        withExistingParent("magenta_colored_stone_brick_slab", modLoc("block/magenta_colored_stone_brick_slab"));
        withExistingParent("magenta_colored_stone_brick_stairs", modLoc("block/magenta_colored_stone_brick_stairs"));
        withExistingParent("magenta_colored_stone_brick_wall", modLoc("block/magenta_colored_stone_brick_wall_inventory"));
        withExistingParent("magenta_colored_stone_slab", modLoc("block/magenta_colored_stone_slab"));
        withExistingParent("magenta_colored_stone_stairs", modLoc("block/magenta_colored_stone_stairs"));
        withExistingParent("magenta_colored_stone_wall", modLoc("block/magenta_colored_stone_wall_inventory"));

        withExistingParent("pink_colored_stone", modLoc("block/pink_colored_stone"));
        withExistingParent("pink_colored_stone_bricks", modLoc("block/pink_colored_stone_bricks"));
        withExistingParent("pink_colored_stone_brick_slab", modLoc("block/pink_colored_stone_brick_slab"));
        withExistingParent("pink_colored_stone_brick_stairs", modLoc("block/pink_colored_stone_brick_stairs"));
        withExistingParent("pink_colored_stone_brick_wall", modLoc("block/pink_colored_stone_brick_wall_inventory"));
        withExistingParent("pink_colored_stone_slab", modLoc("block/pink_colored_stone_slab"));
        withExistingParent("pink_colored_stone_stairs", modLoc("block/pink_colored_stone_stairs"));
        withExistingParent("pink_colored_stone_wall", modLoc("block/pink_colored_stone_wall_inventory"));

        withExistingParent("black_colored_stone", modLoc("block/black_colored_stone"));
        withExistingParent("black_colored_stone_bricks", modLoc("block/black_colored_stone_bricks"));
        withExistingParent("black_colored_stone_brick_slab", modLoc("block/black_colored_stone_brick_slab"));
        withExistingParent("black_colored_stone_brick_stairs", modLoc("block/black_colored_stone_brick_stairs"));
        withExistingParent("black_colored_stone_brick_wall", modLoc("block/black_colored_stone_brick_wall_inventory"));
        withExistingParent("black_colored_stone_slab", modLoc("block/black_colored_stone_slab"));
        withExistingParent("black_colored_stone_stairs", modLoc("block/black_colored_stone_stairs"));
        withExistingParent("black_colored_stone_wall", modLoc("block/black_colored_stone_wall_inventory"));

        withExistingParent("white_colored_stone", modLoc("block/white_colored_stone"));
        withExistingParent("white_colored_stone_bricks", modLoc("block/white_colored_stone_bricks"));
        withExistingParent("white_colored_stone_brick_slab", modLoc("block/white_colored_stone_brick_slab"));
        withExistingParent("white_colored_stone_brick_stairs", modLoc("block/white_colored_stone_brick_stairs"));
        withExistingParent("white_colored_stone_brick_wall", modLoc("block/white_colored_stone_brick_wall_inventory"));
        withExistingParent("white_colored_stone_slab", modLoc("block/white_colored_stone_slab"));
        withExistingParent("white_colored_stone_stairs", modLoc("block/white_colored_stone_stairs"));
        withExistingParent("white_colored_stone_wall", modLoc("block/white_colored_stone_wall_inventory"));

        withExistingParent("brown_colored_stone", modLoc("block/brown_colored_stone"));
        withExistingParent("brown_colored_stone_bricks", modLoc("block/brown_colored_stone_bricks"));
        withExistingParent("brown_colored_stone_brick_slab", modLoc("block/brown_colored_stone_brick_slab"));
        withExistingParent("brown_colored_stone_brick_stairs", modLoc("block/brown_colored_stone_brick_stairs"));
        withExistingParent("brown_colored_stone_brick_wall", modLoc("block/brown_colored_stone_brick_wall_inventory"));
        withExistingParent("brown_colored_stone_slab", modLoc("block/brown_colored_stone_slab"));
        withExistingParent("brown_colored_stone_stairs", modLoc("block/brown_colored_stone_stairs"));
        withExistingParent("brown_colored_stone_wall", modLoc("block/brown_colored_stone_wall_inventory"));

        withExistingParent("orange_colored_stone", modLoc("block/orange_colored_stone"));
        withExistingParent("orange_colored_stone_bricks", modLoc("block/orange_colored_stone_bricks"));
        withExistingParent("orange_colored_stone_brick_slab", modLoc("block/orange_colored_stone_brick_slab"));
        withExistingParent("orange_colored_stone_brick_stairs", modLoc("block/orange_colored_stone_brick_stairs"));
        withExistingParent("orange_colored_stone_brick_wall", modLoc("block/orange_colored_stone_brick_wall_inventory"));
        withExistingParent("orange_colored_stone_slab", modLoc("block/orange_colored_stone_slab"));
        withExistingParent("orange_colored_stone_stairs", modLoc("block/orange_colored_stone_stairs"));
        withExistingParent("orange_colored_stone_wall", modLoc("block/orange_colored_stone_wall_inventory"));

        withExistingParent("cyan_colored_stone", modLoc("block/cyan_colored_stone"));
        withExistingParent("cyan_colored_stone_bricks", modLoc("block/cyan_colored_stone_bricks"));
        withExistingParent("cyan_colored_stone_brick_slab", modLoc("block/cyan_colored_stone_brick_slab"));
        withExistingParent("cyan_colored_stone_brick_stairs", modLoc("block/cyan_colored_stone_brick_stairs"));
        withExistingParent("cyan_colored_stone_brick_wall", modLoc("block/cyan_colored_stone_brick_wall_inventory"));
        withExistingParent("cyan_colored_stone_slab", modLoc("block/cyan_colored_stone_slab"));
        withExistingParent("cyan_colored_stone_stairs", modLoc("block/cyan_colored_stone_stairs"));
        withExistingParent("cyan_colored_stone_wall", modLoc("block/cyan_colored_stone_wall_inventory"));
        
        

        
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Caveopolis.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Caveopolis.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }
}