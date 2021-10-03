package fr.vianney.minecraftmeh.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

import fr.vianney.minecraftmeh.main;

public class PlayerListener implements Listener {

	private main main;
	
	public boolean ShearsHeart = false;
	public boolean NoJump = false;
	public boolean Furnace = false;
	public boolean Flower = false;
	public boolean ArmorHeart = false;
	public boolean ItemKamikaze = false;
	
	
	public PlayerListener(main main) {
		this.main = main;
	}
	
	@EventHandler
	public void onShears(PlayerShearEntityEvent event) {
		
		Entity entity = event.getEntity();
		Player player = event.getPlayer();
		
		
		if(ShearsHeart == true && entity instanceof Sheep) {
			
			player.setMaxHealth(player.getMaxHealth() + 2);
			player.setHealth(player.getHealth() + 1);
			
		}
		
		
		
	}
	
	

}
