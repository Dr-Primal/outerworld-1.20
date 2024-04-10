package net.primal.outerworld;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import net.primal.outerworld.block.OuterWorldBlocks;
import net.primal.outerworld.entity.OuterWorldBoats;
import net.primal.outerworld.particle.AutumnMapleLeavesParticle;
import net.primal.outerworld.particle.OuterWorldParticles;

public class OuterWorldClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(OuterWorldBlocks.AUTUMN_MAPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(OuterWorldBlocks.AUTUMN_MAPLE_SAPLING, RenderLayer.getCutout());

        StrippableBlockRegistry.register(OuterWorldBlocks.AUTUMN_MAPLE_LOG, OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG);
        StrippableBlockRegistry.register(OuterWorldBlocks.AUTUMN_MAPLE_WOOD, OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD);
        StrippableBlockRegistry.register(OuterWorldBlocks.PRIMUBERANT_LOG, OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG);
        StrippableBlockRegistry.register(OuterWorldBlocks.PRIMUBERANT_WOOD, OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD);

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
                        OuterWorldBlocks.AUTUMN_MAPLE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
                        OuterWorldBlocks.AUTUMN_MAPLE_HANGING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(OuterWorldBoats.AUTUMN_MAPLE_BOAT_ID, false);
        TerraformBoatClientHelper.registerModelLayers(OuterWorldBoats.PRIMUBERANT_BOAT_ID, false);

        ParticleFactoryRegistry.getInstance().register(OuterWorldParticles.AUTUMN_MAPLE_LEAVES, AutumnMapleLeavesParticle.Factory::new);
    }
}