package net.primal.outerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.primal.outerworld.OuterWorld;
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

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(OuterWorldBlocks.STANDING_AUTUMN_MAPLE_SIGN.asItem())
                .add(OuterWorldBlocks.WALL_AUTUMN_MAPLE_SIGN.asItem());

        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(OuterWorldBlocks.HANGING_AUTUMN_MAPLE_SIGN.asItem());

        getOrCreateTagBuilder(OuterWorldTags.Items.AUTUMN_MAPLE_LOGS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem())
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem());
        //Create Custom Item Tag for Maple Wood TODO;

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES.asItem());


    }
}
