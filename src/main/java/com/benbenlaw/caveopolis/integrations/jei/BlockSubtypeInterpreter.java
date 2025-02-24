package com.benbenlaw.caveopolis.integrations.jei;

import com.benbenlaw.core.block.colored.ColoredBlock;
import com.benbenlaw.core.block.colored.util.IColored;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoredBlockItem;
import com.benbenlaw.core.item.colored.ColoredItem;
import mezz.jei.api.ingredients.subtypes.ISubtypeInterpreter;
import mezz.jei.api.ingredients.subtypes.UidContext;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class BlockSubtypeInterpreter implements ISubtypeInterpreter<ItemStack> {
    @Override
    public @Nullable Object getSubtypeData(ItemStack ingredient, UidContext context) {
        if (ingredient.getItem() instanceof ColoredItem || ingredient.getItem() instanceof ColoredBlockItem) {
            return ingredient.getOrDefault(CoreDataComponents.COLOR, "white");
        }
        return null;
    }

    @Override
    public String getLegacyStringSubtypeInfo(ItemStack ingredient, UidContext context) {
        if (ingredient.getItem() instanceof ColoredItem || ingredient.getItem() instanceof ColoredBlockItem) {
            return ingredient.getOrDefault(CoreDataComponents.COLOR, "white");
        }
        return "";
    }
}

