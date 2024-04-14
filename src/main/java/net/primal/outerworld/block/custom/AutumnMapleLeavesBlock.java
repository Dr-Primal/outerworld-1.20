package net.primal.outerworld.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.CherryLeavesBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.primal.outerworld.particle.OuterWorldParticles;

public class AutumnMapleLeavesBlock extends LeavesBlock {
    public AutumnMapleLeavesBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) != 0) {
            return;
        }
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (CherryLeavesBlock.isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
            return;
        }
        ParticleUtil.spawnParticle(world, pos, random, OuterWorldParticles.AUTUMN_MAPLE_LEAVES);
    }
}