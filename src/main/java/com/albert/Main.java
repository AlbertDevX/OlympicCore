package com.albert;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.albert.commands.CMenuCommand;
import com.albert.commands.SalvarCommand;

public class Main extends JavaPlugin
{

    public static String prefix = "&9OlympicCore";

    private String version = getDescription().getVersion();

    @Override
    public void onEnable() {
        CommandLogger();
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m------------------------------------------"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', prefix));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&3Se ha inicado &acorrectamente"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7version: "+version));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m------------------------------------------"));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m------------------------------------------"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', prefix));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cSe ha desactivado!"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7version: "+version));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m------------------------------------------"));    }

    private void CommandLogger(){
        this.getCommand("cmenu").setExecutor( new CMenuCommand());
        this.getCommand("salvar").setExecutor( new SalvarCommand());
    }
}
