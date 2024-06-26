package net.primal.outerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
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

    private LootTable.Builder autumnMapleLeavesDrops(float ... chance) {
        return this.leavesDrops(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES, OuterWorldBlocks.AUTUMN_MAPLE_SAPLING, chance)
                .pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0f))
                .conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS)
                .with(((LeafEntry.Builder<?>)this.addSurvivesExplosionCondition
                        (OuterWorldBlocks.AUTUMN_MAPLE_LEAVES, ItemEntry.builder(OuterWorldItems.AUTUMN_SAMARA)))
                .conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, 0.01f, 0.0111111114f, 0.0125f, 0.016666668f, 0.05f))));
    }

    public LootTable.Builder rubyLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop,
                ((LeafEntry.Builder<?>) ItemEntry.builder(item)
                        .apply(SetCountLootFunction
                                .builder(UniformLootNumberProvider
                                        .create(1.0f, 2.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

    @Override
    public void generate() {
        addDrop(OuterWorldBlocks.PURPLE_ICE, dropsWithSilkTouch(OuterWorldBlocks.PURPLE_ICE));
        addDrop(OuterWorldBlocks.RUBY_BLOCK);
        addDrop(OuterWorldBlocks.BLUE_CALCITE);

        addDrop(OuterWorldBlocks.VIOLET_STONE_RUBY_ORE, rubyLikeOreDrops(OuterWorldBlocks.VIOLET_STONE_RUBY_ORE, OuterWorldItems.RUBY));
        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE_RUBY_ORE, rubyLikeOreDrops(OuterWorldBlocks.DEEP_VIOLET_STONE_RUBY_ORE, OuterWorldItems.RUBY));

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

        addDrop(OuterWorldBlocks.VIOLET_STONE, (Block block) -> this.drops(block, OuterWorldBlocks.COBBLED_VIOLET_STONE));
        addDrop(OuterWorldBlocks.VIOLET_STONE_STAIRS);
        addDrop(OuterWorldBlocks.VIOLET_STONE_BUTTON);
        addDrop(OuterWorldBlocks.VIOLET_STONE_PRESSURE_PLATE);
        addDrop(OuterWorldBlocks.COBBLED_VIOLET_STONE);
        addDrop(OuterWorldBlocks.COBBLED_VIOLET_STONE_STAIRS);
        addDrop(OuterWorldBlocks.COBBLED_VIOLET_STONE_WALL);
        addDrop(OuterWorldBlocks.VIOLET_STONE_BRICKS);
        addDrop(OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS);
        addDrop(OuterWorldBlocks.VIOLET_STONE_BRICK_WALL);
        addDrop(OuterWorldBlocks.VIOLET_STONE_SLAB, slabDrops(OuterWorldBlocks.VIOLET_STONE_SLAB));
        addDrop(OuterWorldBlocks.COBBLED_VIOLET_STONE_SLAB, slabDrops(OuterWorldBlocks.COBBLED_VIOLET_STONE_SLAB));
        addDrop(OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB, slabDrops(OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB));

        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE, (Block block) -> this.drops(block, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE));
        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE_STAIRS);
        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE_BUTTON);
        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE_PRESSURE_PLATE);
        addDrop(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE);
        addDrop(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_STAIRS);
        addDrop(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_WALL);
        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS);
        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS);
        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_WALL);
        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE_SLAB, slabDrops(OuterWorldBlocks.DEEP_VIOLET_STONE_SLAB));
        addDrop(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_SLAB, slabDrops(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_SLAB));
        addDrop(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB, slabDrops(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB));

        addDrop(OuterWorldBlocks.SCORCH_STONE, (Block block) -> this.drops(block, OuterWorldBlocks.COBBLED_SCORCH_STONE));
        addDrop(OuterWorldBlocks.SCORCH_STONE_STAIRS);
        addDrop(OuterWorldBlocks.SCORCH_STONE_BUTTON);
        addDrop(OuterWorldBlocks.SCORCH_STONE_PRESSURE_PLATE);
        addDrop(OuterWorldBlocks.COBBLED_SCORCH_STONE);
        addDrop(OuterWorldBlocks.COBBLED_SCORCH_STONE_STAIRS);
        addDrop(OuterWorldBlocks.COBBLED_SCORCH_STONE_WALL);
        addDrop(OuterWorldBlocks.SCORCH_STONE_BRICKS);
        addDrop(OuterWorldBlocks.SCORCH_STONE_BRICK_STAIRS);
        addDrop(OuterWorldBlocks.SCORCH_STONE_BRICK_WALL);
        addDrop(OuterWorldBlocks.SCORCH_STONE_SLAB, slabDrops(OuterWorldBlocks.SCORCH_STONE_SLAB));
        addDrop(OuterWorldBlocks.COBBLED_SCORCH_STONE_SLAB, slabDrops(OuterWorldBlocks.COBBLED_SCORCH_STONE_SLAB));
        addDrop(OuterWorldBlocks.SCORCH_STONE_BRICK_SLAB, slabDrops(OuterWorldBlocks.SCORCH_STONE_BRICK_SLAB));

        addDrop(OuterWorldBlocks.DEEP_SCORCH_STONE, (Block block) -> this.drops(block, OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE));
        addDrop(OuterWorldBlocks.DEEP_SCORCH_STONE_STAIRS);
        addDrop(OuterWorldBlocks.DEEP_SCORCH_STONE_BUTTON);
        addDrop(OuterWorldBlocks.DEEP_SCORCH_STONE_PRESSURE_PLATE);
        addDrop(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE);
        addDrop(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_STAIRS);
        addDrop(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_WALL);
        addDrop(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICKS);
        addDrop(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_STAIRS);
        addDrop(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_WALL);
        addDrop(OuterWorldBlocks.DEEP_SCORCH_STONE_SLAB, slabDrops(OuterWorldBlocks.DEEP_SCORCH_STONE_SLAB));
        addDrop(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_SLAB, slabDrops(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_SLAB));
        addDrop(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_SLAB, slabDrops(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_SLAB));

        addDrop(OuterWorldBlocks.GNEISS);
        addDrop(OuterWorldBlocks.GNEISS_STAIRS);
        addDrop(OuterWorldBlocks.GNEISS_WALL);
        addDrop(OuterWorldBlocks.POLISHED_GNEISS);
        addDrop(OuterWorldBlocks.POLISHED_GNEISS_STAIRS);
        addDrop(OuterWorldBlocks.GNEISS_SLAB, slabDrops(OuterWorldBlocks.GNEISS_SLAB));
        addDrop(OuterWorldBlocks.POLISHED_GNEISS_SLAB, slabDrops(OuterWorldBlocks.POLISHED_GNEISS_SLAB));

        addDrop(OuterWorldBlocks.SYENITE);
        addDrop(OuterWorldBlocks.SYENITE_STAIRS);
        addDrop(OuterWorldBlocks.SYENITE_WALL);
        addDrop(OuterWorldBlocks.POLISHED_SYENITE);
        addDrop(OuterWorldBlocks.POLISHED_SYENITE_STAIRS);
        addDrop(OuterWorldBlocks.SYENITE_SLAB, slabDrops(OuterWorldBlocks.SYENITE_SLAB));
        addDrop(OuterWorldBlocks.POLISHED_SYENITE_SLAB, slabDrops(OuterWorldBlocks.POLISHED_SYENITE_SLAB));

        addDrop(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES,
                autumnMapleLeavesDrops(0.05f, 0.0625f, 0.083333336f, 0.1f));
    }
}
