package com.teamtemplate.io.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.teamtemplate.io.IBJobs;

public class IBCommandExecutor implements CommandExecutor {

	private IBJobs plugin;
	
	public IBCommandExecutor(IBJobs plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("initplayer")) {
			if(args.length == 1) {
				Player target = (Bukkit.getPlayer(args[0]));
				if(target != null) {
					plugin.hashmap.initializePlayer(target);
					sender.sendMessage(args[0] + " has been manually initalized");
					return true;
				}
				sender.sendMessage(args[0] + " is not online!");
				return false;
			}
			sender.sendMessage("Check your Syntax!");
			return false;
		}
		return false;
	}
}
