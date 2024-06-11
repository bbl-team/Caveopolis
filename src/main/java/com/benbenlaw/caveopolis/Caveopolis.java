package com.benbenlaw.caveopolis;

import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.block.entity.ModBlockEntities;
import com.benbenlaw.caveopolis.config.ConfigFile;
import com.benbenlaw.caveopolis.item.ModCreativeModTab;
import com.benbenlaw.caveopolis.item.ModDataComponents;
import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.networking.ModMessages;
import com.benbenlaw.caveopolis.particles.ModParticles;
import com.benbenlaw.caveopolis.recipe.ModRecipes;
import com.benbenlaw.caveopolis.screen.ModMenuTypes;
import com.benbenlaw.caveopolis.screen.SprayerScreen;
import com.benbenlaw.caveopolis.util.ModItemProperties;
import com.benbenlaw.caveopolis.util.ModWoodTypes;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.ComposterBlock;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
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

    public Caveopolis(IEventBus modEventBus) {

        ModItems.register(modEventBus);
        ModDataComponents.COMPONENTS.register(modEventBus);

        ModBlocks.register(modEventBus);
        ModCreativeModTab.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        modEventBus.addListener(this::registerCapabilities);

        ModParticles.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::commonSetupCompostable);

        ModLoadingContext.get().getActiveContainer().registerConfig(ModConfig.Type.COMMON, ConfigFile.SPEC, "caveopolis.toml");

    }

    public void registerCapabilities(RegisterCapabilitiesEvent event) {
        ModBlockEntities.registerCapabilities(event);
    }

    public void commonSetup(RegisterPayloadHandlersEvent event) {
        ModMessages.registerNetworking(event);
    }



    private void commonSetupCompostable(final FMLCommonSetupEvent event) {

        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModBlocks.BLACK_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.BLACK_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.BLUE_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.BLUE_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_BLUE_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_BLUE_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_GRAY_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_GRAY_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GRAY_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GRAY_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.ORANGE_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.ORANGE_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.YELLOW_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.YELLOW_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.BROWN_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.BROWN_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CYAN_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CYAN_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.MAGENTA_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.MAGENTA_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_COLORED_LEAVES.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIME_COLORED_SAPLING.get().asItem(),  0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LIME_COLORED_LEAVES.get().asItem(),  0.3F);

        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

        event.enqueueWork(() -> {
            Sheets.addWoodType(ModWoodTypes.BROWN);
            Sheets.addWoodType(ModWoodTypes.BLACK);
            Sheets.addWoodType(ModWoodTypes.BLUE);
            Sheets.addWoodType(ModWoodTypes.LIGHT_BLUE);
            Sheets.addWoodType(ModWoodTypes.LIGHT_GRAY);
            Sheets.addWoodType(ModWoodTypes.GRAY);
            Sheets.addWoodType(ModWoodTypes.ORANGE);
            Sheets.addWoodType(ModWoodTypes.YELLOW);
            Sheets.addWoodType(ModWoodTypes.RED);
            Sheets.addWoodType(ModWoodTypes.LIME);
            Sheets.addWoodType(ModWoodTypes.GREEN);
            Sheets.addWoodType(ModWoodTypes.PINK);
            Sheets.addWoodType(ModWoodTypes.MAGENTA);
            Sheets.addWoodType(ModWoodTypes.PURPLE);
            Sheets.addWoodType(ModWoodTypes.WHITE);
            Sheets.addWoodType(ModWoodTypes.CYAN);

        });
    }

    @EventBusSubscriber(modid = Caveopolis.MOD_ID, bus = EventBusSubscriber.Bus.MOD ,value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ModItemProperties.addCustomItemProperties();
                ModItemProperties.addCustomItemProperties();
            });
        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(ModMenuTypes.SPRAYER_MENU.get(), SprayerScreen::new);
        }
    }
}
