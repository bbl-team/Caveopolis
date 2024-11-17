package com.benbenlaw.caveopolis.screen;

import com.benbenlaw.caveopolis.recipe.CaveopolisRecipes;
import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
import com.benbenlaw.core.block.IColored;
import com.benbenlaw.core.item.CoreDataComponents;
import com.google.common.collect.Lists;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WorktableMenu extends AbstractContainerMenu {
    public static final int INPUT_SLOT = 0;
    public static final int RESULT_SLOT = 1;
    private static final int INV_SLOT_START = 2;
    private static final int INV_SLOT_END = 29;
    private static final int USE_ROW_SLOT_START = 29;
    private static final int USE_ROW_SLOT_END = 38;
    private final ContainerLevelAccess access;
    private final DataSlot selectedRecipeIndex = DataSlot.standalone();
    private final Level level;
    private List<RecipeHolder<WorktableRecipe>> recipes = Lists.newArrayList();
    private ItemStack input = ItemStack.EMPTY;
    long lastSoundTime;
    final Slot inputSlot;
    final Slot resultSlot;
    Runnable slotUpdateListener = () -> {
    };
    public final Container container = new SimpleContainer(1) {
        @Override
        public void setChanged() {
            super.setChanged();
            WorktableMenu.this.slotsChanged(this);
            WorktableMenu.this.slotUpdateListener.run();
        }
    };
    final ResultContainer resultContainer = new ResultContainer();

    public WorktableMenu(int p_40294_, Inventory p_40295_, FriendlyByteBuf buf) {
        this(p_40294_, p_40295_, ContainerLevelAccess.NULL);
    }


    public WorktableMenu(int p_40297_, Inventory p_40298_, final ContainerLevelAccess p_40299_) {
        super(CaveopolisMenuTypes.WORKTABLE_MENU.get(), p_40297_);
        this.access = p_40299_;
        this.level = p_40298_.player.level();
        this.inputSlot = this.addSlot(new Slot(this.container, 0, 20, 33));
        this.resultSlot = this.addSlot(new Slot(this.resultContainer, 1, 143, 33) {
            @Override
            public boolean mayPlace(ItemStack p_40362_) {
                return false;
            }

            @Override
            public void onTake(Player p_150672_, ItemStack p_150673_) {
                p_150673_.onCraftedBy(p_150672_.level(), p_150672_, p_150673_.getCount());
                WorktableMenu.this.resultContainer.awardUsedRecipes(p_150672_, this.getRelevantItems());
                RecipeHolder<WorktableRecipe> selectedRecipe = WorktableMenu.this.recipes.get(WorktableMenu.this.getSelectedRecipeIndex());
                if (selectedRecipe != null) {
                    WorktableRecipe recipe = selectedRecipe.value();

                    recipe.getIngredients().forEach(ingredient -> {
                        ItemStack inputStack = WorktableMenu.this.inputSlot.getItem();
                        if (ingredient.test(inputStack)) {
                            int requiredAmount = ingredient.getItems()[0].getCount();
                            inputStack.shrink(requiredAmount);
                            WorktableMenu.this.inputSlot.set(inputStack.isEmpty() ? ItemStack.EMPTY : inputStack);
                            setupRecipeList(container, inputStack);
                        }
                    });
                }

                WorktableMenu.this.setupResultSlot();
                WorktableMenu.this.access.execute((level, pos) -> {
                    long gameTime = level.getGameTime();
                    if (WorktableMenu.this.lastSoundTime != gameTime) {
                        level.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundSource.BLOCKS, 1.0F, 1.0F);
                        WorktableMenu.this.lastSoundTime = gameTime;
                    }
                });

                super.onTake(p_150672_, p_150673_);
            }

            private List<ItemStack> getRelevantItems() {
                return List.of(WorktableMenu.this.inputSlot.getItem());
            }
        });

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(p_40298_, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; k++) {
            this.addSlot(new Slot(p_40298_, k, 8 + k * 18, 142));
        }

        this.addDataSlot(this.selectedRecipeIndex);
    }
    public int getSelectedRecipeIndex() {
        return this.selectedRecipeIndex.get();
    }

    public List<RecipeHolder<WorktableRecipe>> getRecipes() {
        return this.recipes;
    }

    public int getNumRecipes() {
        return this.recipes.size();
    }

    public boolean hasInputItem() {
        return this.inputSlot.hasItem() && !this.recipes.isEmpty();
    }

    @Override
    public boolean stillValid(Player p_40307_) {
        return true;
    }

    @Override
    public boolean clickMenuButton(Player p_40309_, int p_40310_) {
        if (this.isValidRecipeIndex(p_40310_)) {
            this.selectedRecipeIndex.set(p_40310_);
            this.setupResultSlot();
        }

        return true;
    }

    private boolean isValidRecipeIndex(int p_40335_) {
        return p_40335_ >= 0 && p_40335_ < this.recipes.size();
    }

    @Override
    public void slotsChanged(Container pContainer) {
        ItemStack itemstack = this.inputSlot.getItem();

        if (itemstack.isEmpty()) {
            this.input = ItemStack.EMPTY;
            this.resultSlot.set(ItemStack.EMPTY);
            this.recipes.clear();
        } else if (!itemstack.is(this.input.getItem())) {
            this.input = itemstack.copy();
            this.setupRecipeList(pContainer, itemstack);
        }
        this.setupResultSlot();
    }

    private static SingleRecipeInput createRecipeInput(Container p_346312_) {
        return new SingleRecipeInput(p_346312_.getItem(0));
    }

    private void setupRecipeList(Container pContainer, ItemStack pStack) {
        this.recipes = new ArrayList<>();

        DataComponentMap inputComponents = input.getComponents();
        DataComponentMap containerComponents = container.getItem(0).getComponents();

        Object inputColor = inputComponents.get(CoreDataComponents.COLOR.get());
        Object inputLit = inputComponents.get(CoreDataComponents.LIT.get());

        if (!pStack.isEmpty()) {
            this.recipes = this.level.getRecipeManager()
                    .getAllRecipesFor(WorktableRecipe.Type.INSTANCE)
                    .stream()
                    .filter(recipe -> {
                        boolean matchesInput = recipe.value().getIngredients().stream().anyMatch(ingredient -> ingredient.test(pStack));
                        boolean sufficientCount = recipe.value().getIngredients().stream().allMatch(ingredient ->
                                ingredient.getItems().length > 0 &&
                                        ingredient.getItems()[0].getCount() <= pStack.getCount()
                        );

                        ItemStack outputStack = recipe.value().getResultItem(this.level.registryAccess());
                        DataComponentMap outputComponents = outputStack.getComponents();
                        Object outputColor = outputComponents.get(CoreDataComponents.COLOR.get());
                        Object outputLit = outputComponents.get(CoreDataComponents.LIT.get());

                        if (inputColor == null && inputLit == null) {
                            return matchesInput && sufficientCount;
                        }

                        boolean colorMatches = inputColor == null || inputColor.equals(outputColor);
                        boolean litMatches = inputLit == null || inputLit.equals(outputLit);

                        return matchesInput && sufficientCount && colorMatches && litMatches;
                    })
                    .collect(Collectors.toList());
        }
    }


    void setupResultSlot() {
        if (!this.recipes.isEmpty() && this.isValidRecipeIndex(this.selectedRecipeIndex.get())) {
            RecipeHolder<WorktableRecipe> recipeholder = this.recipes.get(this.selectedRecipeIndex.get());
            ItemStack itemstack = recipeholder.value().assemble(createRecipeInput(this.container), this.level.registryAccess());
            if (itemstack.isItemEnabled(this.level.enabledFeatures())) {
                this.resultContainer.setRecipeUsed(recipeholder);
                this.resultSlot.set(itemstack);
            } else {
                this.resultSlot.set(ItemStack.EMPTY);
            }
        } else {
            this.resultSlot.set(ItemStack.EMPTY);
        }

        this.broadcastChanges();
    }

    @Override
    public MenuType<?> getType() {
        return CaveopolisMenuTypes.WORKTABLE_MENU.get();
    }

    public void registerUpdateListener(Runnable p_40324_) {
        this.slotUpdateListener = p_40324_;
    }

    @Override
    public boolean canTakeItemForPickAll(ItemStack p_40321_, Slot p_40322_) {
        return p_40322_.container != this.resultContainer && super.canTakeItemForPickAll(p_40321_, p_40322_);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack stackInSlot = slot.getItem();
            itemstack = stackInSlot.copy();

            if (index == RESULT_SLOT) {
                if (!this.moveItemStackTo(stackInSlot, INV_SLOT_START, USE_ROW_SLOT_END, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(stackInSlot, itemstack);
            } else if (index == INPUT_SLOT) {
                if (!this.moveItemStackTo(stackInSlot, INV_SLOT_START, USE_ROW_SLOT_END, false)) {
                    return ItemStack.EMPTY;
                }
            } else {
                if (this.inputSlot.mayPlace(stackInSlot)) {
                    if (!this.moveItemStackTo(stackInSlot, INPUT_SLOT, INPUT_SLOT + 1, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (index >= INV_SLOT_START && index < USE_ROW_SLOT_START) {
                    if (!this.moveItemStackTo(stackInSlot, USE_ROW_SLOT_START, USE_ROW_SLOT_END, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (index >= USE_ROW_SLOT_START && index < USE_ROW_SLOT_END) {
                    if (!this.moveItemStackTo(stackInSlot, INV_SLOT_START, USE_ROW_SLOT_START, false)) {
                        return ItemStack.EMPTY;
                    }
                }
            }

            if (stackInSlot.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            }

            slot.setChanged();

            if (stackInSlot.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, stackInSlot);
            this.broadcastChanges();
        }

        return itemstack;
    }


    @Override
    public void removed(Player p_40326_) {
        super.removed(p_40326_);
        this.resultContainer.removeItemNoUpdate(1);
        this.access.execute((p_40313_, p_40314_) -> this.clearContainer(p_40326_, this.container));
    }
}
