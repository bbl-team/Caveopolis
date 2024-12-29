package com.benbenlaw.caveopolis.screen;

import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoringItem;
import com.benbenlaw.core.screen.util.CoreSlotTextures;
import com.benbenlaw.core.screen.util.slot.CoreSlot;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Collectors;

public class WorktableMenu extends AbstractContainerMenu {

    protected static int INPUT_SLOT = 0;
    protected int SPRAY_SLOT = 1;
    protected Level level;
    protected Player player;
    public final Container container = new SimpleContainer(23) {
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

        this.addSlot(new Slot(container, INPUT_SLOT, 8, 16) {

            @Override
            public boolean mayPlace(ItemStack stack ) {
                return !(stack.getItem() instanceof ColoringItem);

            }

            @Override
            public void set(ItemStack stack) {
                super.set(stack);
                updateOutputSlots();
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
                super.onTake(player, stack);
                updateOutputSlots();
            }

            @Override
            public @NotNull Pair<ResourceLocation, ResourceLocation> getNoItemIcon() {
                return Pair.of(InventoryMenu.BLOCK_ATLAS, CoreSlotTextures.BLOCK_SLOT);
            }
        });

        // Spray Slot
        this.addSlot(new Slot(container, SPRAY_SLOT, 8, 52) {

            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.getItem() instanceof ColoringItem;
            }

            @Override
            public void set(ItemStack stack) {
                super.set(stack);
                updateOutputSlots();
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
                super.onTake(player, stack);
                updateOutputSlots();
            }

        });

        // Define Output Slots
        int OUTPUT_SLOT = 2;
        int xStart = 43;
        int yStart = 15;
        int xOffset = 18;
        int yOffset = 18;
        int rows = 3;  // Output rows
        int columns = 7;  // Output columns

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
                    public void onTake(Player player, ItemStack stack) {
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

    private List<List<ItemStack>> getRecipeResults(ItemStack input) {
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
            // Clear output slots if no input item exists
            for (int i = 2; i < container.getContainerSize(); i++) {
                container.setItem(i, ItemStack.EMPTY);
            }
            return;
        }

        List<List<ItemStack>> allResults = getRecipeResults(inputItem);
        DyeColor sprayColor = getSprayColor();

        // Clear all the output slots before applying the new results
        for (int i = 2; i < container.getContainerSize(); i++) {
            container.setItem(i, ItemStack.EMPTY);
        }

        int outputIndex = 2;
        Set<ItemStack> addedItems = new HashSet<>(); // Set to track added items

        // Iterate over all recipe results
        for (List<ItemStack> results : allResults) {
            for (ItemStack result : results) {
                if (outputIndex < container.getContainerSize()) {

                    // Apply spray color if available
                    if (sprayColor != null) {
                        result.set(CoreDataComponents.COLOR, sprayColor.toString());
                    }

                    // Check if this result has already been added (using a more robust comparison)
                    if (!isItemInSet(addedItems, result)) {
                        container.setItem(outputIndex, result.copy());
                        addedItems.add(result.copy()); // Add the item to the set to prevent future duplicates
                        outputIndex++;
                    }
                }
            }
        }
    }


    // Helper method to compare item stacks more accurately
    private boolean isItemInSet(Set<ItemStack> addedItems, ItemStack result) {
        // Compare by item, count, and NBT data (if necessary)
        for (ItemStack stack : addedItems) {
            // Compare the base item and count first
            if (ItemStack.isSameItem(stack, result) && stack.getCount() == result.getCount()) {
                // Compare NBT data (use the getOrCreateTag method)
                if (stack.getComponents().equals(result.getComponents())) {
                    return true;  // The items are considered the same
                }
            }
        }
        return false;
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
            System.out.println("Invalid slotIndex:" + index);
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
