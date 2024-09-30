package net.pikminman13.CobaltChargerAmpgun.common.item.custom;

import net.pikminman13.CobaltChargerAmpgun.common.item.interfaces.FEItem;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.energy.IEnergyStorage;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class AmpgunItem implements FEItem {
    public AmpgunItem() {
        super();

        @Override
        public int getBarWidth(ItemStack stack){
            return getEnergyBarWidth(stack);
        }

        @Override
        public int getBarColor(ItemStack stack){
            return getEnergyBarColor(stack);
        }

        @Override
        public boolean isDamaged(ItemStack stack){
            return isEnergyBelowZero(stack);
        }

        @Override
        public boolean isBarVisible(ItemStack stack){
            return isEnergyBarVisible(stack);

        }
    }

}
