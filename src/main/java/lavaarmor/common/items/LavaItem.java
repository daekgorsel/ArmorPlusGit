package lavaarmor.common.items;

import java.util.Random;

import lavaarmor.core.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.item.Item.Properties;

public class LavaItem extends ArmorItem {
	final Random random = new Random();
 
	public LavaItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
	
		if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.LAVA_HELMET.get()
				&& player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.LAVA_CHEST.get()
				&& player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.LAVA_LEGGINGS.get()
				&& player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.LAVA_BOOTS.get()) 
		{			world.addParticle(ParticleTypes.LAVA, (double) player.prevPosX, (double) player.prevPosY + 0.15D,
					(double) player.prevPosZ, 0.01D, 0.01D, 0.01D);

			

		}
		
		
	}

}
