package lavaarmor.core.util;


import lavaarmor.LavaArmor;
import lavaarmor.client.render.entity.HotLavaRenderer;
import lavaarmor.common.items.HotLavaItem;
import lavaarmor.core.init.ItemInit;
import net.minecraft.entity.MobEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = LavaArmor.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	@SubscribeEvent
	public static void registerRenderers(final FMLClientSetupEvent event)
	{
	    GeoArmorRenderer.registerArmorRenderer(HotLavaItem.class, new HotLavaRenderer());
	}
	
	
	
}