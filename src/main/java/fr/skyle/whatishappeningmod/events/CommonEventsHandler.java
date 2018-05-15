package fr.skyle.whatishappeningmod.events;

import fr.skyle.whatishappeningmod.ModWIHM;
import fr.skyle.whatishappeningmod.world.dimensions.dream.DreamDimension;
import fr.skyle.whatishappeningmod.world.teleporters.CustomTeleporter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class CommonEventsHandler {

    @SubscribeEvent
    public void onPlayerWakeUp(PlayerWakeUpEvent event) {
        Random rd = new Random();
        int value = rd.nextInt(2);
        if (value == 1) {
            if (event.getEntity() instanceof EntityPlayerMP) {
                EntityPlayerMP playerMP = (EntityPlayerMP) event.getEntity();
                EntityPlayer player = event.getEntityPlayer();
                MinecraftServer mc = player.getServer();


                if (mc.getPlayerList() != null) {
                    mc.getPlayerList().transferPlayerToDimension(playerMP, DreamDimension.DREAM_DIMENSION.getId(), new CustomTeleporter(mc.getWorld(DreamDimension.DREAM_DIMENSION.getId())));
//                player.setPositionAndUpdate(5.0, 65.0, 5.0);
                    ModWIHM.logger.info(player.getName() + " has been teleported to Dream Dimension\n");
                }
            }
        }
    }
}
