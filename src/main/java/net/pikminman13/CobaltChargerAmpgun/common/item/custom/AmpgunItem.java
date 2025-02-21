package net.pikminman13.CobaltChargerAmpgun.common.item.custom;

import net.neoforged.neoforge.common.property.Properties;
import net.pikminman13.CobaltChargerAmpgun.common.item.interfaces.FEBase;
import net.pikminman13.CobaltChargerAmpgun.common.item.interfaces.FEItem;

public class AmpgunItem extends FEBase implements FEItem {

    public AmpgunItem() {
        super(new Properties()
                .stacksTo(1));

    }
}

