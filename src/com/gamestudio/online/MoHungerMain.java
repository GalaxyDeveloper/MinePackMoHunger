package com.gamestudio.online;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class MoHungerMain extends JavaPlugin{

	@Override
	public void onEnable() {
		
	      	ItemStack item = new ItemStack(Material.PUMPKIN_PIE);
	      	ItemMeta meta = item.getItemMeta();
	        meta.setDisplayName("§eCheese Slice");
	        item.setItemMeta(meta);
	    	ShapedRecipe recipe = new ShapedRecipe(item);
	        recipe.shape("   ", "MMM", "   ");
	        recipe.setIngredient('M', Material.MILK_BUCKET);
	        Bukkit.addRecipe(recipe);
	        
	        ItemStack item0 = new ItemStack(Material.BREAD);
	      	ItemMeta meta0 = item0.getItemMeta();
	        meta0.setDisplayName("§6Sweet Bun");
	        item0.setItemMeta(meta0);
	    	ShapedRecipe recipe0 = new ShapedRecipe(item0);
	        recipe0.shape("   ", "WSW", "   ");
	        recipe0.setIngredient('W', Material.WHEAT);
	        recipe0.setIngredient('S', Material.SUGAR);
	        Bukkit.addRecipe(recipe0);
		
	      	ItemStack item1 = new ItemStack(Material.COOKIE);
	      	ItemMeta meta1 = item1.getItemMeta();
	        meta1.setDisplayName("§6Sugar Cookie");
	        item1.setItemMeta(meta1);
	    	ShapedRecipe recipe1 = new ShapedRecipe(item1);
	        recipe1.shape("   ", "SWS", "   ");
	        recipe1.setIngredient('W', Material.WHEAT);
	        recipe1.setIngredient('S', Material.SUGAR);
	        Bukkit.addRecipe(recipe1);
	        
	      	ItemStack item2 = new ItemStack(Material.RABBIT_STEW);
	      	ItemMeta meta2 = item2.getItemMeta();
	        meta2.setDisplayName("§fPotato Salad");
	        item2.setItemMeta(meta2);
	    	ShapedRecipe recipe2 = new ShapedRecipe(item2);
	        recipe2.shape("   ", "PCP", " B ");
	        recipe2.setIngredient('B', Material.BOWL);
	        recipe2.setIngredient('P', Material.POTATO_ITEM);
	        recipe2.setIngredient('C', Material.CARROT_ITEM);
	        Bukkit.addRecipe(recipe2);
	        
	}

	@Override
	public void onDisable() {
		
		
	}
	
}
