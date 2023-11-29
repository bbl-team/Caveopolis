package com.benbenlaw.caveopolis.events;


import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.custom.brightblock.Brightable;
import com.benbenlaw.opolisutilities.block.ModBlocks;
import com.benbenlaw.opolisutilities.item.ModItems;
import com.mojang.blaze3d.platform.Window;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Caveopolis.MOD_ID)

public class HoverInWorldEventsCaveopolis {

    @OnlyIn(Dist.CLIENT)
    public static void renderLitStatusInfo(GuiGraphics graphics, float partialTicks) {
        Minecraft minecraft = Minecraft.getInstance();
        Player player = minecraft.player;
        assert player != null;
        Level level = player.level();

        if (player.getMainHandItem().is(ModItems.OPOLIS_WRENCH.get()) || player.getOffhandItem().is(ModItems.OPOLIS_WRENCH.get())
                || player.getMainHandItem().is(com.benbenlaw.caveopolis.item.ModItems.GLOWSTONE_SPRAY_CAN.get()) || player.getOffhandItem().is(com.benbenlaw.caveopolis.item.ModItems.GLOWSTONE_SPRAY_CAN.get())) {

            if (minecraft.screen == null) {

                HitResult hitResult = minecraft.hitResult;
                if (hitResult instanceof BlockHitResult hit) {
                    BlockPos blockPos = hit.getBlockPos();
                    BlockState blockState = minecraft.level.getBlockState(blockPos);
                    Block block = blockState.getBlock();
                    ItemStack lookingAtBlock = block.getCloneItemStack(minecraft.level, blockPos, blockState);
                    Window window = minecraft.getWindow();
                    int x = window.getGuiScaledWidth() / 2 + 3;
                    int y = window.getGuiScaledHeight() / 2 + 3;

                    if (block instanceof Brightable) {
                        boolean lit = blockState.getValue(BlockStateProperties.LIT);
                        if (lit) {
                            graphics.drawCenteredString(minecraft.font, "Status: Lit", x, y + 3, 0xFFFFFF);
                        }
                        if (!lit) {
                            graphics.drawCenteredString(minecraft.font, "Status: Unlit", x, y + 3, 0xFFFFFF);
                        }

                        graphics.pose().pushPose();
                        graphics.pose().scale(0.75F, 0.75F, 1F);
                        graphics.pose().popPose();
                    }

                }
            }
        }
    }
}