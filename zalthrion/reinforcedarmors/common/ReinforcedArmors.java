package zalthrion.reinforcedarmors.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import zalthrion.reinforcedarmors.common.ReinforcedArmorsCommonProxy;

@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"ReinforcedArmors"}, packetHandler = reinforcedarmorsClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"ReinforcedArmors"}, packetHandler = reinforcedarmorsServerPacketHandler.class)) //For serverside packet handling

//MOD BASICS
@Mod(modid="ReinforcedArmors",name="Reinforced Armors",version="Release")


public class ReinforcedArmors {

	@Instance("ReinforcedArmors") //The instance, this is very important later on
	public static ReinforcedArmors instance = new ReinforcedArmors();

	@SidedProxy(clientSide = "zalthrion.reinforcedarmors.client.ReinforcedArmorsClientProxy", serverSide = "zalthrion.reinforcedarmors.common.ReinforcedArmorsCommonProxy") //Tells Forge the location of your proxies
	public static ReinforcedArmorsCommonProxy proxy;

	@PreInit
	public void PreInit(FMLPreInitializationEvent e){

	}

	@Init
	public void InitReinforcedArmors(FMLInitializationEvent event){ //Your main initialization method

	//MULTIPLAYER ABILITY
	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

	}	
}