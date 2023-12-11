package com.benbenlaw.caveopolis.block.custom;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.util.ColoredCavesTeleporter;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ColoredCavesPortalBlock extends Block {
    public ColoredCavesPortalBlock(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {

        if(player.canChangeDimensions()) {
            coloredCavesPortal(player, pos);
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.FAIL;
        }
    }

    private void coloredCavesPortal(Entity player, BlockPos pos) {

        if (player.level() instanceof ServerLevel serverLevel) {
            MinecraftServer minecraftServer = serverLevel.getServer();
            ResourceKey<Level> coloredCavesDim = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(Caveopolis.MOD_ID, "colored_caves"));
            ResourceKey<Level> resourceKey = player.level().dimension() == coloredCavesDim ? Level.OVERWORLD : coloredCavesDim;

            ServerLevel portalDim = minecraftServer.getLevel(resourceKey);

            if (portalDim != null && !player.isPassenger()) {
                player.changeDimension(portalDim, new ColoredCavesTeleporter(pos, true));
            }
        }
    }
}
