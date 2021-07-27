package lavaarmor.common.material;

import java.util.function.Supplier;

import lavaarmor.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;


public enum LavaMaterial implements IArmorMaterial {
	 
	LAVA_ARMOR("lava", 9900, new int[] {4, 5, 6, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 
			99f, 12.5f, () -> Ingredient.fromItems(Items.LAVA_BUCKET));
 
	private static final int[] baseDurability = { 128, 144, 169, 112};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal; //boots leggings chest helmet
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistence;
	private final Ingredient repairIngredient;
	
	LavaMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability, 
			SoundEvent equipSound, float toughness, float knockbackResistence, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier =durabilityMultiplier;
		this.armorVal = armorVal; 
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistence = knockbackResistence;
		this.repairIngredient = repairIngredient.get();
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return this.baseDurability[slotIn.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return this.armorVal[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		// TODO Auto-generated method stub
		return this.equipSound;
		}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairIngredient;
		}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return this.knockbackResistence;
	}

}
