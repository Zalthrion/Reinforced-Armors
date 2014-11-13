package zalthrion.reinforcedarmors.common.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.items.*;
import net.minecraft.item.Item;

import java.util.List;

public class ModItems {
	
	//Obsidian
	
	public static final Item Obsidian_Ingot = new Obsidian_Ingot(5114).setUnlocalizedName("Obsidian_Ingot").setCreativeTab(ModTabs.Reinforced_Armors_Items);
	
    public static final Item Reinforced_Obsidian_Ingot = new Reinforced_Obsidian_Ingot(5159).setUnlocalizedName("Reinforced_Obsidian_Ingot").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
	public static final Item Purified_Obsidian_Ingot = new Purified_Obsidian_Ingot(5113).setUnlocalizedName("Purified_Obsidian_Ingot").setCreativeTab(ModTabs.Reinforced_Armors_Items);
	
    public static final Item Obsidian_Crystal = new Obsidian_Crystal(5132).setUnlocalizedName("Obsidian_Crystal").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Reinforced_Obsidian_Crystal = new Reinforced_Obsidian_Crystal(5133).setUnlocalizedName("Reinforced_Obsidian_Crystal").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Purified_Obsidian_Crystal = new Purified_Obsidian_Crystal(5143).setUnlocalizedName("Purified_Obsidian_Crystal").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    
    //Crying Obsidian
    
    public static final Item CryingObsidian_Ingot = new CryingObsidian_Ingot(5123).setUnlocalizedName("CryingObsidian_Ingot").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Reinforced_CryingObsidian_Ingot = new Reinforced_CryingObsidian_Ingot(5260).setUnlocalizedName("Reinforced_Obsidian_Ingot").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
	public static final Item Purified_CryingObsidian_Ingot = new Purified_CryingObsidian_Ingot(5261).setUnlocalizedName("Purified_Obsidian_Ingot").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item CryingObsidian_Crystal = new CryingObsidian_Crystal(5156).setUnlocalizedName("CryingObsidian_Crystal").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Reinforced_CryingObsidian_Crystal = new Reinforced_CryingObsidian_Crystal(5157).setUnlocalizedName("Reinforced_CryingObsidian_Crystal").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Purified_CryingObsidian_Crystal = new Purified_CryingObsidian_Crystal(5158).setUnlocalizedName("Purified_CryingObsidian_Crystal").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    
    //Lapis Lazuli

    public static final Item LapisLazuli_Ingot = new LapisLazuli_Ingot(5168).setUnlocalizedName("Lapis Lazuli Ingot").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Reinforced_LapisLazuli_Ingot = new Reinforced_LapisLazuli_Ingot(5197).setUnlocalizedName("Reinforced Lapis Lazuli Ingot").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Purified_LapisLazuli_Ingot = new Purified_LapisLazuli_Ingot(5198).setUnlocalizedName("Purified Lapis Lazuli Ingot").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    
    //Emerald
    
    public static final Item Hardened_Emerald = new Hardened_Emerald(5199).setUnlocalizedName("Hardened Emerald").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Reinforced_Emerald = new Reinforced_Emerald(5200).setUnlocalizedName("Reinforced Emerald").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Purified_Emerald= new Purified_Emerald(5201).setUnlocalizedName("Purified Emerald").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    
    //Quartz
    
    public static final Item Hardened_Quartz_Shard = new Hardened_Quartz_Shard(5202).setUnlocalizedName("Hardened Quartz Shard").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Reinforced_Quartz_Shard = new Reinforced_Quartz_Shard(5203).setUnlocalizedName("Reinforced Quartz Shard").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    public static final Item Purified_Quartz_Shard = new Purified_Quartz_Shard(5204).setUnlocalizedName("Purified Quartz Shard").setCreativeTab(ModTabs.Reinforced_Armors_Items);
    
    
    //Admin
    
    public static final Item Admin_Crystal = new Admin_Crystal(5134).setUnlocalizedName("Admin Crystal").setCreativeTab(ModTabs.Reinforced_Armors_Admin);


    public static void init() {
        registerObsidian();
        registerCryingObsidian();
        registerLapisLazuli();
        registerEmerald();
        registerQuartz();
        registerAdmin();
        
    }

    private static void registerObsidian() {
    	
    	GameRegistry.registerItem(Obsidian_Ingot, Names.OBIngot);
    	LanguageRegistry.addName(ModItems.Obsidian_Ingot, "Obsidian Ingot");
    	
    	GameRegistry.registerItem(Reinforced_Obsidian_Ingot, Names.ROBIngot);
    	LanguageRegistry.addName(ModItems.Reinforced_Obsidian_Ingot, "Reinforced Obsidian Ingot");
    	
    	GameRegistry.registerItem(Purified_Obsidian_Ingot, Names.POBIngot);
    	LanguageRegistry.addName(ModItems.Purified_Obsidian_Ingot, "Purified Obsidian Ingot");
        
        GameRegistry.registerItem(Obsidian_Crystal, Names.OBCrystal);
        LanguageRegistry.addName(ModItems.Obsidian_Crystal, "Obsidian Crystal");
        
        GameRegistry.registerItem(Reinforced_Obsidian_Crystal, Names.ROBCrystal);
        LanguageRegistry.addName(ModItems.Reinforced_Obsidian_Crystal, "Reinforced Obsidian Crystal");
        
        GameRegistry.registerItem(Purified_Obsidian_Crystal, Names.POBCrystal);
        LanguageRegistry.addName(ModItems.Purified_Obsidian_Crystal, "Purified Obsidian Crystal");
        
    }
    
