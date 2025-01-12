package com.benbenlaw.caveopolis;

import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.config.StartupConfig;
import com.benbenlaw.caveopolis.item.CaveopolisCreativeTab;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.network.CaveopolisMessages;
import com.benbenlaw.caveopolis.recipe.CaveopolisRecipes;
import com.benbenlaw.caveopolis.screen.CaveopolisMenuTypes;
import com.benbenlaw.caveopolis.screen.WorktableScreen;
import com.benbenlaw.caveopolis.util.CaveopolisColorHandler;
import com.benbenlaw.caveopolis.util.LogMaps;
import com.benbenlaw.caveopolis.util.TreeGrowerMap;
import com.benbenlaw.caveopolis.worldgen.tree.CaveopolisTrunkPlacers;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Caveopolis.MOD_ID)
public class Caveopolis {

    public static final String MOD_ID = "caveopolis";
    public static final Logger LOGGER = LogManager.getLogger();

    public Caveopolis(final IEventBus eventBus, final ModContainer modContainer) {

        CaveopolisBlocks.BLOCKS.register(eventBus);
        CaveopolisItems.ITEMS.register(eventBus);
        CaveopolisCreativeTab.CREATIVE_TABS.register(eventBus);

        CaveopolisMenuTypes.MENUS.register(eventBus);
        CaveopolisRecipes.register(eventBus);
        CaveopolisTrunkPlacers.TRUNK_PLACER.register(eventBus);

        if (FMLEnvironment.dist == Dist.CLIENT) {
            eventBus.register(new CaveopolisColorHandler());
        }

        modContainer.registerConfig(ModConfig.Type.STARTUP, StartupConfig.SPEC, "bbl/caveopolis/startup.toml");
        modContainer.registerConfig(ModConfig.Type.COMMON, StartupConfig.SPEC, "bbl/caveopolis/recipes.toml");

        eventBus.addListener(this::registerCapabilities);
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::networkingSetup);

    }

    public void registerCapabilities(RegisterCapabilitiesEvent event) {
       // ModBlockEntities.registerCapabilities(event);
    }

    public void networkingSetup(RegisterPayloadHandlersEvent event) {
        CaveopolisMessages.registerNetworking(event);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LogMaps logMaps = new LogMaps();
        logMaps.updateLogMaps();

        TreeGrowerMap treeGrowerMaps = new TreeGrowerMap();
        treeGrowerMaps.updateTreeGrowerMap();

        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CaveopolisBlocks.COLORED_POPPY.getId(), CaveopolisBlocks.COLORED_POTTED_POPPY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CaveopolisBlocks.COLORED_DANDELION.getId(), CaveopolisBlocks.COLORED_POTTED_DANDELION);
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
        });
    }

    @EventBusSubscriber(modid = Caveopolis.MOD_ID, bus = EventBusSubscriber.Bus.MOD ,value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
            });
        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(CaveopolisMenuTypes.WORKTABLE_MENU.get(), WorktableScreen::new);
        }
    }
}
