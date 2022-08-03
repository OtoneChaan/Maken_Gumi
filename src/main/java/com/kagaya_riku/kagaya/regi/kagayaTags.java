package com.kagaya_riku.kagaya.regi;

import com.kagaya_riku.kagaya.main.kagaya;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

/* tag追加クラス */
public class kagayaTags {

    public static class Blocks {

        /* "needs_kagaya_tool"にタグを追加していく */
        public static final Tags.IOptionalNamedTag NEEDS_KAGAYA_TOOL = tag("needs_kagaya_tool");

        /* 引数：tagの名前 */
        private static final Tags.IOptionalNamedTag<Block> tag(String name){
            return BlockTags.createOptional(new ResourceLocation(kagaya.MOD_ID, name));
        }
    }

    public static class Items {

        /* 引数：tagの名前 */
        private static final Tags.IOptionalNamedTag<Item> tag(String name){
            return ItemTags.createOptional(new ResourceLocation(kagaya.MOD_ID, name));
        }
    }
}
