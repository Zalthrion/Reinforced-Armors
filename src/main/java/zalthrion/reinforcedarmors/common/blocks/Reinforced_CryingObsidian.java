package zalthrion.reinforcedarmors.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;


public class Reinforced_CryingObsidian extends Block
{
	
	public Reinforced_CryingObsidian(int par1)
    {
        super(par1, Material.rock); //You can set different materials, check them out!
    }
    public void registerIcons(IconRegister iconRegister)
    {
             blockIcon = iconRegister.registerIcon("reinforcedarmors:CryingObsidian_1");//Telling Forge where our texture is
    }
}
