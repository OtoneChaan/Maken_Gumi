package com.kagaya_riku.kagaya.item;

import com.kagaya_riku.kagaya.main.kagaya;
import net.minecraft.world.item.Item;


public class kagayaIngot extends Item {

    /* hojoIngotのデフォルトコンストラクタ */
    public kagayaIngot() {

        /* mainクラスで作製したCreativeModTabクラスのインスタンス変数を設定 */
        /* ...TAB).の後ろに来るのは継承元のメソッド（セッター、ゲッター）これで属性が決まる */
        /* Item.Properties型        下はインベントリのタブをどこにするか*/
        super(new Properties().tab(kagaya.KAGAYA_TAB).fireResistant());


        this.setRegistryName("hojo_ingot");
    }
}
