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

public class ModItemRecipes {
	
	//Obsidian
	
	public static final ItemStack Obsidian_IngotStack = new ItemStack (ModItems.Obsidian_Ingot);
	public static final ItemStack Reinforced_Obsidian_IngotStack = new ItemStack (ModItems.Reinforced_Obsidian_Ingot);
	public static final ItemStack Purified_Obsidian_IngotStack = new ItemStack(ModItems.Purified_Obsidian_Ingot);
	
	public static final ItemStack Obsidian_CrystalStack = new ItemStack (ModItems.Obsidian_Crystal);
	public static final ItemStack Reinforced_Obsidian_CrystalStack = new ItemStack (ModItems.Reinforced_Obsidian_Crystal);
	public static final ItemStack Purified_Obsidian_CrystalStack = new ItemStack(ModItems.Purified_Obsidian_Crystal);
	
	
	//Crying Obsidian
	
	public static final ItemStack CryingObsidian_IngotStack = new ItemStack (ModItems.CryingObsidian_Ingot);
	public static final ItemStack Reinforced_CryingObsidian_IngotStack = new ItemStack (ModItems.Reinforced_CryingObsidian_Ingot);
	public static final ItemStack Purified_CryingObsidian_IngotStack = new ItemStack(ModItems.Purified_CryingObsidian_Ingot);
	
	public static final ItemStack CryingObsidian_CrystalStack = new ItemStack (ModItems.CryingObsidian_Crystal);
	public static final ItemStack Reinforced_CryingObsidian_CrystalStack = new ItemStack (ModItems.Reinforced_CryingObsidian_Crystal);
	public static final ItemStack Purified_CryingObsidian_CrystalStack = new ItemStack(ModItems.Purified_CryingObsidian_Crystal);
	
	
	//Lapis Lazuli
	
	public static final ItemStack LapisLazuli_IngotStack = new ItemStack (ModItems.LapisLazuli_Ingot);
	public static final ItemStack Reinforced_LapisLazuli_IngotStack = new ItemStack (ModItems.Reinforced_Obsidian_Ingot);
	public static final ItemStack Purified_LapisLazuli_IngotStack = new ItemStack(ModItems.Purified_Obsidian_Ingot);
/*	
	public static final ItemStack LapisLazuli_IngotStack = new ItemStack (ModItems.LapisLazuli_Ingot);
	public static final ItemStack Reinforced_LapisLazuli_IngotStack = new ItemStack (ModItems.Reinforced_Obsidian_Ingot);
	public static final ItemStack Purified_LapisLazuli_IngotStack = new ItemStack(ModItems.Purified_Obsidian_Ingot);
*/	
	
	//Emerald
	
	public static final ItemStack Hardened_EmeraldStack = new ItemStack (ModItems.Hardened_Emerald);
	public static final ItemStack Reinforced_EmeraldStack = new ItemStack (ModItems.Reinforced_Emerald);
	public static final ItemStack Purified_EmeraldStack = new ItemStack(ModItems.Purified_Emerald);
/*	
	public static final ItemStack Hardened_EmeraldStack = new ItemStack (ModItems.Hardened_Emerald);
	public static final ItemStack Reinforced_EmeraldStack = new ItemStack (ModItems.Reinforced_Emerald);
	public static final ItemStack Purified_EmeraldStack = new ItemStack(ModItems.Purified_Emerald);
*/	
	
	//Quartz
	
	public static final ItemStack Hardened_Quartz_ShardStack = new ItemStack (ModItems.Hardened_Quartz_Shard);
	public static final ItemStack Reinforced_Quartz_ShardStack = new ItemStack (ModItems.Reinforced_Quartz_Shard);
	public static final ItemStack Purified_Quartz_ShardStack = new ItemStack(ModItems.Purified_Quartz_Shard);
/*	
	public static final ItemStack Hardened_Quartz_ShardStack = new ItemStack (ModItems.Hardened_Quartz_Shard);
	public static final ItemStack Reinforced_Quartz_ShardStack = new ItemStack (ModItems.Reinforced_Quartz_Shard);
	public static final ItemStack Purified_Quartz_ShardStack = new ItemStack(ModItems.Purified_Quartz_Shard);
*/	
	
	//Admin
	
	public static final ItemStack Admin_CrystalStack = new ItemStack(ModItems.Admin_Crystal);
	
	
    public static void init() {
        registerShapelessRecipes();
        registerShapedRecipes();
        
    }

    private static void registerShapelessRecipes() {
    	
    //Obsidian
    	
    //Empty
    	
    }
    
    private static void registerShapedRecipes() {
    	
    //Obsidian
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Hardened_Obsidian), "II", "II", 'I', ModItems.Obsidian_Ingot);
    	
    
    //Crying Obsidian
    	
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Hardened_CryingObsidian), "II", "II", 'I', ModItems.CryingObsidian_Ingot);
    	
    
    //Lapis Lazuli
    
    GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.Hardened_LapisLazuli_Block), "II", "II", 'I', ModItems.LapisLazuli_Ingot);
    
    	
    //Emerald
    	
    //Empty
    	
    
    //Quartz
    	
    //Empty	
    	
    
    //Admin
    
    //Empty
    
    
    }

}