package com.kagaya_riku.kagaya.item.tool;

import com.kagaya_riku.kagaya.main.kagaya;
import net.minecraft.world.item.SwordItem;

// if adding tool, the tool class extend default toolItem class
// Certain classes require the creation of a constructor when inherited
public class ToolHojokinSword extends SwordItem {

    public ToolHojokinSword(){

        /* This value is common in minecraft(Sword) */
        super(kagayaTiers.HOJOKIN, 3, -2.4F, new Properties().tab(kagaya.KAGAYA_TAB).fireResistant());
        this.setRegistryName("hojokin_sword");
    }
}
