package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {

    public static void addCustomItemProperties() {

        ItemProperties.register(ModItems.GREEN_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.LIME_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.BROWN_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.ORANGE_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.BLACK_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.RED_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.LIGHT_BLUE_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.LIGHT_GRAY_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.GRAY_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.BLUE_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.PURPLE_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.PINK_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.MAGENTA_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.CYAN_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.GLOWSTONE_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.YELLOW_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.WHTIE_SPRAY_CAN.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });

        ItemProperties.register(ModItems.SPRAY_CAN_REMOVER.get(), new ResourceLocation(Caveopolis.MOD_ID, "change"),
                (stack, level, entity, seed) -> {
                    if (stack.getDamageValue() >= 1 && stack.getDamageValue() <= 85) {
                        return 0F;
                    }
                    if (stack.getDamageValue() >= 86 && stack.getDamageValue() <= 171) {
                        return 1F;
                    }
                    if (stack.getDamageValue() >= 172 && stack.getDamageValue() <= 256) {
                        return 2F;
                    }
                    return 0.0F;
                });
    }
}
