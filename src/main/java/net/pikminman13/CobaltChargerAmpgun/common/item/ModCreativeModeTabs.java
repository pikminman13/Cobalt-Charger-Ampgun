package net.pikminman13.CobaltChargerAmpgun.common.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pikminman13.CobaltChargerAmpgun.CobaltChargerAmpgun;

import java.util.function.Supplier;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CobaltChargerAmpgun.MODID);

    public static final Supplier<CreativeModeTab> COBALT_CHARGER_AMPGUN_TAB = CREATIVE_MODE_TAB.register("cobalt_charger_ampgun_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMPGUN.get()))
                    .title(Component.translatable("creativetab.cobaltchargerampgun.cobalt_charger_ampgun"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AMPGUN);
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
