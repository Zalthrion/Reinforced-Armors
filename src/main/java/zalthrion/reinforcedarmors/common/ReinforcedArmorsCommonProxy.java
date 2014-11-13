package zalthrion.reinforcedarmors.common;

import zalthrion.reinforcedarmors.common.lib.ModArmor;
import zalthrion.reinforcedarmors.common.lib.ModBlocks;
import zalthrion.reinforcedarmors.common.lib.ModItems;
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
	}

	public void registerItems(){ //For registering Items
	
	//ARMORS
	
	
	//OBSIDIAN Armor Set
	
	//Obsidian Helmet
	
	LanguageRegistry.addName(ModArmor.Obsidian_Helmet, "Obsidian Helmet"); //In-game name
		
	//Obsidian Chestplate
	
	LanguageRegistry.addName(ModArmor.Obsidian_Chestplate, "Obsidian Chestplate"); //In-game name
	
	
	//Obsidian Leggings
	
	LanguageRegistry.addName(ModArmor.Obsidian_Leggings, "Obsidian Leggings"); //In-game name
	
	//Obsidian Boots
	
	LanguageRegistry.addName(ModArmor.Obsidian_Boots, "Obsidian Boots"); //In-game name
	
	
	//CRYING OBSIDIAN Armor Set
	
	//Obsidian Helmet
	
	LanguageRegistry.addName(ModArmor.CryingObsidian_Helmet, "Crying Obsidian Helmet"); //In-game name
			
	//Obsidian Chestplate
		
	LanguageRegistry.addName(ModArmor.CryingObsidian_Chestplate, "Crying Obsidian Chestplate"); //In-game name
		
		
	//Obsidian Leggings
		
	LanguageRegistry.addName(ModArmor.CryingObsidian_Leggings, "Crying Obsidian Leggings"); //In-game name
		
	//Obsidian Boots
		
	LanguageRegistry.addName(ModArmor.CryingObsidian_Boots, "Crying Obsidian Boots"); //In-game name
		
	
	//OBSIDIAN T1 Armor Set
	
	//Obsidian Helmet
		
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Helmet_T1, "Obsidian Helmet"); //In-game name
			
	//Obsidian Chestplate
		
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Chestplate_T1, "Obsidian Chestplate"); //In-game name
		
		
	//Obsidian Leggings
		
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Leggings_T1, "Obsidian Leggings"); //In-game name
		
	//Obsidian Boots
		
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Boots_T1, "Obsidian Boots"); //In-game name
		
		
	//CRYING OBSIDIAN T1 Armor Set
		
	//Crying Obsidian Helmet
		
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Helmet_T1, "Crying Obsidian Helmet"); //In-game name
				
	//Crying Obsidian Chestplate
			
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Chestplate_T1, "Crying Obsidian Chestplate"); //In-game name
				
	//Crying Obsidian Leggings
			
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Leggings_T1, "Crying Obsidian Leggings"); //In-game name
			
	//Crying Obsidian Boots
			
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Boots_T1, "Crying Obsidian Boots"); //In-game name
	
	
	//ADMIN ARMOR
	
	//Admin Helmet
	
	LanguageRegistry.addName(ModArmor.Admin_Helmet, "Admin Helmet"); //In-game name
				
	//Admin Chestplate
				
	LanguageRegistry.addName(ModArmor.Admin_Chestplate, "Admin Chestplate"); //In-game name
				
				
	//Admin Leggings
				
	LanguageRegistry.addName(ModArmor.Admin_Leggings, "Admin Leggings"); //In-game name
				
	//Admin Boots
				
	LanguageRegistry.addName(ModArmor.Admin_Boots, "Admin Boots"); //In-game name
	
	
	//OBSIDIAN ARMOR RT2
	
	//Obsidian Helmet RT2
		
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Helmet_T2, "Obsidian Helmet"); //In-game name
					
	//Obsidian Chestplate RT2
					
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Chestplate_T2, "Obsidian Chestplate"); //In-game name
					
					
	//Obsidian Leggings RT2
					
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Leggings_T2, "Obsidian Leggings"); //In-game name
					
	//Obsidian Boots RT2
					
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Boots_T2, "Obsidian Boots"); //In-game name
	
	
	//OBSIDIAN ARMOR RT3
	
	//Obsidian Helmet RT3
				
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Helmet_T3, "Obsidian Helmet"); //In-game name
							
	//Obsidian Chestplate RT3
							
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Chestplate_T3, "Obsidian Chestplate"); //In-game name
											
	//Obsidian Leggings RT3
							
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Leggings_T3, "Obsidian Leggings"); //In-game name
							
	//Obsidian Boots RT3
							
	LanguageRegistry.addName(ModArmor.Reinforced_Obsidian_Boots_T3, "Obsidian Boots"); //In-game name
	
	
	//Crying OBSIDIAN ARMOR RT2
	
	//Crying Obsidian Helmet RT2
			
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Helmet_T2, "Crying Obsidian Helmet"); //In-game name
						
	//Crying Obsidian Chestplate RT2
						
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Chestplate_T2, "Crying Obsidian Chestplate"); //In-game name
						
						
	//Crying Obsidian Leggings RT2
						
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Leggings_T2, "Crying Obsidian Leggings"); //In-game name
						
	//Crying Obsidian Boots RT2
						
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Boots_T2, "Crying Obsidian Boots"); //In-game name
		
		
	//Crying OBSIDIAN ARMOR RT3
		
	//Crying Obsidian Helmet RT3
					
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Helmet_T3, "Crying Obsidian Helmet"); //In-game name
								
	//Crying Obsidian Chestplate RT3
								
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Chestplate_T3, "Crying Obsidian Chestplate"); //In-game name
											
	//Crying Obsidian Leggings RT3
								
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Leggings_T3, "Crying Obsidian Leggings"); //In-game name
								
	//Crying Obsidian Boots RT3
								
	LanguageRegistry.addName(ModArmor.Reinforced_CryingObsidian_Boots_T3, "Crying Obsidian Boots"); //In-game name
	
		
	//Lapis Lazuli ARMOR
	
	//Lapis Lazuli Helmet
						
	LanguageRegistry.addName(ModArmor.LapisLazuli_Helmet, "Lapis Lazuli Helmet"); //In-game name
									
	//Lapis Lazuli Chestplate
									
	LanguageRegistry.addName(ModArmor.LapisLazuli_Chestplate, "Lapis Lazuli Chestplate"); //In-game name
												
	//Lapis Lazuli Leggings
									
	LanguageRegistry.addName(ModArmor.LapisLazuli_Leggings, "Lapis Lazuli Leggings"); //In-game name
									
	//Lapis Lazuli Boots
									
	LanguageRegistry.addName(ModArmor.LapisLazuli_Boots, "Lapis Lazuli Boots"); //In-game name
		
	
	//Lapis Lazuli ARMOR RT1
	
	//Lapis Lazuli Helmet RT1
							
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Helmet_T1, "Lapis Lazuli Helmet"); //In-game name
										
	//Lapis Lazuli Chestplate RT1
									
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Chestplate_T1, "Lapis Lazuli Chestplate"); //In-game name
													
	//Lapis Lazuli Leggings RT1
										
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Leggings_T1, "Lapis Lazuli Leggings"); //In-game name
										
	//Lapis Lazuli Boots RT1
										
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Boots_T1, "Lapis Lazuli Boots"); //In-game name
	
	
	//Lapis Lazuli ARMOR RT2
	
	//Lapis Lazuli Helmet RT2
				
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Helmet_T2, "Lapis Lazuli Helmet"); //In-game name
						
	//Lapis Lazuli Chestplate RT2
							
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Chestplate_T2, "Lapis Lazuli Chestplate"); //In-game name
												
	//Lapis Lazuli Leggings RT2
							
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Leggings_T2, "Lapis Lazuli Leggings"); //In-game name
							
	//Lapis Lazuli Boots RT2
							
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Boots_T2, "Lapis Lazuli Boots"); //In-game name
			
			
	//Lapis Lazuli ARMOR RT3
			
	//Lapis Lazuli Helmet RT3
						
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Helmet_T3, "Lapis Lazuli Helmet"); //In-game name
									
	//Lapis Lazuli Chestplate RT3
								
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Chestplate_T3, "Lapis Lazuli Chestplate"); //In-game name
												
	//Lapis Lazuli Leggings RT3
									
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Leggings_T3, "Lapis Lazuli Leggings"); //In-game name
									
	//Lapis Lazuli Boots RT3
									
	LanguageRegistry.addName(ModArmor.Reinforced_LapisLazuli_Boots_T3, "Lapis Lazuli Boots"); //In-game name
		
	
	//Emerald ARMOR
	
	//Emerald Helmet
							
	LanguageRegistry.addName(ModArmor.Emerald_Helmet, "Emerald Helmet"); //In-game name
										
	//Emerald Chestplate
										
	LanguageRegistry.addName(ModArmor.Emerald_Chestplate, "Emerald Chestplate"); //In-game name
													
	//Emerald Leggings
										
	LanguageRegistry.addName(ModArmor.Emerald_Leggings, "Emerald Leggings"); //In-game name
										
	//Emerald Boots
										
	LanguageRegistry.addName(ModArmor.Emerald_Boots, "Emerald Boots"); //In-game name
		
		
	//Emerald ARMOR RT1
		
	//Emerald Helmet RT1
								
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Helmet_T1, "Emerald Helmet"); //In-game name
											
	//Emerald Chestplate RT1
										
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Chestplate_T1, "Emerald Chestplate"); //In-game name
														
	//Emerald Leggings RT1
											
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Leggings_T1, "Emerald Leggings"); //In-game name
											
	//Emerald Boots RT1
											
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Boots_T1, "Emerald Boots"); //In-game name
		
	
	//Emerald ARMOR RT2
		
	//Emerald Helmet RT2
					
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Helmet_T2, "Emerald Helmet"); //In-game name
							
	//Emerald Chestplate RT2
								
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Chestplate_T2, "Emerald Chestplate"); //In-game name
													
	//Emerald Leggings RT2
								
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Leggings_T2, "Emerald Leggings"); //In-game name
								
	//Emerald Boots RT2
								
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Boots_T2, "Emerald Boots"); //In-game name
				
				
	//Emerald ARMOR RT3
				
	//Emerald Helmet RT3
							
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Helmet_T3, "Emerald Helmet"); //In-game name
										
	//Emerald Chestplate RT3
									
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Chestplate_T3, "Emerald Chestplate"); //In-game name
													
	//Emerald Leggings RT3
										
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Leggings_T3, "Emerald Leggings"); //In-game name
										
	//Emerald Boots RT3
										
	LanguageRegistry.addName(ModArmor.Reinforced_Emerald_Boots_T3, "Emerald Boots"); //In-game name
	
	
	//Quartz ARMOR
	
	//Quartz Helmet
								
	LanguageRegistry.addName(ModArmor.Quartz_Helmet, "Quartz Helmet"); //In-game name
											
	//Quartz Chestplate
											
	LanguageRegistry.addName(ModArmor.Quartz_Chestplate, "Quartz Chestplate"); //In-game name
														
	//Quartz Leggings
											
	LanguageRegistry.addName(ModArmor.Quartz_Leggings, "Quartz Leggings"); //In-game name
											
	//Quartz Boots
											
	LanguageRegistry.addName(ModArmor.Quartz_Boots, "Quartz Boots"); //In-game name
			
			
	//Quartz ARMOR RT1
			
	//Quartz Helmet RT1
									
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Helmet_T1, "Quartz Helmet"); //In-game name
												
	//Quartz Chestplate RT1
											
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Chestplate_T1, "Quartz Chestplate"); //In-game name
															
	//Quartz Leggings RT1
												
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Leggings_T1, "Quartz Leggings"); //In-game name
												
	//Quartz Boots RT1
												
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Boots_T1, "Quartz Boots"); //In-game name
			
		
	//Quartz ARMOR RT2
			
	//Quartz Helmet RT2
						
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Helmet_T2, "Quartz Helmet"); //In-game name
								
	//Quartz Chestplate RT2
									
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Chestplate_T2, "Quartz Chestplate"); //In-game name
													
	//Quartz Leggings RT2
									
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Leggings_T2, "Quartz Leggings"); //In-game name
									
	//Quartz Boots RT2
									
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Boots_T2, "Quartz Boots"); //In-game name
					
					
	//Quartz ARMOR RT3
					
	//Quartz Helmet RT3
								
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Helmet_T3, "Quartz Helmet"); //In-game name
											
	//Quartz Chestplate RT3
										
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Chestplate_T3, "Quartz Chestplate"); //In-game name
														
	//Quartz Leggings RT3
											
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Leggings_T3, "Quartz Leggings"); //In-game name
											
	//Quartz Boots RT3
											
	LanguageRegistry.addName(ModArmor.Reinforced_Quartz_Boots_T3, "Quartz Boots"); //In-game name
	
	
	//Bone ARMOR
	
	//Bone Helmet
									
	LanguageRegistry.addName(ModArmor.Bone_Helmet, "Bone Helmet"); //In-game name
											
	//Bone Chestplate
												
	LanguageRegistry.addName(ModArmor.Bone_Chestplate, "Bone Chestplate"); //In-game name
															
	//Bone Leggings
												
	LanguageRegistry.addName(ModArmor.Bone_Leggings, "Bone Leggings"); //In-game name
												
	//Bone Boots
												
	LanguageRegistry.addName(ModArmor.Bone_Boots, "Bone Boots"); //In-game name
			
		
	}
}
