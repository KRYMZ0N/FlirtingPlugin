package me.KRYMZ0N.TheFlirtCommand1.commands;

import me.KRYMZ0N.TheFlirtCommand1.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class FlirtCommand implements CommandExecutor {
	
	private Main plugin;
	
	public FlirtCommand(me.KRYMZ0N.TheFlirtCommand1.Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("flirt").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// Just command stuff
		if (!(sender instanceof Player)){
			
			sender.sendMessage("Nah, only cool Anarch Realm Players may execute this command scrub!!");
			return true;
		}
		Player g = (Player) sender;
		
		if (g.hasPermission("Flirt.use")){
			g.sendMessage("Wassup bitch, let me get summa dat pussy ;)");
			return true;
		} else {
			g.sendMessage("Nah, if you want to be cool and you this command, you better vote!");
		}
		return false;
	}

}