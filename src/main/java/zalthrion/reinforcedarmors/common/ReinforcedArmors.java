package zalthrion.reinforcedarmors.common;

import net.minecraft.block.Block;
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
import zalthrion.reinforcedarmors.common.ReinforcedArmorsCommonProxy;
import zalthrion.reinforcedarmors.common.blocks.BlockCrying_Obsidian;
import zalthrion.reinforcedarmors.common.handlers.ReinforcedArmorsServerPacketHandler;
import zalthrion.reinforcedarmors.common.handlers.ReinforcedArmorsClientPacketHandler;


@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"ReinforcedArmors"}, packetHandler = ReinforcedArmorsClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"ReinforcedArmors"}, packetHandler = ReinforcedArmorsServerPacketHandler.class)) //For serverside packet handling

//MOD BASICS
@Mod(modid="ReinforcedArmors",name="Reinforced Armors",version="Release")


public class ReinforcedArmors {

	@Instance("ReinforcedArmors") //The instance, this is very important later on
	public static ReinforcedArmors instance ;

	@SidedProxy(clientSide = "zalthrion.reinforcedarmors.client.ReinforcedArmorsClientProxy", serverSide = "zalthrion.reinforcedarmors.common.ReinforcedArmorsCommonProxy") //Tells Forge the location of your proxies
	public static ReinforcedArmorsCommonProxy proxy;

	//BLOCKS
	public static Block Crying_Obsidian;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent e){

	//BLOCKS
	Crying_Obsidian = new BlockCrying_Obsidian(3000).setUnlocalizedName("Crying Obsidian"); //3000 is its ID
		
	}

	@EventHandler
	public void InitReinforcedArmors(FMLInitializationEvent event){ //Your main initialization method

	//BLOCKS (METHOD)
	proxy.registerBlocks(); //Calls the registerBlocks method -- This wasn't here before, so don't skip over this!
		
	//MULTIPLAYER ABILITY
//	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

	}	
}