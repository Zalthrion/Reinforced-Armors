package zalthrion.reinforcedarmors.common;


import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import zalthrion.reinforcedarmors.common.ReinforcedArmorsCommonProxy;
import zalthrion.reinforcedarmors.common.blocks.BlockCrying_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.Purified_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.Hardened_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.HardenedCrying_Obsidian;
import zalthrion.reinforcedarmors.common.handlers.ReinforcedArmorsServerPacketHandler;
import zalthrion.reinforcedarmors.common.handlers.ReinforcedArmorsClientPacketHandler;
import zalthrion.reinforcedarmors.common.items.Purified_Obsidian_Ingot;
import zalthrion.reinforcedarmors.common.items.Obsidian_Ingot;
import zalthrion.reinforcedarmors.common.items.Crying_Obsidian_Ingot;
import zalthrion.reinforcedarmors.common.items.armors.ItemAdminArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemCryingObsidianArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemCryingObsidianArmorRT1;
import zalthrion.reinforcedarmors.common.items.armors.ItemCryingObsidianArmorRT2;
import zalthrion.reinforcedarmors.common.items.armors.ItemCryingObsidianArmorRT3;
import zalthrion.reinforcedarmors.common.items.armors.ItemObsidianArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemObsidianArmorRT1;
import zalthrion.reinforcedarmors.common.items.armors.ItemObsidianArmorRT2;
import zalthrion.reinforcedarmors.common.items.armors.ItemObsidianArmorRT3;
import zalthrion.reinforcedarmors.common.items.Obsidian_Crystal;
import zalthrion.reinforcedarmors.common.items.Reinforced_Obsidian_Crystal;
import zalthrion.reinforcedarmors.common.items.Purified_Obsidian_Crystal;
import zalthrion.reinforcedarmors.common.items.Admin_Crystal;



@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed

clientPacketHandlerSpec = @SidedPacketHandler(channels = {"ReinforcedArmors"}, packetHandler = ReinforcedArmorsClientPacketHandler.class), //For clientside packet handling

serverPacketHandlerSpec = @SidedPacketHandler(channels = {"ReinforcedArmors"}, packetHandler = ReinforcedArmorsServerPacketHandler.class)) //For serverside packet handling


//MOD BASICS

@Mod(modid="ReinforcedArmors",name="Reinforced Armors",version="Alpha")



