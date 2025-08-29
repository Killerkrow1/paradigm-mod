package paradigm.killerkrow.paradigm.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import paradigm.killerkrow.paradigm.Paradigm;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Paradigm.MODID);

    public static final RegistryObject<Item> ASTRAVEN_LEAF = ITEMS.register("astraven_leaf",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMILE_ITEM = ITEMS.register("smile_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NULL_ITEM = ITEMS.register("null_item",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
