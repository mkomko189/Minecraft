package com.pontierent.commands;


import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.pontierent.commands.Commands.Eat;
import com.pontierent.commands.Commands.Fly;
import com.pontierent.commands.Commands.Gamemodes;
import com.pontierent.commands.Commands.Heal;
import com.pontierent.commands.Commands.Spawns;


import com.pontierent.commands.Commands.broadcast;


public class Plugins extends JavaPlugin { 
	
	public void onEnable() {
		getConfig().options().copyDefaults(true);
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		getCommand("eat").setExecutor(new Eat());
		getCommand("Heal").setExecutor(new Heal());
		getCommand("Fly").setExecutor(new Fly());
		getCommand("Gamemode0").setExecutor(new Gamemodes());
		getCommand("Gamemode1").setExecutor(new Gamemodes());
		getCommand("Gamemode2").setExecutor(new Gamemodes());
		getCommand("Gamemode3").setExecutor(new Gamemodes());
		getCommand("Spawn").setExecutor(new Spawns());
		getCommand("SetSpawn").setExecutor(new Spawns());
		getCommand("Broadcast").setExecutor(new broadcast());
		
		logger.info(pdfFile.getName() + " has been enable! (V." + pdfFile.getVersion() + ")");
		
		
	}
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		logger.info(pdfFile.getName() + " has been disabled! (V." + pdfFile.getVersion() + ")");
		
		
	}
}
	