package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class CaveopolisDataMapProvider extends DataMapProvider {
    Builder<Compostable, Item> compostables = this.builder(NeoForgeDataMaps.COMPOSTABLES);
    public CaveopolisDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        addCompostable(CaveopolisItems.COLORED_APPLE, 0.65F);
        addCompostable(CaveopolisItems.COLORED_DANDELION, 0.65F);
        addCompostable(CaveopolisItems.COLORED_POPPY, 0.65F);
        addCompostable(CaveopolisItems.COLORED_LEAVES, 0.3F);
        addCompostable(CaveopolisItems.COLORED_SAPLING, 0.3F);
        addCompostable(CaveopolisItems.COLORED_SHORT_GRASS, 0.3F);
        addCompostable(CaveopolisItems.COLORED_TALL_GRASS, 0.3F);
    }

    @SuppressWarnings("deprecation")
    protected void addCompostable(ItemLike item, float chance) {
        compostables.add(item.asItem().builtInRegistryHolder(), new Compostable(chance), false);
    }
}
