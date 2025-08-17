package de.scholle.linksplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TexturepackCommand implements CommandExecutor {

    private final Linksplugin plugin;

    public TexturepackCommand(Linksplugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String link = plugin.getConfig().getString("texturepack-link", "https://example.com/texturepack.zip");

        sender.sendMessage(ChatColor.GREEN + "Texturepack: " + ChatColor.YELLOW + link);
        return true;
    }
}
