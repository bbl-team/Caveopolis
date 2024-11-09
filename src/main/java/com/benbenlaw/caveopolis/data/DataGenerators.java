package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.recipe.CaveopolisRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Caveopolis.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new CaveopolisRecipeBuilder(packOutput, event.getLookupProvider()));
//
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(CaveopolisLootTableProvider::new, LootContextParamSets.BLOCK)), event.getLookupProvider()));
//
        CaveopolisBlockTags blockTags = new CaveopolisBlockTags(packOutput, lookupProvider, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
//
        CaveopolisItemTags itemTags = new CaveopolisItemTags(packOutput, lookupProvider, blockTags, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), itemTags);
//
        generator.addProvider(event.includeClient(), new CaveopolisItemModelProvider(packOutput, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new CaveopolisBlockStatesProvider(packOutput, event.getExistingFileHelper()));


    }
}
