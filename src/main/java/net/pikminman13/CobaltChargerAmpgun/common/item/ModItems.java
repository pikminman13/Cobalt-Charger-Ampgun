package net.pikminman13.CobaltChargerAmpgun.common.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pikminman13.CobaltChargerAmpgun.CobaltChargerAmpgun;
import net.pikminman13.CobaltChargerAmpgun.common.item.custom.AmpgunItem;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobaltChargerAmpgun.MODID);

    public static final DeferredItem<Item> AMPGUN = ITEMS.register("ampgun", AmpgunItem::new);

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
