package me.miked.TripleDropsCommands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TripleDropsCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack commandDiamond = new ItemStack(Material.DIAMOND);
            commandDiamond.setAmount(64);
            player.getInventory().addItem(commandDiamond);
        }
        return true;
    }
}
