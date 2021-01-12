package me.miked.randomdrops;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;


public final class Randomdrops extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic//
        System.out.println("Hello!");
        getServer().getPluginManager().registerEvents(new BreakBlock(), this);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic


    }
}
