package me.KRYMZ0N.TheFlirtCommand1;

import org.bukkit.plugin.java.JavaPlugin;

import me.KRYMZ0N.TheFlirtCommand1.commands.FlirtCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new FlirtCommand(this);
	}
	

}
