package me.miked.randomdrops;

import me.miked.TripleDropsCommands.TripleDropsCommands;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;


public final class Randomdrops extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic//
        System.out.println("Hello!");
        getServer().getPluginManager().registerEvents(new BreakBlock(), this);
        this.getCommand("diamonds").setExecutor(new TripleDropsCommands());
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic


    }
}
