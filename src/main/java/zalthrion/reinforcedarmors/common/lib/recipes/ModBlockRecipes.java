package zalthrion.reinforcedarmors.common.lib.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.lib.ModBlocks;
import zalthrion.reinforcedarmors.common.lib.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import java.util.List;

public class ModBlockRecipes {
	
	//Obsidian
	
	public static final ItemStack ObsidianStack = new ItemStack(Block.obsidian);
	public static final ItemStack Clay_ObsidianStack = new ItemStack(ModBlocks.Clay_Obsidian);
	public static final ItemStack Hardened_ObsidianStack = new ItemStack (ModBlocks.Hardened_Obsidian);
	public static final ItemStack Reinforced_ObsidianStack = new ItemStack (ModBlocks.Reinforced_Obsidian);
	public static final ItemStack Purified_ObsidianStack = new ItemStack(ModBlocks.Purified_Obsidian);
	
	
	//Crying Obsidian
	
	public static final ItemStack Crying_ObsidianStack = new ItemStack (ModBlocks.Crying_Obsidian);
	public static final ItemStack Clay_CryingObsidianStack = new ItemStack(ModBlocks.Clay_CryingObsidian);
	public static final ItemStack Hardened_CryingObsidianStack = new ItemStack (ModBlocks.Hardened_CryingObsidian);
	public static final ItemStack Reinforced_CryingObsidianStack = new ItemStack (ModBlocks.Reinforced_CryingObsidian);
	public static final ItemStack Purified_CryingObsidianStack = new ItemStack(ModBlocks.Purified_CryingObsidian);
	
	
	//Lapis Lazuli
	
	public static final ItemStack LapisLazuli_BlockStack = new ItemStack(Block.blockLapis);
	public static final ItemStack Clay_LapisLazuliStack = new ItemStack(ModBlocks.Clay_LapisLazuli);
	public static final ItemStack Hardened_LapisLazuli_BlockStack = new ItemStack (ModBlocks.Hardened_LapisLazuli_Block);
	public static final ItemStack Reinforced_LapisLazuli_BlockStack = new ItemStack (ModBlocks.Reinforced_LapisLazuli_Block);
	public static final ItemStack Purified_LapisLazuli_BlockStack = new ItemStack(ModBlocks.Purified_LapisLazuli_Block);
	
	
	//Emerald
	
	public static final ItemStack Emerald_BlockStack = new ItemStack (Block.blockEmerald);
	public static final ItemStack Clay_EmeraldStack = new ItemStack(ModBlocks.Clay_Emerald);
	public static final ItemStack Hardened_Emerald_BlockStack = new ItemStack (ModBlocks.Hardened_Emerald_Block);
	public static final ItemStack Reinforced_Emerald_BlockStack = new ItemStack (ModBlocks.Reinforced_Emerald_Block);
	public static final ItemStack Purified_Emerald_BlockStack = new ItemStack(ModBlocks.Purified_Emerald_Block);
	
	
	//Quartz
	
	public static final ItemStack Quartz_BlockStack = new ItemStack (Block.blockNetherQuartz);
	public static final ItemStack Clay_QuartzStack = new ItemStack(ModBlocks.Clay_Quartz);
	public static final ItemStack Hardened_Quartz_BlockStack = new ItemStack (ModBlocks.Hardened_Quartz_Block);
	public static final ItemStack Reinforced_Quartz_BlockStack = new ItemStack (ModBlocks.Reinforced_Quartz_Block);
	public static final ItemStack Purified_Quartz_BlockStack = new ItemStack(ModBlocks.Purified_Quartz_Block);
	
	
    public static void init() {
        registerShapelessRecipes();
        registerShapedRecipes();
        
    }

    private static void registerShapelessRecipes() {
    	
    //Obsidian
    	
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Obsidian_Ingot, 4), ModBlocks.Hardened_Obsidian);
    	
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Reinforced_Obsidian_Ingot, 4), ModBlocks.Reinforced_Obsidian);
    	
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Purified_Obsidian_Ingot, 4), ModBlocks.Purified_Obsidian);
    
    
    //Crying Obsidian
    
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CryingObsidian_Ingot, 4), ModBlocks.Hardened_CryingObsidian);
	
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Reinforced_CryingObsidian_Ingot, 4), ModBlocks.Reinforced_CryingObsidian);
    	
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Purified_CryingObsidian_Ingot, 4), ModBlocks.Purified_CryingObsidian);
    
    
    //Lapis Lazuli
    
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LapisLazuli_Ingot, 4), ModBlocks.Hardened_LapisLazuli_Block);
	
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Reinforced_LapisLazuli_Ingot, 4), ModBlocks.Reinforced_LapisLazuli_Block);
    	
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Purified_LapisLazuli_Ingot, 4), ModBlocks.Purified_LapisLazuli_Block);
    
    	
    }
    
    private static void registerShapedRecipes() {
    	
    //Obsidian
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Clay_Obsidian, 1), "SCS", "CBC", "SCS", 'B', Block.obsidian, 'S', Item.clay, 'C', Block.blockClay);
    	
    //Crying Obsidian
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Clay_CryingObsidian, 1), "SCS", "CBC", "SCS", 'B', ModBlocks.Crying_Obsidian, 'S', Item.clay, 'C', Block.blockClay);
    	
    //Lapis Lazuli
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Clay_LapisLazuli, 1), "SCS", "CBC", "SCS", 'B', Block.blockLapis, 'S', Item.clay, 'C', Block.blockClay);
    	
    //Emerald
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Clay_Emerald, 1), "SCS", "CBC", "SCS", 'B', Block.blockEmerald, 'S', Item.clay, 'C', Block.blockClay);
    	
    //Quartz
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Clay_Quartz, 1), "SCS", "CBC", "SCS", 'B', Block.blockNetherQuartz, 'S', Item.clay, 'C', Block.blockClay);
    	
    }

}