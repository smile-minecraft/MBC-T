package smile.main.mbct2;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import smile.main.mbct2.commands.location;
import smile.main.mbct2.commands.locationall;
import smile.main.mbct2.commands.mbc;

public final class MBCT2 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.format(ChatColor.AQUA+"MBC-T2正在加載..."+ChatColor.WHITE);
        getCommand("mbc").setExecutor(new mbc());
        getCommand("location").setExecutor(new location());
        getCommand("locationall").setExecutor(new locationall());
    }

    @Override
    public void onDisable() {
        System.out.format(ChatColor.RED+"MBC-T2正在關閉..."+ChatColor.WHITE);
    }


}
