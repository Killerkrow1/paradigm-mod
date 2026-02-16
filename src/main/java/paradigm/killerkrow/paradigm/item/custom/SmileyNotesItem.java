package paradigm.killerkrow.paradigm.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SmileyNotesItem extends Item {
    public SmileyNotesItem(Properties properties) {
        super(properties);
    }

    public boolean isFoil(ItemStack pStack) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.paradigm.smiley_notes.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        // Only send message on the server side to avoid double messages
        if (!level.isClientSide()) {
            player.sendSystemMessage(Component.literal("Ultimus, Aura, Seven, Mr. Pumpkin, Sally, Kingsman, Will, Kalon, Kizz, Shadow, Keres, Raven, Togg, Athens"));
        }

        // Returns success to indicate the action was performed
        return InteractionResultHolder.success(player.getItemInHand(hand));
    }
}