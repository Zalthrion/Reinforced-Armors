package zalthrion.reinforcedarmors.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IconRegister;

public class Obsidian_Crystal extends Item
{
public Obsidian_Crystal(int id)
{
super(id);
}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister)
{
     itemIcon = iconRegister.registerIcon("reinforcedarmors:" + "Obsidian_Crystal");
}
}