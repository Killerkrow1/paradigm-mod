package paradigm.killerkrow.paradigm.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SmileyNotesItem extends Item {
    public SmileyNotesItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        // Only send message on the server side to avoid double messages
        if (!level.isClientSide()) {
            player.sendSystemMessage(Component.literal("Ultimus, Aura, Seven, Mr. Pumpkin, Sally, Kingsman, Will, Kalon, Kizz, Shadow, Keres, Raven, Togg"));
        }

        // Returns success to indicate the action was performed
        return InteractionResultHolder.success(player.getItemInHand(hand));
    }
}