public class ReinforcedArmors {


@Instance("ReinforcedArmors") //The instance, this is very important later on

public static ReinforcedArmors instance ;


@SidedProxy(clientSide = "zalthrion.reinforcedarmors.client.ReinforcedArmorsClientProxy", serverSide = "zalthrion.reinforcedarmors.common.ReinforcedArmorsCommonProxy") //Tells Forge the location of your proxies

public static ReinforcedArmorsCommonProxy proxy;


//Creative Tabs

//Reinforced Armors

public static CreativeTabs Reinforced_Armors = new CreativeTabs("Reinforced Armors") {

    public ItemStack getIconItemStack() {

        return new ItemStack(Obsidian_Crystal, 1, 0);
    }
};

//Reinforced Armors Admin

public static CreativeTabs Reinforced_Armors_Admin = new CreativeTabs("Reinforced Armors Admin") {

    public ItemStack getIconItemStack() {

        return new ItemStack(Admin_Crystal, 1, 0);
    }
};

//ITEMS

public static Item Purified_Obsidian_Ingot;

public static Item Obsidian_Ingot;

public static Item Crying_Obsidian_Ingot;

public static Item Obsidian_Crystal;

public static Item Reinforced_Obsidian_Crystal;

public static Item Admin_Crystal;

public static Item Purified_Obsidian_Crystal;


//ARMORMATERIALS

public static EnumArmorMaterial AMObsidian;

public static EnumArmorMaterial AMCryingObsidian;

public static EnumArmorMaterial AMObsidianRT1;

public static EnumArmorMaterial AMObsidianRT2;

public static EnumArmorMaterial AMObsidianRT3;

public static EnumArmorMaterial AMCryingObsidianRT1;

public static EnumArmorMaterial AMCryingObsidianRT2;

public static EnumArmorMaterial AMCryingObsidianRT3;

public static EnumArmorMaterial AMAdmin;


//ARMORS

//Obsidian Armor (T0)

public static Item Obsidian_Helmet;

public static Item Obsidian_Chestplate;

public static Item Obsidian_Leggings;

public static Item Obsidian_Boots;


//Obsidian Armor (T1)

public static Item Reinforced_Obsidian_Helmet_T1;

public static Item Reinforced_Obsidian_Chestplate_T1;

public static Item Reinforced_Obsidian_Leggings_T1;

public static Item Reinforced_Obsidian_Boots_T1;


//Obsidian Armor (T2)

public static Item Reinforced_Obsidian_Helmet_T2;

public static Item Reinforced_Obsidian_Chestplate_T2;

public static Item Reinforced_Obsidian_Leggings_T2;

public static Item Reinforced_Obsidian_Boots_T2;


//Obsidian Armor (T3)

public static Item Reinforced_Obsidian_Helmet_T3;

public static Item Reinforced_Obsidian_Chestplate_T3;

public static Item Reinforced_Obsidian_Leggings_T3;

public static Item Reinforced_Obsidian_Boots_T3;


//Crying Obsidian Armor (T0)

public static Item CryingObsidian_Helmet;

public static Item CryingObsidian_Chestplate;

public static Item CryingObsidian_Leggings;

public static Item CryingObsidian_Boots;


//Crying Obsidian Armor (T1)


public static Item Reinforced_CryingObsidian_Helmet_T1;

public static Item Reinforced_CryingObsidian_Chestplate_T1;

public static Item Reinforced_CryingObsidian_Leggings_T1;

public static Item Reinforced_CryingObsidian_Boots_T1;


//Obsidian Armor (T2)

public static Item Reinforced_CryingObsidian_Helmet_T2;

public static Item Reinforced_CryingObsidian_Chestplate_T2;

public static Item Reinforced_CryingObsidian_Leggings_T2;

public static Item Reinforced_CryingObsidian_Boots_T2;


//Obsidian Armor (T3)

public static Item Reinforced_CryingObsidian_Helmet_T3;

public static Item Reinforced_CryingObsidian_Chestplate_T3;

public static Item Reinforced_CryingObsidian_Leggings_T3;

public static Item Reinforced_CryingObsidian_Boots_T3;


//Admin Armor

public static Item Admin_Helmet;

public static Item Admin_Chestplate;

public static Item Admin_Leggings;

public static Item Admin_Boots;


//BLOCKS

public static Block Crying_Obsidian;

public static Block Purified_Obsidian;

public static Block Hardened_Obsidian;

public static Block HardenedCrying_Obsidian;


//ACHIEVEMENTS

public static Achievement Upgraded;

public static Achievement Full_Upgrade;

public static Achievement Total_Upgrade;


//OTHERS

//(Empty)

@EventHandler

public void PreInit(FMLPreInitializationEvent e){


//ITEMS

//Purified Obsidian Ingot

Purified_Obsidian_Ingot = new Purified_Obsidian_Ingot(5113).setUnlocalizedName("Purified Obsidian Ingot").setCreativeTab(this.Reinforced_Armors); //5113 (5413) is the ID
GameRegistry.registerItem(Purified_Obsidian_Ingot, "Purified Obsidian Ingot");

//Obsidian Ingot

Obsidian_Ingot = new Obsidian_Ingot(5114).setUnlocalizedName("Obsidian Ingot").setCreativeTab(this.Reinforced_Armors); //5114 (5414) is the ID
GameRegistry.registerItem(Obsidian_Ingot, "Obsidian Ingot");

//Crying Obsidian Ingot

Crying_Obsidian_Ingot = new Crying_Obsidian_Ingot(5123).setUnlocalizedName("Crying Obsidian Ingot").setCreativeTab(this.Reinforced_Armors); //5124 (5424) is the ID
GameRegistry.registerItem(Crying_Obsidian_Ingot, "Crying Obsidian Ingot");

//Obsidian Crystal

Obsidian_Crystal= new Obsidian_Crystal(5132).setUnlocalizedName("Obsidian Crystal").setCreativeTab(this.Reinforced_Armors); //5132 (5432) is the ID
GameRegistry.registerItem(Obsidian_Crystal, "Obsidian Crystal");

//Reinforced Obsidian Crystal

Reinforced_Obsidian_Crystal= new Reinforced_Obsidian_Crystal(5133).setUnlocalizedName("Reinforced Obsidian Crystal").setCreativeTab(this.Reinforced_Armors); //5132 (5432) is the ID
GameRegistry.registerItem(Reinforced_Obsidian_Crystal, "Reinforced Obsidian Crystal");

//Admin Crystal

Admin_Crystal= new Admin_Crystal(5134).setUnlocalizedName("Admin Crystal").setCreativeTab(this.Reinforced_Armors_Admin); //5134 (5434) is the ID
GameRegistry.registerItem(Admin_Crystal, "Admin Crystal");

//Purified Obsidian Crysatl

Purified_Obsidian_Crystal= new Purified_Obsidian_Crystal(5143).setUnlocalizedName("Purified Obsidian Crystal").setCreativeTab(this.Reinforced_Armors); //5134 (5434) is the ID
GameRegistry.registerItem(Purified_Obsidian_Crystal, "Purified Obsidian Crystal");

//ARMORS

//ArmorMaterial

AMObsidian = EnumHelper.addArmorMaterial("ObsidianArmorMaterial", 25, new int[]{2, 6, 5, 3}, 7);

AMObsidianRT1 = EnumHelper.addArmorMaterial("ReinforcedObsidianArmorMaterialT1", 27, new int[]{3, 7, 6, 3}, 9);

AMObsidianRT2 = EnumHelper.addArmorMaterial("ReinforcedObsidianArmorMaterialT2", 32, new int[]{3, 8, 6, 3}, 11);

AMObsidianRT2 = EnumHelper.addArmorMaterial("ReinforcedObsidianArmorMaterialT2", 36, new int[]{3, 8, 6, 3}, 15);

AMCryingObsidian = EnumHelper.addArmorMaterial("CryingObsidianArmorMaterial", 28, new int[]{3, 7, 5, 3}, 8);

AMCryingObsidianRT1 = EnumHelper.addArmorMaterial("ReinforcedCryingObsidianArmorMaterialT1", 30, new int[]{4, 7, 6, 4}, 10);

AMCryingObsidianRT2 = EnumHelper.addArmorMaterial("ReinforcedCryingObsidianArmorMaterialT2", 34, new int[]{3, 8, 6, 3}, 12);

AMCryingObsidianRT2 = EnumHelper.addArmorMaterial("ReinforcedCryingObsidianArmorMaterialT2", 38, new int[]{3, 8, 6, 3}, 16);

AMAdmin = EnumHelper.addArmorMaterial("AdminArmorMaterial", 100, new int[]{3, 8, 6, 3}, 0);


//Obsidian Armor

Obsidian_Helmet = new ItemObsidianArmor (5115, AMObsidian, 0, 0, "Obsidian").setUnlocalizedName("Obsidian_Helmet").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Obsidian_Helmet, "Obsidian Helmet");

Obsidian_Chestplate = new ItemObsidianArmor (5116, AMObsidian, 0, 1, "Obsidian").setUnlocalizedName("Obsidian_Chestplate").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Obsidian_Chestplate, "Obsidian Chestplate");

