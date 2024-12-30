package com.benbenlaw.caveopolis.screen;

import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoringItem;
import com.benbenlaw.core.screen.util.CoreSlotTextures;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class WorktableMenu extends AbstractContainerMenu {

    protected static int INPUT_SLOT = 0;
    protected int SPRAY_SLOT = 1;

    private int currentPage = 0;
    private static final int ITEMS_PER_PAGE = 21;

    int OUTPUT_SLOT = 2;
    int xStart = 46;
    int yStart = 16;
    int xOffset = 18;
    int yOffset = 18;
    int rows = 3;  // Output rows
    int columns = 7;  // Output columns
    int totalItems = 7;  // Output columns
    protected Level level;
    protected Player player;
    public final Container container = new SimpleContainer(23) { // rows * columns + 2
        @Override
        public void setChanged() {
            super.setChanged();
            slotsChanged(this);
        }
    };

    public WorktableMenu(int containerID, Inventory inventory, FriendlyByteBuf extraData) {
        this(containerID, inventory, ContainerLevelAccess.NULL);
    }

    public WorktableMenu(int containerID, Inventory inventory, final ContainerLevelAccess data) {
        super(CaveopolisMenuTypes.WORKTABLE_MENU.get(), containerID);
        this.player = inventory.player;
        this.level = inventory.player.level();

        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);

        //Input Slot
        this.addSlot(new Slot(container, INPUT_SLOT, 6, 16) {

            @Override
            public boolean mayPlace(@NotNull ItemStack stack ) {
                return !(stack.getItem() instanceof ColoringItem);

            }

            @Override
            public void set(@NotNull ItemStack stack) {
                super.set(stack);
                updateOutputSlots();
            }

            @Override
            public void onTake(@NotNull Player player, @NotNull ItemStack stack) {
                super.onTake(player, stack);
                updateOutputSlots();
            }

            @Override
            public @NotNull Pair<ResourceLocation, ResourceLocation> getNoItemIcon() {
                return Pair.of(InventoryMenu.BLOCK_ATLAS, CoreSlotTextures.BLOCK_SLOT);
            }
        });

        // Spray Slot
        this.addSlot(new Slot(container, SPRAY_SLOT, 6, 52) {

            @Override
            public boolean mayPlace(@NotNull ItemStack stack) {
                return stack.getItem() instanceof ColoringItem;
            }

            @Override
            public void set(@NotNull ItemStack stack) {
                super.set(stack);
                resetTotalItemsIfSprayCanChanged();
                updateOutputSlots();
            }

            @Override
            public void onTake(@NotNull Player player, @NotNull ItemStack stack) {
                super.onTake(player, stack);
                resetTotalItemsIfSprayCanChanged();
                updateOutputSlots();
            }

            private void resetTotalItemsIfSprayCanChanged() {
                totalItems = 0;
            }
        });

        // Output Slots
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                int xPos = xStart + (col * xOffset);
                int yPos = yStart + (row * yOffset);
                this.addSlot(new Slot(container, OUTPUT_SLOT++, xPos, yPos) {
                    @Override
                    public boolean mayPlace(@NotNull ItemStack stack) {
                        return false;
                    }

                    @Override
                    public void onTake(@NotNull Player player, @NotNull ItemStack stack) {
                        super.onTake(player, stack);

                        updateOutputSlots();

                        if (!container.getItem(INPUT_SLOT).isEmpty()) {
                            container.getItem(INPUT_SLOT).shrink(1);
                        }

                        if (container.getItem(INPUT_SLOT).isEmpty()) {
                            updateOutputSlots();
                        }

                        if (hasSprayCan()) {
                            container.getItem(SPRAY_SLOT).setDamageValue(container.getItem(SPRAY_SLOT).getDamageValue() + 1);
                        }

                    }


                });
            }
        }
    }

    public static SingleRecipeInput createRecipeInput(Container p_346312_) {
        return new SingleRecipeInput(p_346312_.getItem(0));
    }

    public List<List<ItemStack>> getRecipeResults(ItemStack input) {
        return getRecipesForInput(input, container, this.level)
                .stream()
                .map(recipeHolder -> recipeHolder.value().getResults())
                .collect(Collectors.toList());
    }

    public static List<RecipeHolder<WorktableRecipe>> getRecipesForInput(ItemStack input, Container container, Level level) {
        RecipeManager recipeManager = level.getRecipeManager();

        return recipeManager.getAllRecipesFor(WorktableRecipe.Type.INSTANCE)
                .stream()
                .filter(recipe -> {
                    WorktableRecipe worktableRecipe = recipe.value();
                    NonNullList<Ingredient> ingredients = worktableRecipe.getIngredients();

                    for (Ingredient ingredient : ingredients) {
                        for (ItemStack ingredientItem : ingredient.getItems()) {
                            if (ItemStack.isSameItem(ingredientItem, input)) {
                                return true;
                            }
                        }
                    }
                    return false;
                })
                .filter(recipe -> recipe.value().matches(createRecipeInput(container), level))
                .collect(Collectors.toList());
    }

    private void updateOutputSlots() {
        ItemStack inputItem = container.getItem(INPUT_SLOT);

        if (inputItem.isEmpty()) {
            clearOutputSlots();
            currentPage = 0;
            totalItems = 0;
            return;
        }

        List<ItemStack> flattenedList = getRecipeResults(inputItem)
                .stream()
                .flatMap(List::stream)
                .toList();

        int startIndex = currentPage * ITEMS_PER_PAGE;
        int endIndex = Math.min(startIndex + ITEMS_PER_PAGE, flattenedList.size());

        clearOutputSlots();
        DyeColor sprayColor = getSprayColor();
        Set<ItemStack> addedItems = new HashSet<>();

        for (int i = startIndex, outputIndex = 2; i < endIndex && outputIndex < container.getContainerSize(); i++) {
            ItemStack resultItem = flattenedList.get(i).copy();

            if (sprayColor != null) {
                resultItem.set(CoreDataComponents.COLOR, sprayColor.toString());
            }

            boolean isDuplicate = addedItems.stream().anyMatch(existingItem ->
                    ItemStack.isSameItemSameComponents(existingItem, resultItem) &&
                            Objects.equals(existingItem.getComponents(), resultItem.getComponents())
            );

            if (!isDuplicate) {
                container.setItem(outputIndex, resultItem);
                addedItems.add(resultItem);
                outputIndex++;
            }
        }

        totalItems = addedItems.size();
        container.setChanged();
    }


    private void clearOutputSlots() {
        for (int i = 2; i < container.getContainerSize(); i++) {
            container.setItem(i, ItemStack.EMPTY);
        }
    }


    public void nextPage() {
        List<ItemStack> flattenedList = getRecipeResults(container.getItem(INPUT_SLOT))
                .stream()
                .flatMap(List::stream)
                .toList();

        int maxPages = (int) Math.ceil((double) flattenedList.size() / ITEMS_PER_PAGE);
        if (currentPage < maxPages - 1) {
            currentPage++;
            clearOutputSlots();
            updateOutputSlots();
            slotsChanged(container);

        }
    }

    public void previousPage() {
        List<ItemStack> flattenedList = getRecipeResults(container.getItem(INPUT_SLOT))
                .stream()
                .flatMap(List::stream)
                .toList();

        int maxPages = (int) Math.ceil((double) flattenedList.size() / ITEMS_PER_PAGE);

        if (maxPages > 0) {
            if (currentPage > 0) {
                currentPage--;
            }
            clearOutputSlots();
            updateOutputSlots();
        }
    }

    boolean hasSprayCan() {
        return container.getItem(1).getItem() instanceof ColoringItem;
    }

    public DyeColor getSprayColor() {
        if (hasSprayCan()) {
            return ((ColoringItem) container.getItem(1).getItem()).getColor();
        }
        return null;
    }


    protected void clearContainer(Player player, Container container) {
        if (!player.isAlive() || player instanceof ServerPlayer && ((ServerPlayer) player).hasDisconnected()) {
            for (int slot : new int[]{0, 1}) {
                player.drop(container.removeItemNoUpdate(slot), false);
            }
        } else {
            Inventory inventory = player.getInventory();
            for (int slot : new int[]{0, 1}) {
                if (inventory.player instanceof ServerPlayer) {
                    inventory.placeItemBackInInventory(container.removeItemNoUpdate(slot));
                }
            }
        }
    }

    @Override
    public void removed(@NotNull Player player) {
        this.clearContainer(player, container);


    }



    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    private static final int TE_INVENTORY_SLOT_COUNT = 23;  // must be the number of slots you have!

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(@NotNull Player player) {
        return true;
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

}