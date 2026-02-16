package paradigm.killerkrow.paradigm.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import org.jetbrains.annotations.Nullable;
import paradigm.killerkrow.paradigm.item.ModItems;

import java.util.List;

public class GodsEffigyItem extends Item {
    public GodsEffigyItem(Item.Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (!level.isClientSide() && entity instanceof Player player) {
            // Apply effect (e.g., Night Vision) for 2 seconds (40 ticks)
            // every tick they have it, preventing it from running out
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 3, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 3, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 3, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 3, false, false));
        }
        super.inventoryTick(stack, level, entity, slotId, isSelected);
    }


@Override
public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
    pTooltipComponents.add(Component.translatable("tooltip.paradigm.gods_effigy.tooltip"));
    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
}

    /**
     * Returns {@code true} if this item has an enchantment glint. By default, this returns
     * <code>stack.isItemEnchanted()</code>, but other items can override it (for instance, written books always return
     * true).
     *
     * Note that if you override this method, you generally want to also call the super version (on {@link Item}) to get
     * the glint for enchanted items. Of course, that is unnecessary if the overwritten version always returns true.
     */
    public boolean isFoil(ItemStack pStack) {
        return true;
    }
}