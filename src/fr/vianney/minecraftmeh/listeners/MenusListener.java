package fr.vianney.minecraftmeh.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.vianney.minecraftmeh.main;

public class MenusListener implements Listener {

	private main main;
	private PlayerListener PListener;
	
	public MenusListener(main main) {
		this.main = main;
	}
	
	@EventHandler
	public void onClic(InventoryClickEvent event) {
		
		Player player = (Player) event.getWhoClicked();
		Inventory inv = event.getInventory();
		ItemStack current = event.getCurrentItem();
		Material CItem = current.getType();
		
		ItemStack redshulker = new ItemStack(Material.RED_SHULKER_BOX);
		ItemMeta redshulkermeta = redshulker.getItemMeta();
		redshulkermeta.setDisplayName("§4désactiver le mode");
		redshulker.setItemMeta(redshulkermeta);
		
		
		ItemStack limeshulker = new ItemStack(Material.LIME_SHULKER_BOX);
		ItemMeta limeshulkermeta = limeshulker.getItemMeta();
		limeshulkermeta.setDisplayName("§aactiver le mode");
		limeshulker.setItemMeta(limeshulkermeta);
		
		
		if(CItem == Material.TNT || CItem == Material.SHEARS || CItem == Material.YELLOW_FLOWER || CItem == Material.LEATHER_CHESTPLATE || CItem == Material.FURNACE || CItem == Material.POTION ) {
			
			Bukkit.broadcastMessage("reconnu !!!!!!!!!");
			Inventory newinv = Bukkit.createInventory(null, 9, event.getCurrentItem().getItemMeta().getDisplayName());
			
			newinv.setItem(3, redshulker);
			newinv.setItem(5, limeshulker);
			
			
			player.openInventory(newinv);
			event.setCancelled(true);
			
		}
		
		if(CItem == Material.RED_SHULKER_BOX || CItem == Material.LIME_SHULKER_BOX) {
			
			if(inv.getName().equals("§aVive les moutons !")) {
					  
				  if(CItem == Material.RED_SHULKER_BOX) {
				    	
					  event.setCancelled(true);
					  
					  Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "");
						  
				  }else if(CItem == Material.LIME_SHULKER_BOX) {
						
					  event.setCancelled(true);

					  Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "");
						  
				  }
				
			}else if(inv.getName().equals("§4XX INTERDIT DE SAUTER !! XX")) {
				
			      if(CItem == Material.RED_SHULKER_BOX) {
					  
			    	  event.setCancelled(true);
			    	  PListener.NoJump = false;
			    	  
				  }else if(CItem == Material.LIME_SHULKER_BOX) {
					  
					  event.setCancelled(true);
					  PListener.NoJump = true;
					  
				  }
				
			}else if(inv.getName().equals("§8Au fourneau !")) {
				
				  if(CItem == Material.RED_SHULKER_BOX) {
					  
					  event.setCancelled(true);
					  PListener.Furnace = false;
					  
				  }else if(CItem == Material.LIME_SHULKER_BOX) {
					  
					  event.setCancelled(true);
					  PListener.Furnace = true;
					  
				  }
				
			}else if(inv.getName().equals("§eLe plus beau bouquet !")) {
				
			   	  if(CItem == Material.RED_SHULKER_BOX) {
			   		 
			   		event.setCancelled(true);
			   		PListener.Flower = false;
					  
				  }else if(CItem == Material.LIME_SHULKER_BOX) {
					  
					 event.setCancelled(true);
					 PListener.Flower = true;
					  
				  }
				
			}else if(inv.getName().equals("§6Équipez-vous !")) {
				
				  if(CItem == Material.RED_SHULKER_BOX) {
					  
					  event.setCancelled(true);
					  PListener.ArmorHeart = false;
					  
				  }else if(CItem == Material.LIME_SHULKER_BOX) {
					  
					  event.setCancelled(true);
					  PListener.ArmorHeart = true;
					  
				  }
				
			}else if(inv.getName().equals("§4Item Kamikaze")) {
				
				  if(CItem == Material.RED_SHULKER_BOX) {
					  
					  event.setCancelled(true);
					  PListener.ItemKamikaze = false;
					  
				  }else if(CItem == Material.LIME_SHULKER_BOX) {
					  
					  event.setCancelled(true);
					  PListener.ItemKamikaze = true;
					  
				  }
				
			}
			
		}
		
	}

}
