package fr.vianney.minecraftmeh.commands;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import fr.vianney.minecraftmeh.main;

public class CommandMenu implements CommandExecutor {

	private main main;

	public CommandMenu(main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(sender instanceof Player) {
			
			Player player = ((Player) sender).getPlayer();
			
			Inventory inv = Bukkit.createInventory(null, 27, "§cChanger les modes");

			ItemStack shears = new ItemStack(Material.SHEARS);
			ItemMeta shearsmeta = shears.getItemMeta();
			shearsmeta.setDisplayName("§aVive les moutons !");
			shearsmeta.setLore(Arrays.asList("quand vous tondez un mouton,", "vous gagnez un coeur", "(la chance !)."));
			shears.setItemMeta(shearsmeta);
			
			ItemStack potion = new ItemStack(Material.POTION);
			PotionMeta potionmeta = (PotionMeta) potion.getItemMeta();
			potionmeta.setDisplayName("§4XX INTERDIT DE SAUTER !! XX");
			potionmeta.setBasePotionData(new PotionData(PotionType.JUMP));
			potionmeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			potionmeta.setLore(Arrays.asList("Si vous sautez,", "vous prenez un dégats", "(je suis un peu désolé)."));
			potion.setItemMeta(potionmeta);
			
			
			ItemStack furnace = new ItemStack(Material.FURNACE);
			ItemMeta furnacemeta = furnace.getItemMeta();
			furnacemeta.setDisplayName("§8Au fourneau !");
			furnacemeta.setLore(Arrays.asList("quand vous faites cuir", "des objets, vous", "gagnez un effet aléatoire", "(ca peu être mauvais)."));
			furnace.setItemMeta(furnacemeta);
			
			ItemStack flower = new ItemStack(Material.YELLOW_FLOWER);
			ItemMeta flowermeta = flower.getItemMeta();
			flowermeta.setDisplayName("§eLe plus beau bouquet !");
			flowermeta.setLore(Arrays.asList("chaque fleur que vous cassé,", "vous rapporte du stuff aleatoire."));
			flower.setItemMeta(flowermeta);
			
			
			ItemStack armor = new ItemStack(Material.LEATHER_CHESTPLATE);
			ItemMeta armormeta = armor.getItemMeta();
			armormeta.setDisplayName("§6Équipez-vous !");
			armormeta.setLore(Arrays.asList("Quand vous équipez une armure,", "vous gagnez des coeurs en plus."));
			armor.setItemMeta(armormeta);
			
			ItemStack tnt = new ItemStack(Material.TNT);
			ItemMeta tntmeta = tnt.getItemMeta();
			tntmeta.setDisplayName("§4Item Kamikaze");
			tntmeta.setLore(Arrays.asList("Quand vous récuperez un item,", "une explosion s'en suit !"));
			tnt.setItemMeta(tntmeta);
			
			
			
			
			
			inv.addItem(shears);
			inv.addItem(potion);
			inv.addItem(furnace);
			inv.addItem(flower);
			inv.addItem(armor);
			inv.addItem(tnt);
			
			player.openInventory(inv);
			
		}

		return false;
	}

}
