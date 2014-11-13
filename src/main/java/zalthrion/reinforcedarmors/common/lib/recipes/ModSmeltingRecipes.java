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

public class ModSmeltingRecipes {
	
	
    public static void init() {
        registerSmeltingRecipes();
        
    }

    private static void registerSmeltingRecipes() {

    	GameRegistry.addSmelting(ModBlocks.Clay_Obsidian.blockID, new ItemStack(ModBlocks.Hardened_Obsidian), 0.1F);

    	GameRegistry.addSmelting(ModBlocks.Clay_CryingObsidian.blockID, new ItemStack(ModBlocks.Hardened_CryingObsidian), 0.2F);

    	GameRegistry.addSmelting(ModBlocks.Clay_LapisLazuli.blockID, new ItemStack(ModBlocks.Hardened_LapisLazuli_Block), 0.1F);

    	GameRegistry.addSmelting(ModBlocks.Clay_Emerald.blockID, new ItemStack(ModBlocks.Hardened_Emerald_Block), 0.1F);
    	
    	GameRegistry.addSmelting(ModBlocks.Clay_Quartz.blockID, new ItemStack(ModBlocks.Hardened_Quartz_Block), 0.1F);
        
    }

}