package com.teamtemplate.io.Listener;


import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;

import com.teamtemplate.io.IBJobs;


public class BlockBreak implements Listener {
	
	private IBJobs plugin;
	
	public BlockBreak(IBJobs plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		this.plugin = plugin;
	}
	
	@EventHandler
	void onBlockBreak(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		
		if(block.getType() == Material.GRASS) {
			player.sendMessage("grass abgebaut");
			if(plugin.hashmap.experienceJob1.containsKey(player)){
				plugin.hashmap.experienceJob1.put(player, plugin.hashmap.experienceJob1.get(player) + 1);
			}
		}
		
		if(block.getType() == Material.DIRT) {
			player.sendMessage("dirt abgebaut");
			if(plugin.hashmap.experienceJob1.containsKey(player)){
				plugin.hashmap.experienceJob1.put(player, plugin.hashmap.experienceJob1.get(player) + 1);
			}
		}
	}
}
