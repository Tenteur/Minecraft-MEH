package fr.vianney.minecraftmeh;

import org.bukkit.plugin.java.JavaPlugin;

import fr.vianney.minecraftmeh.commands.CommandMenu;
import fr.vianney.minecraftmeh.listeners.MenusListener;
import fr.vianney.minecraftmeh.listeners.PlayerListener;

public class main extends JavaPlugin{

	public void onEnable() {
		System.out.println("le Plugin a démarré");
		getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
		getServer().getPluginManager().registerEvents(new MenusListener(this), this);
		getCommand("menu").setExecutor(new CommandMenu(this));
//		getCommand("reset").setExecutor(new CommandReset(this));
		
	}
	
}
