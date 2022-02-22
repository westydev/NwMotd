package nw.motd;

import nw.motd.listener.ServerPingEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main plugin;
    @Override
    public void onEnable() {
        plugin=this;
        addDefault();
        this.getServer().getPluginManager().registerEvents(new ServerPingEvent(), this);
    }


    private void addDefault() {
        getConfig().addDefault("Motd","&eStandart Server Motd.");
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public String getMotd() {
        reloadConfig();
        saveConfig();
        return getConfig().getString("Motd");
    }
    public String colorTranslate(String message){
        return ChatColor.translateAlternateColorCodes('&', message);
    }
    public static Main getInstance(){
        return plugin;
    }
}
