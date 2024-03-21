package net.primal.outerworld.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.primal.outerworld.OuterWorld;
import net.primal.outerworld.block.OuterWorldBlocks;
import net.primal.outerworld.item.OuterWorldItems;

public class OuterWorldBoats {
    public static final Identifier AUTUMN_MAPLE_BOAT_ID =
            new Identifier(OuterWorld.MOD_ID, "autumn_maple_boat");
    public static final Identifier AUTUMN_MAPLE_CHEST_BOAT_ID =
            new Identifier(OuterWorld.MOD_ID, "autumn_maple_chest_boat");

    public static final RegistryKey<TerraformBoatType> AUTUMN_MAPLE_BOAT_KEY =
            TerraformBoatTypeRegistry.createKey(AUTUMN_MAPLE_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType chestnutBoat = new TerraformBoatType.Builder()
                .item(OuterWorldItems.AUTUMN_MAPLE_BOAT)
                .chestItem(OuterWorldItems.AUTUMN_MAPLE_CHEST_BOAT)
                .planks(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, AUTUMN_MAPLE_BOAT_KEY, chestnutBoat);
    }
}