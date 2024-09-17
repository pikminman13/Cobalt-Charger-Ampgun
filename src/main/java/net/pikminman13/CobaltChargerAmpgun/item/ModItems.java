package net.pikminman13.CobaltChargerAmpgun.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pikminman13.CobaltChargerAmpgun.CobaltChargerAmpgun;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobaltChargerAmpgun.MODID);

    public static final DeferredItem<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
