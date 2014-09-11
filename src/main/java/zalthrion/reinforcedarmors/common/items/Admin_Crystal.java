package zalthrion.reinforcedarmors.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IconRegister;

public class Admin_Crystal extends Item
{
public Admin_Crystal(int id)
{
super(id);
}

@Override
public boolean hasEffect(ItemStack par1ItemStack){
	
	if(par1ItemStack.stackTagCompound == null) {
		 par1ItemStack.stackTagCompound = new NBTTagCompound();
		 }
		 if(!par1ItemStack.stackTagCompound.hasKey("ench")) {
	par1ItemStack.setTagInfo("ench", new NBTTagList()); }
	return true;
}

public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List, boolean par4)
{
par2List.add("\u00a7o" + "Creative Only");
}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister)
{
     itemIcon = iconRegister.registerIcon("reinforcedarmors:" + "Admin_Crystal");
}
}