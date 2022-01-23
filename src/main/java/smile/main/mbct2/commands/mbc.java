package smile.main.mbct2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class mbc implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("mbc")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.AQUA+"公會功能:team help\n"+ChatColor.YELLOW+
                        "監測功能:co help\n"+ChatColor.AQUA+"領地功能:詳見DC群#指令列表"+ChatColor.WHITE);
            }
            else if (sender instanceof ConsoleCommandSender){
                System.out.println("你不可以在控制台輸入這項指令");
            }

        }
        return true;
    }


}
