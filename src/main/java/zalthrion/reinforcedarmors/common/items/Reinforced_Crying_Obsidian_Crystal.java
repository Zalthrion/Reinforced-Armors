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

public class Reinforced_Crying_Obsidian_Crystal extends Item
{
public Reinforced_Crying_Obsidian_Crystal(int id)
{
super(id);
}

@Override
public boolean hasEffect(ItemStack par1ItemStack){
	return true;
}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister)
{
     itemIcon = iconRegister.registerIcon("reinforcedarmors:" + "Reinforced_Crying_Obsidian_Crystal");
}
}