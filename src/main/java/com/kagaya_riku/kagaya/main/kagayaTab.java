package com.kagaya_riku.kagaya.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class kagayaTab extends CreativeModeTab {

    public kagayaTab() {
        super("kagaya_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.DIAMOND);
    }
}
