package com.benbenlaw.caveopolis.block.custom.brightblock;

import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BrightButtonBlock extends ButtonBlock implements Brightable {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BrightButtonBlock(Properties properties, BlockSetType type, int delay, boolean arrowActivated) {
        super(properties, type, delay, arrowActivated);
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, Boolean.FALSE).setValue(FACING, Direction.NORTH).setValue(POWERED, Boolean.valueOf(false)).setValue(FACE, AttachFace.WALL));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_51101_) {
        p_51101_.add(LIT, FACING, POWERED, FACE);
    }

    /*
    @Override
    public void attack(BlockState state, Level level, BlockPos pos, Player player) {

        if (level.isClientSide()){

            ItemStack stack = player.getMainHandItem();
            CompoundTag nbt = stack.getTag();
            if (nbt == null) nbt = new CompoundTag();

            if (player.getMainHandItem().is(ModTags.Items.SPRAY_CANS) && !player.isCrouching()) {

                nbt.putInt("pos_1_x", pos.getX());
                nbt.putInt("pos_1_y", pos.getY());
                nbt.putInt("pos_1_z", pos.getZ());

                System.out.println("pos_1_x: " + nbt.getInt("pos_1_x"));
                System.out.println("pos_1_y: " + nbt.getInt("pos_1_y"));
                System.out.println("pos_1_z: " + nbt.getInt("pos_1_z"));

                player.sendSystemMessage(Component.literal("Setting Pos 1"));
            }

            else if (player.getMainHandItem().is(ModTags.Items.SPRAY_CANS) && player.isCrouching()) {


                nbt.putInt("pos_2_x", pos.getX());
                nbt.putInt("pos_2_y", pos.getY());
                nbt.putInt("pos_2_z", pos.getZ());

                System.out.println("pos_2_x: " + nbt.getInt("pos_2_x"));
                System.out.println("pos_2_y: " + nbt.getInt("pos_2_y"));
                System.out.println("pos_2_z: " + nbt.getInt("pos_2_z"));

                player.sendSystemMessage(Component.literal("Setting Pos 2"));


            }
        }

    }

     */

    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

}
