package me.offluffy.SmoothSleep.commands;

import me.offluffy.SmoothSleep.SmoothSleep;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SmoothSleepReload implements CommandExecutor {

	private SmoothSleep plugin;
	public SmoothSleepReload(SmoothSleep p) { plugin = p; }

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!sender.hasPermission("smoothsleep.reload")) {
			sender.sendMessage(ChatColor.RED + "You don't have permission to do this!");
		} else {
			plugin.reload();
			sender.sendMessage(ChatColor.GREEN + "Reloaded SmoothSleep");
			if (!plugin.enabled) {
				sender.sendMessage(ChatColor.GOLD + "SmoothSleep is disabled. To enable, use " + ChatColor.YELLOW + "/sstoggle");
			}
		}
		return true;
	}
}