package me.miked.randomdrops;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;


public final class Randomdrops extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic//
        System.out.println("Hello!");
        Random number = new Random();
        int n = number.nextInt(51);
        int randomNumber = n + 1;
        System.out.println(n);
}

    @Override
    public void onDisable() {
        // Plugin shutdown logic


    }
}
