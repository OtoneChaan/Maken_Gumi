package com.kagaya_riku.kagaya.item;

import com.kagaya_riku.kagaya.main.kagaya;
import net.minecraft.world.item.Item;


public class kagayaIngot extends Item {

    public kagayaIngot() {

        /* mainクラスで作製したCreativeModTabクラスのインスタンス変数を設定 */
        /* ...TAB).の後ろに来るのは継承元のメソッド（セッター、ゲッター）これで属性が決まる */
        /* これはoverrideではなくコンストラクタです */
        super(new Properties().tab(kagaya.KAGAYA_TAB).fireResistant());

        this.setRegistryName("kagaya_ingot");
    }
}
