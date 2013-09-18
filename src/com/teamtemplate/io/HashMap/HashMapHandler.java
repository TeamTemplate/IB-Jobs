package com.teamtemplate.io.HashMap;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;

import com.teamtemplate.io.IBJobs;

public class HashMapHandler {

	public Map<Player, Integer> experienceJob1 = new HashMap<Player, Integer>();
	public Map<Player, Integer> experienceJob2 = new HashMap<Player, Integer>();
	public Map<Player, Integer> experienceJob3 = new HashMap<Player, Integer>();
	public Map<Player, String> stringJob1 = new HashMap<Player, String>();
	public Map<Player, String> stringJob2 = new HashMap<Player, String>();
	public Map<Player, String> stringJob3 = new HashMap<Player, String>();
	
	private IBJobs plugin;
	
	public HashMapHandler(IBJobs plugin) {
		this.plugin = plugin;
	}
	
	public void initializePlayer(Player player) {
		experienceJob1.put(player, 0);
		experienceJob2.put(player, 0);
		experienceJob3.put(player, 0);
		
		stringJob1.put(player, "null");
		stringJob2.put(player, "null");
		stringJob3.put(player, "null");
	}
}
