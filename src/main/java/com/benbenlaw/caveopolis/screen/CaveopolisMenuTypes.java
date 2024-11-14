package com.benbenlaw.caveopolis.screen;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.StonecutterMenu;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CaveopolisMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(BuiltInRegistries.MENU, Caveopolis.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<WorktableMenu>> WORKTABLE_MENU;


    static {
    WORKTABLE_MENU = MENUS.register("worktable_menu", () ->
            IMenuTypeExtension.create(WorktableMenu::new));

    }

    
    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }


}
