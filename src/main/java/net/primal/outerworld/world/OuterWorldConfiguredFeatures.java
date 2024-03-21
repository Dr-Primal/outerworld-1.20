package net.primal.outerworld.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.primal.outerworld.OuterWorld;
import net.primal.outerworld.block.OuterWorldBlocks;

public class OuterWorldConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> AUTUMN_MAPLE_KEY = registerKey("autumn_maple");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, AUTUMN_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(OuterWorldBlocks.AUTUMN_MAPLE_LOG),
                new StraightTrunkPlacer(
                        6,
                        4,
                        1
                ),

                BlockStateProvider.of(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES),
                new CherryFoliagePlacer(
                        ConstantIntProvider.create(4),
                        ConstantIntProvider.create(0),
                        ConstantIntProvider.create(5),
                        0.25f,
                        0.5f,
                        0.16666667f,
                        0.33333334f),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(OuterWorld.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
        RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
