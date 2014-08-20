package zalthrion.reinforcedarmors.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import zalthrion.reinforcedarmors.common.ReinforcedArmorsCommonProxy;
import zalthrion.reinforcedarmors.common.blocks.BlockCrying_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.Purified_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.Hardened_Obsidian;
import zalthrion.reinforcedarmors.common.blocks.HardenedCrying_Obsidian;
import zalthrion.reinforcedarmors.common.handlers.ReinforcedArmorsServerPacketHandler;
import zalthrion.reinforcedarmors.common.handlers.ReinforcedArmorsClientPacketHandler;
import zalthrion.reinforcedarmors.common.items.Purified_Obsidian_Ingot;
import zalthrion.reinforcedarmors.common.items.Obsidian_Ingot;


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

	//ITEMS
	public static Item Purified_Obsidian_Ingot;
	
	public static Item Obsidian_Ingot;
	
	//BLOCKS
	public static Block Crying_Obsidian;
	
	public static Block Purified_Obsidian;
	
	public static Block Hardened_Obsidian;
	
	public static Block HardenedCrying_Obsidian;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent e){

	//ITEMS
		
	//Purified Obsidian Ingot
		
	Purified_Obsidian_Ingot = new Purified_Obsidian_Ingot(5113).setUnlocalizedName("Purified Obsidian Ingot").setCreativeTab(CreativeTabs.tabMaterials); //5413 is the ID
	GameRegistry.registerItem(Purified_Obsidian_Ingot, "Purified Obsidian Ingot");
	
	//Purified Obsidian Ingot
	
	Obsidian_Ingot = new Obsidian_Ingot(5114).setUnlocalizedName("Obsidian Ingot").setCreativeTab(CreativeTabs.tabMaterials); //5413 is the ID
	GameRegistry.registerItem(Obsidian_Ingot, "Obsidian Ingot");
	
	//BLOCKS
	
	//Crying Obsidian
	
	Crying_Obsidian = new BlockCrying_Obsidian(3134).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Crying Obsidian").setCreativeTab(CreativeTabs.tabBlock).setResistance(2000.0F); //3134 is its ID
	GameRegistry.registerBlock(Crying_Obsidian, "Crying Obsidian");
	MinecraftForge.setBlockHarvestLevel(Crying_Obsidian, "pickaxe", 3);
	
	//Purified Obsidian
	
	Purified_Obsidian = new Purified_Obsidian(3135).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Purified Obsidian").setCreativeTab(CreativeTabs.tabBlock).setResistance(2000.0F); //3134 is its ID
	GameRegistry.registerBlock(Purified_Obsidian, "Purified Obsidian");
	MinecraftForge.setBlockHarvestLevel(Purified_Obsidian, "pickaxe", 3);
	
	//Hardened Obsidian
	
	Hardened_Obsidian = new Hardened_Obsidian(3136).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Hardened Obsidian").setCreativeTab(CreativeTabs.tabBlock).setResistance(2000.0F); //3134 is its ID
	GameRegistry.registerBlock(Hardened_Obsidian, "Hardened Obsidian");
	MinecraftForge.setBlockHarvestLevel(Hardened_Obsidian, "pickaxe", 3);
	
	//Hardened Crying Obsidian
	
	HardenedCrying_Obsidian = new HardenedCrying_Obsidian(3137).setHardness(50.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Hardened Crying Obsidian").setCreativeTab(CreativeTabs.tabBlock).setResistance(2000.0F); //3134 is its ID
	GameRegistry.registerBlock(HardenedCrying_Obsidian, "Hardened Crying Obsidian");
	MinecraftForge.setBlockHarvestLevel(HardenedCrying_Obsidian, "pickaxe", 3);
	
	}

	@EventHandler
	public void InitReinforcedArmors(FMLInitializationEvent event){ //Your main initialization method

	//Recipes and Other Stuff

	ItemStack Obsidian_IngotStack = new ItemStack(Obsidian_Ingot);
		
	ItemStack Purified_Obsidian_IngotStack = new ItemStack(Purified_Obsidian_Ingot);
		
	ItemStack ObsidianStack = new ItemStack(Block.obsidian);

	ItemStack Crying_ObsidianStack = new ItemStack(Crying_Obsidian);

	ItemStack DirtStack = new ItemStack(Block.dirt);

	ItemStack Lapis_BlockStack = new ItemStack(Block.blockLapis);

	ItemStack Ender_PearlStack = new ItemStack(Item.enderPearl);
	
	ItemStack Purified_ObsidianStack = new ItemStack(Purified_Obsidian);
	
	ItemStack Hardened_ObsidianStack = new ItemStack(Hardened_Obsidian);

	ItemStack HardenedCrying_ObsidianStack = new ItemStack(HardenedCrying_Obsidian);
	
	
	//Crafting Recipe for Crying Obsidian

	GameRegistry.addRecipe(Crying_ObsidianStack, "lyl", "yxy", "lyl", 'x', Purified_ObsidianStack, 'y', Lapis_BlockStack, 'l', Ender_PearlStack);
	
	
	//Crafting Recipe for Purified Obsidian Ingots
	
	GameRegistry.addShapelessRecipe(new ItemStack(ReinforcedArmors.Purified_Obsidian_Ingot, 4), new ItemStack(ReinforcedArmors.Purified_Obsidian));
	
	//Crafting Recipe for Purified Obsidian Block, Using Purified Obsidian Ingots
	
	GameRegistry.addRecipe(Purified_ObsidianStack, "yy", "yy", 'y', Purified_Obsidian_Ingot);
	
	//Crafting Recipe for Obsidian Ingots
	
	GameRegistry.addShapelessRecipe(new ItemStack(ReinforcedArmors.Obsidian_Ingot, 4), new ItemStack(ReinforcedArmors.Hardened_Obsidian));
		
	//Crafting Recipe for Obsidian Block, Using Purified Ingots
		
	GameRegistry.addRecipe(ObsidianStack, "yy", "yy", 'y', Obsidian_Ingot);
	
	//Smelting
	
	GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(ReinforcedArmors.Hardened_Obsidian), 0.5F);
	
	GameRegistry.addSmelting(Crying_Obsidian.blockID, new ItemStack(ReinforcedArmors.HardenedCrying_Obsidian), 0.7F);
		
	//BLOCKS (METHOD)
	proxy.registerBlocks(); //Calls the registerBlocks method -- This wasn't here before, so don't skip over this!
		
	//ITEMS (METHOD)
	proxy.registerItems(); //Calls the RegisterItems method

	
	//MULTIPLAYER ABILITY
//	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

	}	
}