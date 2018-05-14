package fr.skyle.whatishappeningmod;

import fr.skyle.whatishappeningmod.events.CommonEventsHandler;
import fr.skyle.whatishappeningmod.handler.RegisteringHandler;
import fr.skyle.whatishappeningmod.proxy.WIHMCommonProxy;
import fr.skyle.whatishappeningmod.world.dream.dimension.DreamDimension;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModWIHM.MODID, name = ModWIHM.NAME, version = ModWIHM.VERSION, acceptedMinecraftVersions = ModWIHM.ACCEPTED_VERSION)
public class ModWIHM {

    public static final String MODID = "whatishappeningmod";
    public static final String NAME = "What Is Happening mod";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSION = "[1.12.2]";

    @Mod.Instance(ModWIHM.MODID)
    public static ModWIHM instance;

    @SidedProxy(clientSide = "fr.skyle.whatishappeningmod.proxy.WIHMClientProxy", serverSide = "fr.skyle.whatishappeningmod.proxy.WIHMServerProxy")
    public static WIHMCommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event.getSuggestedConfigurationFile());
        DreamDimension.registerDimension();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
        RegisteringHandler.postInitRegistries();
    }

    public ModWIHM() {
        // Item Handler
        MinecraftForge.EVENT_BUS.register(new RegisteringHandler());

        // Event Handler
        MinecraftForge.EVENT_BUS.register(new CommonEventsHandler());
    }
}
