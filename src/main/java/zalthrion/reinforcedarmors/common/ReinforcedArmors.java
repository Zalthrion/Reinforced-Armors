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
import zalthrion.reinforcedarmors.common.blocks.Crying_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.Purified_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.Hardened_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.Hardened_CryingObsidian;
import zalthrion.reinforcedarmors.common.blocks.Reinforced_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.Hardened_LapisLazuli_Block;
import zalthrion.reinforcedarmors.common.blocks.Purified_LapisLazuli_Block;
import zalthrion.reinforcedarmors.common.blocks.Reinforced_LapisLazuli_Block;
import zalthrion.reinforcedarmors.common.blocks.Purified_CryingObsidian;
import zalthrion.reinforcedarmors.common.blocks.Reinforced_CryingObsidian;
import zalthrion.reinforcedarmors.common.blocks.Hardened_Emerald_Block;
import zalthrion.reinforcedarmors.common.blocks.Purified_Emerald_Block;
import zalthrion.reinforcedarmors.common.blocks.Reinforced_Emerald_Block;
import zalthrion.reinforcedarmors.common.blocks.Hardened_Quartz_Block;
import zalthrion.reinforcedarmors.common.blocks.Reinforced_Quartz_Block;
import zalthrion.reinforcedarmors.common.blocks.Purified_Quartz_Block;
import zalthrion.reinforcedarmors.common.handlers.ReinforcedArmorsServerPacketHandler;
import zalthrion.reinforcedarmors.common.handlers.ReinforcedArmorsClientPacketHandler;
import zalthrion.reinforcedarmors.common.items.Purified_Obsidian_Ingot;
import zalthrion.reinforcedarmors.common.items.Obsidian_Ingot;
import zalthrion.reinforcedarmors.common.items.CryingObsidian_Ingot;
import zalthrion.reinforcedarmors.common.items.Obsidian_Crystal;
import zalthrion.reinforcedarmors.common.items.Reinforced_Obsidian_Crystal;
import zalthrion.reinforcedarmors.common.items.Purified_Obsidian_Crystal;
import zalthrion.reinforcedarmors.common.items.Admin_Crystal;
import zalthrion.reinforcedarmors.common.items.CryingObsidian_Crystal;
import zalthrion.reinforcedarmors.common.items.Reinforced_CryingObsidian_Crystal;
import zalthrion.reinforcedarmors.common.items.Purified_CryingObsidian_Crystal;
import zalthrion.reinforcedarmors.common.items.Reinforced_Obsidian_Ingot;
import zalthrion.reinforcedarmors.common.items.LapisLazuli_Ingot;
import zalthrion.reinforcedarmors.common.items.Reinforced_LapisLazuli_Ingot;
import zalthrion.reinforcedarmors.common.items.Purified_LapisLazuli_Ingot;
import zalthrion.reinforcedarmors.common.items.Hardened_Emerald;
import zalthrion.reinforcedarmors.common.items.Reinforced_Emerald;
import zalthrion.reinforcedarmors.common.items.Purified_Emerald;
import zalthrion.reinforcedarmors.common.items.Hardened_Quartz_Shard;
import zalthrion.reinforcedarmors.common.items.Reinforced_Quartz_Shard;
import zalthrion.reinforcedarmors.common.items.Purified_Quartz_Shard;
import zalthrion.reinforcedarmors.common.items.armors.ItemAdminArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemBoneArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemCryingObsidianArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemCryingObsidianArmorRT1;
import zalthrion.reinforcedarmors.common.items.armors.ItemCryingObsidianArmorRT2;
import zalthrion.reinforcedarmors.common.items.armors.ItemCryingObsidianArmorRT3;
import zalthrion.reinforcedarmors.common.items.armors.ItemObsidianArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemObsidianArmorRT1;
import zalthrion.reinforcedarmors.common.items.armors.ItemObsidianArmorRT2;
import zalthrion.reinforcedarmors.common.items.armors.ItemObsidianArmorRT3;
import zalthrion.reinforcedarmors.common.items.armors.ItemLapisLazuliArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemLapisLazuliArmorRT1;
import zalthrion.reinforcedarmors.common.items.armors.ItemLapisLazuliArmorRT2;
import zalthrion.reinforcedarmors.common.items.armors.ItemLapisLazuliArmorRT3;
import zalthrion.reinforcedarmors.common.items.armors.ItemEmeraldArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemEmeraldArmorRT1;
import zalthrion.reinforcedarmors.common.items.armors.ItemEmeraldArmorRT2;
import zalthrion.reinforcedarmors.common.items.armors.ItemEmeraldArmorRT3;
import zalthrion.reinforcedarmors.common.items.armors.ItemQuartzArmor;
import zalthrion.reinforcedarmors.common.items.armors.ItemQuartzArmorRT1;
import zalthrion.reinforcedarmors.common.items.armors.ItemQuartzArmorRT2;
import zalthrion.reinforcedarmors.common.items.armors.ItemQuartzArmorRT3;
import zalthrion.reinforcedarmors.common.lib.ModAchievs;
import zalthrion.reinforcedarmors.common.lib.ModArmor;
import zalthrion.reinforcedarmors.common.lib.ModBlocks;
import zalthrion.reinforcedarmors.common.lib.ModItems;
import zalthrion.reinforcedarmors.common.lib.ModTabs;
import zalthrion.reinforcedarmors.common.lib.recipes.ModArmorRecipes;
import zalthrion.reinforcedarmors.common.lib.recipes.ModBlockRecipes;
import zalthrion.reinforcedarmors.common.lib.recipes.ModItemRecipes;
import zalthrion.reinforcedarmors.common.lib.recipes.ModSmeltingRecipes;


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


@EventHandler

public void PreInit(FMLPreInitializationEvent e){
	
ModItems.init();

ModArmor.init();

ModBlocks.init();

}



@EventHandler

public void InitReinforcedArmors(FMLInitializationEvent event){ //Your main initialization method


ModItemRecipes.init();

ModBlockRecipes.init();

ModArmorRecipes.init();

ModSmeltingRecipes.init();

//BLOCKS (METHOD)

proxy.registerBlocks(); //Calls the registerBlocks method


//ITEMS (METHOD)

proxy.registerItems(); //Calls the RegisterItems method


//MULTIPLAYER ABILITY

//	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

}

@EventHandler

public void PostInitReinforcedArmors(FMLInitializationEvent event){
	
ModAchievs.init();

ModTabs.init();

}

}