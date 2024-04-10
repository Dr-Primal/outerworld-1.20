package net.primal.outerworld.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.primal.outerworld.OuterWorld;
import net.primal.outerworld.block.OuterWorldBlocks;
import net.primal.outerworld.entity.OuterWorldBoats;

public class OuterWorldItems {
    //Boats
    public static final Item AUTUMN_MAPLE_BOAT =
            TerraformBoatItemHelper.registerBoatItem(OuterWorldBoats.AUTUMN_MAPLE_BOAT_ID,
                    OuterWorldBoats.AUTUMN_MAPLE_BOAT_KEY, false);
    public static final Item AUTUMN_MAPLE_CHEST_BOAT =
            TerraformBoatItemHelper.registerBoatItem(OuterWorldBoats.AUTUMN_MAPLE_CHEST_BOAT_ID,
                    OuterWorldBoats.AUTUMN_MAPLE_BOAT_KEY, true);

    public static final Item PRIMUBERANT_BOAT =
            TerraformBoatItemHelper.registerBoatItem(OuterWorldBoats.PRIMUBERANT_BOAT_ID,
                    OuterWorldBoats.PRIMUBERANT_BOAT_KEY, false);
    public static final Item PRIMUBERANT_CHEST_BOAT =
            TerraformBoatItemHelper.registerBoatItem(OuterWorldBoats.PRIMUBERANT_CHEST_BOAT_ID,
                    OuterWorldBoats.PRIMUBERANT_BOAT_KEY, true);

    //Signs
    public static final Item AUTUMN_MAPLE_SIGN = registerItem("autumn_maple_sign",
            new SignItem(new FabricItemSettings().maxCount(16),
                    OuterWorldBlocks.STANDING_AUTUMN_MAPLE_SIGN, OuterWorldBlocks.WALL_AUTUMN_MAPLE_SIGN));
    public static final Item HANGING_AUTUMN_MAPLE_SIGN = registerItem("autumn_maple_hanging_sign",
            new HangingSignItem(OuterWorldBlocks.HANGING_AUTUMN_MAPLE_SIGN,
                    OuterWorldBlocks.WALL_HANGING_AUTUMN_MAPLE_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item PRIMUBERANT_SIGN = registerItem("primuberant_sign",
            new SignItem(new FabricItemSettings().maxCount(16),
                    OuterWorldBlocks.STANDING_PRIMUBERANT_SIGN, OuterWorldBlocks.WALL_PRIMUBERANT_SIGN));
    public static final Item HANGING_PRIMUBERANT_SIGN = registerItem("primuberant_hanging_sign",
            new HangingSignItem(OuterWorldBlocks.HANGING_PRIMUBERANT_SIGN,
                    OuterWorldBlocks.WALL_HANGING_PRIMUBERANT_SIGN, new FabricItemSettings().maxCount(16)));

    //Ruby Stuff
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(OuterWorldToolMaterial.RUBY, 1, -2.8f,
            new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(OuterWorldToolMaterial.RUBY, 5, -3f,
            new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(OuterWorldToolMaterial.RUBY, 1.5f, -3f,
            new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(OuterWorldToolMaterial.RUBY, 3, -2.4f,
            new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(OuterWorldToolMaterial.RUBY, -3, 0f,
            new FabricItemSettings()));


    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(OuterWorldArmorMaterials.RUBY, ArmorItem.Type.HELMET,
            new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(OuterWorldArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE,
            new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(OuterWorldArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS,
            new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(OuterWorldArmorMaterials.RUBY, ArmorItem.Type.BOOTS,
            new FabricItemSettings()));

    //Food Items
    public static final Item AUTUMN_SAMARA = registerItem("autumn_samara",
            new Item(new FabricItemSettings().food(OuterWorldFoodComponents.AUTUMN_SAMARA)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OuterWorld.MOD_ID, name), item);
    }

    public static void registerOWItems() {
        OuterWorld.LOGGER.info("Registering OuterWorld Items for " + OuterWorld.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(OuterWorldItems::addItemsToIngredientItemGroup);
    }
}
