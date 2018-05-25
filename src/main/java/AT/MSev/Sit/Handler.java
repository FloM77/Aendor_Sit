package AT.MSev.Sit;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.spigotmc.event.entity.EntityDismountEvent;

import static org.bukkit.Bukkit.getLogger;

public class Handler implements Listener {
    @EventHandler
    public void OnStandUp(EntityDismountEvent e)
    {
        if(e.getDismounted().getType().equals(EntityType.ARROW))
        {
            e.getDismounted().remove();
        }
    }
}
