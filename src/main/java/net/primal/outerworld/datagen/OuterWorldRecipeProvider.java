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

        //Autumn Maple Wood
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.AUTUMN_MAPLE_WOOD, 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_WOOD.asItem())));

        //Stripped Autumn Maple Wood
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem(), 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem())));

        //Autumn Maple Planks
        offerPlanksRecipe(exporter, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem(), OuterWorldTags.Items.AUTUMN_MAPLE_LOGS, 4);

        //Autumn Maple Stairs
        createStairsRecipe(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS.asItem())));

        //Autumn Maple Slab
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.AUTUMN_MAPLE_SLAB, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);

        //Autumn Maple Button
        offerSingleOutputShapelessRecipe(exporter, OuterWorldBlocks.AUTUMN_MAPLE_BUTTON, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS, null);

        //Autumn Maple Pressure Plate
        offerPressurePlateRecipe(exporter, OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);

        //Autumn Maple Fence
        createFenceRecipe(OuterWorldBlocks.AUTUMN_MAPLE_FENCE.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_FENCE.asItem())));

        //Autumn Maple Fence Gate
        createFenceGateRecipe(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE.asItem())));

        //Autumn Maple Door
        createDoorRecipe(OuterWorldBlocks.AUTUMN_MAPLE_DOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_DOOR.asItem())));

        //Autumn Maple Trapdoor
        createTrapdoorRecipe(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR.asItem())));

        //Autumn Maple Sign
        createSignRecipe(OuterWorldItems.AUTUMN_MAPLE_SIGN, Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.AUTUMN_MAPLE_SIGN)));

        //Autumn Maple Hanging Sign
        offerHangingSignRecipe(exporter, OuterWorldItems.HANGING_AUTUMN_MAPLE_SIGN, OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem());

        //Autumn Maple Boat

        offerBoatRecipe(exporter, OuterWorldItems.AUTUMN_MAPLE_BOAT, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem());
        //Autumn Maple Boat With Chest

        offerChestBoatRecipe(exporter, OuterWorldItems.AUTUMN_MAPLE_CHEST_BOAT, OuterWorldItems.AUTUMN_MAPLE_BOAT);


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