Obsidian_Leggings = new ItemObsidianArmor (5117, AMObsidian, 0, 2, "Obsidian").setUnlocalizedName("Obsidian_Leggings").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Obsidian_Leggings, "Obsidian Leggings");

Obsidian_Boots = new ItemObsidianArmor (5118, AMObsidian, 0, 3, "Obsidian").setUnlocalizedName("Obsidian_Boots").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Obsidian_Boots, "Obsidian Boots");


//Crying Obsidian

CryingObsidian_Helmet = new ItemCryingObsidianArmor (5119, AMCryingObsidian, 0, 0, "CryingObsidian").setUnlocalizedName("CryingObsidian_Helmet").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(CryingObsidian_Helmet, "Crying Obsidian Helmet");

CryingObsidian_Chestplate = new ItemCryingObsidianArmor (5120, AMCryingObsidian, 0, 1, "CryingObsidian").setUnlocalizedName("CryingObsidian_Chestplate").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(CryingObsidian_Chestplate, "Crying Obsidian Chestplate");

CryingObsidian_Leggings = new ItemCryingObsidianArmor (5121, AMCryingObsidian, 0, 2, "CryingObsidian").setUnlocalizedName("CryingObsidian_Leggings").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(CryingObsidian_Leggings, "Crying Obsidian Leggings");

CryingObsidian_Boots = new ItemCryingObsidianArmor (5122, AMCryingObsidian, 0, 3, "CryingObsidian").setUnlocalizedName("CryingObsidian_Boots").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(CryingObsidian_Boots, "Crying Obsidian Boots");


//Reinforced Armor Tier 1

//Reinforced Obsidian Armor T1

Reinforced_Obsidian_Helmet_T1 = new ItemObsidianArmorRT1 (5124, AMObsidianRT1, 0, 0, "ObsidianRT1").setUnlocalizedName("Reinforced_Obsidian_Helmet_T1").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Helmet_T1, "Reinforced Obsidian Helmet");

Reinforced_Obsidian_Chestplate_T1 = new ItemObsidianArmorRT1 (5125, AMObsidianRT1, 0, 1, "ObsidianRT1").setUnlocalizedName("Reinforced_Obsidian_Chestplate_T1").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Chestplate_T1, "Reinforced Obsidian Chestplate");

Reinforced_Obsidian_Leggings_T1 = new ItemObsidianArmorRT1 (5126, AMObsidianRT1, 0, 2, "ObsidianRT1").setUnlocalizedName("Reinforced_Obsidian_Leggings_T1").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Leggings_T1, "Reinforced Obsidian Leggings");

