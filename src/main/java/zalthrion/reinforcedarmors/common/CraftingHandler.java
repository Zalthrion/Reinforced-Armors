package zalthrion.reinforcedarmors.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.lib.ModAchievs;
import zalthrion.reinforcedarmors.common.lib.ModArmor;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		
		//Tier 1
		
		//Obsidian Armor
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Helmet_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Chestplate_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Leggings_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Boots_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		//Tier 2
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Helmet_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Chestplate_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Leggings_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Boots_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		//Tier 3
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Helmet_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Chestplate_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Leggings_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Obsidian_Boots_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		
		//Crying Obsidian Armor
		
		//Tier 1
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Helmet_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Chestplate_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Leggings_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Boots_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
	    //Tier 2
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Helmet_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Chestplate_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Leggings_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Boots_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		//Tier 3
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Helmet_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Chestplate_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Leggings_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_CryingObsidian_Boots_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		//-=-
		
		//Lapis Armor
		
		//Tier 1
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Helmet_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Chestplate_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Leggings_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Boots_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
		
	    //Tier 2
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Helmet_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Chestplate_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Leggings_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Boots_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
		
		//Tier 3
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Helmet_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Chestplate_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Leggings_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_LapisLazuli_Boots_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
		
		//-=-
		
		//Emerald Armor
		
		//Tier 1
			
		if (item.itemID == ModArmor.Reinforced_Emerald_Helmet_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
				
		// -=-
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Chestplate_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
				
		// -=-
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Leggings_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
				
		// -=-
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Boots_T1.itemID)
		{
		player.addStat(ModAchievs.Upgraded, 1);
		}
				
		//Tier 2
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Helmet_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
				
		// -=-
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Chestplate_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
				
		// -=-
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Leggings_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
				
		// -=-
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Boots_T2.itemID)
		{
		player.addStat(ModAchievs.Full_Upgrade, 1);
		}
				
		//Tier 3
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Helmet_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
				
		// -=-
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Chestplate_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
				
		// -=-
		
		if (item.itemID == ModArmor.Reinforced_Emerald_Leggings_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
				
		// -=-
				
		if (item.itemID == ModArmor.Reinforced_Emerald_Boots_T3.itemID)
		{
		player.addStat(ModAchievs.Total_Upgrade, 1);
		}
				
		//-=-


	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {

	}

}
