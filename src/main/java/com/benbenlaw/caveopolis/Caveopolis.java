package com.benbenlaw.caveopolis;

import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.util.LogMaps;
import com.benbenlaw.caveopolis.item.CaveopolisCreativeTab;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.recipe.CaveopolisRecipes;
import com.benbenlaw.caveopolis.screen.CaveopolisMenuTypes;
import com.benbenlaw.caveopolis.screen.WorktableScreen;
import com.benbenlaw.caveopolis.util.CaveopolisColorHandler;
import com.benbenlaw.caveopolis.util.TreeGrowerMap;
import com.benbenlaw.caveopolis.worldgen.tree.CaveopolisTreeGrowers;
import com.benbenlaw.caveopolis.worldgen.tree.CaveopolisTrunkPlacers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Caveopolis.MOD_ID)
public class Caveopolis {

    public static final String MOD_ID = "caveopolis";
    public static final Logger LOGGER = LogManager.getLogger();

    public Caveopolis(IEventBus modEventBus) {

        CaveopolisBlocks.BLOCKS.register(modEventBus);
        CaveopolisItems.ITEMS.register(modEventBus);
        CaveopolisCreativeTab.CREATIVE_TABS.register(modEventBus);

        CaveopolisMenuTypes.MENUS.register(modEventBus);
        CaveopolisRecipes.register(modEventBus);
        CaveopolisTrunkPlacers.TRUNK_PLACER.register(modEventBus);




        if (FMLEnvironment.dist == Dist.CLIENT) {
            modEventBus.register(new CaveopolisColorHandler());
        }

    //    ModItems.register(modEventBus);
    //    ModDataComponents.COMPONENTS.register(modEventBus);

   //     ModBlocks.register(modEventBus);
   //     ModCreativeModTab.register(modEventBus);
//
        modEventBus.addListener(this::registerCapabilities);

    //    ModParticles.register(modEventBus);
   //     ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
       // modEventBus.addListener(this::commonSetupCompostable);

     //   ModLoadingContext.get().getActiveContainer().registerConfig(ModConfig.Type.STARTUP, ConfigFile.SPEC, "caveopolis.toml");

    }

    public void registerCapabilities(RegisterCapabilitiesEvent event) {
       // ModBlockEntities.registerCapabilities(event);
    }


    private void commonSetup(final FMLCommonSetupEvent event) {
        LogMaps logMaps = new LogMaps();
        logMaps.updateLogMaps();

        TreeGrowerMap treeGrowerMaps = new TreeGrowerMap();
        treeGrowerMaps.updateTreeGrowerMap();

        event.enqueueWork(() -> {
          //  ComposterBlock.COMPOSTABLES.put(ModBlocks.BLACK_COLORED_SAPLING.get().asItem(),  0.3F);
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {



        event.enqueueWork(() -> {
        //    Sheets.addWoodType(ModWoodTypes.BROWN);
        //    Sheets.addWoodType(ModWoodTypes.BLACK);
        //    Sheets.addWoodType(ModWoodTypes.BLUE);
        //    Sheets.addWoodType(ModWoodTypes.LIGHT_BLUE);
        //    Sheets.addWoodType(ModWoodTypes.LIGHT_GRAY);
        //    Sheets.addWoodType(ModWoodTypes.GRAY);
        //    Sheets.addWoodType(ModWoodTypes.ORANGE);
        //    Sheets.addWoodType(ModWoodTypes.YELLOW);
        //    Sheets.addWoodType(ModWoodTypes.RED);
        //    Sheets.addWoodType(ModWoodTypes.LIME);
        //    Sheets.addWoodType(ModWoodTypes.GREEN);
        //    Sheets.addWoodType(ModWoodTypes.PINK);
        //    Sheets.addWoodType(ModWoodTypes.MAGENTA);
        //    Sheets.addWoodType(ModWoodTypes.PURPLE);
        //    Sheets.addWoodType(ModWoodTypes.WHITE);
        //    Sheets.addWoodType(ModWoodTypes.CYAN);

        });
    }

    @EventBusSubscriber(modid = Caveopolis.MOD_ID, bus = EventBusSubscriber.Bus.MOD ,value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {



            //    ModItemProperties.addCustomItemProperties();
            //    ModItemProperties.addCustomItemProperties();
            });
        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(CaveopolisMenuTypes.WORKTABLE_MENU.get(), WorktableScreen::new);
        }
    }
}
