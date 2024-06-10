package com.benbenlaw.caveopolis.networking.packets;

import net.minecraft.network.FriendlyByteBuf;

public class MassSprayingPacket {
    public MassSprayingPacket() {

    }

    public MassSprayingPacket(FriendlyByteBuf buf) {

    }

    public void toBytes(FriendlyByteBuf buf) {

    }


    /*

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

            BlockPos pos1 = null;
            if (stack.getTag().contains("pos_1_x") && stack.getTag().contains("pos_1_y") && stack.getTag().contains("pos_1_z")) {
                pos1 = new BlockPos(stack.getTag().getInt("pos_1_x"), stack.getTag().getInt("pos_1_y"), stack.getTag().getInt("pos_1_z"));
            }

            BlockPos pos2 = null;
            if (stack.getTag().contains("pos_2_x") && stack.getTag().contains("pos_2_y") && stack.getTag().contains("pos_2_z")) {
                pos2 = new BlockPos(stack.getTag().getInt("pos_2_x"), stack.getTag().getInt("pos_2_y"), stack.getTag().getInt("pos_2_z"));
            }

            if (pos1 == null || pos2 == null) {
                player.sendSystemMessage(Component.literal("No area selected!"));
                return;
            } else {

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
                            ParticleOptions particle = SprayCanParticleMappings.getParticleForSprayCan(sprayCan.getItem());

                            //Check for banned blocks, matching blocks and matching spray can dont forget
                            if (targetBlockIngredient.test(blockState.getBlock().asItem().getDefaultInstance()) && sprayCan.getItem() == player.getOffhandItem().getItem() && !blockState.is(ModTags.Blocks.BANNED_FROM_IN_WORLD_SPRAYING)) {
                                //Handle Wall Torches due to being a different block
                                if (blockState.getBlock() instanceof WallTorchBlock) {
                                    if (newBlockRecipe.getBlock() instanceof TorchBlock) {
                                        String torch = newBlockRecipe.toString().replace("Block{", "").replace("}", "");
                                        Block wallTorch = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(torch.replace("torch", "wall_torch")));
                                        if (wallTorch == null) {
                                            wallTorch = Blocks.WALL_TORCH;
                                        }
                                        level.setBlockAndUpdate(pos, wallTorch.withPropertiesOf(blockState));

                                    }
                                }
                                //Standard same block type replacements
                                else {
                                    level.setBlockAndUpdate(pos, newBlockRecipe);

                                }
                                player.getItemInHand(InteractionHand.OFF_HAND).hurtAndBreak(1, player, (player1) -> player.broadcastBreakEvent(InteractionHand.OFF_HAND));
                                level.sendParticles(particle, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 0, 0, 0, 0, 1);
                            }
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

     */


}