package com.albert.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CMenuCommand implements CommandExecutor
{

    public String prefix;
    
        @Override
        public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
            if(!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', " " + prefix + "&clos jugadores solo pueden usar este comando!"));
                return true;
            }

            sender.sendMessage(ChatColor.translateAlternateColorCodes(
                '&', " " + prefix + "&ceste comando estara disponible pronto!"));

            return true;
    }
}