Reinforced_Obsidian_Boots_T1 = new ItemObsidianArmorRT1 (5127, AMObsidianRT1, 0, 3, "ObsidianRT1").setUnlocalizedName("Reinforced_Obsidian_Boots_T1").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Boots_T1, "Reinforced Obsidian Boots");


//Reinforced Crying Obsidian Armor T1


Reinforced_CryingObsidian_Helmet_T1 = new ItemCryingObsidianArmorRT1 (5128, AMObsidian, 0, 0, "CryingObsidianRT1").setUnlocalizedName("Reinforced_CryingObsidian_Helmet_T1").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_CryingObsidian_Helmet_T1, "Reinforced Crying Obsidian Helmet");

Reinforced_CryingObsidian_Chestplate_T1 = new ItemCryingObsidianArmorRT1 (5129, AMObsidian, 0, 1, "CryingObsidianRT1").setUnlocalizedName("Reinforced_CryingObsidian_Chestplate_T1").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_CryingObsidian_Chestplate_T1, "Reinforced Crying Obsidian Chestplate");

Reinforced_CryingObsidian_Leggings_T1 = new ItemCryingObsidianArmorRT1 (5130, AMObsidian, 0, 2, "CryingObsidianRT1").setUnlocalizedName("Reinforced_CryingObsidian_Leggings_T1").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_CryingObsidian_Leggings_T1, "Reinforced Crying Obsidian Leggings");

Reinforced_CryingObsidian_Boots_T1 = new ItemCryingObsidianArmorRT1 (5131, AMObsidian, 0, 3, "CryingObsidianRT1").setUnlocalizedName("Reinforced_CryingObsidian_Boots_T1").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_CryingObsidian_Boots_T1, "Reinforced Crying Obsidian Boots");


//Admin Armor

Admin_Helmet = new ItemAdminArmor (5135, AMAdmin, 0, 0, "Admin").setUnlocalizedName("Admin_Helmet").setCreativeTab(this.Reinforced_Armors_Admin);
GameRegistry.registerItem(Admin_Helmet, "Admin Helmet");

Admin_Chestplate = new ItemAdminArmor (5136, AMAdmin, 0, 1, "Admin").setUnlocalizedName("Admin_Chestplate").setCreativeTab(this.Reinforced_Armors_Admin);
GameRegistry.registerItem(Admin_Chestplate, "Admin Chestplate");

Admin_Leggings = new ItemAdminArmor (5137, AMAdmin, 0, 2, "Admin").setUnlocalizedName("Admin_Leggings").setCreativeTab(this.Reinforced_Armors_Admin);
GameRegistry.registerItem(Admin_Leggings, "Admin Leggings");

Admin_Boots = new ItemAdminArmor (5138, AMAdmin, 0, 3, "Admin").setUnlocalizedName("Admin_Boots").setCreativeTab(this.Reinforced_Armors_Admin);
GameRegistry.registerItem(Admin_Boots, "Admin Boots");


//Reinforced Obsidian Armor T2

Reinforced_Obsidian_Helmet_T2 = new ItemObsidianArmorRT2 (5139, AMObsidianRT2, 0, 0, "ObsidianRT2").setUnlocalizedName("Reinforced_Obsidian_Helmet_T2").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Helmet_T2, "Reinforced Obsidian Helmet Tier 2");

Reinforced_Obsidian_Chestplate_T2 = new ItemObsidianArmorRT2 (5140, AMObsidianRT2, 0, 1, "ObsidianRT2").setUnlocalizedName("Reinforced_Obsidian_Chestplate_T2").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Chestplate_T2, "Reinforced Obsidian Chestplate Tier 2");

Reinforced_Obsidian_Leggings_T2 = new ItemObsidianArmorRT2 (5141, AMObsidianRT2, 0, 2, "ObsidianRT2").setUnlocalizedName("Reinforced_Obsidian_Leggings_T2").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Leggings_T2, "Reinforced Obsidian Leggings Tier 2");

Reinforced_Obsidian_Boots_T2 = new ItemObsidianArmorRT2 (5142, AMObsidianRT2, 0, 3, "ObsidianRT2").setUnlocalizedName("Reinforced_Obsidian_Boots_T2").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Boots_T2, "Reinforced Obsidian Boots Tier 2");


//Reinforced Obsidian Armor T3

Reinforced_Obsidian_Helmet_T3 = new ItemObsidianArmorRT3 (5144, AMObsidianRT3, 0, 0, "ObsidianRT3").setUnlocalizedName("Reinforced_Obsidian_Helmet_T3").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Helmet_T3, "Reinforced Obsidian Helmet Tier 3");

Reinforced_Obsidian_Chestplate_T3 = new ItemObsidianArmorRT3 (5145, AMObsidianRT3, 0, 1, "ObsidianRT3").setUnlocalizedName("Reinforced_Obsidian_Chestplate_T3").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Chestplate_T3, "Reinforced Obsidian Chestplate Tier 3");

