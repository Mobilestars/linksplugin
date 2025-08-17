package de.scholle.linksplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Linksplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Default-Config laden
        saveDefaultConfig();

        // Commands registrieren
        getCommand("discord").setExecutor(new DiscordCommand(this));
        getCommand("dc").setExecutor(new DiscordCommand(this));

        getCommand("texturepack").setExecutor(new TexturepackCommand(this));
        getCommand("resourcepack").setExecutor(new TexturepackCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