    private static void registerCryingObsidian() { 
    	
    	GameRegistry.registerItem(CryingObsidian_Ingot, Names.COBIngot);
    	LanguageRegistry.addName(ModItems.CryingObsidian_Ingot, "Crying Obsidian Ingot");
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Ingot, Names.RCOBIngot);
    	LanguageRegistry.addName(ModItems.Reinforced_CryingObsidian_Ingot, "Reinforced Crying Obsidian Ingot");
    	
    	GameRegistry.registerItem(Purified_CryingObsidian_Ingot, Names.PCOBIngot);
    	LanguageRegistry.addName(ModItems.Purified_CryingObsidian_Ingot, "Purified Crying Obsidian Ingot");
    	
    	GameRegistry.registerItem(CryingObsidian_Crystal, Names.COBCrystal);
    	LanguageRegistry.addName(ModItems.CryingObsidian_Crystal, "Crying Obsidian Crystal");

    	GameRegistry.registerItem(Reinforced_CryingObsidian_Crystal, Names.RCOBCrystal);
    	LanguageRegistry.addName(ModItems.Reinforced_CryingObsidian_Crystal, "Reinforced Crying Obsidian Crystal");
    	
    	GameRegistry.registerItem(Purified_CryingObsidian_Crystal, Names.PCOBCrystal);
    	LanguageRegistry.addName(ModItems.Purified_CryingObsidian_Crystal, "Purified Crying Obsidian Crystal");
    	
    }
    
    private static void registerLapisLazuli(){
    	
        GameRegistry.registerItem(LapisLazuli_Ingot, Names.LLIngot);
        LanguageRegistry.addName(ModItems.LapisLazuli_Ingot, "Lapis Lazuli Ingot");
        
        GameRegistry.registerItem(Reinforced_LapisLazuli_Ingot, Names.RLLIngot);
        LanguageRegistry.addName(ModItems.Reinforced_LapisLazuli_Ingot, "Reinforced Lapis Lazuli Ingot");
        
        GameRegistry.registerItem(Purified_LapisLazuli_Ingot, Names.PLLIngot);
        LanguageRegistry.addName(ModItems.Purified_LapisLazuli_Ingot, "Purified Lapis Lazuli Ingot");
    	
    }
    
    private static void registerEmerald(){
    	
    	GameRegistry.registerItem(Hardened_Emerald, Names.HEmerald);
    	LanguageRegistry.addName(ModItems.Hardened_Emerald, "Hardened Emerald");
    	
    	GameRegistry.registerItem(Reinforced_Emerald, Names.REmerald);
    	LanguageRegistry.addName(ModItems.Reinforced_Emerald, "Reinforced Emerald");
    	
    	GameRegistry.registerItem(Purified_Emerald, Names.PEmerald);
    	LanguageRegistry.addName(ModItems.Purified_Emerald, "Purified Emerald");
    	
    }
    
    private static void registerQuartz(){
    	
    	GameRegistry.registerItem(Hardened_Quartz_Shard, Names.HQShard);
    	LanguageRegistry.addName(ModItems.Hardened_Quartz_Shard, "Hardened Quartz Shard");
    	
    	GameRegistry.registerItem(Reinforced_Quartz_Shard, Names.RQShard);
    	LanguageRegistry.addName(ModItems.Reinforced_Quartz_Shard, "Reinforced Quartz Shard");
    	
    	GameRegistry.registerItem(Purified_Quartz_Shard, Names.PQShard);
    	LanguageRegistry.addName(ModItems.Purified_Quartz_Shard, "Purified Quartz Shard");
    	
    }
    
    private static void registerAdmin(){
    	
    	GameRegistry.registerItem(Admin_Crystal, Names.AdminCrystal);
    	LanguageRegistry.addName(ModItems.Admin_Crystal, "Admin Crystal");
    	
    }

    public static class Names {
    	
    	//Obsidian
    	
    	public static final String OBIngot = "Obsidian_Ingot";
    	
    	public static final String ROBIngot = "Reinforced_Obsidian_Ingot";
    	
    	public static final String POBIngot = "Purified_Obsidian_Ingot";
    	
        public static final String OBCrystal = "Obsidian_Crystal";
        
    	public static final String ROBCrystal = "Reinforced_Obsidian_Crystal";
    	
    	public static final String POBCrystal = "Purified_Obsidian_Crystal";
    	
    	
    	//Crying Obsidian
    	
        public static final String COBIngot = "CryingObsidian_Ingot";
        
        public static final String RCOBIngot = "Reinforced_CryingObsidian_Ingot";
    	
    	public static final String PCOBIngot = "Purified_CryingObsidian_Ingot";
    	
    	public static final String COBCrystal = "CryingObsidian_Crystal";
    	
    	public static final String RCOBCrystal = "Reinforced_CryingObsidian_Crystal";
    	
    	public static final String PCOBCrystal = "Purified_CryingObsidian_Crystal";
    	
    	
    	//Lapis Lazuli
    	
        public static final String LLIngot = "LapisLazuli_Ingot";
        
        public static final String RLLIngot = "Reinforced_LapisLazuli_Ingot";
        
        public static final String PLLIngot = "Purified_LapisLazuli_Ingot";
    	
        
        //Emerald
        
        public static final String HEmerald = "Hardened_Emerald";
        
        public static final String REmerald = "Reinforced_Emerald";
        
        public static final String PEmerald = "Purified_Emerald";
        
        
        //Quartz
        
        public static final String HQShard = "Hardened_Quartz_Shard";
        		
        public static final String RQShard = "Reinforced_Quartz_Shard";
        
        public static final String PQShard = "Purified_Quartz_Shard";
        
    	
    	//Admin
    	
    	public static final String AdminCrystal = "Admin_Crystal";

    	
    }
}