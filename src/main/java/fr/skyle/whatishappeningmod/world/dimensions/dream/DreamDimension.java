package fr.skyle.whatishappeningmod.world.dimensions.dream;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DreamDimension {
    public static final int DIMENSION_ID = DimensionManager.getNextFreeDimId();
    public static final String DIM_NAME = "Dream";
    public static final DimensionType DREAM_DIMENSION = DimensionType.register(DIM_NAME, "_dream", DIMENSION_ID, DreamWorldProvider.class, false);

    public static void registerDimension() {
        DimensionManager.registerDimension(DIMENSION_ID, DreamDimension.DREAM_DIMENSION);
    }
}
