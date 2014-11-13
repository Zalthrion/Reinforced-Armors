package zalthrion.reinforcedarmors.common.items.armors;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import zalthrion.reinforcedarmors.common.lib.ModItems;
import zalthrion.reinforcedarmors.common.lib.ModTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemLapisLazuliArmorRT1 extends ItemArmor {

	private String texturePath = "reinforcedarmors" + ":" + "textures/models/armors/";
	
	public ItemLapisLazuliArmorRT1(int par1, EnumArmorMaterial armorMaterial, int par3, int par4, String type) {
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

//	player.addPotionEffect(new PotionEffect(Potion.weakness.id, 2, 0));

	}

	//(Repairing)

	@Override

	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {

	  return stack.getItem() == ModItems.LapisLazuli_Ingot; //Alllows certain items to repair this armor.

	}
	
	@Override
	public boolean hasEffect(ItemStack par1ItemStack){
		return true;
		
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List, boolean par4)
	{
	par2List.add("\u00a7d" + "Tier 1");
//	par2List.add("\u00a7o" + "-No Effects-");
	par2List.add("-No Effects-");
	par2List.add("\u00a7b" + "(Repairable):");
//	par2List.add("\u00a7o" + "Lapis Lazuli Ingots");
	par2List.add("Lapis Lazuli Ingots");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.rare;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		this.itemIcon = register.registerIcon("reinforcedarmors" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
	public String getArmorTexture (ItemStack itemstack,  Entity entity, int slot, int layer){
		return texturePath;
	
	}
}
