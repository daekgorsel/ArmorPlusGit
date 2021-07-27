package lavaarmor.client.render.model;

import lavaarmor.LavaArmor;
import lavaarmor.common.items.HotLavaItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.example.item.JackInTheBoxItem;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HotLavaModel extends AnimatedGeoModel<HotLavaItem>
{
    @Override
    public ResourceLocation getModelLocation(HotLavaItem object)
    {
        return new ResourceLocation(LavaArmor.MODID, "geo/lava.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HotLavaItem object)
    {
        return new ResourceLocation(LavaArmor.MODID, "textures/item/lava.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HotLavaItem object)
    {
        return new ResourceLocation(LavaArmor.MODID, "animations/lava.animation.json");
    }
}
