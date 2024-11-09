package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.loaders.DynamicFluidContainerModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class CaveopolisItemModelProvider extends ItemModelProvider {

    public CaveopolisItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Caveopolis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(CaveopolisItems.BLACK_SPRAY_CAN);
        simpleItem(CaveopolisItems.BLUE_SPRAY_CAN);
        simpleItem(CaveopolisItems.GREEN_SPRAY_CAN);
        simpleItem(CaveopolisItems.RED_SPRAY_CAN);
        simpleItem(CaveopolisItems.YELLOW_SPRAY_CAN);
        simpleItem(CaveopolisItems.PINK_SPRAY_CAN);
        simpleItem(CaveopolisItems.ORANGE_SPRAY_CAN);
        simpleItem(CaveopolisItems.PURPLE_SPRAY_CAN);
        simpleItem(CaveopolisItems.WHITE_SPRAY_CAN);
        simpleItem(CaveopolisItems.BROWN_SPRAY_CAN);
        simpleItem(CaveopolisItems.CYAN_SPRAY_CAN);
        simpleItem(CaveopolisItems.GRAY_SPRAY_CAN);
        simpleItem(CaveopolisItems.LIGHT_BLUE_SPRAY_CAN);
        simpleItem(CaveopolisItems.LIGHT_GRAY_SPRAY_CAN);
        simpleItem(CaveopolisItems.LIME_SPRAY_CAN);
        simpleItem(CaveopolisItems.MAGENTA_SPRAY_CAN);
        simpleItem(CaveopolisItems.GLOWSTONE_SPRAY_CAN);

        simpleItem(CaveopolisItems.COLORED_PLANK_DOOR);



    }


    private void simpleItem(DeferredItem<Item> item) {
        withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "item/" + item.getId().getPath()));
    }

    private void simpleBlockItemWithParent(DeferredBlock<Block> block) {
        withExistingParent(block.getId().getPath(), ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "block/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID,"item/" + item.getId().getPath()));
    }


    @Override
    public String getName() {
        return Caveopolis.MOD_ID + " Item Models";
    }
}
