package com.benbenlaw.caveopolis.block.entity;

import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import com.benbenlaw.caveopolis.screen.SprayerMenu;
import com.benbenlaw.opolisutilities.block.entity.custom.handler.InputOutputItemHandler;
import com.benbenlaw.opolisutilities.util.inventory.IInventoryHandlingBlockEntity;
import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.neoforged.neoforge.common.util.FakePlayer;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class SprayerBlockEntity extends BlockEntity implements MenuProvider, IInventoryHandlingBlockEntity {

    private final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            sync();
        }
    };

    public void sync() {
        if (level instanceof ServerLevel serverLevel) {
            LevelChunk chunk = serverLevel.getChunkAt(getBlockPos());
            if (Objects.requireNonNull(chunk.getLevel()).getChunkSource() instanceof ServerChunkCache chunkCache) {
                chunkCache.chunkMap.getPlayers(chunk.getPos(), false).forEach(this::syncContents);
            }
        }
    }

    public void syncContents(ServerPlayer player) {
        player.connection.send(Objects.requireNonNull(getUpdatePacket()));
    }

    public final ContainerData data;
    public int progress = 0;
    public int maxProgress = 40;

    public int INPUT_SLOT = 0;
    public int OUTPUT_SLOT = 1;
    public int SPRAY_CAN_SLOT = 2;

    private final IItemHandler sprayerItemHandler = new InputOutputItemHandler(itemHandler,
            (i, stack ) -> i == INPUT_SLOT,
            i -> i == OUTPUT_SLOT
    );

    public @Nullable IItemHandler getItemHandlerCapability(@Nullable Direction side) {
        return sprayerItemHandler;
    }

    public void setHandler(ItemStackHandler handler) {
        for (int i = 0; i < handler.getSlots(); i++) {
            this.itemHandler.setStackInSlot(i, handler.getStackInSlot(i));
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
        return Component.translatable("block.caveopolis.sprayer");
    }


    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int container, @NotNull Inventory inventory, @NotNull Player player) {
        return new SprayerMenu(container, inventory, this.getBlockPos(), data);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        this.setChanged();
    }

    @Nullable
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public void handleUpdateTag(@NotNull CompoundTag compoundTag, HolderLookup.@NotNull Provider provider) {
        super.loadAdditional(compoundTag, provider);
    }

    @Override
    public @NotNull CompoundTag getUpdateTag(HolderLookup.@NotNull Provider provider) {
        CompoundTag compoundTag = new CompoundTag();
        saveAdditional(compoundTag, provider);
        return compoundTag;
    }

    @Override
    public void onDataPacket(@NotNull Connection connection, @NotNull ClientboundBlockEntityDataPacket clientboundBlockEntityDataPacket,
                             HolderLookup.@NotNull Provider provider) {
        super.onDataPacket(connection, clientboundBlockEntityDataPacket, provider);
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag compoundTag, HolderLookup.@NotNull Provider provider) {
        super.saveAdditional(compoundTag, provider);
        compoundTag.put("inventory", this.itemHandler.serializeNBT(provider));
        compoundTag.putInt("sprayer.progress", progress);
        compoundTag.putInt("sprayer.maxProgress", maxProgress);
    }
    @Override
    protected void loadAdditional(CompoundTag compoundTag, HolderLookup.@NotNull Provider provider) {
        this.itemHandler.deserializeNBT(provider, compoundTag.getCompound("inventory"));
        progress = compoundTag.getInt("sprayer.progress");
        maxProgress = compoundTag.getInt("sprayer.maxProgress");
        super.loadAdditional(compoundTag, provider);
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        assert this.level != null;
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

        Optional<RecipeHolder<SprayerRecipe>> sprayerRecipe = level.getRecipeManager()
                .getRecipeFor(SprayerRecipe.Type.INSTANCE, inventory, level);


        if (sprayerRecipe.isPresent()) {

            pEntity.itemHandler.extractItem(1, 1, false);
            assert Minecraft.getInstance().level != null;
            pEntity.itemHandler.setStackInSlot(2, new ItemStack(sprayerRecipe.get().value().output().getItem(),
                    pEntity.itemHandler.getStackInSlot(2).getCount() + 1));

            pEntity.itemHandler.getStackInSlot(0).hurtAndBreak(1, createFakePlayer((ServerLevel) level), EquipmentSlot.OFFHAND);

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

        Optional<RecipeHolder<SprayerRecipe>> sprayerRecipe = level.getRecipeManager()
                .getRecipeFor(SprayerRecipe.Type.INSTANCE, inventory, level);


        return sprayerRecipe.filter(sprayerRecipeCheck->
        {
            if (!hasMakingItem(entity, sprayerRecipe.get().value()) ||
                    !hasSprayCan(entity, sprayerRecipe.get().value()) ||
                    !canInsertAmountIntoOutputSlot(inventory)) return false;
            assert Minecraft.getInstance().level != null;
            return canInsertItemIntoOutputSlot(inventory, sprayerRecipeCheck.value().output());
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

    private FakePlayer createFakePlayer(ServerLevel level) {
        return new FakePlayer(level, new GameProfile(UUID.randomUUID(), "Sprayer"));
    }

}
