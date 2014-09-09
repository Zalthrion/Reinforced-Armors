package zalthrion.reinforcedarmors.common.items.armors;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import zalthrion.reinforcedarmors.common.ReinforcedArmors;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemObsidianArmor extends ItemArmor {

	private String texturePath = "reinforcedarmors" + ":" + "textures/models/armors/";
	
	public ItemObsidianArmor(int par1, EnumArmorMaterial armorMaterial, int par3, int par4, String type) {
		super(par1, armorMaterial, par3, par4);
		
		this.setMaxStackSize(1);
		this.setCreativeTab(ReinforcedArmors.Reinforced_Armors);
		this.setTextureName(type, par4);
	}
	
	private void setTextureName(String type, int armorPart){
		if (armorType == 0 || armorType == 1 || armorType == 3){
			this.texturePath += type + "_layer_1.png";
		}else{
			this.texturePath += type + "_layer_2.png";
     }
  }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		this.itemIcon = register.registerIcon("reinforcedarmors" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
	public String getArmorTexture (ItemStack itemstack,  Entity entity, int slot, int layer){
		return texturePath;
	
	}
}
