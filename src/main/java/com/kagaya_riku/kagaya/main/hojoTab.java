package com.kagaya_riku.kagaya.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/* クリエイティブでインベントリ開いた時の大分類 */
public class hojoTab extends CreativeModeTab {

    /* ここはタブの名前 */
    public hojoTab() {
        super("MPH_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.DIAMOND);
    }
}