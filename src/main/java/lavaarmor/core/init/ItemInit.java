package lavaarmor.core.init;


import lavaarmor.LavaArmor;
import lavaarmor.common.items.HotLavaItem;
import lavaarmor.common.items.LavaItem;
import lavaarmor.common.material.LavaMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			LavaArmor.MODID); 
	
	public static final RegistryObject<Item> JADE_INGOT = ITEMS.register("jade_ingot", 
			() -> new Item(new Item.Properties().group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> LAVA_BOOTS = ITEMS.register("lava_boots", 
			() -> new HotLavaItem(LavaMaterial.LAVA_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> LAVA_LEGGINGS = ITEMS.register("lava_leggings", 
			() -> new HotLavaItem(LavaMaterial.LAVA_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> LAVA_CHEST = ITEMS.register("lava_chest", 
			() -> new HotLavaItem(LavaMaterial.LAVA_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> LAVA_HELMET = ITEMS.register("lava_helmet", 
			() -> new HotLavaItem(LavaMaterial.LAVA_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ItemGroup.COMBAT)));
}
