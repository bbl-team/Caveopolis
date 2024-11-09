package com.benbenlaw.caveopolis.integrations.jei;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.ingredients.subtypes.IIngredientSubtypeInterpreter;
import mezz.jei.api.ingredients.subtypes.UidContext;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BlockSubtypeInterpreter implements IIngredientSubtypeInterpreter<ItemStack> {

    @Override
    public @NotNull String apply(ItemStack itemStack, UidContext uidContext) {

        @Nullable String color = itemStack.get(CoreDataComponents.COLOR);

        if (color != null) {
            return "color: " + color;
        }

        return IIngredientSubtypeInterpreter.NONE;
    }
}
