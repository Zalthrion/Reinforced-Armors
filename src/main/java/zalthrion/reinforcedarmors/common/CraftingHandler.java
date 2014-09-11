package zalthrion.reinforcedarmors.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		
		//Tier 1
		
		//Obsidian Armor
		
		if (item.itemID == ReinforcedArmors.Reinforced_Obsidian_Helmet_T1.itemID)
		{
		player.addStat(ReinforcedArmors.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ReinforcedArmors.Reinforced_Obsidian_Chestplate_T1.itemID)
		{
		player.addStat(ReinforcedArmors.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ReinforcedArmors.Reinforced_Obsidian_Leggings_T1.itemID)
		{
		player.addStat(ReinforcedArmors.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ReinforcedArmors.Reinforced_Obsidian_Boots_T1.itemID)
		{
		player.addStat(ReinforcedArmors.Upgraded, 1);
		}
		
		//Crying Obsidian Armor
		
		if (item.itemID == ReinforcedArmors.Reinforced_CryingObsidian_Helmet_T1.itemID)
		{
		player.addStat(ReinforcedArmors.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ReinforcedArmors.Reinforced_CryingObsidian_Chestplate_T1.itemID)
		{
		player.addStat(ReinforcedArmors.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ReinforcedArmors.Reinforced_CryingObsidian_Leggings_T1.itemID)
		{
		player.addStat(ReinforcedArmors.Upgraded, 1);
		}
		
		// -=-
		
		if (item.itemID == ReinforcedArmors.Reinforced_CryingObsidian_Boots_T1.itemID)
		{
		player.addStat(ReinforcedArmors.Upgraded, 1);
		}
		
	    //Tier 2
		
		if (item.itemID == ReinforcedArmors.Crying_Obsidian_Ingot.itemID)
		{
		player.addStat(ReinforcedArmors.Full_Upgrade, 1);
		}
		
		//Tier 3
		
		if (item.itemID == ReinforcedArmors.Obsidian_Ingot.itemID)
		{
		player.addStat(ReinforcedArmors.Total_Upgrade, 1);
		}

	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {

	}

}
