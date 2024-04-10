package net.primal.outerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.primal.outerworld.block.OuterWorldBlocks;
import net.primal.outerworld.item.OuterWorldItems;
import net.primal.outerworld.util.OuterWorldTags;

import java.util.List;
import java.util.function.Consumer;

public class OuterWorldRecipeProvider extends FabricRecipeProvider {
    public OuterWorldRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {



//Autumn Maple Wood Set

        //Woods
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.AUTUMN_MAPLE_WOOD, 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_WOOD.asItem())));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.PRIMUBERANT_WOOD, 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.PRIMUBERANT_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_WOOD.asItem())));

        //Stripped Woods
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem(), 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem())));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD.asItem(), 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD.asItem())));

        //Planks
        offerPlanksRecipe(exporter, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem(), OuterWorldTags.Items.AUTUMN_MAPLE_LOGS, 4);
        offerPlanksRecipe(exporter, OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem(), OuterWorldTags.Items.PRIMUBERANT_LOGS, 4);


        //Wooden Stairs
        createStairsRecipe(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS.asItem())));
        createStairsRecipe(OuterWorldBlocks.PRIMUBERANT_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_STAIRS.asItem())));

        //Wooden Slabs
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.AUTUMN_MAPLE_SLAB, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.PRIMUBERANT_SLAB, OuterWorldBlocks.PRIMUBERANT_PLANKS);


        //Wooden Buttons
        offerSingleOutputShapelessRecipe(exporter, OuterWorldBlocks.AUTUMN_MAPLE_BUTTON, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS, null);
        offerSingleOutputShapelessRecipe(exporter, OuterWorldBlocks.PRIMUBERANT_BUTTON, OuterWorldBlocks.PRIMUBERANT_PLANKS, null);


        //Wooden Pressure Plates
        offerPressurePlateRecipe(exporter, OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);
        offerPressurePlateRecipe(exporter, OuterWorldBlocks.PRIMUBERANT_PRESSURE_PLATE, OuterWorldBlocks.PRIMUBERANT_PLANKS);


        //Fences
        createFenceRecipe(OuterWorldBlocks.AUTUMN_MAPLE_FENCE.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_FENCE.asItem())));
        createFenceRecipe(OuterWorldBlocks.PRIMUBERANT_FENCE.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_FENCE.asItem())));

        //Fence Gates
        createFenceGateRecipe(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE.asItem())));
        createFenceGateRecipe(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE.asItem())));

        //Wooden Doors
        createDoorRecipe(OuterWorldBlocks.AUTUMN_MAPLE_DOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_DOOR.asItem())));
        createDoorRecipe(OuterWorldBlocks.PRIMUBERANT_DOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_DOOR.asItem())));

        //Wooden Trapdoors
        createTrapdoorRecipe(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR.asItem())));
        createTrapdoorRecipe(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR.asItem())));

        //Signs
        createSignRecipe(OuterWorldItems.AUTUMN_MAPLE_SIGN, Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.AUTUMN_MAPLE_SIGN)));
        createSignRecipe(OuterWorldItems.PRIMUBERANT_SIGN, Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.PRIMUBERANT_SIGN)));

        //Hanging Signs
        offerHangingSignRecipe(exporter, OuterWorldItems.HANGING_AUTUMN_MAPLE_SIGN, OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem());
        offerHangingSignRecipe(exporter, OuterWorldItems.HANGING_PRIMUBERANT_SIGN, OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem());

        //Boats
        offerBoatRecipe(exporter, OuterWorldItems.AUTUMN_MAPLE_BOAT, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem());
        offerBoatRecipe(exporter, OuterWorldItems.PRIMUBERANT_BOAT, OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem());

        //Boat With Chests
        offerChestBoatRecipe(exporter, OuterWorldItems.AUTUMN_MAPLE_CHEST_BOAT, OuterWorldItems.AUTUMN_MAPLE_BOAT);
        offerChestBoatRecipe(exporter, OuterWorldItems.PRIMUBERANT_CHEST_BOAT, OuterWorldItems.PRIMUBERANT_BOAT);


//Ruby Tools and Armor

        //Ruby + Ruby Block
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldItems.RUBY,
                RecipeCategory.DECORATIONS, OuterWorldBlocks.RUBY_BLOCK);

        //Ruby Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, OuterWorldItems.RUBY_HELMET, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_HELMET)));

        //Ruby Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, OuterWorldItems.RUBY_CHESTPLATE, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_CHESTPLATE)));

        //Ruby Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, OuterWorldItems.RUBY_LEGGINGS, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_LEGGINGS)));

        //Ruby Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, OuterWorldItems.RUBY_BOOTS, 1)
                .pattern("R R")
                .pattern("R R")
                .pattern("   ")
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_BOOTS)));

        //Ruby Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_SWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_SWORD)));

        //Ruby Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_PICKAXE)));

        //Ruby Axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_AXE, 1)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_AXE)));

        //Ruby Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_SHOVEL, 1)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_SHOVEL)));

        //Ruby Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_HOE, 1)
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_HOE)));
    }
}
