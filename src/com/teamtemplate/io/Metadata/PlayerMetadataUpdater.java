package com.teamtemplate.io.Metadata;

import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;

import com.teamtemplate.io.IBJobs;


public class PlayerMetadataUpdater {

	Player player;
	IBJobs plugin;
	
	public PlayerMetadataUpdater(Player player, IBJobs plugin) {
		this.player = player;
		this.plugin = plugin;
	}
	
	public boolean hasMetadata(){
		if(player.hasMetadata("ibjobs")) {
			return true;
		}
		return false;
	}
	
	public void initializeMetadata() {
		player.getMetadata("ibjobs").add(new FixedMetadataValue(plugin, new PlayerMetadataJob(0, "null")));
		player.getMetadata("ibjobs").add(new FixedMetadataValue(plugin, new PlayerMetadataJob(0, "null")));
		player.getMetadata("ibjobs").add(new FixedMetadataValue(plugin, new PlayerMetadataJob(0, "null")));
	}
	
	public void updateMetadata(int index, PlayerMetadataJob pmj) {
		player.getMetadata("ibjobs").set(index, new FixedMetadataValue(plugin, pmj));
	}
	
	
}
