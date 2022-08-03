package com.kagaya_riku.kagaya.regi;

import com.kagaya_riku.kagaya.item.kagayaIngot;
import com.kagaya_riku.kagaya.main.kagaya;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(kagaya.MOD_ID)
public class kagayaItems {

    public static final kagayaIngot kagaya_ingot = new kagayaIngot();

    @Mod.EventBusSubscriber(modid = kagaya.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Resister{

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] items = {
                    kagaya_ingot
            };

            event.getRegistry().registerAll(items);
        }
    }
}
