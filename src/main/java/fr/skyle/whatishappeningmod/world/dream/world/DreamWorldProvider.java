package fr.skyle.whatishappeningmod.world.dream.world;

import fr.skyle.whatishappeningmod.world.dream.dimension.DreamChunkGenerator;
import fr.skyle.whatishappeningmod.world.dream.dimension.DreamDimension;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class DreamWorldProvider extends WorldProvider {

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new DreamChunkGenerator(this.world);
    }

    @Override
    public DimensionType getDimensionType() {
        return DreamDimension.DREAM_DIMENSION;
    }

    // --- SPECIFIC JOB ---

    /**
     * Define height of the world
     */
    @Override
    public int getHeight() {
        return 256;
    }

    /**
     * Define actual height of the world
     */
    @Override
    public int getActualHeight() {
        return 256;
    }

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

    /**
     * Returns 'true' if you allow lightning, or if not return false
     */
    @Override
    public boolean canDoLightning(net.minecraft.world.chunk.Chunk chunk) {
        return false;
    }

    /**
     * Returns 'true' if you allow to rain/to snow/to ice, or if not return false
     */
    @Override
    public boolean canDoRainSnowIce(Chunk chunk) {
        return false;
    }

    /**
     * Allows you to modify dream height
     */
    @Override
    @SideOnly(Side.CLIENT)
    public float getCloudHeight() {
        return 8.0F;
    }

    /**
     * Define spawn coordinate
     */
    @Nullable
    @Override
    public BlockPos getSpawnCoordinate() {
        return new BlockPos(5.0, 64.0, 5.0);
    }

    /**
     * Show horizontal fog or not
     */
    @Override
    @SideOnly(Side.CLIENT)
    public boolean doesXZShowFog(int x, int z) {
        return false;
    }
}