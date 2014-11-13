package zalthrion.reinforcedarmors.common.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.items.armors.*;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.EnumHelper;

import java.util.List;

public class ModArmor {
	
	//Obsidian
	
	//TIER 0
	
	public static final EnumArmorMaterial AMObsidian = EnumHelper.addArmorMaterial("ObsidianArmorMaterial", 25, new int[]{2, 6, 5, 3}, 7);
	
	public static final Item Obsidian_Helmet = new ItemObsidianArmor (5115, AMObsidian, 0, 0, "Obsidian").setUnlocalizedName("Obsidian_Helmet").setCreativeTab(ModTabs.Reinforced_Armors);
	
    public static final Item Obsidian_Chestplate = new ItemObsidianArmor (5116, AMObsidian, 0, 1, "Obsidian").setUnlocalizedName("Obsidian_Chestplate").setCreativeTab(ModTabs.Reinforced_Armors);
    
	public static final Item Obsidian_Leggings = new ItemObsidianArmor (5117, AMObsidian, 0, 2, "Obsidian").setUnlocalizedName("Obsidian_Leggings").setCreativeTab(ModTabs.Reinforced_Armors);
	
    public static final Item Obsidian_Boots = new ItemObsidianArmor (5118, AMObsidian, 0, 3, "Obsidian").setUnlocalizedName("Obsidian_Boots").setCreativeTab(ModTabs.Reinforced_Armors);
    
    
    //TIER 1
	
    public static final EnumArmorMaterial AMObsidianRT1 = EnumHelper.addArmorMaterial("ReinforcedObsidianArmorMaterialT1", 27, new int[]{2, 7, 6, 3}, 9);
    
	public static final Item Reinforced_Obsidian_Helmet_T1 = new ItemObsidianArmorRT1 (5124, AMObsidianRT1, 0, 0, "Obsidian_RT1").setUnlocalizedName("Reinforced_Obsidian_Helmet_T1").setCreativeTab(ModTabs.Reinforced_Armors);
	
    public static final Item Reinforced_Obsidian_Chestplate_T1 = new ItemObsidianArmorRT1 (5125, AMObsidianRT1, 0, 1, "Obsidian_RT1").setUnlocalizedName("Reinforced_Obsidian_Chestplate_T1").setCreativeTab(ModTabs.Reinforced_Armors);
    
	public static final Item Reinforced_Obsidian_Leggings_T1 = new ItemObsidianArmorRT1 (5126, AMObsidianRT1, 0, 2, "Obsidian_RT1").setUnlocalizedName("Reinforced_Obsidian_Leggings_T1").setCreativeTab(ModTabs.Reinforced_Armors);
	
    public static final Item Reinforced_Obsidian_Boots_T1 = new ItemObsidianArmorRT1 (5127, AMObsidianRT1, 0, 3, "Obsidian_RT1").setUnlocalizedName("Reinforced_Obsidian_Boots_T1").setCreativeTab(ModTabs.Reinforced_Armors);
    
    
    //TIER 2
	
    public static final EnumArmorMaterial AMObsidianRT2 = EnumHelper.addArmorMaterial("ReinforcedObsidianArmorMaterialT2", 32, new int[]{3, 7, 6, 3}, 12);
    
	public static final Item Reinforced_Obsidian_Helmet_T2 = new ItemObsidianArmorRT2 (5139, AMObsidianRT2, 0, 0, "Obsidian_RT2").setUnlocalizedName("Reinforced_Obsidian_Helmet_T2").setCreativeTab(ModTabs.Reinforced_Armors);
	
