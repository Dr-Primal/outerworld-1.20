package net.primal.outerworld;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.primal.outerworld.datagen.*;
import net.primal.outerworld.world.OuterWorldConfiguredFeatures;
import net.primal.outerworld.world.OuterWorldPlacedFeatures;

public class OuterWorldDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(OuterWorldBlockTagProvider::new);
		pack.addProvider(OuterWorldItemTagProvider::new);
		pack.addProvider(OuterWorldLootTableProvider::new);
		pack.addProvider(OuterWorldModelProvider::new);
		pack.addProvider(OuterWorldRecipeProvider::new);
		pack.addProvider(OuterWorldWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, OuterWorldConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, OuterWorldPlacedFeatures::boostrap);
	}
}