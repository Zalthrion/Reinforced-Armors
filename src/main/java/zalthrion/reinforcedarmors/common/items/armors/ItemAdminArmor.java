package zalthrion.reinforcedarmors.common.items.armors;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.lib.ModArmor;
import zalthrion.reinforcedarmors.common.lib.ModItems;
import zalthrion.reinforcedarmors.common.lib.ModTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAdminArmor extends ItemArmor {

	private String texturePath = "reinforcedarmors" + ":" + "textures/models/armors/";
	
	public ItemAdminArmor(int par1, EnumArmorMaterial armorMaterial, int par3, int par4, String type) {
		super(par1, armorMaterial, par3, par4);
		
		this.setMaxStackSize(1);
		this.setCreativeTab(ModTabs.Reinforced_Armors);
		this.setTextureName(type, par4);
	}
	
	private void setTextureName(String type, int armorPart){
		if (armorType == 0 || armorType == 1 || armorType == 3){
			this.texturePath += type + "_layer_1.png";
		}else{
			this.texturePath += type + "_layer_2.png";
     }
  }
	
	//(Potion Effects.)
	@Override

	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack stack)

	{
		ItemStack boots = player.getCurrentArmor(0);
		ItemStack legs = player.getCurrentArmor(1);
		ItemStack chest = player.getCurrentArmor(2);
		ItemStack helmet = player.getCurrentArmor(3);    

				if(this == ModArmor.Admin_Helmet)

				{
					//if(helmet != null)
					//if(chest != null)
					//if(legs != null)
					//if(boots != null)
						
					if(ModArmor.Admin_Helmet != null)
					if(ModArmor.Admin_Chestplate != null)
					if(ModArmor.Admin_Leggings != null)
				    if(ModArmor.Admin_Boots != null)

				{

	player.addPotionEffect(new PotionEffect(Potion.resistance.id, 2, 100));
	
	player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2, 100));
	
	player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 2, 100));

				}
				}
	}

	//(Repairing)

	@Override

	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {

	  return stack.getItem() == ModItems.Admin_Crystal; //Allows certain items to repair this armor.

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
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		this.itemIcon = register.registerIcon("reinforcedarmors" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
	public String getArmorTexture (ItemStack itemstack,  Entity entity, int slot, int layer){
		return texturePath;
	
	}
}
