package me.miked.randomdrops;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakBlock implements Listener {
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {

        Block blockBroken = event.getBlock();
        event.setCancelled(true);
        ItemStack item = new ItemStack(blockBroken.getType(), 3);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), item);
        blockBroken.setType(Material.AIR);



    }
}
