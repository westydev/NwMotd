package nw.motd.listener;

import nw.motd.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerPingEvent implements Listener {
    @EventHandler
    public void event(ServerListPingEvent e) {
        e.setMotd(Main.getInstance().colorTranslate(Main.getInstance().getMotd()));
    }
}
