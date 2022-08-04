package com.kagaya_riku.kagaya.item.tool;

import com.kagaya_riku.kagaya.main.kagaya;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

//if adding tool, the tool class extend default toolItem class
public class ToolHojokinPickaxe extends PickaxeItem {


    /* p_42962 = toolの攻撃力補正                  */
    /* 実際の攻撃力 = 1 + tierの攻撃力 + toolの攻撃力 */
    /* p_42963 = toolの攻撃速度                    */
    /* 実際の攻撃速度 4 + toolの攻撃速度              */
    public ToolHojokinPickaxe() {

        /* This value is common in minecraft(Pickaxe) */
        super(kagayaTiers.HOJOKIN, 1, -2.8F, new Properties().tab(kagaya.KAGAYA_TAB).fireResistant());
        this.setRegistryName("hojokin_pickaxe");
    }

    /* モードごとの掘るスピード */
    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return switch (modeInt(stack)){
            case 0 -> BlockTags.MINEABLE_WITH_PICKAXE.contains(state.getBlock()) ? kagayaTiers.HOJOKIN.getSpeed() : 1.0F;
            case 1 -> BlockTags.MINEABLE_WITH_PICKAXE.contains(state.getBlock()) ? (kagayaTiers.HOJOKIN.getSpeed() * 3) : 1.0F;
            default -> 0F;
        };
    }

    @Override
    public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected) {

        /* 10秒ごとに5回復 */
        if (entity.tickCount % 200 == 0){
            stack.setDamageValue(stack.getDamageValue() - 5);
        }
    }

    /* アイテムを持ってるときに右クリックで発動 */
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        /* スニーク中なら発動 */
        if (player.isSteppingCarefully()){
            player.startUsingItem(hand);
            modeChange(stack);

            /* ホットバー切り替え時にモード表示 */
            player.displayClientMessage(new TextComponent("Mode:" + modeName(stack)), true);

            return InteractionResultHolder.consume(stack);
        }

        return InteractionResultHolder.pass(stack);
    }

    public void modeChange(ItemStack stack){
        if (stack.getTag() == null){
            stack.setTag(new CompoundTag());
        }
        stack.getTag().putInt("mode", modeInt(stack) < 1 ? modeInt(stack) + 1 : 0);
    }

    public int modeInt(ItemStack stack){

        if (stack.getTag() == null){
            return 0;
        }
        return stack.getTag().getInt("mode");
    }

    public String modeName(ItemStack stack){
        return switch (modeInt(stack)){
            case 0 -> "normal";
            case 1 -> "tactical";
            default -> null;
        };
    }

    /* インベントリ開いた時のテキスト */
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> list, TooltipFlag tooTip) {
        list.add(new TextComponent("Mode:" + modeName(stack)));
    }
}
