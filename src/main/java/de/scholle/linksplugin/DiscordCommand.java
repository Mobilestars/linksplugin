package de.scholle.linksplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DiscordCommand implements CommandExecutor {

    private final Linksplugin plugin;

    public DiscordCommand(Linksplugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String link = plugin.getConfig().getString("discord-link", "https://discord.gg/deinserver");

        sender.sendMessage(ChatColor.AQUA + "Discord: " + ChatColor.BLUE + link);
        return true;
    }
}
