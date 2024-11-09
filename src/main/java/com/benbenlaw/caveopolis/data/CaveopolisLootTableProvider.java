package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class CaveopolisLootTableProvider extends VanillaBlockLoot {

    HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
    public CaveopolisLootTableProvider(HolderLookup.Provider provider) {
        super(provider);
    }

    @Override
    protected void generate() {

        //Colored Stone
        this.dropSelf(CaveopolisBlocks.COLORED_STONE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_STONE_SLAB.get());
        this.dropSelf(CaveopolisBlocks.COLORED_STONE_STAIRS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_STONE_WALL.get());
        this.dropSelf(CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_STONE_BUTTON.get());

        //Colored Mosaic
        this.dropSelf(CaveopolisBlocks.COLORED_MOSAIC.get());
        this.dropSelf(CaveopolisBlocks.COLORED_MOSAIC_SLAB.get());
        this.dropSelf(CaveopolisBlocks.COLORED_MOSAIC_STAIRS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_MOSAIC_WALL.get());
        this.dropSelf(CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_MOSAIC_BUTTON.get());

        //Colored Chaotic
        this.dropSelf(CaveopolisBlocks.COLORED_CHAOTIC.get());
        this.dropSelf(CaveopolisBlocks.COLORED_CHAOTIC_SLAB.get());
        this.dropSelf(CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_CHAOTIC_WALL.get());
        this.dropSelf(CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.get());

        //Colored Triple
        this.dropSelf(CaveopolisBlocks.COLORED_TRIPLE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_TRIPLE_SLAB.get());
        this.dropSelf(CaveopolisBlocks.COLORED_TRIPLE_STAIRS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_TRIPLE_WALL.get());
        this.dropSelf(CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_TRIPLE_BUTTON.get());

        //Colored Braid
        this.dropSelf(CaveopolisBlocks.COLORED_BRAID.get());
        this.dropSelf(CaveopolisBlocks.COLORED_BRAID_SLAB.get());
        this.dropSelf(CaveopolisBlocks.COLORED_BRAID_STAIRS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_BRAID_WALL.get());
        this.dropSelf(CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_BRAID_BUTTON.get());

        //Colored Encased
        this.dropSelf(CaveopolisBlocks.COLORED_ENCASED.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ENCASED_SLAB.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ENCASED_STAIRS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ENCASED_WALL.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ENCASED_BUTTON.get());

        //Colored Road
        this.dropSelf(CaveopolisBlocks.COLORED_ROAD.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ROAD_SLAB.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ROAD_STAIRS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ROAD_WALL.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_ROAD_BUTTON.get());




        this.dropSelf(CaveopolisBlocks.COLORED_PLANKS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_PLANK_FENCE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.get());
        this.createDoorTable(CaveopolisBlocks.COLORED_PLANK_DOOR.get());
        this.dropSelf(CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.get());
        this.dropSelf(CaveopolisBlocks.COLORED_LOG.get());
        this.dropSelf(CaveopolisBlocks.COLORED_WOOD.get());
        this.dropSelf(CaveopolisBlocks.STRIPPED_COLORED_LOG.get());
        this.dropSelf(CaveopolisBlocks.STRIPPED_COLORED_WOOD.get());

        //Change when colored apples and sapling are added
        this.add(CaveopolisBlocks.COLORED_LEAVES.get(), block ->
                createColoredLeavesDrops(block, Blocks.OAK_SAPLING, Items.APPLE, NORMAL_LEAVES_SAPLING_CHANCES));


        this.dropSelf(CaveopolisBlocks.COLORED_BRICKS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_STONE_BRICKS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_DIRT.get());
        this.dropSelf(CaveopolisBlocks.COLORED_COBBLESTONE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get());
        this.dropSelf(CaveopolisBlocks.COLORED_MARBLE.get());
        this.dropSelf(CaveopolisBlocks.COLORED_MARBLE_BRICKS.get());


    }


    @Override
    protected void add(@NotNull Block block, @NotNull LootTable.Builder table) {
        super.add(block, table);
        knownBlocks.add(block);
    }
    private final Set<Block> knownBlocks = new ReferenceOpenHashSet<>();

    @NotNull
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return knownBlocks;
    }

    private static final float[] NORMAL_LEAVES_STICK_CHANCES = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};


    protected static final LootItemCondition.Builder HAS_SHEARS = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Tags.Items.TOOLS_SHEAR));
    private LootItemCondition.Builder hasShearsOrSilkTouch() {
        return HAS_SHEARS.or(this.hasSilkTouch());
    }

    private LootItemCondition.Builder doesNotHaveShearsOrSilkTouch() {
        return this.hasShearsOrSilkTouch().invert();
    }
    protected LootTable.Builder createColoredLeavesDrops(Block p_249535_, Block p_251505_, Item apple, float... p_250753_) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createLeavesDrops(p_249535_, p_251505_, p_250753_)
                .withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .when(this.doesNotHaveShearsOrSilkTouch())
                                .add(
                                        ((LootPoolSingletonContainer.Builder<?>)this.applyExplosionCondition(p_249535_, LootItem.lootTableItem(apple)))
                                                .when(
                                                        BonusLevelTableCondition.bonusLevelFlatChance(
                                                                registrylookup.getOrThrow(Enchantments.FORTUNE), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F
                                                        )
                                                )
                                )
                );
    }

    protected LootTable.Builder createLeavesDrops(Block p_250088_, Block p_250731_, float... p_248949_) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchOrShearsDispatchTable(
                        p_250088_,
                        ((LootPoolSingletonContainer.Builder<?>)this.applyExplosionCondition(p_250088_, LootItem.lootTableItem(p_250731_)))
                                .when(BonusLevelTableCondition.bonusLevelFlatChance(registrylookup.getOrThrow(Enchantments.FORTUNE), p_248949_))
                )
                .withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .when(this.doesNotHaveShearsOrSilkTouch())
                                .add(
                                        ((LootPoolSingletonContainer.Builder<?>)this.applyExplosionDecay(
                                                p_250088_, LootItem.lootTableItem(Items.STICK).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                        ))
                                                .when(BonusLevelTableCondition.bonusLevelFlatChance(registrylookup.getOrThrow(Enchantments.FORTUNE), NORMAL_LEAVES_STICK_CHANCES))
                                )
                );
    }
    protected LootTable.Builder createSilkTouchOrShearsDispatchTable(Block p_250539_, LootPoolEntryContainer.Builder<?> p_251459_) {
        return createSelfDropDispatchTable(p_250539_, this.hasShearsOrSilkTouch(), p_251459_);
    }

}
