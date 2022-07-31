package net.overtek.pingoo.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.overtek.pingoo.Pingoo;
import net.overtek.pingoo.entity.custom.PenguinEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PenguinModel extends AnimatedGeoModel<PenguinEntity> {
    @Override
    public ResourceLocation getModelResource(PenguinEntity object) {
        return new ResourceLocation(Pingoo.MOD_ID,"geo/penguin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PenguinEntity object) {
        return new ResourceLocation(Pingoo.MOD_ID,"textures/entity/penguin/penguin.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PenguinEntity animatable) {
        return new ResourceLocation(Pingoo.MOD_ID,"animations/penguin.animation.json");
    }
}
