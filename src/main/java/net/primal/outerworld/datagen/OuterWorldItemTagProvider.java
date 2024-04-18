package net.primal.outerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.primal.outerworld.block.OuterWorldBlocks;
import net.primal.outerworld.item.OuterWorldItems;
import net.primal.outerworld.util.OuterWorldTags;

import java.util.concurrent.CompletableFuture;

public class OuterWorldItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public OuterWorldItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(OuterWorldItems.RUBY_HELMET, OuterWorldItems.RUBY_CHESTPLATE, OuterWorldItems.RUBY_LEGGINGS, OuterWorldItems.RUBY_BOOTS);

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE.asItem())
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE.asItem())
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_BUTTONS)
                .add(OuterWorldBlocks.VIOLET_STONE_BUTTON.asItem())
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BUTTON.asItem())
                .add(OuterWorldBlocks.SCORCH_STONE_BUTTON.asItem())
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_SLAB.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(OuterWorldBlocks.VIOLET_STONE_SLAB.asItem())
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE_SLAB.asItem())
                .add(OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB.asItem())
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_SLAB.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_SLAB.asItem())
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB.asItem())
                .add(OuterWorldBlocks.SCORCH_STONE_SLAB.asItem())
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE_SLAB.asItem())
                .add(OuterWorldBlocks.SCORCH_STONE_BRICK_SLAB.asItem())
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_SLAB.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_SLAB.asItem())
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_SLAB.asItem())
                .add(OuterWorldBlocks.GNEISS_SLAB.asItem())
                .add(OuterWorldBlocks.POLISHED_GNEISS_SLAB.asItem())
                .add(OuterWorldBlocks.SYENITE_SLAB.asItem())
                .add(OuterWorldBlocks.POLISHED_SYENITE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(OuterWorldBlocks.VIOLET_STONE_STAIRS.asItem())
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE_STAIRS.asItem())
                .add(OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS.asItem())
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_STAIRS.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_STAIRS.asItem())
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS.asItem())
                .add(OuterWorldBlocks.SCORCH_STONE_STAIRS.asItem())
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE_STAIRS.asItem())
                .add(OuterWorldBlocks.SCORCH_STONE_BRICK_STAIRS.asItem())
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_STAIRS.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_STAIRS.asItem())
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_STAIRS.asItem())
                .add(OuterWorldBlocks.GNEISS_STAIRS.asItem())
                .add(OuterWorldBlocks.POLISHED_GNEISS_STAIRS.asItem())
                .add(OuterWorldBlocks.SYENITE_STAIRS.asItem())
                .add(OuterWorldBlocks.POLISHED_SYENITE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE_WALL.asItem())
                .add(OuterWorldBlocks.VIOLET_STONE_BRICK_WALL.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_WALL.asItem())
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_WALL.asItem())
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE_WALL.asItem())
                .add(OuterWorldBlocks.SCORCH_STONE_BRICK_WALL.asItem())
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_WALL.asItem())
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_WALL.asItem())
                .add(OuterWorldBlocks.GNEISS_WALL.asItem())
                .add(OuterWorldBlocks.SYENITE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_BUTTON.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_DOOR.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(OuterWorldBlocks.STANDING_AUTUMN_MAPLE_SIGN.asItem())
                .add(OuterWorldBlocks.WALL_AUTUMN_MAPLE_SIGN.asItem())
                .add(OuterWorldBlocks.STANDING_PRIMUBERANT_SIGN.asItem())
                .add(OuterWorldBlocks.WALL_PRIMUBERANT_SIGN.asItem());

        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(OuterWorldBlocks.HANGING_AUTUMN_MAPLE_SIGN.asItem())
                .add(OuterWorldBlocks.HANGING_PRIMUBERANT_SIGN.asItem());

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(OuterWorldItems.AUTUMN_MAPLE_BOAT)
                .add(OuterWorldItems.PRIMUBERANT_BOAT);

        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(OuterWorldItems.AUTUMN_MAPLE_CHEST_BOAT)
                .add(OuterWorldItems.PRIMUBERANT_CHEST_BOAT);

        getOrCreateTagBuilder(OuterWorldTags.Items.AUTUMN_MAPLE_LOGS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem());

        getOrCreateTagBuilder(OuterWorldTags.Items.PRIMUBERANT_LOGS)
                .add(OuterWorldBlocks.PRIMUBERANT_LOG.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_WOOD.asItem())
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem())
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_LOG.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_WOOD.asItem())
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem())
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(OuterWorldItems.RUBY_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(OuterWorldItems.RUBY_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(OuterWorldItems.RUBY_AXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(OuterWorldItems.RUBY_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(OuterWorldItems.RUBY_HOE);

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_SAPLING.asItem());

        getOrCreateTagBuilder(ItemTags.COMPLETES_FIND_TREE_TUTORIAL)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_LOG.asItem())
                .add(OuterWorldBlocks.PRIMUBERANT_WOOD.asItem())
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem())
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD.asItem());


    }
}
