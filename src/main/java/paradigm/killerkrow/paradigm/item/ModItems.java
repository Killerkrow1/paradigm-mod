package paradigm.killerkrow.paradigm.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import paradigm.killerkrow.paradigm.Paradigm;
import paradigm.killerkrow.paradigm.block.ModBlocks;
import paradigm.killerkrow.paradigm.fluid.ModFluids;
import paradigm.killerkrow.paradigm.fluid.VoydFluids;
import paradigm.killerkrow.paradigm.item.custom.*;

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
            () -> new SoulItem(new Item.Properties()));
    public static final RegistryObject<Item> SMILEY_NOTES = ITEMS.register("smiley_notes",
            () -> new SmileyNotesItem(new Item.Properties()));
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
            () -> new GodsEffigyItem(new Item.Properties()));
    public static final RegistryObject<Item> DEMIGODS_EFFIGY = ITEMS.register("demigods_effigy",
            () -> new DemigodsEffigyItem(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_EXTRACTOR = ITEMS.register("soul_extractor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GERO_FAVOR = ITEMS.register("gero_favor",
            () -> new GeroFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> ASTRAL_FAVOR = ITEMS.register("astral_favor",
            () -> new AstralFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> ATLAS_FAVOR = ITEMS.register("atlas_favor",
            () -> new AtlasFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> NOVINGARD_FAVOR = ITEMS.register("novingard_favor",
            () -> new NovingardFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> VELEN_FAVOR = ITEMS.register("velen_favor",
            () -> new VelenFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> TOGG_FAVOR = ITEMS.register("togg_favor",
            () -> new ToggFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> PUMPKIN_FAVOR = ITEMS.register("pumpkin_favor",
            () -> new PumpkinFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> UNKNOWN_FAVOR = ITEMS.register("unknown_favor",
            () -> new UnknownFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> ULTIMUS_FAVOR = ITEMS.register("ultimus_favor",
            () -> new UltimusFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> ISMENE_FAVOR = ITEMS.register("ismene_favor",
            () -> new IsmeneFavorItem(new Item.Properties()));
    public static final RegistryObject<Item> WEEPING_AMBROSIA = ITEMS.register("weeping_ambrosia",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTY_EFFIGY = ITEMS.register("empty_effigy",
            () -> new EmptyEffigyitem(new Item.Properties()));
    public static final RegistryObject<Item> AFTERLIFE_EFFIGY = ITEMS.register("afterlife_effigy",
            () -> new AfterlifeEffigyItem(new Item.Properties()));

    public static final RegistryObject<Item> DEAD_WATER_BUCKET = ITEMS.register("dead_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_DEAD_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> VOYD_ESSENCE_BUCKET = ITEMS.register("voyd_essence_bucket",
            () -> new BucketItem(VoydFluids.SOURCE_VOYD_ESSENCE_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> PINE_SIGN = ITEMS.register("pine_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PINE_SIGN.get(), ModBlocks.PINE_WALL_SIGN.get()));
    public static final RegistryObject<Item> PINE_HANGING_SIGN = ITEMS.register("pine_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
