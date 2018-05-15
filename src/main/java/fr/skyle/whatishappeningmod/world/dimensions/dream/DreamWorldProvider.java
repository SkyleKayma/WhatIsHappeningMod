package fr.skyle.whatishappeningmod.world.dimensions.dream;

import fr.skyle.whatishappeningmod.world.biomes.DreamBiomeProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class DreamWorldProvider extends WorldProvider {

    public DreamWorldProvider() {
        this.biomeProvider = new DreamBiomeProvider();
    }

    @Override
    public DimensionType getDimensionType() {
        return DreamDimension.DREAM_DIMENSION;
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new DreamChunkGenerator(this.world, this.world.getSeed(), new BlockPos(0.0, 65.0, 0.0));
    }

    // --- SPECIFIC JOB ---

    // Really importants methods

    /**
     * Returns 'true' if it's possible to respawn in this world if player died, or if not return false
     */
    @Override
    public boolean canRespawnHere() {
        return false;
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    @Override
    public boolean isSurfaceWorld() {
        return true;
    }

    //Others methods
}