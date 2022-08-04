package com.kagaya_riku.kagaya.item.tool;

import com.kagaya_riku.kagaya.main.kagaya;
import com.kagaya_riku.kagaya.regi.kagayaTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class kagayaTiers {

    /* アイテムのティアを設定(耐久度とか) */
    public static final ForgeTier HOJOKIN = new ForgeTier(5, 3000, 15F, 10F, 50, kagayaTags.Blocks.NEEDS_KAGAYA_TOOL,()-> Ingredient.of(Items.DIAMOND));

    /* ティアの登録 */
    static {
        TierSortingRegistry.registerTier(HOJOKIN, new ResourceLocation(kagaya.MOD_ID, "hojokin"), List.of(TierSortingRegistry.getName(Tiers.NETHERITE)), List.of());
    }
}
