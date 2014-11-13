package zalthrion.reinforcedarmors.common.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.lib.ModBlocks;
import zalthrion.reinforcedarmors.common.lib.ModItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.MinecraftForge;

import java.util.List;

public class ModTabs {
	
	//Armors
	
	public static final CreativeTabs Reinforced_Armors = new CreativeTabs("Reinforced Armors") {

	public ItemStack getIconItemStack() {

	 return new ItemStack(ModItems.Obsidian_Crystal, 1, 0);
	
	  }
	};
	
	
	//Blocks
	 
	public static CreativeTabs Reinforced_Armors_Blocks = new CreativeTabs("Reinforced Armors Blocks") {

	public ItemStack getIconItemStack() {

	 return new ItemStack(ModItems.Reinforced_Obsidian_Crystal, 1, 0);
	
	  }
	};

		
	//Items

	public static CreativeTabs Reinforced_Armors_Items = new CreativeTabs("Reinforced Armors Items") {

	public ItemStack getIconItemStack() {

	 return new ItemStack(ModItems.Purified_Obsidian_Crystal, 1, 0);
	
	  }
	};		
		
		
	//Admin

	public static CreativeTabs Reinforced_Armors_Admin = new CreativeTabs("Reinforced Armors Admin") {

	public ItemStack getIconItemStack() {

	 return new ItemStack(ModItems.Admin_Crystal, 1, 0);
		        
	  }
	};
		
	
    public static void init() {
        registerTabs();
        
    }
    
    private static void registerTabs() {
    	
    	//Reinforced Armors

    	LanguageRegistry.instance().addStringLocalization("itemGroup.Reinforced Armors", "en_US", "Reinforced Armors (Armors)");

    	//Reinforced Armors Blocks

    	LanguageRegistry.instance().addStringLocalization("itemGroup.Reinforced Armors Blocks", "en_US", "Reinforced Armors (Blocks)");

    	//Reinforced Armors Items

    	LanguageRegistry.instance().addStringLocalization("itemGroup.Reinforced Armors Items", "en_US", "Reinforced Armors (Items)");

    	//Reinforced Armors Admin

    	LanguageRegistry.instance().addStringLocalization("itemGroup.Reinforced Armors Admin", "en_US", "Reinforced Armors (Admin)");
        
    }

}