package net.overtek.pingoo.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.overtek.pingoo.entity.ModEntityTypes;
import net.overtek.pingoo.entity.custom.PenguinEntity;

public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.PENGUIN.get(), PenguinEntity.setAttributes());
    }
}
