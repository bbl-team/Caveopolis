package com.benbenlaw.caveopolis.block.entity;

import com.benbenlaw.caveopolis.networking.ModMessages;
import com.benbenlaw.caveopolis.networking.packets.PacketSyncItemStackToClient;
import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import com.benbenlaw.caveopolis.screen.SprayerMenu;
import com.benbenlaw.caveopolis.util.ModTags;
import com.benbenlaw.opolisutilities.util.inventory.IInventoryHandlingBlockEntity;
import com.benbenlaw.opolisutilities.util.inventory.WrappedHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class SprayerBlockEntity extends BlockEntity implements MenuProvider, IInventoryHandlingBlockEntity {

    private final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            assert level != null;
            if (!level.isClientSide()) {
                ModMessages.sendToClients(new PacketSyncItemStackToClient(this, worldPosition));
            }
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            Map.of(Direction.DOWN, LazyOptional.of(() -> new WrappedHandler(itemHandler, (i) -> i == 2, (i, s) -> false)),

                    Direction.UP, LazyOptional.of(() -> new WrappedHandler(itemHandler, (index) -> index == 1,
                            (index, stack) -> {
                                if (index == 0 && itemHandler.isItemValid(0, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                if (index == 1 && itemHandler.isItemValid(1, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return !stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                return false;
                            })),

                    Direction.NORTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (index) -> index == 1,
                            (index, stack) -> {
                                if (index == 0 && itemHandler.isItemValid(0, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                if (index == 1 && itemHandler.isItemValid(1, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return !stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                return false;
                            })),

                    Direction.SOUTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (index) -> index == 1,
                            (index, stack) -> {
                                if (index == 0 && itemHandler.isItemValid(0, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                if (index == 1 && itemHandler.isItemValid(1, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return !stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                return false;
                            })),

                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (index) -> index == 1,
                            (index, stack) -> {
                                if (index == 0 && itemHandler.isItemValid(0, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                if (index == 1 && itemHandler.isItemValid(1, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return !stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                return false;
                            })),

                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (index) -> index == 1,
                            (index, stack) -> {
                                if (index == 0 && itemHandler.isItemValid(0, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                if (index == 1 && itemHandler.isItemValid(1, stack)) {
                                    // Add a condition to check for the specific item you want to allow
                                    return !stack.getTags().anyMatch(ModTags.Items.SPRAY_CANS::equals);
                                }
                                return false;
                            }))


            );

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 10;

    public void setHandler(ItemStackHandler handler) {
        copyHandlerContents(handler);
    }

    private void copyHandlerContents(ItemStackHandler handler) {
        for (int i = 0; i < handler.getSlots(); i++) {
            itemHandler.setStackInSlot(i, handler.getStackInSlot(i));
        }
    }

    public ItemStackHandler getItemStackHandler() {
        return this.itemHandler;
    }

    public SprayerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SPRAYER.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> SprayerBlockEntity.this.progress;
                    case 1 -> SprayerBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> SprayerBlockEntity.this.progress = value;
                    case 1 -> SprayerBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Sprayer");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new SprayerMenu(id, inventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return directionWrappedHandlerMap.get(side).cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
        for (Direction dir : Direction.values()) {
            if (directionWrappedHandlerMap.containsKey(dir)) {
                directionWrappedHandlerMap.get(dir).invalidate();
            }
        }
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putInt("sprayer.progress", this.progress);

        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("sprayer.progress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }


    public void tick() {

        Level pLevel = this.level;
        BlockPos pPos = this.worldPosition;
        BlockState state = this.getBlockState();

        SprayerBlockEntity pEntity = this;

            if (hasRecipe(pEntity)) {
                pEntity.progress++;
                setChanged(level, pPos, state);

                if (pEntity.progress >= pEntity.maxProgress) {
                    craftItem(pEntity);
                }
            } else {
                pEntity.resetProgress();
                setChanged(level, pPos, state);
            }
    }

    private void resetProgress() {
        this.progress = 0;
    }



    private void craftItem(SprayerBlockEntity pEntity) {
        Level level = pEntity.level;
        SimpleContainer inventory = new SimpleContainer(pEntity.itemHandler.getSlots());
        for (int i = 0; i < pEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, pEntity.itemHandler.getStackInSlot(i));
        }

        Optional<SprayerRecipe> sprayerRecipe = level.getRecipeManager()
                .getRecipeFor(SprayerRecipe.Type.INSTANCE, inventory, level);


        if (sprayerRecipe.isPresent()) {

            pEntity.itemHandler.extractItem(1, 1, false);
            assert Minecraft.getInstance().level != null;
            pEntity.itemHandler.setStackInSlot(2, new ItemStack(sprayerRecipe.get().getResultItem(Objects.requireNonNull(getLevel()).registryAccess()).getItem(),
                    pEntity.itemHandler.getStackInSlot(2).getCount() + 1));

            if (pEntity.itemHandler.getStackInSlot(0).hurt(1, RandomSource.create(), null)) {
                pEntity.itemHandler.extractItem(0, 1, false);
            }

            pEntity.resetProgress();
        }


    }



    private boolean hasRecipe(SprayerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }
        assert level != null;

        Optional<SprayerRecipe> sprayerRecipe = level.getRecipeManager()
                .getRecipeFor(SprayerRecipe.Type.INSTANCE, inventory, level);
/*

        return sprayerRecipe.isPresent() && canInsertAmountIntoOutputSlot(inventory)
        //        && hasMakingItem(entity, sprayerRecipe.get())
                && canInsertItemIntoOutputSlot(inventory, sprayerRecipe.get().getResultItem());


 */
        return sprayerRecipe.filter(sprayerRecipeCheck->
        {
            if (!hasMakingItem(entity, sprayerRecipe.get()) ||
                    !hasSprayCan(entity, sprayerRecipe.get()) ||
                    !canInsertAmountIntoOutputSlot(inventory)) return false;
            assert Minecraft.getInstance().level != null;
            return canInsertItemIntoOutputSlot(inventory, sprayerRecipeCheck.getResultItem(Objects.requireNonNull(getLevel()).registryAccess()));
        }).isPresent();

    }

    private boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack stack) {
        return inventory.getItem(2).getItem() == stack.getItem() || inventory.getItem(2).isEmpty();
    }

    private boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(2).getMaxStackSize() > inventory.getItem(2).getCount();
    }

    private boolean hasSprayCan(SprayerBlockEntity entity, SprayerRecipe recipe) {
    //    return ModItems.BLUE_SPRAY_CAN.get() == entity.itemHandler.getStackInSlot(0).getItem();
        return recipe.getIngredients().get(0).test(entity.itemHandler.getStackInSlot(0));
    }
    private boolean hasMakingItem(SprayerBlockEntity entity, SprayerRecipe recipe) {
        return  recipe.getIngredients().get(1).test(entity.itemHandler.getStackInSlot(1));
    }

    //recipe.getResultItem().getItem()

    /*

    private static boolean hasSprayCan(SprayerBlockEntity inventory, SprayerRecipe recipe) {
        return inventory.itemHandler.getStackInSlot(0).getItem() ;
    }

     */




}
