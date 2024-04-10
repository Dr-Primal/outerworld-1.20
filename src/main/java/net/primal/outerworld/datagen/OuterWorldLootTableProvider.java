package net.primal.outerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.primal.outerworld.block.OuterWorldBlocks;
import net.primal.outerworld.item.OuterWorldItems;

public class OuterWorldLootTableProvider extends FabricBlockLootTableProvider {
    public OuterWorldLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public LootTable.Builder autumnMapleLeavesDrops(Block leaves, Block drop, float ... chance) {
        return this.leavesDrops(leaves, drop, chance)
                .pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0f))
                .conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS)
                .with(((LeafEntry.Builder<?>)this.addSurvivesExplosionCondition
                        (leaves, ItemEntry.builder(OuterWorldItems.AUTUMN_SAMARA)))
                .conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, 0.01f, 0.0111111114f, 0.0125f, 0.016666668f, 0.05f))));
    }

    @Override
    public void generate() {
        addDrop(OuterWorldBlocks.PURPLE_ICE);
        addDrop(OuterWorldBlocks.RUBY_BLOCK);

        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_LOG);
        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_WOOD);
        addDrop(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG);
        addDrop(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD);
        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);
        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS);
        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_BUTTON);
        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE);
        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_FENCE);
        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE);
        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR);

        addDrop(OuterWorldBlocks.STANDING_AUTUMN_MAPLE_SIGN);
        addDrop(OuterWorldBlocks.WALL_AUTUMN_MAPLE_SIGN);
        addDrop(OuterWorldBlocks.HANGING_AUTUMN_MAPLE_SIGN);
        addDrop(OuterWorldBlocks.WALL_HANGING_AUTUMN_MAPLE_SIGN);

        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_DOOR, doorDrops(OuterWorldBlocks.AUTUMN_MAPLE_DOOR));
        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_SLAB, slabDrops(OuterWorldBlocks.AUTUMN_MAPLE_SLAB));

        addDrop(OuterWorldBlocks.PRIMUBERANT_LOG);
        addDrop(OuterWorldBlocks.PRIMUBERANT_WOOD);
        addDrop(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG);
        addDrop(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD);
        addDrop(OuterWorldBlocks.PRIMUBERANT_PLANKS);
        addDrop(OuterWorldBlocks.PRIMUBERANT_STAIRS);
        addDrop(OuterWorldBlocks.PRIMUBERANT_BUTTON);
        addDrop(OuterWorldBlocks.PRIMUBERANT_PRESSURE_PLATE);
        addDrop(OuterWorldBlocks.PRIMUBERANT_FENCE);
        addDrop(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE);
        addDrop(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR);

        addDrop(OuterWorldBlocks.STANDING_PRIMUBERANT_SIGN);
        addDrop(OuterWorldBlocks.WALL_PRIMUBERANT_SIGN);
        addDrop(OuterWorldBlocks.HANGING_PRIMUBERANT_SIGN);
        addDrop(OuterWorldBlocks.WALL_HANGING_PRIMUBERANT_SIGN);

        addDrop(OuterWorldBlocks.PRIMUBERANT_DOOR, doorDrops(OuterWorldBlocks.PRIMUBERANT_DOOR));
        addDrop(OuterWorldBlocks.PRIMUBERANT_SLAB, slabDrops(OuterWorldBlocks.PRIMUBERANT_SLAB));


        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES,
                autumnMapleLeavesDrops(
                OuterWorldBlocks.AUTUMN_MAPLE_LEAVES,
                OuterWorldBlocks.AUTUMN_MAPLE_SAPLING,
                0.05f, 0.0625f, 0.083333336f, 0.1f));
    }
}
