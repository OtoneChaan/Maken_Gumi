package com.kagaya_riku.kagaya.regi;

import com.kagaya_riku.kagaya.item.hojoKIngot;
import com.kagaya_riku.kagaya.item.kagayaIngot;
import com.kagaya_riku.kagaya.item.tool.ToolHojokinPickaxe;
import com.kagaya_riku.kagaya.item.tool.ToolHojokinSword;
import com.kagaya_riku.kagaya.main.kagaya;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/* kagayaで追加されるアイテムを登録するクラスです */
@ObjectHolder(kagaya.MOD_ID)
public class kagayaItems {

    public static final kagayaIngot hojoIngot = new kagayaIngot();
    public static final hojoKIngot hojoKIngot = new hojoKIngot();
    public static final ToolHojokinPickaxe hojokinpickaxe = new ToolHojokinPickaxe();
    public static final ToolHojokinSword hojokinsword = new ToolHojokinSword();

    @Mod.EventBusSubscriber(modid = kagaya.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Resister{

        /* アイテム登録メソッド */
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            /* 作ったアイテムを登録するときはここに入れる。インスタンス変数(アイテム)) */
            final Item[] items = {
                    hojoIngot,
                    hojoKIngot,
                    hojokinpickaxe,
                    hojokinsword
            };

            /* ここで追加 */
            event.getRegistry().registerAll(items);
        }
    }
}
