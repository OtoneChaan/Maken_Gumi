package com.kagaya_riku.kagaya.item;

import com.kagaya_riku.kagaya.main.kagaya;
import net.minecraft.world.item.Item;

/* hojoIngot + 金Ingot = hojoKIngot です */
public class hojoKIngot extends Item {

    /* 補助金ゴットクラスのデフォルトコンストラクタ */
    public hojoKIngot() {

        super(new Properties().tab(kagaya.KAGAYA_TAB).fireResistant());

        this.setRegistryName("hojoK_Ingot");
    }
}
