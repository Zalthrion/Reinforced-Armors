package zalthrion.reinforcedarmors.common.lib.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.lib.ModArmor;
import zalthrion.reinforcedarmors.common.lib.ModBlocks;
import zalthrion.reinforcedarmors.common.lib.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import java.util.List;

public class ModArmorRecipes {
	
	//Obsidian
	
	//TIER 0
	
	public static final ItemStack Obsidian_HelmetStack = new ItemStack (ModArmor.Obsidian_Helmet);
	public static final ItemStack Obsidian_Chestplatetack = new ItemStack (ModArmor.Obsidian_Chestplate);
	public static final ItemStack Obsidian_LeggingsStack = new ItemStack (ModArmor.Obsidian_Leggings);
	public static final ItemStack Obsidian_BootsStack = new ItemStack (ModArmor.Obsidian_Boots);
	
	
	//Crying Obsidian
	
    //TIER 0
	
	public static final ItemStack CryingObsidian_HelmetStack = new ItemStack (ModArmor.CryingObsidian_Helmet);
	public static final ItemStack CryingObsidian_Chestplatetack = new ItemStack (ModArmor.CryingObsidian_Chestplate);
	public static final ItemStack CryingObsidian_LeggingsStack = new ItemStack (ModArmor.CryingObsidian_Leggings);
	public static final ItemStack CryingObsidian_BootsStack = new ItemStack (ModArmor.CryingObsidian_Boots);
	
	
	//Lapis Lazuli
	
	//TIER 0
	
	public static final ItemStack LapisLazuli_HelmetStack = new ItemStack (ModArmor.LapisLazuli_Helmet);
	public static final ItemStack LapisLazuli_Chestplatetack = new ItemStack (ModArmor.LapisLazuli_Chestplate);
	public static final ItemStack LapisLazuli_LeggingsStack = new ItemStack (ModArmor.LapisLazuli_Leggings);
	public static final ItemStack LapisLazuli_BootsStack = new ItemStack (ModArmor.LapisLazuli_Boots);
	
	
	//Emerald
	
	//TIER 0
	
	public static final ItemStack Emerald_HelmetStack = new ItemStack (ModArmor.Emerald_Helmet);
	public static final ItemStack Emerald_Chestplatetack = new ItemStack (ModArmor.Emerald_Chestplate);
	public static final ItemStack Emerald_LeggingsStack = new ItemStack (ModArmor.Emerald_Leggings);
	public static final ItemStack Emerald_BootsStack = new ItemStack (ModArmor.Emerald_Boots);
	
	
	//Quartz
	
	//TIER 0
	
	public static final ItemStack Quartz_HelmetStack = new ItemStack (ModArmor.Quartz_Helmet);
	public static final ItemStack Quartz_Chestplatetack = new ItemStack (ModArmor.Quartz_Chestplate);
	public static final ItemStack Quartz_LeggingsStack = new ItemStack (ModArmor.Quartz_Leggings);
	public static final ItemStack Quartz_BootsStack = new ItemStack (ModArmor.Quartz_Boots);

	
	//Admin
	
	//ULTIMATE TIER
	
	public static final ItemStack Admin_HelmetStack = new ItemStack (ModArmor.Admin_Helmet);
	public static final ItemStack Admin_Chestplatetack = new ItemStack (ModArmor.Admin_Chestplate);
	public static final ItemStack Admin_LeggingsStack = new ItemStack (ModArmor.Admin_Leggings);
	public static final ItemStack Admin_BootsStack = new ItemStack (ModArmor.Admin_Boots);
	
	
    public static void init() {
        registerObsidian();
        registerCryingObsidian();
        registerLapisLazuli();
        registerEmerald();
        registerQuartz();
        registerAdmin();
        
    }

    private static void registerObsidian() {
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.Obsidian_Helmet), "BIB", "IEI", 'I', ModItems.Obsidian_Ingot, 'B', ModBlocks.Reinforced_Obsidian);
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.Obsidian_Chestplate), "BEB", "III", "III", 'I', ModItems.Obsidian_Ingot, 'B', ModBlocks.Reinforced_Obsidian);
    
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.Obsidian_Leggings), "BIB", "IEI", "IEI", 'I', ModItems.Obsidian_Ingot, 'B', ModBlocks.Reinforced_Obsidian);
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.Obsidian_Boots), "IEI", "BEB", 'I', ModItems.Obsidian_Ingot, 'B', ModBlocks.Reinforced_Obsidian);
    
    
    }
    
    private static void registerCryingObsidian() {
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.CryingObsidian_Helmet), "BIB", "IEI", 'I', ModItems.CryingObsidian_Ingot, 'B', ModBlocks.Reinforced_CryingObsidian);
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.CryingObsidian_Chestplate), "BEB", "III", "III", 'I', ModItems.CryingObsidian_Ingot, 'B', ModBlocks.Reinforced_CryingObsidian);
        
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.CryingObsidian_Leggings), "BIB", "IEI", "IEI", 'I', ModItems.CryingObsidian_Ingot, 'B', ModBlocks.Reinforced_CryingObsidian);
        	
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.CryingObsidian_Boots), "IEI", "BEB", 'I', ModItems.CryingObsidian_Ingot, 'B', ModBlocks.Reinforced_CryingObsidian);
    	
    	
    }
    
    private static void registerLapisLazuli() {
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.LapisLazuli_Helmet), "BIB", "IEI", 'I', ModItems.LapisLazuli_Ingot, 'B', ModBlocks.Reinforced_LapisLazuli_Block);
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.LapisLazuli_Chestplate), "BEB", "III", "III", 'I', ModItems.LapisLazuli_Ingot, 'B', ModBlocks.Reinforced_LapisLazuli_Block);
        
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.LapisLazuli_Leggings), "BIB", "IEI", "IEI", 'I', ModItems.LapisLazuli_Ingot, 'B', ModBlocks.Reinforced_LapisLazuli_Block);
        	
    GameRegistry.addShapedRecipe(new ItemStack(ModArmor.LapisLazuli_Boots), "IEI", "BEB", 'I', ModItems.LapisLazuli_Ingot, 'B', ModBlocks.Reinforced_LapisLazuli_Block);
    	
    	
    }
    
    private static void registerEmerald() {
    	
    //Empty
    	
    	
    }
    
    private static void registerQuartz() {
    	
    //Empty
    	
    	
    }
    
    private static void registerAdmin() {
    	
    //Empty
    	
    	
    }

}