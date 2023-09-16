package com.benbenlaw.caveopolis.events;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.entity.ModBlockEntities;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

@Mod.EventBusSubscriber(modid = Caveopolis.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {

        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_HANGING_SIGN.get(), HangingSignRenderer::new);
    }

}