Reinforced_Obsidian_Leggings_T3 = new ItemObsidianArmorRT3 (5146, AMObsidianRT3, 0, 2, "ObsidianRT3").setUnlocalizedName("Reinforced_Obsidian_Leggings_T3").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Leggings_T3, "Reinforced Obsidian Leggings Tier 3");

Reinforced_Obsidian_Boots_T3 = new ItemObsidianArmorRT3 (5147, AMObsidianRT3, 0, 3, "ObsidianRT3").setUnlocalizedName("Reinforced_Obsidian_Boots_T3").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Boots_T3, "Reinforced Obsidian Boots Tier 3");


//Reinforced Crying Obsidian Armor T2

Reinforced_CryingObsidian_Helmet_T2 = new ItemCryingObsidianArmorRT2 (5139, AMCryingObsidianRT2, 0, 0, "CryingObsidianRT2").setUnlocalizedName("Reinforced_CryingObsidian_Helmet_T2").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_CryingObsidian_Helmet_T2, "Reinforced Crying Obsidian Helmet Tier 2");

Reinforced_CryingObsidian_Chestplate_T2 = new ItemCryingObsidianArmorRT2 (5140, AMCryingObsidianRT2, 0, 1, "CryingObsidianRT2").setUnlocalizedName("Reinforced_CryingObsidian_Chestplate_T2").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_CryingObsidian_Chestplate_T2, "Reinforced Crying Obsidian Chestplate Tier 2");

Reinforced_CryingObsidian_Leggings_T2 = new ItemCryingObsidianArmorRT2 (5141, AMCryingObsidianRT2, 0, 2, "CryingObsidianRT2").setUnlocalizedName("Reinforced_CryingObsidian_Leggings_T2").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_CryingObsidian_Leggings_T2, "Reinforced Crying Obsidian Leggings Tier 2");

Reinforced_CryingObsidian_Boots_T2 = new ItemCryingObsidianArmorRT2 (5142, AMCryingObsidianRT2, 0, 3, "CryingObsidianRT2").setUnlocalizedName("Reinforced_CryingObsidian_Boots_T2").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Boots_T2, "Reinforced Crying Obsidian Boots Tier 2");


//Reinforced Crying Obsidian Armor T3

Reinforced_CryingObsidian_Helmet_T3 = new ItemCryingObsidianArmorRT3 (5144, AMCryingObsidianRT3, 0, 0, "CryingObsidianRT3").setUnlocalizedName("Reinforced_CryingObsidian_Helmet_T3").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Helmet_T3, "Reinforced Crying Obsidian Helmet Tier 3");

Reinforced_CryingObsidian_Chestplate_T3 = new ItemCryingObsidianArmorRT3 (5145, AMCryingObsidianRT3, 0, 1, "CryingObsidianRT3").setUnlocalizedName("Reinforced_CryingObsidian_Chestplate_T3").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Chestplate_T3, "Reinforced Crying Obsidian Chestplate Tier 3");

Reinforced_CryingObsidian_Leggings_T3 = new ItemCryingObsidianArmorRT3 (5146, AMCryingObsidianRT3, 0, 2, "CryingObsidianRT3").setUnlocalizedName("Reinforced_CryingObsidian_Leggings_T3").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Leggings_T3, "Reinforced Crying Obsidian Leggings Tier 3");

Reinforced_CryingObsidian_Boots_T3 = new ItemCryingObsidianArmorRT3 (5147, AMCryingObsidianRT3, 0, 3, "CryingObsidianRT3").setUnlocalizedName("Reinforced_CryingObsidian_Boots_T3").setCreativeTab(this.Reinforced_Armors);
GameRegistry.registerItem(Reinforced_Obsidian_Boots_T3, "Reinforced Crying Obsidian Boots Tier 3");


//BLOCKS

//Crying Obsidian

Crying_Obsidian = new BlockCrying_Obsidian(3134).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Crying Obsidian").setCreativeTab(this.Reinforced_Armors).setResistance(2000.0F); //3134 is its ID
GameRegistry.registerBlock(Crying_Obsidian, "Crying Obsidian");
MinecraftForge.setBlockHarvestLevel(Crying_Obsidian, "pickaxe", 3);


//Purified Obsidian

Purified_Obsidian = new Purified_Obsidian(3135).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Purified Obsidian").setCreativeTab(this.Reinforced_Armors).setResistance(2000.0F); //3134 is its ID
GameRegistry.registerBlock(Purified_Obsidian, "Purified Obsidian");
MinecraftForge.setBlockHarvestLevel(Purified_Obsidian, "pickaxe", 3);


//Hardened Obsidian

