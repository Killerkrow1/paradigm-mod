package paradigm.killerkrow.paradigm.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SoulItem extends Item {
    public SoulItem(Item.Properties pProperties) {
        super(pProperties);
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
