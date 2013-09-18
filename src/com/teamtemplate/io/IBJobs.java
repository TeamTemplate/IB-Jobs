package com.teamtemplate.io;

import org.bukkit.plugin.java.JavaPlugin;

import com.teamtemplate.io.HashMap.HashMapHandler;
import com.teamtemplate.io.Listener.BlockBreak;
import com.teamtemplate.io.commands.IBCommandExecutor;

public final class IBJobs extends JavaPlugin{

	public HashMapHandler hashmap = new HashMapHandler(this);
	
	public void onEnable() { 
		getLogger().info("onEnable has been invoked");
		
		getCommand("initplayer").setExecutor(new IBCommandExecutor(this));
		new BlockBreak(this);
	}
	
	public void onDisable() {
	}
}
