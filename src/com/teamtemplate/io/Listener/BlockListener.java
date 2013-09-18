package com.teamtemplate.io.Listener;


import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;

import com.teamtemplate.io.IBJobs;
import com.teamtemplate.io.Metadata;
import com.teamtemplate.io.Metadata.PlayerMetadataUpdater;


public class BlockListener implements Listener {
	
	private IBJobs plugin;
	
	public BlockListener(IBJobs plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Material block = event.getBlock().getType();
		
		if(block == Material.DIAMOND_BLOCK) {
			
		}

	}
}
