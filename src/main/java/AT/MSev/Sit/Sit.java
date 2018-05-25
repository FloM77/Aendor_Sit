package AT.MSev.Sit;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Sit extends JavaPlugin {
    public static NamespacedKey key;
    @Override
    public void onEnable() {
        key = new NamespacedKey(this, this.getDescription().getName());

        this.getCommand("Sit").setExecutor(new CommandSit());

        getServer().getPluginManager().registerEvents(new Handler(), this);
    }
    @Override
    public void onDisable() {

    }
}