    public static final Item Reinforced_Obsidian_Chestplate_T2 = new ItemObsidianArmorRT2 (5140, AMObsidianRT2, 0, 1, "Obsidian_RT2").setUnlocalizedName("Reinforced_Obsidian_Chestplate_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
	public static final Item Reinforced_Obsidian_Leggings_T2 = new ItemObsidianArmorRT2 (5141, AMObsidianRT2, 0, 2, "Obsidian_RT2").setUnlocalizedName("Reinforced_Obsidian_Leggings_T2").setCreativeTab(ModTabs.Reinforced_Armors);
	
    public static final Item Reinforced_Obsidian_Boots_T2 = new ItemObsidianArmorRT2 (5142, AMObsidianRT2, 0, 3, "Obsidian_RT2").setUnlocalizedName("Reinforced_Obsidian_Boots_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    
    //TIER 3
	
    public static final EnumArmorMaterial AMObsidianRT3 = EnumHelper.addArmorMaterial("ReinforcedObsidianArmorMaterialT3", 36, new int[]{4, 8, 6, 3}, 15);
    
	public static final Item Reinforced_Obsidian_Helmet_T3 = new ItemObsidianArmorRT3 (5144, AMObsidianRT3, 0, 0, "Obsidian_RT3").setUnlocalizedName("Reinforced_Obsidian_Helmet_T3").setCreativeTab(ModTabs.Reinforced_Armors);
	
    public static final Item Reinforced_Obsidian_Chestplate_T3 = new ItemObsidianArmorRT3 (5145, AMObsidianRT3, 0, 1, "Obsidian_RT3").setUnlocalizedName("Reinforced_Obsidian_Chestplate_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
	public static final Item Reinforced_Obsidian_Leggings_T3 = new ItemObsidianArmorRT3 (5146, AMObsidianRT3, 0, 2, "Obsidian_RT3").setUnlocalizedName("Reinforced_Obsidian_Leggings_T3").setCreativeTab(ModTabs.Reinforced_Armors);
	
    public static final Item Reinforced_Obsidian_Boots_T3 = new ItemObsidianArmorRT3 (5147, AMObsidianRT3, 0, 3, "Obsidian_RT3").setUnlocalizedName("Reinforced_Obsidian_Boots_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    
    //Crying Obsidian
    
    //TIER 0
	
  	public static final EnumArmorMaterial AMCryingObsidian = EnumHelper.addArmorMaterial("CryingObsidianArmorMaterial", 28, new int[]{3, 7, 5, 3}, 8);
  	
  	public static final Item CryingObsidian_Helmet = new ItemCryingObsidianArmor (5119, AMCryingObsidian, 0, 0, "CryingObsidian").setUnlocalizedName("CryingObsidian_Helmet").setCreativeTab(ModTabs.Reinforced_Armors);
  	
    public static final Item CryingObsidian_Chestplate = new ItemCryingObsidianArmor (5120, AMCryingObsidian, 0, 1, "CryingObsidian").setUnlocalizedName("CryingObsidian_Chestplate").setCreativeTab(ModTabs.Reinforced_Armors);
      
  	public static final Item CryingObsidian_Leggings = new ItemCryingObsidianArmor (5121, AMCryingObsidian, 0, 2, "CryingObsidian").setUnlocalizedName("CryingObsidian_Leggings").setCreativeTab(ModTabs.Reinforced_Armors);
  	
    public static final Item CryingObsidian_Boots = new ItemCryingObsidianArmor (5122, AMCryingObsidian, 0, 3, "CryingObsidian").setUnlocalizedName("CryingObsidian_Boots").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 1
  	
    public static final EnumArmorMaterial AMCryingObsidianRT1 = EnumHelper.addArmorMaterial("ReinforcedCryingObsidianArmorMaterialT1", 30, new int[]{4, 7, 6, 3}, 10);
      
  	public static final Item Reinforced_CryingObsidian_Helmet_T1 = new ItemCryingObsidianArmorRT1 (5128, AMCryingObsidianRT1, 0, 0, "CryingObsidian_RT1").setUnlocalizedName("Reinforced_CryingObsidian_Helmet_T1").setCreativeTab(ModTabs.Reinforced_Armors);
  	
    public static final Item Reinforced_CryingObsidian_Chestplate_T1 = new ItemCryingObsidianArmorRT1 (5129, AMCryingObsidianRT1, 0, 1, "CryingObsidian_RT1").setUnlocalizedName("Reinforced_CryingObsidian_Chestplate_T1").setCreativeTab(ModTabs.Reinforced_Armors);
      
  	public static final Item Reinforced_CryingObsidian_Leggings_T1 = new ItemCryingObsidianArmorRT1 (5130, AMCryingObsidianRT1, 0, 2, "CryingObsidian_RT1").setUnlocalizedName("Reinforced_CryingObsidian_Leggings_T1").setCreativeTab(ModTabs.Reinforced_Armors);
  	
    public static final Item Reinforced_CryingObsidian_Boots_T1 = new ItemCryingObsidianArmorRT1 (5131, AMCryingObsidianRT1, 0, 3, "CryingObsidian_RT1").setUnlocalizedName("Reinforced_CryingObsidian_Boots_T1").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 2
  	
    public static final EnumArmorMaterial AMCryingObsidianRT2 = EnumHelper.addArmorMaterial("ReinforcedCryingObsidianArmorMaterialT2", 34, new int[]{4, 8, 6, 4}, 12);
      
  	public static final Item Reinforced_CryingObsidian_Helmet_T2 = new ItemCryingObsidianArmorRT2 (5148, AMCryingObsidianRT2, 0, 0, "CryingObsidian_RT2").setUnlocalizedName("Reinforced_CryingObsidian_Helmet_T2").setCreativeTab(ModTabs.Reinforced_Armors);
  	
    public static final Item Reinforced_CryingObsidian_Chestplate_T2 = new ItemCryingObsidianArmorRT2 (5149, AMCryingObsidianRT2, 0, 1, "CryingObsidian_RT2").setUnlocalizedName("Reinforced_CryingObsidian_Chestplate_T2").setCreativeTab(ModTabs.Reinforced_Armors);
      
  	public static final Item Reinforced_CryingObsidian_Leggings_T2 = new ItemCryingObsidianArmorRT2 (5150, AMCryingObsidianRT2, 0, 2, "CryingObsidian_RT2").setUnlocalizedName("Reinforced_CryingObsidian_Leggings_T2").setCreativeTab(ModTabs.Reinforced_Armors);
  	
    public static final Item Reinforced_CryingObsidian_Boots_T2 = new ItemCryingObsidianArmorRT2 (5151, AMCryingObsidianRT2, 0, 3, "CryingObsidian_RT2").setUnlocalizedName("Reinforced_CryingObsidian_Boots_T2").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 3
  	
    public static final EnumArmorMaterial AMCryingObsidianRT3 = EnumHelper.addArmorMaterial("ReinforcedCryingObsidianArmorMaterialT3", 38, new int[]{4, 8, 7, 4}, 17);
      
  	public static final Item Reinforced_CryingObsidian_Helmet_T3 = new ItemCryingObsidianArmorRT3 (5152, AMCryingObsidianRT3, 0, 0, "CryingObsidian_RT3").setUnlocalizedName("Reinforced_CryingObsidian_Helmet_T3").setCreativeTab(ModTabs.Reinforced_Armors);
  	
    public static final Item Reinforced_CryingObsidian_Chestplate_T3 = new ItemCryingObsidianArmorRT3 (5153, AMCryingObsidianRT3, 0, 1, "CryingObsidian_RT3").setUnlocalizedName("Reinforced_CryingObsidian_Chestplate_T3").setCreativeTab(ModTabs.Reinforced_Armors);
      
  	public static final Item Reinforced_CryingObsidian_Leggings_T3 = new ItemCryingObsidianArmorRT3 (5154, AMCryingObsidianRT3, 0, 2, "CryingObsidian_RT3").setUnlocalizedName("Reinforced_CryingObsidian_Leggings_T3").setCreativeTab(ModTabs.Reinforced_Armors);
  	
    public static final Item Reinforced_CryingObsidian_Boots_T3 = new ItemCryingObsidianArmorRT3 (5155, AMCryingObsidianRT3, 0, 3, "CryingObsidian_RT3").setUnlocalizedName("Reinforced_CryingObsidian_Boots_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    
    //Lapis Lazuli

    //TIER 0
	
  	public static final EnumArmorMaterial AMLapisLazuli = EnumHelper.addArmorMaterial("LapisLazuliArmorMaterial", 12, new int[]{2, 5, 4, 2}, 12);
  	
    public static final Item LapisLazuli_Helmet = new ItemLapisLazuliArmor (5164, AMLapisLazuli, 0, 0, "LapisLazuli").setUnlocalizedName("LapisLazuli_Helmet").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item LapisLazuli_Chestplate = new ItemLapisLazuliArmor (5165, AMLapisLazuli, 0, 1, "LapisLazuli").setUnlocalizedName("LapisLazuli_Chestplate").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item LapisLazuli_Leggings = new ItemLapisLazuliArmor (5166, AMLapisLazuli, 0, 2, "LapisLazuli").setUnlocalizedName("LapisLazuli_Leggings").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item LapisLazuli_Boots = new ItemLapisLazuliArmor (5167, AMLapisLazuli, 0, 3, "LapisLazuli").setUnlocalizedName("LapisLazuli_Boots").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 1
  	
    public static final EnumArmorMaterial AMLapisLazuliRT1 = EnumHelper.addArmorMaterial("ReinforcedLapisLazuliArmorMaterialT1", 14, new int[]{3, 5, 4, 2}, 14); 
      
  	public static final Item Reinforced_LapisLazuli_Helmet_T1 = new ItemLapisLazuliArmorRT1 (5169, AMLapisLazuliRT1, 0, 0, "LapisLazuli_RT1").setUnlocalizedName("Reinforced_LapisLazuli_Helmet_T1").setCreativeTab(ModTabs.Reinforced_Armors);
  	
  	public static final Item Reinforced_LapisLazuli_Chestplate_T1 = new ItemLapisLazuliArmorRT1 (5170, AMLapisLazuliRT1, 0, 1, "LapisLazuli_RT1").setUnlocalizedName("Reinforced_LapisLazuli_Chestplate_T1").setCreativeTab(ModTabs.Reinforced_Armors);
  	
  	public static final Item Reinforced_LapisLazuli_Leggings_T1 = new ItemLapisLazuliArmorRT1 (5171, AMLapisLazuliRT1, 0, 2, "LapisLazuli_RT1").setUnlocalizedName("Reinforced_LapisLazuli_Leggings_T1").setCreativeTab(ModTabs.Reinforced_Armors);
  	
  	public static final Item Reinforced_LapisLazuli_Boots_T1 = new ItemLapisLazuliArmorRT1 (5172, AMLapisLazuliRT1, 0, 3, "LapisLazuli_RT1").setUnlocalizedName("Reinforced_LapisLazuli_Boots_T1").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 2
  	
    public static final EnumArmorMaterial AMLapisLazuliRT2 = EnumHelper.addArmorMaterial("ReinforcedLapisLazuliArmorMaterialT2", 16, new int[]{3, 5, 4, 3}, 16);
    
    public static final Item Reinforced_LapisLazuli_Helmet_T2 = new ItemLapisLazuliArmorRT2 (5173, AMLapisLazuliRT2, 0, 0, "LapisLazuli_RT2").setUnlocalizedName("Reinforced_LapisLazuli_Helmet_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_LapisLazuli_Chestplate_T2 = new ItemLapisLazuliArmorRT2 (5174, AMLapisLazuliRT2, 0, 1, "LapisLazuli_RT2").setUnlocalizedName("Reinforced_LapisLazuli_Chestplate_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_LapisLazuli_Leggings_T2 = new ItemLapisLazuliArmorRT2 (5175, AMLapisLazuliRT2, 0, 2, "LapisLazuli_RT2").setUnlocalizedName("Reinforced_LapisLazuli_Leggings_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_LapisLazuli_Boots_T2 = new ItemLapisLazuliArmorRT2 (5176, AMLapisLazuliRT2, 0, 3, "LapisLazuli_RT2").setUnlocalizedName("Reinforced_LapisLazuli_Boots_T2").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 3
  	
    public static final EnumArmorMaterial AMLapisLazuliRT3 = EnumHelper.addArmorMaterial("ReinforcedLapisLazuliArmorMaterialT3", 17, new int[]{3, 5, 5, 3}, 18);
    
    public static final Item Reinforced_LapisLazuli_Helmet_T3 = new ItemLapisLazuliArmorRT3 (5177, AMLapisLazuliRT3, 0, 0, "LapisLazuli_RT3").setUnlocalizedName("Reinforced_LapisLazuli_Helmet_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_LapisLazuli_Chestplate_T3 = new ItemLapisLazuliArmorRT3 (5178, AMLapisLazuliRT3, 0, 1, "LapisLazuli_RT3").setUnlocalizedName("Reinforced_LapisLazuli_Chestplate_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_LapisLazuli_Leggings_T3 = new ItemLapisLazuliArmorRT3 (5179, AMLapisLazuliRT3, 0, 2, "LapisLazuli_RT3").setUnlocalizedName("Reinforced_LapisLazuli_Leggings_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_LapisLazuli_Boots_T3 = new ItemLapisLazuliArmorRT3 (5180, AMLapisLazuliRT3, 0, 3, "LapisLazuli_RT3").setUnlocalizedName("Reinforced_LapisLazuli_Boots_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    
    //Emerald
    
    //TIER 0
	
  	public static final EnumArmorMaterial AMEmerald = EnumHelper.addArmorMaterial("EmeraldArmorMaterial", 34, new int[]{3, 8, 6, 3}, 12);
  	
  	public static final Item Emerald_Helmet = new ItemEmeraldArmor (5181, AMEmerald, 0, 0, "Emerald").setUnlocalizedName("Emerald_Helmet").setCreativeTab(ModTabs.Reinforced_Armors);
  	
  	public static final Item Emerald_Chestplate = new ItemEmeraldArmor (5182, AMEmerald, 0, 1, "Emerald").setUnlocalizedName("Emerald_Chestplate").setCreativeTab(ModTabs.Reinforced_Armors);
  	
  	public static final Item Emerald_Leggings = new ItemEmeraldArmor (5183, AMEmerald, 0, 2, "Emerald").setUnlocalizedName("Emerald_Leggings").setCreativeTab(ModTabs.Reinforced_Armors);
  	
  	public static final Item Emerald_Boots = new ItemEmeraldArmor (5184, AMEmerald, 0, 3, "Emerald").setUnlocalizedName("Emerald_Boots").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 1
  	
    public static final EnumArmorMaterial AMEmeraldRT1 = EnumHelper.addArmorMaterial("ReinforcedEmeraldArmorMaterialT1", 36, new int[]{3, 8, 6, 3}, 14);
      
  	public static final Item Reinforced_Emerald_Helmet_T1 = new ItemEmeraldArmorRT1 (5185, AMEmeraldRT1, 0, 0, "Emerald_RT1").setUnlocalizedName("Reinforced_Emerald_Helmet_T1").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Emerald_Chestplate_T1 = new ItemEmeraldArmorRT1 (5186, AMEmeraldRT1, 0, 1, "Emerald_RT1").setUnlocalizedName("Reinforced_Emerald_Chestplate_T1").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Emerald_Leggings_T1 = new ItemEmeraldArmorRT1 (5187, AMEmeraldRT1, 0, 2, "Emerald_RT1").setUnlocalizedName("Reinforced_Emerald_Leggings_T1").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Emerald_Boots_T1 = new ItemEmeraldArmorRT1 (5188, AMEmeraldRT1, 0, 3, "Emerald_RT1").setUnlocalizedName("Reinforced_Emerald_Boots_T1").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 2
  	
    public static final EnumArmorMaterial AMEmeraldRT2 = EnumHelper.addArmorMaterial("ReinforcedEmeraldArmorMaterialT2", 38, new int[]{3, 8, 6, 3}, 18);
    
    public static final Item Reinforced_Emerald_Helmet_T2 = new ItemEmeraldArmorRT2 (5189, AMEmeraldRT2, 0, 0, "Emerald_RT2").setUnlocalizedName("Reinforced_Emerald_Helmet_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Emerald_Chestplate_T2 = new ItemEmeraldArmorRT2 (5190, AMEmeraldRT2, 0, 1, "Emerald_RT2").setUnlocalizedName("Reinforced_Emerald_Chestplate_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Emerald_Leggings_T2 = new ItemEmeraldArmorRT2 (5191, AMEmeraldRT2, 0, 2, "Emerald_RT2").setUnlocalizedName("Reinforced_Emerald_Leggings_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Emerald_Boots_T2 = new ItemEmeraldArmorRT2 (5192, AMEmeraldRT2, 0, 3, "Emerald_RT2").setUnlocalizedName("Reinforced_Emerald_Boots_T2").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 3
  	
    public static final EnumArmorMaterial AMEmeraldRT3 = EnumHelper.addArmorMaterial("ReinforcedEmeraldArmorMaterialT3", 42, new int[]{3, 8, 6, 3}, 20);
    
    public static final Item Reinforced_Emerald_Helmet_T3 = new ItemEmeraldArmorRT3 (5193, AMEmeraldRT3, 0, 0, "Emerald_RT3").setUnlocalizedName("Reinforced_Emerald_Helmet_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Emerald_Chestplate_T3 = new ItemEmeraldArmorRT3 (5194, AMEmeraldRT3, 0, 1, "Emerald_RT3").setUnlocalizedName("Reinforced_Emerald_Chestplate_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Emerald_Leggings_T3 = new ItemEmeraldArmorRT3 (5195, AMEmeraldRT3, 0, 2, "Emerald_RT3").setUnlocalizedName("Reinforced_Emerald_Leggings_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Emerald_Boots_T3 = new ItemEmeraldArmorRT3 (5196, AMEmeraldRT3, 0, 3, "Emerald_RT3").setUnlocalizedName("Reinforced_Emerald_Boots_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    
    //Quartz
    
    //TIER 0
	
  	public static final EnumArmorMaterial AMQuartz = EnumHelper.addArmorMaterial("QuartzArmorMaterial", 34, new int[]{3, 8, 6, 3}, 12);
  	
    public static final Item Quartz_Helmet = new ItemQuartzArmor (5205, AMQuartz, 0, 0, "Quartz").setUnlocalizedName("Quartz_Helmet").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Quartz_Chestplate = new ItemQuartzArmor (5206, AMQuartz, 0, 1, "Quartz").setUnlocalizedName("Quartz_Chestplate").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Quartz_Leggings = new ItemQuartzArmor (5207, AMQuartz, 0, 2, "Quartz").setUnlocalizedName("Quartz_Leggings").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Quartz_Boots = new ItemQuartzArmor (5208, AMQuartz, 0, 3, "Quartz").setUnlocalizedName("Quartz_Boots").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 1
  	
    public static final EnumArmorMaterial AMQuartzRT1 = EnumHelper.addArmorMaterial("ReinforcedQuartzArmorMaterialT1", 36, new int[]{3, 8, 6, 3}, 14);
      
  	public static final Item Reinforced_Quartz_Helmet_T1 = new ItemQuartzArmorRT1 (5209, AMQuartzRT1, 0, 0, "Quartz_RT1").setUnlocalizedName("Reinforced_Quartz_Helmet_T1").setCreativeTab(ModTabs.Reinforced_Armors);
  	
  	public static final Item Reinforced_Quartz_Chestplate_T1 = new ItemQuartzArmorRT1 (5210, AMQuartzRT1, 0, 1, "Quartz_RT1").setUnlocalizedName("Reinforced_Quartz_Chestplate_T1").setCreativeTab(ModTabs.Reinforced_Armors);
  	
  	public static final Item Reinforced_Quartz_Leggings_T1 = new ItemQuartzArmorRT1 (5211, AMQuartzRT1, 0, 2, "Quartz_RT1").setUnlocalizedName("Reinforced_Quartz_Leggings_T1").setCreativeTab(ModTabs.Reinforced_Armors);
  	
  	public static final Item Reinforced_Quartz_Boots_T1 = new ItemQuartzArmorRT1 (5212, AMQuartzRT1, 0, 3, "Quartz_RT1").setUnlocalizedName("Reinforced_Quartz_Boots_T1").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 2
  	
    public static final EnumArmorMaterial AMQuartzRT2 = EnumHelper.addArmorMaterial("ReinforcedQuartzArmorMaterialT2", 38, new int[]{3, 8, 6, 3}, 18);
    
    public static final Item Reinforced_Quartz_Helmet_T2 = new ItemQuartzArmorRT2 (5213, AMQuartzRT2, 0, 0, "Quartz_RT2").setUnlocalizedName("Reinforced_Quartz_Helmet_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Quartz_Chestplate_T2 = new ItemQuartzArmorRT2 (5214, AMQuartzRT2, 0, 1, "Quartz_RT2").setUnlocalizedName("Reinforced_Quartz_Chestplate_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Quartz_Leggings_T2 = new ItemQuartzArmorRT2 (5215, AMQuartzRT2, 0, 2, "Quartz_RT2").setUnlocalizedName("Reinforced_Quartz_Leggings_T2").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Quartz_Boots_T2 = new ItemQuartzArmorRT2 (5216, AMQuartzRT2, 0, 3, "Quartz_RT2").setUnlocalizedName("Reinforced_Quartz_Boots_T2").setCreativeTab(ModTabs.Reinforced_Armors);
      
      
    //TIER 3
  	
    public static final EnumArmorMaterial AMQuartzRT3 = EnumHelper.addArmorMaterial("ReinforcedQuartzArmorMaterialT3", 42, new int[]{3, 8, 6, 3}, 20);
    
    public static final Item Reinforced_Quartz_Helmet_T3 = new ItemQuartzArmorRT3 (5217, AMQuartzRT3, 0, 0, "Quartz_RT3").setUnlocalizedName("Reinforced_Quartz_Helmet_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Quartz_Chestplate_T3 = new ItemQuartzArmorRT3 (5218, AMQuartzRT3, 0, 1, "Quartz_RT3").setUnlocalizedName("Reinforced_Quartz_Chestplate_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Quartz_Leggings_T3 = new ItemQuartzArmorRT3 (5219, AMQuartzRT3, 0, 2, "Quartz_RT3").setUnlocalizedName("Reinforced_Quartz_Leggings_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Reinforced_Quartz_Boots_T3 = new ItemQuartzArmorRT3 (5220, AMQuartzRT3, 0, 3, "Quartz_RT3").setUnlocalizedName("Reinforced_Quartz_Boots_T3").setCreativeTab(ModTabs.Reinforced_Armors);
    
    
    //Admin
    
    public static final EnumArmorMaterial AMAdmin = EnumHelper.addArmorMaterial("AdminArmorMaterial", 100, new int[]{3, 8, 6, 3}, 0);
    
    public static final Item Admin_Helmet = new ItemAdminArmor (5135, AMAdmin, 0, 0, "Admin").setUnlocalizedName("Admin_Helmet").setCreativeTab(ModTabs.Reinforced_Armors_Admin);
    
    public static final Item Admin_Chestplate = new ItemAdminArmor (5136, AMAdmin, 0, 1, "Admin").setUnlocalizedName("Admin_Chestplate").setCreativeTab(ModTabs.Reinforced_Armors_Admin);
    
    public static final Item Admin_Leggings = new ItemAdminArmor (5137, AMAdmin, 0, 2, "Admin").setUnlocalizedName("Admin_Leggings").setCreativeTab(ModTabs.Reinforced_Armors_Admin);
    
    public static final Item Admin_Boots = new ItemAdminArmor (5138, AMAdmin, 0, 3, "Admin").setUnlocalizedName("Admin_Boots").setCreativeTab(ModTabs.Reinforced_Armors_Admin);
    
    
    //Bone
    
    public static final EnumArmorMaterial AMBone = EnumHelper.addArmorMaterial("BoneArmorMaterial", 34, new int[]{3, 8, 6, 3}, 12);
    
    public static final Item Bone_Helmet = new ItemBoneArmor (5221, AMBone, 0, 0, "Bone").setUnlocalizedName("Bone_Helmet").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Bone_Chestplate = new ItemBoneArmor (5222, AMBone, 0, 1, "Bone").setUnlocalizedName("Bone_Chestplate").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Bone_Leggings = new ItemBoneArmor (5223, AMBone, 0, 2, "Bone").setUnlocalizedName("Bone_Leggings").setCreativeTab(ModTabs.Reinforced_Armors);
    
    public static final Item Bone_Boots = new ItemBoneArmor (5224, AMBone, 0, 3, "Bone").setUnlocalizedName("Bone_Boots").setCreativeTab(ModTabs.Reinforced_Armors);


    public static void init() {
        registerObsidian();
        registerCryingObsidian();
        registerLapisLazuli();
        registerEmerald();
        registerQuartz();
        registerAdmin();
        registerBone();
        
    }

    private static void registerObsidian() {
    	
    	//TIER 0
    	
    	GameRegistry.registerItem(Obsidian_Helmet, Names.OBHelm);
    	
    	GameRegistry.registerItem(Obsidian_Chestplate, Names.OBChest);
    	
    	GameRegistry.registerItem(Obsidian_Leggings, Names.OBLegs);
        
        GameRegistry.registerItem(Obsidian_Boots, Names.OBBoots);
        
        
        //TIER 1
        
    	GameRegistry.registerItem(Reinforced_Obsidian_Helmet_T1, Names.OBHelmRT1);
    	
    	GameRegistry.registerItem(Reinforced_Obsidian_Chestplate_T1, Names.OBChestRT1);
    	
    	GameRegistry.registerItem(Reinforced_Obsidian_Leggings_T1, Names.OBLegsRT1);
        
        GameRegistry.registerItem(Reinforced_Obsidian_Boots_T1, Names.OBBootsRT1);
        
        
        //TIER 2
        
    	GameRegistry.registerItem(Reinforced_Obsidian_Helmet_T2, Names.OBHelmRT2);
    	
    	GameRegistry.registerItem(Reinforced_Obsidian_Chestplate_T2, Names.OBChestRT2);
    	
    	GameRegistry.registerItem(Reinforced_Obsidian_Leggings_T2, Names.OBLegsRT2);
        
        GameRegistry.registerItem(Reinforced_Obsidian_Boots_T2, Names.OBBootsRT2);
        
        
        //TIER 3
        
    	GameRegistry.registerItem(Reinforced_Obsidian_Helmet_T3, Names.OBHelmRT3);
    	
    	GameRegistry.registerItem(Reinforced_Obsidian_Chestplate_T3, Names.OBChestRT3);
    	
    	GameRegistry.registerItem(Reinforced_Obsidian_Leggings_T3, Names.OBLegsRT3);
        
        GameRegistry.registerItem(Reinforced_Obsidian_Boots_T3, Names.OBBootsRT3);
    }
    
    private static void registerCryingObsidian() { 
    	
    	//TIER 0
    	
    	GameRegistry.registerItem(CryingObsidian_Helmet, Names.COBHelm);
    	
    	GameRegistry.registerItem(CryingObsidian_Chestplate, Names.COBChest);
    	
    	GameRegistry.registerItem(CryingObsidian_Leggings, Names.COBLegs);
    	
    	GameRegistry.registerItem(CryingObsidian_Boots, Names.COBBoots);
    	
    	
    	//TIER 1
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Helmet_T1, Names.COBHelmRT1);
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Chestplate_T1, Names.COBChestRT1);
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Leggings_T1, Names.COBLegsRT1);
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Boots_T1, Names.COBBootsRT1);
    	
    	
    	//TIER 2
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Helmet_T2, Names.COBHelmRT2);
    
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Chestplate_T2, Names.COBChestRT2);
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Leggings_T2, Names.COBLegsRT2);
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Boots_T2, Names.COBBootsRT2);
    	
    	
    	//TIER 3
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Helmet_T3, Names.COBHelmRT3);
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Chestplate_T3, Names.COBChestRT3);
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Leggings_T3, Names.COBLegsRT3);
    	
    	GameRegistry.registerItem(Reinforced_CryingObsidian_Boots_T3, Names.COBBootsRT3);
    }
    
    private static void registerLapisLazuli(){
/*  	
        //TIER 0
    	
    	GameRegistry.registerItem(LapisLazuli_Helmet, Names.LLHelm);
    	
    	GameRegistry.registerItem(LapisLazuli_Chestplate, Names.LLChest);
    	
    	GameRegistry.registerItem(LapisLazuli_Leggings, Names.LLLegs);
        
        GameRegistry.registerItem(LapisLazuli_Boots, Names.LLBoots);
        
        
        //TIER 1
        
    	GameRegistry.registerItem(Reinforced_LapisLazuli_Helmet_T1, Names.OBHelmRT1);
    	
    	GameRegistry.registerItem(Reinforced_LapisLazuli_Chestplate_T1, Names.LLChestRT1);
    	
    	GameRegistry.registerItem(Reinforced_LapisLazuli_Leggings_T1, Names.LLLegsRT1);
        
        GameRegistry.registerItem(Reinforced_LapisLazuli_Boots_T1, Names.LLBootsRT1);
        
        
        //TIER 2
        
    	GameRegistry.registerItem(Reinforced_LapisLazuli_Helmet_T2, Names.LLHelmRT2);
    	
    	GameRegistry.registerItem(Reinforced_LapisLazuli_Chestplate_T2, Names.LLChestRT2);
    	
    	GameRegistry.registerItem(Reinforced_LapisLazuli_Leggings_T2, Names.LLLegsRT2);
        
        GameRegistry.registerItem(Reinforced_LapisLazuli_Boots_T2, Names.LLBootsRT2);
        
        
        //TIER 3
        
    	GameRegistry.registerItem(Reinforced_LapisLazuli_Helmet_T3, Names.LLHelmRT3);
    	
    	GameRegistry.registerItem(Reinforced_LapisLazuli_Chestplate_T3, Names.LLChestRT3);
    	
    	GameRegistry.registerItem(Reinforced_LapisLazuli_Leggings_T3, Names.LLLegsRT3);
        
        GameRegistry.registerItem(Reinforced_LapisLazuli_Boots_T3, Names.LLBootsRT3);
*/    	
    }
    
    private static void registerEmerald(){
/*    	
    	//TIER 0
    	
    	GameRegistry.registerItem(Emerald_Helmet, Names.EMHelm);
    	
    	GameRegistry.registerItem(Emerald_Chestplate, Names.EMChest);
    	
    	GameRegistry.registerItem(Emerald_Leggings, Names.EMLegs);
        
        GameRegistry.registerItem(Emerald_Boots, Names.EMBoots);
        
        
        //TIER 1
        
    	GameRegistry.registerItem(Reinforced_Emerald_Helmet_T1, Names.EMHelmRT1);
    	
    	GameRegistry.registerItem(Reinforced_Emerald_Chestplate_T1, Names.EMChestRT1);
    	
    	GameRegistry.registerItem(Reinforced_Emerald_Leggings_T1, Names.EMLegsRT1);
        
        GameRegistry.registerItem(Reinforced_Emerald_Boots_T1, Names.EMBootsRT1);
        
        
        //TIER 2
        
    	GameRegistry.registerItem(Reinforced_Emerald_Helmet_T2, Names.EMHelmRT2);
    	
    	GameRegistry.registerItem(Reinforced_Emerald_Chestplate_T2, Names.EMChestRT2);
    	
    	GameRegistry.registerItem(Reinforced_Emerald_Leggings_T2, Names.EMLegsRT2);
        
        GameRegistry.registerItem(Reinforced_Emerald_Boots_T2, Names.EMBootsRT2);
        
        
        //TIER 3
        
    	GameRegistry.registerItem(Reinforced_Emerald_Helmet_T3, Names.EMHelmRT3);
    	
    	GameRegistry.registerItem(Reinforced_Emerald_Chestplate_T3, Names.EMChestRT3);
    	
    	GameRegistry.registerItem(Reinforced_Emerald_Leggings_T3, Names.EMLegsRT3);
        
        GameRegistry.registerItem(Reinforced_Emerald_Boots_T3, Names.EMBootsRT3);
*/   	
    }
    
    private static void registerQuartz(){
/*   	
    	//TIER 0
    	
    	GameRegistry.registerItem(Quartz_Helmet, Names.QHelm);
    	
    	GameRegistry.registerItem(Quartz_Chestplate, Names.QChest);
    	
    	GameRegistry.registerItem(Quartz_Leggings, Names.QLegs);
        
        GameRegistry.registerItem(Quartz_Boots, Names.QBoots);
        
        
        //TIER 1
        
    	GameRegistry.registerItem(Reinforced_Quartz_Helmet_T1, Names.QHelmRT1);
    	
    	GameRegistry.registerItem(Reinforced_Quartz_Chestplate_T1, Names.QChestRT1);
    	
    	GameRegistry.registerItem(Reinforced_Quartz_Leggings_T1, Names.QLegsRT1);
        
        GameRegistry.registerItem(Reinforced_Quartz_Boots_T1, Names.QBootsRT1);
        
        
        //TIER 2
        
    	GameRegistry.registerItem(Reinforced_Quartz_Helmet_T2, Names.QHelmRT2);
    	
    	GameRegistry.registerItem(Reinforced_Quartz_Chestplate_T2, Names.QChestRT2);
    	
    	GameRegistry.registerItem(Reinforced_Quartz_Leggings_T2, Names.QLegsRT2);
        
        GameRegistry.registerItem(Reinforced_Quartz_Boots_T2, Names.QBootsRT2);
        
        
        //TIER 3
        
    	GameRegistry.registerItem(Reinforced_Quartz_Helmet_T3, Names.QHelmRT3);
    	
    	GameRegistry.registerItem(Reinforced_Quartz_Chestplate_T3, Names.QChestRT3);
    	
    	GameRegistry.registerItem(Reinforced_Quartz_Leggings_T3, Names.QLegsRT3);
        
        GameRegistry.registerItem(Reinforced_Quartz_Boots_T3, Names.QBootsRT3);
*/   	
    }
    
    private static void registerAdmin(){
/*    	
    	GameRegistry.registerItem(Admin_Helmet, Names.AdminHelm);
    	
    	GameRegistry.registerItem(Admin_Chestplate, Names.AdminChest);
    	
    	GameRegistry.registerItem(Admin_Leggings, Names.AdminLegs);
        
        GameRegistry.registerItem(Admin_Boots Names.AdminBoots);
*/    	
    }
    
    private static void registerBone(){
/*   	
        GameRegistry.registerItem(Bone_Helmet, Names.BoneHelm);
    	
    	GameRegistry.registerItem(Bone_Chestplate, Names.BoneChest);
    	
    	GameRegistry.registerItem(Bone_Leggings, Names.BoneLegs);
        
        GameRegistry.registerItem(Bone_Boots Names.BoneBoots);
*/
    }

    public static class Names {
    	
    	//Obsidian
    	
    	//TIER 0
    	
    	public static final String OBHelm = "Obsidian_Helmet";
    	
    	public static final String OBChest = "Obsidian_Chestplate";
    	
    	public static final String OBLegs = "Obsidian_Leggings";
    	
        public static final String OBBoots = "Obsidian_Boots";
        
        
        //TIER 1
        
  	    public static final String OBHelmRT1 = "Reinforced_Obsidian_Helmet_T1";
    	
    	public static final String OBChestRT1 = "Reinforced_Obsidian_Chestplate_T1";
    	
    	public static final String OBLegsRT1 = "Reinforced_Obsidian_Leggings_T1";
    	
        public static final String OBBootsRT1 = "Reinforced_Obsidian_Boots_T1";
        
        
        //TIER 2
        
  	    public static final String OBHelmRT2 = "Reinforced_Obsidian_Helmet_T2";
    	
    	public static final String OBChestRT2 = "Reinforced_Obsidian_Chestplate_T2";
    	
    	public static final String OBLegsRT2 = "Reinforced_Obsidian_Leggings_T2";
    	
        public static final String OBBootsRT2 = "Reinforced_Obsidian_Boots_T2";
        
        
        //TIER 3
        
  	    public static final String OBHelmRT3 = "Reinforced_Obsidian_Helmet_T3";
    	
    	public static final String OBChestRT3 = "Reinforced_Obsidian_Chestplate_T3";
    	
    	public static final String OBLegsRT3 = "Reinforced_Obsidian_Leggings_T3";
    	
        public static final String OBBootsRT3 = "Reinforced_Obsidian_Boots_T3";
    	
    	
    	//Crying Obsidian
        
        //TIER 0
    	
        public static final String COBHelm = "CryingObsidian_Helmet";
    	
    	public static final String COBChest = "CryingObsidian_Chestplate";
    	
    	public static final String COBLegs = "CryingObsidian_Leggings";
    	
    	public static final String COBBoots = "CryingObsidian_Boots";
    	
    	
        //TIER 1
    	
        public static final String COBHelmRT1 = "Reinforced_CryingObsidian_Helmet_T1";
    	
    	public static final String COBChestRT1 = "Reinforced_CryingObsidian_Chestplate_T1";
    	
    	public static final String COBLegsRT1 = "Reinforced_CryingObsidian_Leggings_T1";
    	
    	public static final String COBBootsRT1 = "Reinforced_CryingObsidian_Boots_T1";
    	
    	
    	//TIER 2
    	
        public static final String COBHelmRT2 = "Reinforced_CryingObsidian_Helmet_T2";
    	
    	public static final String COBChestRT2 = "Reinforced_CryingObsidian_Chestplate_T2";
    	
    	public static final String COBLegsRT2 = "Reinforced_CryingObsidian_Leggings_T2";
    	
    	public static final String COBBootsRT2 = "Reinforced_CryingObsidian_Boots_T2";
    	
    	
    	//TIER 3
    	
        public static final String COBHelmRT3 = "Reinforced_CryingObsidian_Helmet_T3";
    	
    	public static final String COBChestRT3 = "Reinforced_CryingObsidian_Chestplate_T3";
    	
    	public static final String COBLegsRT3 = "Reinforced_CryingObsidian_Leggings_T3";
    	
    	public static final String COBBootsRT3 = "Reinforced_CryingObsidian_Boots_T3";
    	
    	
    	//Lapis Lazuli
    	
        //TIER 0
    	
        public static final String LLHelm = "LapisLazuli_Helmet";
    	
    	public static final String LLChest = "LapisLazuli_Chestplate";
    	
    	public static final String LLLegs = "LapisLazuli_Leggings";
    	
    	public static final String LLBoots = "LapisLazuli_Boots";
    	
    	
        //TIER 1
    	
        public static final String LLHelmRT1 = "Reinforced_LapisLazuli_Helmet_T1";
    	
    	public static final String LLChestRT1 = "Reinforced_LapisLazuli_Chestplate_T1";
    	
    	public static final String LLLegsRT1 = "Reinforced_LapisLazuli_Leggings_T1";
    	
    	public static final String LLBootsRT1 = "Reinforced_LapisLazuli_Boots_T1";
    	
    	
    	//TIER 2
    	
        public static final String LLHelmRT2 = "Reinforced_LapisLazuli_Helmet_T2";
    	
    	public static final String LLChestRT2 = "Reinforced_LapisLazuli_Chestplate_T2";
    	
    	public static final String LLLegsRT2 = "Reinforced_LapisLazuli_Leggings_T2";
    	
    	public static final String LLBootsRT2 = "Reinforced_LapisLazuli_Boots_T2";
    	
    	
    	//TIER 3
    	
        public static final String LLHelmRT3 = "Reinforced_LapisLazuli_Helmet_T3";
    	
    	public static final String LLChestRT3 = "Reinforced_LapisLazuli_Chestplate_T3";
    	
    	public static final String LLLegsRT3 = "Reinforced_LapisLazuli_Leggings_T3";
    	
    	public static final String LLBootsRT3 = "Reinforced_LapisLazuli_Boots_T3";
    	
        
        //Emerald
        
        //TIER 0
    	
        public static final String EMHelm = "Emerald_Helmet";
    	
    	public static final String EMChest = "Emerald_Chestplate";
    	
    	public static final String EMLegs = "Emerald_Leggings";
    	
    	public static final String EMBoots = "Emerald_Boots";
    	
    	
        //TIER 1
    	
        public static final String EMHelmRT1 = "Reinforced_Emerald_Helmet_T1";
    	
    	public static final String EMChestRT1 = "Reinforced_Emerald_Chestplate_T1";
    	
    	public static final String EMLegsRT1 = "Reinforced_Emerald_Leggings_T1";
    	
    	public static final String EMBootsRT1 = "Reinforced_Emerald_Boots_T1";
    	
    	
    	//TIER 2
    	
        public static final String EMHelmRT2 = "Reinforced_Emerald_Helmet_T2";
    	
    	public static final String EMChestRT2 = "Reinforced_Emerald_Chestplate_T2";
    	
    	public static final String EMLegsRT2 = "Reinforced_Emerald_Leggings_T2";
    	
    	public static final String EMBootsRT2 = "Reinforced_Emerald_Boots_T2";
    	
    	
    	//TIER 3
    	
        public static final String EMHelmRT3 = "Reinforced_Emerald_Helmet_T3";
    	
    	public static final String EMChestRT3 = "Reinforced_Emerald_Chestplate_T3";
    	
    	public static final String EMLegsRT3 = "Reinforced_Emerald_Leggings_T3";
    	
    	public static final String EMBootsRT3 = "Reinforced_Emerald_Boots_T3";
        
        
        //Quartz
        
        //TIER 0
    	
        public static final String QHelm = "Quartz_Helmet";
    	
    	public static final String QChest = "Quartz_Chestplate";
    	
    	public static final String QLegs = "Quartz_Leggings";
    	
    	public static final String QBoots = "Quartz_Boots";
    	
    	
        //TIER 1
    	
        public static final String QHelmRT1 = "Reinforced_Quartz_Helmet_T1";
    	
    	public static final String QChestRT1 = "Reinforced_Quartz_Chestplate_T1";
    	
    	public static final String QLegsRT1 = "Reinforced_Quartz_Leggings_T1";
    	
    	public static final String QBootsRT1 = "Reinforced_Quartz_Boots_T1";
    	
    	
    	//TIER 2
    	
        public static final String QHelmRT2 = "Reinforced_Quartz_Helmet_T2";
    	
    	public static final String QChestRT2 = "Reinforced_Quartz_Chestplate_T2";
    	
    	public static final String QLegsRT2 = "Reinforced_Quartz_Leggings_T2";
    	
    	public static final String QBootsRT2 = "Reinforced_Quartz_Boots_T2";
    	
    	
    	//TIER 3
    	
        public static final String QHelmRT3 = "Reinforced_Quartz_Helmet_T3";
    	
    	public static final String QChestRT3 = "Reinforced_Quartz_Chestplate_T3";
    	
    	public static final String QLegsRT3 = "Reinforced_Quartz_Leggings_T3";
    	
    	public static final String QBootsRT3 = "Reinforced_Quartz_Boots_T3";
        
    	
    	//Admin
    	
        public static final String AdminHelm = "Admin_Helmet";
    	
    	public static final String AdminChest = "Admin_Chestplate";
    	
    	public static final String AdminLegs = "Admin_Leggings";
    	
    	public static final String AdminBoots = "Admin_Boots";
    	
    	
        //Bone
    	
        public static final String BoneHelm = "Bone_Helmet";
    	
    	public static final String BoneChest = "Bone_Chestplate";
    	
    	public static final String BoneLegs = "Bone_Leggings";
    	
    	public static final String BoneBoots = "Bone_Boots";
    	
    }
}