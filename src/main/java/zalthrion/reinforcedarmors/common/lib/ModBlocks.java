package zalthrion.reinforcedarmors.common.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

import java.util.List;

public class ModBlocks {
	
	//Obsidian
	
	public static final Block Clay_Obsidian = new Clay_Obsidian(3240).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Clay_Obsidian").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	public static final Block Hardened_Obsidian = new Hardened_Obsidian(3136).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Hardened_Obsidian").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	public static final Block Reinforced_Obsidian = new Reinforced_Obsidian(3138).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Reinforced_Obsidian").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2150.0F);

	public static final Block Purified_Obsidian = new Purified_Obsidian(3135).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Purified_Obsidian").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);


	//Crying Obsidian
	
	public static final Block Clay_CryingObsidian = new Clay_CryingObsidian(3241).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Clay_CryingObsidian").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	public static final Block Crying_Obsidian = new Crying_Obsidian(3134).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Crying_Obsidian").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	public static final Block Hardened_CryingObsidian = new Hardened_CryingObsidian(3137).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Hardened_CryingObsidian").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	public static final Block Reinforced_CryingObsidian = new Reinforced_CryingObsidian(3143).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Reinforced_CryingObsidian").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2200.0F);
	
	public static final Block Purified_CryingObsidian = new Purified_CryingObsidian(3142).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Purified_CryingObsidian").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	
	//Lapis Lazuli
	
	public static final Block Clay_LapisLazuli = new Clay_LapisLazuli(3242).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Clay_LapisLazuli").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	public static final Block Hardened_LapisLazuli_Block = new Hardened_LapisLazuli_Block(3139).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Hardened_LapisLazuli_Block").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(10.0F);
	
	public static final Block Reinforced_LapisLazuli_Block = new Reinforced_LapisLazuli_Block(3141).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Reinforced_LapisLazuli_Block").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2200.0F);
	
	public static final Block Purified_LapisLazuli_Block = new Purified_LapisLazuli_Block(3140).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Purified_LapisLazuli_Block").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	
	//Emerald
	
	public static final Block Clay_Emerald = new Clay_Emerald(3243).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Clay_Emerald").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	public static final Block Hardened_Emerald_Block = new Hardened_Emerald_Block(3144).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Hardened_Emerald_Block").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(10.0F);
	
	public static final Block Reinforced_Emerald_Block = new Reinforced_Emerald_Block(3146).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Reinforced_Emerald_Block").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(15.0F);
	
	public static final Block Purified_Emerald_Block = new Purified_Emerald_Block(3145).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Purified_Emerald_Block").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(12.0F);
	
	
	//Quartz
	
	public static final Block Clay_Quartz = new Clay_Quartz(3244).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Clay_Quartz").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(2000.0F);
	
	public static final Block Hardened_Quartz_Block = new Hardened_Quartz_Block(3147).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Hardened_Quartz_Block").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(10.0F);
	
	public static final Block Reinforced_Quartz_Block = new Reinforced_Quartz_Block(3149).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Reinforced_Quartz_Block").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(15.0F);
	
	public static final Block Purified_Quartz_Block = new Purified_Quartz_Block(3148).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Purified_Quartz_Block").setCreativeTab(ModTabs.Reinforced_Armors_Blocks).setResistance(12.0F);
	
	
    public static void init() {
        registerObsidian();
        registerCryingObsidian();
        registerLapisLazuli();
        registerEmerald();
        registerQuartz();
        
    }

    private static void registerObsidian() {
    	
    	GameRegistry.registerBlock(Clay_Obsidian, Names.OBCBlock);
    	MinecraftForge.setBlockHarvestLevel(Clay_Obsidian, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Clay_Obsidian, "Obsidian (Covered with Clay)");
    	
    	GameRegistry.registerBlock(Hardened_Obsidian, Names.HOBBlock);
    	MinecraftForge.setBlockHarvestLevel(Hardened_Obsidian, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Hardened_Obsidian, "Hardened Obsidian");
    	
    	GameRegistry.registerBlock(Reinforced_Obsidian, Names.ROBBlock);
    	MinecraftForge.setBlockHarvestLevel(Reinforced_Obsidian, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Reinforced_Obsidian, "Reinforced Obsidian");
    	
    	GameRegistry.registerBlock(Purified_Obsidian, Names.POBBlock);
    	MinecraftForge.setBlockHarvestLevel(Purified_Obsidian, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Purified_Obsidian, "Purified Obsidian");

        
    }
    
    private static void registerCryingObsidian() { 
    	
    	GameRegistry.registerBlock(Crying_Obsidian, Names.COBBlock);
    	MinecraftForge.setBlockHarvestLevel(Crying_Obsidian, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Crying_Obsidian, "Crying Obsidian");
    	
    	GameRegistry.registerBlock(Clay_CryingObsidian, Names.COBCBlock);
    	MinecraftForge.setBlockHarvestLevel(Clay_CryingObsidian, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Clay_CryingObsidian, "Crying Obsidian (Covered with Clay)");
    	
    	GameRegistry.registerBlock(Hardened_CryingObsidian, Names.HCOBBlock);
    	MinecraftForge.setBlockHarvestLevel(Hardened_CryingObsidian, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Hardened_CryingObsidian, "Hardened Crying Obsidian");
    	
    	GameRegistry.registerBlock(Reinforced_CryingObsidian, Names.RCOBBlock);
    	MinecraftForge.setBlockHarvestLevel(Reinforced_CryingObsidian, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Reinforced_CryingObsidian, "Reinforced Crying Obsidian");
    	
    	GameRegistry.registerBlock(Purified_CryingObsidian, Names.PCOBBlock);
    	MinecraftForge.setBlockHarvestLevel(Purified_CryingObsidian, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Purified_CryingObsidian, "Purified Crying Obsidian");
    	
    }
    
    private static void registerLapisLazuli(){
    	
    	GameRegistry.registerBlock(Clay_LapisLazuli, Names.LLCBlock);
    	MinecraftForge.setBlockHarvestLevel(Clay_LapisLazuli, "pickaxe", 2);
    	LanguageRegistry.addName(ModBlocks.Clay_LapisLazuli, "Lapis Lazuli Block (Covered with Clay)");
    	
        GameRegistry.registerBlock(Hardened_LapisLazuli_Block, Names.LLBlock);
        MinecraftForge.setBlockHarvestLevel(Hardened_LapisLazuli_Block, "pickaxe", 2);
        LanguageRegistry.addName(ModBlocks.Hardened_LapisLazuli_Block, "Hardened Lapis Lazuli Block");
        
        GameRegistry.registerBlock(Reinforced_LapisLazuli_Block, Names.RLLBlock);
        MinecraftForge.setBlockHarvestLevel(Reinforced_LapisLazuli_Block, "pickaxe", 3);
        LanguageRegistry.addName(ModBlocks.Reinforced_LapisLazuli_Block, "Reinforced Lapis Lazuli Block");
        
        GameRegistry.registerBlock(Purified_LapisLazuli_Block, Names.PLLBlock);
        MinecraftForge.setBlockHarvestLevel(Purified_LapisLazuli_Block, "pickaxe", 3);
    	LanguageRegistry.addName(ModBlocks.Purified_LapisLazuli_Block, "Purified Lapis Lazuli Block");
    	
    }
    
    private static void registerEmerald(){
    	
    	GameRegistry.registerBlock(Clay_Emerald, Names.EMCBlock);
    	MinecraftForge.setBlockHarvestLevel(Clay_Emerald, "pickaxe", 2);
    	LanguageRegistry.addName(Clay_Emerald, "Emerald Block (Covered with Clay)");
    	
    	GameRegistry.registerBlock(Hardened_Emerald_Block, Names.HEmeraldBlock);
    	MinecraftForge.setBlockHarvestLevel(Hardened_Emerald_Block, "pickaxe", 2);
    	LanguageRegistry.addName(ModBlocks.Hardened_Emerald_Block, "Hardened Emerald Block");
    	
    	GameRegistry.registerBlock(Reinforced_Emerald_Block, Names.REmeraldBlock);
    	MinecraftForge.setBlockHarvestLevel(Reinforced_Emerald_Block, "pickaxe", 2);
    	LanguageRegistry.addName(ModBlocks.Reinforced_Emerald_Block, "Reinforced Emerald Block");
    	
    	GameRegistry.registerBlock(Purified_Emerald_Block, Names.PEmeraldBlock);
    	MinecraftForge.setBlockHarvestLevel(Purified_Emerald_Block, "pickaxe", 2);
    	LanguageRegistry.addName(ModBlocks.Purified_Emerald_Block, "Purified Emerald Block");
    	
    }
    
    private static void registerQuartz(){
    	
    	GameRegistry.registerBlock(Clay_Quartz, Names.QCBlock);
    	MinecraftForge.setBlockHarvestLevel(Clay_Quartz, "pickaxe", 2);
    	LanguageRegistry.addName(Clay_Quartz, "Quartz Block (Covered with Clay)");
    	
    	GameRegistry.registerBlock(Hardened_Quartz_Block, Names.HQBlock);
    	MinecraftForge.setBlockHarvestLevel(Hardened_Quartz_Block, "pickaxe", 2);
    	LanguageRegistry.addName(ModBlocks.Hardened_Quartz_Block, "Hardened Quartz Block");
    	
    	GameRegistry.registerBlock(Reinforced_Quartz_Block, Names.RQBlock);
    	MinecraftForge.setBlockHarvestLevel(Reinforced_Quartz_Block, "pickaxe", 2);
    	LanguageRegistry.addName(ModBlocks.Reinforced_Quartz_Block, "Reinforced Quartz Block");
    	
    	GameRegistry.registerBlock(Purified_Quartz_Block, Names.PQBlock);
    	MinecraftForge.setBlockHarvestLevel(Purified_Quartz_Block, "pickaxe", 2);
    	LanguageRegistry.addName(ModBlocks.Purified_Quartz_Block, "Purified Quartz Block");
    	
    }

    public static class Names {
    	
    	//Obsidian
    	
    	public static final String OBCBlock = "Clay_Obsidian";
    	
    	public static final String HOBBlock = "Hardened_Obsidian";
    	
    	public static final String ROBBlock = "Reinforced_Obsidian";
    	
    	public static final String POBBlock = "Purified_Obsidian";
    	
    	
    	//Crying Obsidian
    	
    	public static final String COBBlock = "Crying_Obsidian";
    	
    	public static final String COBCBlock = "Clay_CryingObsidian";
    	
    	public static final String HCOBBlock = "Hardened_CryingObsidian";
    	
    	public static final String RCOBBlock = "Reinforced_CryingObsidian";
    	
    	public static final String PCOBBlock = "Purified_CryingObsidian";
    	
    	
    	//Lapis Lazuli
    	
    	public static final String LLCBlock = "Clay_LapisLazuli";
    	
        public static final String LLBlock = "LapisLazuli_Block";
        
        public static final String RLLBlock = "Reinforced_LapisLazuli_Block";
        
        public static final String PLLBlock = "Purified_LapisLazuli_Block";
    	
        
        //Emerald
        
        public static final String EMCBlock = "Clay_Emerald";
        
        public static final String HEmeraldBlock = "Hardened_Emerald_Block";
        
        public static final String REmeraldBlock = "Reinforced_Emerald_Block";
        
        public static final String PEmeraldBlock = "Purified_Emerald_Block";
        
        
        //Quartz
        
        public static final String QCBlock = "Clay_Quartz";
        
        public static final String HQBlock = "Hardened_Quartz_Block";
        		
        public static final String RQBlock = "Reinforced_Quartz_Block";
        
        public static final String PQBlock = "Purified_Quartz_Block";

    	
    }
}