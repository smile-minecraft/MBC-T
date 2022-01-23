package smile.main.mbct2.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class locationall implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location PlayerLocation = player.getLocation();

                Bukkit.broadcastMessage(ChatColor.GREEN+"玩家"+player.getDisplayName()+"向你傳送了他的座標:"+PlayerLocation.getWorld()+
                        PlayerLocation.getX()+","+PlayerLocation.getY()+","+PlayerLocation.getZ()+ChatColor.WHITE);

        } else if (sender instanceof ConsoleCommandSender) {
            System.out.println("你不可以在控制台輸入這項指令");
        }
        return true;
    }
}
