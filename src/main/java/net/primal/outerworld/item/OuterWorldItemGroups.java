package net.primal.outerworld.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.primal.outerworld.OuterWorld;
import net.primal.outerworld.block.OuterWorldBlocks;

public class OuterWorldItemGroups {
    public static final ItemGroup OUTER_WORLD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(OuterWorld.MOD_ID, "outer_world_blocks"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.outer_world_blocks"))
                .icon(() -> new ItemStack(OuterWorldBlocks.PURPLE_ICE)).entries((displayContext, entries) -> {

                    entries.add(OuterWorldBlocks.PURPLE_ICE);

                    entries.add(OuterWorldBlocks.RUBY_BLOCK);

                    entries.add(OuterWorldBlocks.VIOLET_STONE);
                    entries.add(OuterWorldBlocks.VIOLET_STONE_STAIRS);
                    entries.add(OuterWorldBlocks.VIOLET_STONE_SLAB);
                    entries.add(OuterWorldBlocks.VIOLET_STONE_BUTTON);
                    entries.add(OuterWorldBlocks.VIOLET_STONE_PRESSURE_PLATE);

                    entries.add(OuterWorldBlocks.COBBLED_VIOLET_STONE);
                    entries.add(OuterWorldBlocks.COBBLED_VIOLET_STONE_STAIRS);
                    entries.add(OuterWorldBlocks.COBBLED_VIOLET_STONE_SLAB);
                    entries.add(OuterWorldBlocks.COBBLED_VIOLET_STONE_WALL);

                    entries.add(OuterWorldBlocks.VIOLET_STONE_BRICKS);
                    entries.add(OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS);
                    entries.add(OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB);
                    entries.add(OuterWorldBlocks.VIOLET_STONE_BRICK_WALL);

                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE);
                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE_STAIRS);
                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE_SLAB);
                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE_BUTTON);
                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE_PRESSURE_PLATE);

                    entries.add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE);
                    entries.add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_STAIRS);
                    entries.add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_SLAB);
                    entries.add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_WALL);

                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS);
                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS);
                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB);
                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_WALL);

                    entries.add(OuterWorldBlocks.VIOLET_STONE_RUBY_ORE);
                    entries.add(OuterWorldBlocks.DEEP_VIOLET_STONE_RUBY_ORE);

                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_LOG);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD);
                    entries.add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG);
                    entries.add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_SLAB);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_BUTTON);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_DOOR);
                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR);
                    entries.add(OuterWorldItems.AUTUMN_MAPLE_BOAT);
                    entries.add(OuterWorldItems.AUTUMN_MAPLE_CHEST_BOAT);
                    entries.add(OuterWorldItems.AUTUMN_MAPLE_SIGN);
                    entries.add(OuterWorldItems.HANGING_AUTUMN_MAPLE_SIGN);

                    entries.add(OuterWorldBlocks.PRIMUBERANT_LOG);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_WOOD);
                    entries.add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG);
                    entries.add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_PLANKS);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_STAIRS);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_SLAB);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_BUTTON);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_PRESSURE_PLATE);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_FENCE);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_DOOR);
                    entries.add(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR);
                    entries.add(OuterWorldItems.PRIMUBERANT_BOAT);
                    entries.add(OuterWorldItems.PRIMUBERANT_CHEST_BOAT);
                    entries.add(OuterWorldItems.PRIMUBERANT_SIGN);
                    entries.add(OuterWorldItems.HANGING_PRIMUBERANT_SIGN);

                    entries.add(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES);

                }).build());

    public static final ItemGroup OUTER_WORLD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OuterWorld.MOD_ID, "outer_world_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.outer_world_items"))
                    .icon(() -> new ItemStack(OuterWorldItems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(OuterWorldItems.RUBY);

                        entries.add(OuterWorldItems.RUBY_HELMET);
                        entries.add(OuterWorldItems.RUBY_CHESTPLATE);
                        entries.add(OuterWorldItems.RUBY_LEGGINGS);
                        entries.add(OuterWorldItems.RUBY_BOOTS);

                        entries.add(OuterWorldItems.RUBY_SWORD);
                        entries.add(OuterWorldItems.RUBY_AXE);
                        entries.add(OuterWorldItems.RUBY_PICKAXE);
                        entries.add(OuterWorldItems.RUBY_SHOVEL);
                        entries.add(OuterWorldItems.RUBY_HOE);

                        entries.add(OuterWorldItems.AUTUMN_SAMARA);

                        entries.add(OuterWorldBlocks.AUTUMN_MAPLE_SAPLING);

                    }).build());


        public static void registerItemGroups() {
            OuterWorld.LOGGER.info("Registering OuterWorld ItemGroups for " + OuterWorld.MOD_ID);
        }
}
