package lavaarmor;

import java.util.logging.Level;

import lavaarmor.core.init.ItemInit;
import net.minecraft.entity.MobEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
 
public class EventHandler {
	
	@SubscribeEvent
	public static void onLivingAttackEvent(LivingAttackEvent event)
	{
		LavaArmor.LOGGER.info("event is here");
		if (event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.LAVA_HELMET.get()
				&& event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.LAVA_CHEST.get()
				&& event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.LAVA_LEGGINGS.get()
				&& event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.LAVA_BOOTS.get()) 
		{		
			//event.getSource().getTrueSource().getEntity().onKillCommand();
			
			 if (event.getSource().getTrueSource().getEntity() instanceof MobEntity) 
			 {
				 event.getSource().getTrueSource().getEntity().onKillCommand();
			 }
				 
		}

	}
}