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
	
	//Reinforced Obsidian
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian, "Reinforced Obsidian");//In-game name
	
	
	}

	public void registerItems(){ //For registering Items
	
	//Items
		
	//Purified Obsidian Ingot
	LanguageRegistry.addName(ReinforcedArmors.Purified_Obsidian_Ingot, "Purified Obsidian Ingot"); //In-game name
	
	//Obsidian Ingot
	LanguageRegistry.addName(ReinforcedArmors.Obsidian_Ingot, "Obsidian Ingot"); //In-game name
	
	//Crying Obsidian Ingot
	LanguageRegistry.addName(ReinforcedArmors.Crying_Obsidian_Ingot, "Crying Obsidian Ingot"); //In-game name
	
	//Obsidian Crystal
	LanguageRegistry.addName(ReinforcedArmors.Obsidian_Crystal, "Obsidian Crystal");
	
	//Reinforced Obsidian Crystal
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Crystal, "Reinforced Obsidian Crystal");
	
	//Admin Crystal
	LanguageRegistry.addName(ReinforcedArmors.Admin_Crystal, "Admin Crystal");
	
	//Crying Obsidian Crystal
	LanguageRegistry.addName(ReinforcedArmors.Purified_Obsidian_Crystal, "Purified Obsidian Crystal");
	
	//Crying Obsidian Crystal
	LanguageRegistry.addName(ReinforcedArmors.Crying_Obsidian_Crystal, "Crying Obsidian Crystal");
	
	//Reinforced Crying Obsidian Crystal
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Crying_Obsidian_Crystal, "Reinforced Crying Obsidian Crystal");
	
	//Crying Obsidian Crystal
	LanguageRegistry.addName(ReinforcedArmors.Purified_Crying_Obsidian_Crystal, "Purified Crying Obsidian Crystal");
	
	//Reinforced Obsidian Ingot
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Ingot, "Reinforced Obsidian Ingot");
	
	
	//OBSIDIAN Armor Set
	
	//Obsidian Helmet
	
	LanguageRegistry.addName(ReinforcedArmors.Obsidian_Helmet, "Obsidian Helmet"); //In-game name
		
	//Obsidian Chestplate
	
	LanguageRegistry.addName(ReinforcedArmors.Obsidian_Chestplate, "Obsidian Chestplate"); //In-game name
	
	
	//Obsidian Leggings
	
	LanguageRegistry.addName(ReinforcedArmors.Obsidian_Leggings, "Obsidian Leggings"); //In-game name
	
	//Obsidian Boots
	
	LanguageRegistry.addName(ReinforcedArmors.Obsidian_Boots, "Obsidian Boots"); //In-game name
	
	
	//CRYING OBSIDIAN Armor Set
	
	//Obsidian Helmet
	
	LanguageRegistry.addName(ReinforcedArmors.CryingObsidian_Helmet, "Crying Obsidian Helmet"); //In-game name
			
	//Obsidian Chestplate
		
	LanguageRegistry.addName(ReinforcedArmors.CryingObsidian_Chestplate, "Crying Obsidian Chestplate"); //In-game name
		
		
	//Obsidian Leggings
		
	LanguageRegistry.addName(ReinforcedArmors.CryingObsidian_Leggings, "Crying Obsidian Leggings"); //In-game name
		
	//Obsidian Boots
		
	LanguageRegistry.addName(ReinforcedArmors.CryingObsidian_Boots, "Crying Obsidian Boots"); //In-game name
		
	
	//OBSIDIAN T1 Armor Set
	
	//Obsidian Helmet
		
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Helmet_T1, "Obsidian Helmet"); //In-game name
			
	//Obsidian Chestplate
		
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Chestplate_T1, "Obsidian Chestplate"); //In-game name
		
		
	//Obsidian Leggings
		
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Leggings_T1, "Obsidian Leggings"); //In-game name
		
	//Obsidian Boots
		
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Boots_T1, "Obsidian Boots"); //In-game name
		
		
	//CRYING OBSIDIAN T1 Armor Set
		
	//Crying Obsidian Helmet
		
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Helmet_T1, "Crying Obsidian Helmet"); //In-game name
				
	//Crying Obsidian Chestplate
			
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Chestplate_T1, "Crying Obsidian Chestplate"); //In-game name
				
	//Crying Obsidian Leggings
			
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Leggings_T1, "Crying Obsidian Leggings"); //In-game name
			
	//Crying Obsidian Boots
			
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Boots_T1, "Crying Obsidian Boots"); //In-game name
	
	
	//ADMIN ARMOR
	
	//Admin Helmet
	
	LanguageRegistry.addName(ReinforcedArmors.Admin_Helmet, "Admin Helmet"); //In-game name
				
	//Admin Chestplate
				
	LanguageRegistry.addName(ReinforcedArmors.Admin_Chestplate, "Admin Chestplate"); //In-game name
				
				
	//Admin Leggings
				
	LanguageRegistry.addName(ReinforcedArmors.Admin_Leggings, "Admin Leggings"); //In-game name
				
	//Admin Boots
				
	LanguageRegistry.addName(ReinforcedArmors.Admin_Boots, "Admin Boots"); //In-game name
	
	
	//OBSIDIAN ARMOR RT2
	
	//Obsidian Helmet RT2
		
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Helmet_T2, "Obsidian Helmet"); //In-game name
					
	//Obsidian Chestplate RT2
					
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Chestplate_T2, "Obsidian Chestplate"); //In-game name
					
					
	//Obsidian Leggings RT2
					
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Leggings_T2, "Obsidian Leggings"); //In-game name
					
	//Obsidian Boots RT2
					
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Boots_T2, "Obsidian Boots"); //In-game name
	
	
	//OBSIDIAN ARMOR RT3
	
	//Obsidian Helmet RT3
				
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Helmet_T3, "Obsidian Helmet"); //In-game name
							
	//Obsidian Chestplate RT3
							
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Chestplate_T3, "Obsidian Chestplate"); //In-game name
											
	//Obsidian Leggings RT3
							
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Leggings_T3, "Obsidian Leggings"); //In-game name
							
	//Obsidian Boots RT3
							
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_Obsidian_Boots_T3, "Obsidian Boots"); //In-game name
	
	
	//Crying OBSIDIAN ARMOR RT2
	
	//Crying Obsidian Helmet RT2
			
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Helmet_T2, "Crying Obsidian Helmet"); //In-game name
						
	//Crying Obsidian Chestplate RT2
						
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Chestplate_T2, "Crying Obsidian Chestplate"); //In-game name
						
						
	//Crying Obsidian Leggings RT2
						
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Leggings_T2, "Crying Obsidian Leggings"); //In-game name
						
	//Crying Obsidian Boots RT2
						
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Boots_T2, "Crying Obsidian Boots"); //In-game name
		
		
	//Crying OBSIDIAN ARMOR RT3
		
	//Crying Obsidian Helmet RT3
					
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Helmet_T3, "Crying Obsidian Helmet"); //In-game name
								
	//Crying Obsidian Chestplate RT3
								
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Chestplate_T3, "Crying Obsidian Chestplate"); //In-game name
											
	//Crying Obsidian Leggings RT3
								
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Leggings_T3, "Crying Obsidian Leggings"); //In-game name
								
	//Crying Obsidian Boots RT3
								
	LanguageRegistry.addName(ReinforcedArmors.Reinforced_CryingObsidian_Boots_T3, "Crying Obsidian Boots"); //In-game name
	
		
	}
}