Hardened_Obsidian = new Hardened_Obsidian(3136).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Hardened Obsidian").setCreativeTab(this.Reinforced_Armors).setResistance(2000.0F); //3134 is its ID
GameRegistry.registerBlock(Hardened_Obsidian, "Hardened Obsidian");
MinecraftForge.setBlockHarvestLevel(Hardened_Obsidian, "pickaxe", 3);


//Hardened Crying Obsidian

HardenedCrying_Obsidian = new HardenedCrying_Obsidian(3137).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Hardened Crying Obsidian").setCreativeTab(this.Reinforced_Armors).setResistance(2000.0F); //3134 is its ID
GameRegistry.registerBlock(HardenedCrying_Obsidian, "Hardened Crying Obsidian");
MinecraftForge.setBlockHarvestLevel(HardenedCrying_Obsidian, "pickaxe", 3);

}


//Achievements

//{

//Upgrade

{
	
Upgraded = new Achievement(3432, "Upgraded", 4, -4, Item.blazePowder, AchievementList.buildWorkBench).setSpecial().registerAchievement();

this.addAchievementName("Upgraded", "Upgraded!");

this.addAchievementDesc("Upgraded", "Upgrade one of your Armors to Tier 1");

}


//Full Upgrade

{

Full_Upgrade = new Achievement(3433, "Full-Upgrade", 6, -5, Item.enderPearl , Upgraded).setSpecial().registerAchievement();


this.addAchievementName("Full-Upgrade", "Fully Upgraded!");

this.addAchievementDesc("Full-Upgrade", "Upgrade one of your Armors to Tier 2");

}


//Total Upgrade

{

Total_Upgrade = new Achievement(3434, "Total-Upgrade", 7, -7, Item.eyeOfEnder, Full_Upgrade).setSpecial().registerAchievement();


this.addAchievementName("Total-Upgrade", "Total Upgraded!");

this.addAchievementDesc("Total-Upgrade", "Upgrade one of your Armors to Tier 3");

}

//}

//Achievements Desc and Names

private void addAchievementName(String ach, String name)
    {
    LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
}


private void addAchievementDesc(String ach, String desc)
    {
    LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
}


@EventHandler

