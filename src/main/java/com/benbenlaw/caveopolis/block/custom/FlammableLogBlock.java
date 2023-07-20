package com.benbenlaw.caveopolis.block.custom;

import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;

public class FlammableLogBlock extends RotatedPillarBlock {
    public FlammableLogBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            Map<Block, Block> logStrippedMap = new HashMap<>();

            logStrippedMap.put(ModBlocks.WHITE_COLORED_LOG.get(), ModBlocks.STRIPPED_WHITE_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.LIME_COLORED_LOG.get(), ModBlocks.STRIPPED_LIME_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.GREEN_COLORED_LOG.get(), ModBlocks.STRIPPED_GREEN_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.CYAN_COLORED_LOG.get(), ModBlocks.STRIPPED_CYAN_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.PINK_COLORED_LOG.get(), ModBlocks.STRIPPED_PINK_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.MAGENTA_COLORED_LOG.get(), ModBlocks.STRIPPED_MAGENTA_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.PURPLE_COLORED_LOG.get(), ModBlocks.STRIPPED_PURPLE_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.GRAY_COLORED_LOG.get(), ModBlocks.STRIPPED_GRAY_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.LIGHT_GRAY_COLORED_LOG.get(), ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.LIGHT_BLUE_COLORED_LOG.get(), ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.BLUE_COLORED_LOG.get(), ModBlocks.STRIPPED_BLUE_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.RED_COLORED_LOG.get(), ModBlocks.STRIPPED_RED_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.ORANGE_COLORED_LOG.get(), ModBlocks.STRIPPED_ORANGE_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.YELLOW_COLORED_LOG.get(), ModBlocks.STRIPPED_YELLOW_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.BROWN_COLORED_LOG.get(), ModBlocks.STRIPPED_BROWN_COLORED_LOG.get());
            logStrippedMap.put(ModBlocks.BLACK_COLORED_LOG.get(), ModBlocks.STRIPPED_BLACK_COLORED_LOG.get());

            Map<Block, Block> woodStrippedMap = new HashMap<>();

            woodStrippedMap.put(ModBlocks.WHITE_COLORED_WOOD.get(), ModBlocks.STRIPPED_WHITE_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.LIME_COLORED_WOOD.get(), ModBlocks.STRIPPED_LIME_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.GREEN_COLORED_WOOD.get(), ModBlocks.STRIPPED_GREEN_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.CYAN_COLORED_WOOD.get(), ModBlocks.STRIPPED_CYAN_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.PINK_COLORED_WOOD.get(), ModBlocks.STRIPPED_PINK_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.MAGENTA_COLORED_WOOD.get(), ModBlocks.STRIPPED_MAGENTA_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.PURPLE_COLORED_WOOD.get(), ModBlocks.STRIPPED_PURPLE_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.GRAY_COLORED_WOOD.get(), ModBlocks.STRIPPED_GRAY_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.LIGHT_GRAY_COLORED_WOOD.get(), ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.LIGHT_BLUE_COLORED_WOOD.get(), ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.BLUE_COLORED_WOOD.get(), ModBlocks.STRIPPED_BLUE_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.RED_COLORED_WOOD.get(), ModBlocks.STRIPPED_RED_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.ORANGE_COLORED_WOOD.get(), ModBlocks.STRIPPED_ORANGE_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.YELLOW_COLORED_WOOD.get(), ModBlocks.STRIPPED_YELLOW_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.BROWN_COLORED_WOOD.get(), ModBlocks.STRIPPED_BROWN_COLORED_WOOD.get());
            woodStrippedMap.put(ModBlocks.BLACK_COLORED_WOOD.get(), ModBlocks.STRIPPED_BLACK_COLORED_WOOD.get());

            Block block = state.getBlock();
            if (logStrippedMap.containsKey(block)) {
                return logStrippedMap.get(block).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            } else if (woodStrippedMap.containsKey(block)) {
                return woodStrippedMap.get(block).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }

}
