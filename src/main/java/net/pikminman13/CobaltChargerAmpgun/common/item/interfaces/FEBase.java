/*package net.pikminman13.CobaltChargerAmpgun.common.item.interfaces;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.pikminman13.CobaltChargerAmpgun.common.item.interfaces.FEItem;

import java.util.List;

public abstract class FEBase extends Item {
    public FEBase(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag flagIn) {
        super.appendHoverText(stack, context, tooltip, flagIn);
        Level level = context.level();
        if (level == null) {
            return;
        }

    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        if (stack.getItem() instanceof FEItem RFItem) {
            return FEItem.isPowerBarVisible(stack);
        }
        return super.isBarVisible(stack);
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        if (stack.getItem() instanceof FEBase RFItem) {
            return FEItem.getPowerBarWidth(stack);
        }
        return super.getBarWidth(stack);
    }

    @Override
    public int getBarColor(ItemStack stack) {
        if (stack.getItem() instanceof FEBase RFItem) {
            int color = FEItem.getPowerBarColor(stack);
            if (color == -1)
                return super.getBarColor(stack);
            return color;
        }
        return super.getBarColor(stack);
    }

}*/