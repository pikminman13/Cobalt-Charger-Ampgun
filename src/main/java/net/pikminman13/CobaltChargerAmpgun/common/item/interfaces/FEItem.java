package net.pikminman13.CobaltChargerAmpgun.common.item.interfaces;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.energy.IEnergyStorage;

public interface FEItem {

    default int getCharge(ItemStack stack) {
        IEnergyStorage energyStorage = stack.getCapability(Capabilities.EnergyStorage.ITEM);
        if (energyStorage == null) return -1;
        return energyStorage.getEnergyStored();
    }

    default float getChargeRatio(ItemStack stack) {
        IEnergyStorage energyStorage = stack.getCapability(Capabilities.EnergyStorage.ITEM);
        if (energyStorage == null) return 0;
        return (float) energyStorage.getEnergyStored() / energyStorage.getMaxEnergyStored();
    }

    default boolean energyDamageEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        IEnergyStorage energyStorage = stack.getCapability(Capabilities.EnergyStorage.ITEM);
        if (energyStorage == null) return false;
        energyStorage.extractEnergy(getMaxTransferRate() - 24, false);
        return true;
    }

    default int getPowerBarWidth(ItemStack stack) {
        IEnergyStorage energyStorage = stack.getCapability(Capabilities.EnergyStorage.ITEM);
        if (energyStorage == null) return 13;
        return Math.min(13 * energyStorage.getMaxEnergyStored() / energyStorage.getMaxEnergyStored(), 13);
    }

    default boolean isPowerBarVisible(ItemStack stack) {
        IEnergyStorage energyStorage = stack.getCapability(Capabilities.EnergyStorage.ITEM);
        if (energyStorage == null) return false;
        return energyStorage.getEnergyStored() < energyStorage.getMaxEnergyStored();
    }

    default int getPowerBarColor(ItemStack stack) {
        IEnergyStorage energyStorage = stack.getCapability(Capabilities.EnergyStorage.ITEM);
        if (energyStorage == null) return -1;
        return Mth.hsvToRgb(Math.max(0.0f, energyStorage.getEnergyStored() / (float) energyStorage.getMaxEnergyStored()) / 3.0f, 1.0f, 1.0f);
    }

    default boolean isEnergyBelowZero(ItemStack stack) {
        IEnergyStorage energyStorage = stack.getCapability(Capabilities.EnergyStorage.ITEM);
        if (energyStorage == null) return false;
        return energyStorage.getEnergyStored() != energyStorage.getMaxEnergyStored();
    }

    default int getMaxCapacity() {
        return 20000;
    }

    default int getMaxTransferRate() {
        return 100;
    }

    default int getMaxEnergy() {
        return 10000;
    }
}