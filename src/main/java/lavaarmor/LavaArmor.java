package lavaarmor;

import java.beans.EventHandler;
import java.util.logging.Logger;

 
import lavaarmor.client.render.entity.HotLavaRenderer;
import lavaarmor.common.items.HotLavaItem;
import lavaarmor.core.init.ItemInit;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


@Mod(LavaArmor.MODID)
public class LavaArmor {
	public static final String MODID = "lavaarmor";
	public static final Logger LOGGER = Logger.getLogger(LavaArmor.class.getName());
	
	public LavaArmor() {
		LOGGER.info("loger is here");
		GeckoLib.initialize();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		bus.addListener(this::setup);
		ItemInit.ITEMS.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
	 	MinecraftForge.EVENT_BUS.register(EventHandler.class);
	}
	
	
	
	@SuppressWarnings("deprecation")
	private void setup(final FMLCommonSetupEvent event) {
		
		DeferredWorkQueue.runLater(() -> {
			//GlobalEntityTypeAttributes.put(EntityTypeInit.EXAMPLE.get(), ExampleEntity.setAttributes().create());
		});
		
	}
}





