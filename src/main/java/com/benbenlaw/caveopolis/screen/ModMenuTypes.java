package com.benbenlaw.caveopolis.screen;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(BuiltInRegistries.MENU, Caveopolis.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<SprayerMenu>> SPRAYER_MENU;

    static {
        SPRAYER_MENU = MENUS.register("sprayer_menu", () ->
                IMenuTypeExtension.create(SprayerMenu::new));
    }


    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);


    }
}