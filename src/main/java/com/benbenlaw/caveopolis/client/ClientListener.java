package com.benbenlaw.caveopolis.client;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.events.HoverInWorldEventsCaveopolis;
import com.benbenlaw.opolisutilities.OpolisUtilities;
import com.benbenlaw.opolisutilities.block.entity.ModBlockEntities;
import com.benbenlaw.opolisutilities.block.entity.client.DryingTableBlockEntityRenderer;
import com.benbenlaw.opolisutilities.event.HoverInWorldEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Caveopolis.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {

    @SubscribeEvent
    public static void registerOverlay(RegisterGuiOverlaysEvent event) {
        event.registerAbove(VanillaGuiOverlay.CROSSHAIR.id(), "lit_status", (gui, guiGraphics, partialTick, screenWidth, screenHeight)
                -> HoverInWorldEventsCaveopolis.renderLitStatusInfo(guiGraphics, partialTick));
    }
}
