package zalthrion.reinforcedarmors.common;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ReinforcedArmorsCommonProxy { //implements IGuiHandler (THIS IS IMPORTANT, CANNOT BE A PROXY/GUI HANDLER WITHOUT THIS!!)

	public void registerRenderInformation() //Client side texture registering
	{
	}
	//@Override
	//public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
	//return null;
	//}
	//@Override
	//public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
	//return null;
	//}

	public void registerTiles(){ //For registering TileEntities
	}

	public void registerBlocks(){ //For registering Blocks
	//Crying Obsidian
	//GameRegistry.registerBlock(ReinforcedArmors.Crying_Obsidian, "Crying Obsidian");//Needed for all blocks
	LanguageRegistry.addName(ReinforcedArmors.Crying_Obsidian, "Crying Obsidian");//In-game name
	
	//Purified Obsidian
	LanguageRegistry.addName(ReinforcedArmors.Purified_Obsidian, "Purified Obsidian");//In-game name
	
	//Hardened Obsidian
	LanguageRegistry.addName(ReinforcedArmors.Hardened_Obsidian, "Hardened Obsidian");//In-game name
	
	//Hardened Crying Obsidian
	LanguageRegistry.addName(ReinforcedArmors.HardenedCrying_Obsidian, "Hardened Crying Obsidian");//In-game name
	
	}

	public void registerItems(){ //For registering Items
	
	//Purified Obsidian Ingot
	LanguageRegistry.addName(ReinforcedArmors.Purified_Obsidian_Ingot, "Purified Obsidian Ingot"); //In-game name
	
	//Obsidian Ingot
	LanguageRegistry.addName(ReinforcedArmors.Obsidian_Ingot, "Obsidian Ingot"); //In-game name
		
	}
}