public void InitReinforcedArmors(FMLInitializationEvent event){ //Your main initialization method

//this.addAchievementLocalizations();

GameRegistry.registerCraftingHandler(new CraftingHandler());

//Recipes and Other Stuff


ItemStack Obsidian_IngotStack = new ItemStack(Obsidian_Ingot);

ItemStack Crying_Obsidian_IngotStack = new ItemStack(Crying_Obsidian_Ingot);

ItemStack Purified_Obsidian_IngotStack = new ItemStack(Purified_Obsidian_Ingot);

ItemStack ObsidianStack = new ItemStack(Block.obsidian);

ItemStack Crying_ObsidianStack = new ItemStack(Crying_Obsidian);

ItemStack DirtStack = new ItemStack(Block.dirt);

ItemStack Lapis_BlockStack = new ItemStack(Block.blockLapis);

ItemStack Ender_PearlStack = new ItemStack(Item.enderPearl);

ItemStack Purified_ObsidianStack = new ItemStack(Purified_Obsidian);

ItemStack Hardened_ObsidianStack = new ItemStack(Hardened_Obsidian);

ItemStack HardenedCrying_ObsidianStack = new ItemStack(HardenedCrying_Obsidian);

ItemStack Obsidian_HelmetStack = new ItemStack(Obsidian_Helmet);

ItemStack Obsidian_ChestplateStack = new ItemStack(Obsidian_Chestplate);

ItemStack Obsidian_LeggingsStack = new ItemStack(Obsidian_Leggings);

ItemStack Obsidian_BootsStack = new ItemStack(Obsidian_Boots);

ItemStack CryingObsidian_HelmetStack = new ItemStack(CryingObsidian_Helmet);

ItemStack CryingObsidian_ChestplateStack = new ItemStack(CryingObsidian_Chestplate);

ItemStack CryingObsidian_LeggingsStack = new ItemStack(CryingObsidian_Leggings);

ItemStack CryingObsidian_BootsStack = new ItemStack(CryingObsidian_Boots);

ItemStack Obsidian_CrystalStack = new ItemStack (Obsidian_Crystal);

ItemStack Reinforced_Obsidian_CrystalStack = new ItemStack (Reinforced_Obsidian_Crystal);

ItemStack Reinforced_Obsidian_Helmet_T1Stack = new ItemStack(Reinforced_Obsidian_Helmet_T1);

ItemStack Reinforced_Obsidian_Chestplate_T1Stack = new ItemStack(Reinforced_Obsidian_Chestplate_T1);

ItemStack Reinforced_Obsidian_Leggings_T1Stack = new ItemStack(Reinforced_Obsidian_Leggings_T1);

ItemStack Reinforced_Obsidian_Boots_T1Stack = new ItemStack(Reinforced_Obsidian_Boots_T1);

ItemStack Purified_Obsidian_CrystalStack = new ItemStack (Purified_Obsidian_Crystal);

ItemStack Reinforced_Obsidian_Helmet_T2Stack = new ItemStack(Reinforced_Obsidian_Helmet_T2);

ItemStack Reinforced_Obsidian_Chestplate_T2Stack = new ItemStack(Reinforced_Obsidian_Chestplate_T2);

ItemStack Reinforced_Obsidian_Leggings_T2Stack = new ItemStack(Reinforced_Obsidian_Leggings_T2);

ItemStack Reinforced_Obsidian_Boots_T2Stack = new ItemStack(Reinforced_Obsidian_Boots_T2);

ItemStack EmeraldStack = new ItemStack (Item.emerald);

ItemStack DiamondStack = new ItemStack (Item.diamond);

ItemStack FeatherStack = new ItemStack (Item.feather);

ItemStack Reinforced_Obsidian_Helmet_T3Stack = new ItemStack(Reinforced_Obsidian_Helmet_T3);

ItemStack Reinforced_Obsidian_Chestplate_T3Stack = new ItemStack(Reinforced_Obsidian_Chestplate_T3);

ItemStack Reinforced_Obsidian_Leggings_T3Stack = new ItemStack(Reinforced_Obsidian_Leggings_T3);

ItemStack Reinforced_Obsidian_Boots_T3Stack = new ItemStack(Reinforced_Obsidian_Boots_T3);


//Crafting Recipe for Crying Obsidian

GameRegistry.addRecipe(Crying_ObsidianStack, "lyl", "yxy", "lyl", 'x', Purified_ObsidianStack, 'y', Lapis_BlockStack, 'l', Ender_PearlStack);


//Crafting Recipe for Obsidian Armor


//Helmet

GameRegistry.addRecipe(Obsidian_HelmetStack, "yyy", "yly", 'y', Obsidian_IngotStack);


//Chestplate

GameRegistry.addRecipe(Obsidian_ChestplateStack, "yly", "yyy", "yyy", 'y', Obsidian_IngotStack);


//Leggings

GameRegistry.addRecipe(Obsidian_LeggingsStack, "yyy", "yly", "yly", 'y', Obsidian_IngotStack);


//Boots

GameRegistry.addRecipe(Obsidian_BootsStack, "yly", "yly", 'y', Obsidian_IngotStack);



//Crafting Recipe for Crying Obsidian Armor


//Helmet

GameRegistry.addRecipe(CryingObsidian_HelmetStack, "yyy", "yly", 'y', Crying_Obsidian_IngotStack);


//Chestplate

GameRegistry.addRecipe(CryingObsidian_ChestplateStack, "yly", "yyy", "yyy", 'y', Crying_Obsidian_IngotStack);


//Leggings

GameRegistry.addRecipe(CryingObsidian_LeggingsStack, "yyy", "yly", "yly", 'y', Crying_Obsidian_IngotStack);


//Boots

GameRegistry.addRecipe(CryingObsidian_BootsStack, "yly", "yly", 'y', Crying_Obsidian_IngotStack);


//Crafting Recipe for Reinforced Obsidian Armor T1


//Helmet

GameRegistry.addRecipe(Reinforced_Obsidian_Helmet_T1Stack, "yyy", "yly", 'y', Obsidian_CrystalStack);


//Chestplate

GameRegistry.addRecipe(Reinforced_Obsidian_Chestplate_T1Stack, "yly", "yyy", "yyy", 'y', Obsidian_CrystalStack);


//Leggings

GameRegistry.addRecipe(Reinforced_Obsidian_Leggings_T1Stack, "yyy", "yly", "yly", 'y', Obsidian_CrystalStack);


//Boots

GameRegistry.addRecipe(Reinforced_Obsidian_Boots_T1Stack, "yly", "yly", 'y', Obsidian_CrystalStack);


//Crafting Recipe for Reinforced Obsidian Armor T2


//Helmet

GameRegistry.addRecipe(Reinforced_Obsidian_Helmet_T2Stack, "yyy", "yly", 'y', Reinforced_Obsidian_CrystalStack);


//Chestplate

GameRegistry.addRecipe(Reinforced_Obsidian_Chestplate_T2Stack, "yly", "yyy", "yyy", 'y', Reinforced_Obsidian_CrystalStack);


//Leggings

GameRegistry.addRecipe(Reinforced_Obsidian_Leggings_T2Stack, "yyy", "yly", "yly", 'y', Reinforced_Obsidian_CrystalStack);


//Boots

GameRegistry.addRecipe(Reinforced_Obsidian_Boots_T2Stack, "yly", "yly", 'y', Reinforced_Obsidian_CrystalStack);


//Crafting Recipe for Reinforced Obsidian Armor T3


//Helmet

GameRegistry.addRecipe(Reinforced_Obsidian_Helmet_T3Stack, "yxy", "xlx", "yxy", 'y', Reinforced_Obsidian_Helmet_T2Stack, 'x', FeatherStack, 'y', Purified_Obsidian_CrystalStack);

//Chestplate

GameRegistry.addRecipe(Reinforced_Obsidian_Chestplate_T3Stack, "yxy", "xlx", "yxy", 'y', Reinforced_Obsidian_Chestplate_T2Stack, 'x', FeatherStack, 'y', Purified_Obsidian_CrystalStack);

//Leggings

GameRegistry.addRecipe(Reinforced_Obsidian_Leggings_T3Stack, "yxy", "xlx", "yxy", 'y', Reinforced_Obsidian_Leggings_T2Stack, 'x', FeatherStack, 'y', Purified_Obsidian_CrystalStack);

//Boots

GameRegistry.addRecipe(Reinforced_Obsidian_Boots_T3Stack, "yxy", "xlx", "yxy", 'y', Reinforced_Obsidian_Boots_T2Stack, 'x', FeatherStack, 'y', Purified_Obsidian_CrystalStack);


//Crafting Recipe for Purified Obsidian Ingots

GameRegistry.addShapelessRecipe(new ItemStack(ReinforcedArmors.Purified_Obsidian_Ingot, 4), new ItemStack(ReinforcedArmors.Purified_Obsidian));


//Crafting Recipe for Purified Obsidian Block, Using Purified Obsidian Ingots

GameRegistry.addRecipe(Purified_ObsidianStack, "yy", "yy", 'y', Purified_Obsidian_Ingot);


//Crafting Recipe for Obsidian Ingots

GameRegistry.addShapelessRecipe(new ItemStack(ReinforcedArmors.Obsidian_Ingot, 4), new ItemStack(ReinforcedArmors.Hardened_Obsidian));


//Crafting Recipe for Obsidian Block, Using Purified Ingots

GameRegistry.addRecipe(ObsidianStack, "yy", "yy", 'y', Obsidian_Ingot);


//Crafting Recipe for Crying Obsidian Ingots

GameRegistry.addShapelessRecipe(new ItemStack(ReinforcedArmors.Crying_Obsidian_Ingot, 4), new ItemStack(ReinforcedArmors.HardenedCrying_Obsidian));


//Crafting Recipe for Crying Obsidian Block, Using Crying Obsidian Ingots

GameRegistry.addRecipe(Crying_ObsidianStack, "yy", "yy", 'y', Crying_Obsidian_Ingot);


//Crafting Recipe for Obsidian Crystal, Using Obsidian Ingots and a Diamond.

GameRegistry.addRecipe(Obsidian_CrystalStack, "yxy", "xlx", "yxy", 'l', DiamondStack, 'x', Obsidian_IngotStack);

//Crafting Recipe for Purified Obsidian Crystal, Using a Reinforced Obsidian Crystal, Diamonds and Emeralds.

GameRegistry.addRecipe(Purified_Obsidian_CrystalStack, "yxy", "xlx", "yxy", 'y', EmeraldStack, 'x', DiamondStack, 'l', Reinforced_Obsidian_CrystalStack);

//Crafting Recipe for Purified Obsidian Crystal, Using a Reinforced Obsidian Crystal, Diamonds and Emeralds.

GameRegistry.addRecipe(Purified_Obsidian_CrystalStack, "yxy", "xlx", "yxy", 'y', Ender_PearlStack, 'x', Obsidian_IngotStack, 'l', Obsidian_CrystalStack);


//Smelting

GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(ReinforcedArmors.Hardened_Obsidian), 0.5F);

GameRegistry.addSmelting(Crying_Obsidian.blockID, new ItemStack(ReinforcedArmors.HardenedCrying_Obsidian), 0.7F);


//CREATIVE TAB (METHOD)

//Reinforced Armors

LanguageRegistry.instance().addStringLocalization("itemGroup.Reinforced Armors", "en_US", "Reinforced Armors");

//Reinforced Armors Admin

LanguageRegistry.instance().addStringLocalization("itemGroup.Reinforced Armors Admin", "en_US", "Reinforced Armors (Admin)");


//BLOCKS (METHOD)

proxy.registerBlocks(); //Calls the registerBlocks method -- This wasn't here before, so don't skip over this!


//ITEMS (METHOD)

proxy.registerItems(); //Calls the RegisterItems method


//MULTIPLAYER ABILITY

//	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data


}

private void addAchievementLocalizations() {

}

}