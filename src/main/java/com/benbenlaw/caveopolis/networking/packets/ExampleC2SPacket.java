package com.benbenlaw.caveopolis.networking.packets;

import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.block.custom.brightblock.Brightable;
import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class ExampleC2SPacket {
    public ExampleC2SPacket() {

    }

    public ExampleC2SPacket(FriendlyByteBuf buf) {

    }

    public void toBytes(FriendlyByteBuf buf) {

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            // HERE WE ARE ON THE SERVER!
            ServerPlayer player = context.getSender();
            ServerLevel level = player.serverLevel();

            float sound = 0;
            if (level.isClientSide) {
                sound = Minecraft.getInstance().options.getSoundSourceVolume(SoundSource.MASTER);
            }
            else sound = 5;

            ItemStack stack = player.getOffhandItem();

            assert stack.getTag() != null;
            BlockPos pos1 = new BlockPos (stack.getTag().getInt("pos_1_x"), stack.getTag().getInt("pos_1_y"), stack.getTag().getInt("pos_1_z"));
            BlockPos pos2 = new BlockPos (stack.getTag().getInt("pos_2_x"), stack.getTag().getInt("pos_2_y"), stack.getTag().getInt("pos_2_z"));

            for (BlockPos pos : BlockPos.betweenClosed(pos1, pos2)) {
                BlockState blockState = level.getBlockState(pos);

                if (player.getOffhandItem().is(ModItems.GLOWSTONE_SPRAY_CAN.get())) {
                    if (blockState.getBlock() instanceof Brightable) {
                        level.setBlockAndUpdate(pos, blockState.cycle(BlockStateProperties.LIT));
                        player.getItemInHand(InteractionHand.OFF_HAND).hurtAndBreak(1, player, (player1) -> player.broadcastBreakEvent(InteractionHand.OFF_HAND));
                    }
                } else {

                    for (SprayerRecipe recipe : level.getRecipeManager().getAllRecipesFor(SprayerRecipe.Type.INSTANCE)) {
                        Ingredient targetBlockIngredient = recipe.getIngredients().get(1);
                        BlockState newBlockRecipe = Block.byItem(recipe.getResultItem(level.registryAccess()).getItem()).withPropertiesOf(blockState);
                        ItemStack sprayCan = recipe.getIngredients().get(0).getItems()[0].getItem().getDefaultInstance();


                        //Check for banned blocks, matching blocks and matching spray can dont forget @benbenlaw
                        if (targetBlockIngredient.test(blockState.getBlock().asItem().getDefaultInstance()) && sprayCan.getItem() == player.getOffhandItem().getItem() && !blockState.is(ModTags.Blocks.BANNED_FROM_IN_WORLD_SPRAYING)) {
                            if (blockState.getBlock() instanceof WallTorchBlock) {
                                BlockState wallTorch = ModBlocks.BLUE_WALL_TORCH.get().withPropertiesOf(blockState);
                                level.setBlockAndUpdate(pos, wallTorch);
                            } else {
                                level.setBlockAndUpdate(pos, newBlockRecipe);
                            }
                            player.getItemInHand(InteractionHand.OFF_HAND).hurtAndBreak(1, player, (player1) -> player.broadcastBreakEvent(InteractionHand.OFF_HAND));
                        }
                    }
                }
            }

            //Play sound once
            if (stack.getTag().size() != 1) {
                level.playSound(null, player.getOnPos(), SoundEvents.BUBBLE_COLUMN_BUBBLE_POP, SoundSource.PLAYERS, sound * 15, 0.5F);
                player.sendSystemMessage(Component.literal("Mass Spraying!"));
            }

            if (stack.getTag().size() == 1) {
                player.sendSystemMessage(Component.literal("No area selected!"));
            }
        });
        return true;
    }

}