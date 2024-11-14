package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.worldgen.CaveopolisBiomeModifiers;
import com.benbenlaw.caveopolis.worldgen.CaveopolisConfiguredFeatures;
import com.benbenlaw.caveopolis.worldgen.CaveopolisPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class CaveopolisWorldGenProviders extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, CaveopolisConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, CaveopolisPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, CaveopolisBiomeModifiers::bootstrap);

    public CaveopolisWorldGenProviders(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Caveopolis.MOD_ID));
    }
}