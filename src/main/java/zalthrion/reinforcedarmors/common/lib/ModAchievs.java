package zalthrion.reinforcedarmors.common.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import zalthrion.reinforcedarmors.common.CraftingHandler;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.lib.ModBlocks;
import zalthrion.reinforcedarmors.common.lib.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.MinecraftForge;

import java.util.List;

public class ModAchievs {
	
	public static final Achievement Upgraded = new Achievement(3432, "Upgraded", 4, -4, Item.blazePowder, AchievementList.buildWorkBench).setSpecial().registerAchievement();
	
	public static final Achievement Full_Upgrade = new Achievement(3433, "Full-Upgrade", 6, -5, Item.enderPearl , Upgraded).setSpecial().registerAchievement();
	
	public static final Achievement Total_Upgrade = new Achievement(3434, "Total-Upgrade", 7, -7, Item.eyeOfEnder, Full_Upgrade).setSpecial().registerAchievement();

	
    public static void init() {
        registerAchievements();
        
    }

    private static void addAchievementName(String ach, String name)
    {
    LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
    }


    private static void addAchievementDesc(String ach, String desc)
    {
    LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
    }
    
    private static void registerAchievements() {

    	    GameRegistry.registerCraftingHandler(new CraftingHandler());
    	    

    		addAchievementName("Upgraded", "Upgraded!");

    		addAchievementDesc("Upgraded", "Upgrade one of your Armors to Tier 1");
    	
    	
    		addAchievementName("Full-Upgrade", "Fully Upgraded!");

    		addAchievementDesc("Full-Upgrade", "Upgrade one of your Armors to Tier 2");
    	
    	
    		addAchievementName("Total-Upgrade", "Total Upgraded!");

    		addAchievementDesc("Total-Upgrade", "Upgrade one of your Armors to Tier 3");
    	
    		addAchievementLocalizations();
    }

	private static void addAchievementLocalizations() 
	{      }

}