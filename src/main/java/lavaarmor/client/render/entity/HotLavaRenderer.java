package lavaarmor.client.render.entity;

import lavaarmor.client.render.model.HotLavaModel;
import lavaarmor.common.items.HotLavaItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HotLavaRenderer extends GeoArmorRenderer<HotLavaItem>
{
    public HotLavaRenderer()
    {
        super(new HotLavaModel());

        //These values are what each bone name is in blockbench. So if your head bone is named "bone545", 
        // make sure to do this.headBone = "bone545";

        // The default values are the ones that come with the default armor template in the geckolib blockbench plugin.
        this.headBone = "head";
        this.bodyBone = "body";
        this.rightArmBone = "right_arm";
        this.leftArmBone = "left_arm";
        this.rightLegBone = "right_leg";
        this.leftLegBone = "left_leg";
        this.rightBootBone = "right_boot";
        this.leftBootBone = "left_boot";
    }
}