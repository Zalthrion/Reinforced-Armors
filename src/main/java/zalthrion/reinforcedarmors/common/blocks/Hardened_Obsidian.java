package zalthrion.reinforcedarmors.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;


public class Hardened_Obsidian extends Block
{
	public Hardened_Obsidian(int par1)
    {
        super(par1, Material.rock); //You can set different materials, check them out!
    }
    public void registerIcons(IconRegister iconRegister)
    {
             blockIcon = iconRegister.registerIcon("reinforcedarmors:Hardened_Obsidian");//Telling Forge where our texture is
    }
}