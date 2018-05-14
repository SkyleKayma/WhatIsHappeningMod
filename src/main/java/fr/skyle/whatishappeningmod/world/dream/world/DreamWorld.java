package fr.skyle.whatishappeningmod.world.dream.world;

import fr.skyle.whatishappeningmod.world.dream.dimension.DreamChunkProvider;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.storage.WorldInfo;

public class DreamWorld extends World {

    public DreamWorld(WorldInfo info, Profiler profilerIn) {
        super(null, info, new DreamWorldProvider(), profilerIn, true);
        this.chunkProvider = this.createChunkProvider();
    }

    @Override
    protected IChunkProvider createChunkProvider() {
        return new DreamChunkProvider(this);
    }

    @Override
    protected boolean isChunkLoaded(int x, int z, boolean allowEmpty) {
        return allowEmpty || !getChunkProvider().provideChunk(x, z).isEmpty();
    }
}