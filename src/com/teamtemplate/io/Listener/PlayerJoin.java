package com.teamtemplate.io.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.teamtemplate.io.IBJobs;

public class PlayerJoin implements Listener {
	
	private IBJobs plugin;
	
	public PlayerJoin(IBJobs plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	void onPlayerJoin(PlayerJoinEvent event) {
		if(!event.getPlayer().hasPlayedBefore()) {
			plugin.hashmap.initializePlayer(event.getPlayer());
		}
		
		
	}

}
