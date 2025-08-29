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
    public static final RegistryObject<Item> SOUL_ITEM = ITEMS.register("soul_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMILEY_NOTES = ITEMS.register("smiley_notes",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDEN_ORE = ITEMS.register("gilden_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDEN_INGOT = ITEMS.register("gilden_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MASK_OF_UNKNOWN_ITEM = ITEMS.register("mask_of_unknown_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TICKET = ITEMS.register("ticket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARRIAGE_RING = ITEMS.register("marriage_ring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPERIUM_INGOT = ITEMS.register("imperium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GODS_EFFIGY = ITEMS.register("gods_effigy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEMIGODS_EFFIGY = ITEMS.register("demigods_effigy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_EXTRACTOR = ITEMS.register("soul_extractor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOG_TRAINER = ITEMS.register("dog_trainer",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
