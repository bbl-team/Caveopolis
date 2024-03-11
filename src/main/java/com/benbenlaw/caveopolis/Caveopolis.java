package com.benbenlaw.caveopolis;

import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.block.entity.ModBlockEntities;
import com.benbenlaw.caveopolis.block.networking.ModMessages;
import com.benbenlaw.caveopolis.config.ConfigFile;
import com.benbenlaw.caveopolis.item.ModCreativeModTab;
import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.particles.ModParticles;
import com.benbenlaw.caveopolis.recipe.ModRecipes;
import com.benbenlaw.caveopolis.screen.ModMenuTypes;
import com.benbenlaw.caveopolis.screen.SprayerScreen;
import com.benbenlaw.caveopolis.util.ModItemProperties;
import com.benbenlaw.caveopolis.util.ModTags;
import com.benbenlaw.caveopolis.util.ModWoodTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Caveopolis.MOD_ID)
public class Caveopolis {

    public static final String MOD_ID = "caveopolis";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public Caveopolis() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTab.register(eventBus);

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModParticles.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);
        ModRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::enqueueIMC);
        eventBus.addListener(this::processIMC);
        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);
        eventBus.addListener(this::commonSetup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigFile.SPEC, "caveopolis.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getName());
    }


    private void commonSetup(final FMLCommonSetupEvent event) {

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

        event.enqueueWork(ModMessages::register);


    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("com", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
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


            MenuScreens.register(ModMenuTypes.SPRAYER_MENU.get(), SprayerScreen::new);

        });
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus =Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ModItemProperties.addCustomItemProperties();
                ModItemProperties.addCustomItemProperties();
            });
        }
    }
}
