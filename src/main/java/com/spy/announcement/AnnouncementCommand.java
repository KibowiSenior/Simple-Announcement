package com.spy.announcement;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AnnouncementCommand implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /" + label + " <message>");
            return true;
        }
        
        String message = String.join(" ", args);
        String coloredMessage = ChatColor.translateAlternateColorCodes('&', message);
        
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendTitle(
                ChatColor.GOLD + "" + ChatColor.BOLD + "ᴀɴɴᴏᴜɴᴄᴇᴍᴇɴᴛ",
                coloredMessage,
                10, 70, 20
            );
        }
        
        sender.sendMessage(ChatColor.GREEN + "Announcement sent to all players!");
        return true;
    }
}
