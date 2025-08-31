package paradigm.killerkrow.paradigm.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import paradigm.killerkrow.paradigm.Paradigm;
import paradigm.killerkrow.paradigm.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Paradigm.MODID);

    public static final RegistryObject<CreativeModeTab> Paradigm_TAB = CREATIVE_MODE_TABS.register("paradigm_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASTRAVEN_LEAF.get()))
                    .title(Component.translatable("creativetab.paradigm_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.ASTRAVEN_LEAF.get());
                        output.accept(ModItems.TICKET.get());
                        output.accept(ModItems.MARRIAGE_RING.get());
                        output.accept(ModItems.IMPERIUM_INGOT.get());
                        output.accept(ModItems.DEMIGODS_EFFIGY.get());
                        output.accept(ModItems.GODS_EFFIGY.get());
                        output.accept(ModItems.DEAD_WATER_BUCKET.get());
                        output.accept(ModItems.VOYD_ESSENCE_BUCKET.get());
                        output.accept(ModItems.ATLAS_FAVOR.get());
                        output.accept(ModItems.NOVINGARD_FAVOR.get());
                        output.accept(ModItems.ASTRAL_FAVOR.get());
                        output.accept(ModItems.GERO_FAVOR.get());
                        output.accept(ModItems.ISMENE_FAVOR.get());
                        output.accept(ModItems.ULTIMUS_FAVOR.get());
                        output.accept(ModItems.UNKNOWN_FAVOR.get());
                        output.accept(ModItems.PUMPKIN_FAVOR.get());
                        output.accept(ModItems.GABRIEL_FAVOR.get());
                        output.accept(ModItems.VELEN_FAVOR.get());
                        output.accept(ModItems.TOGG_FAVOR.get());

                        output.accept(ModBlocks.VOYD_LIGHT.get());
                        output.accept(ModBlocks.VOYD_DARKNESS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Disc_TAB = CREATIVE_MODE_TABS.register("disc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASTRAVEN_LEAF.get()))
                    .title(Component.translatable("creativetab.disc_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASTRAVEN_LEAF.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Afterlife_TAB = CREATIVE_MODE_TABS.register("afterlife_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SMILE_ITEM.get()))
                    .title(Component.translatable("creativetab.afterlife_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SMILEY_NOTES.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Gilden_TAB = CREATIVE_MODE_TABS.register("gilden_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GILDEN_INGOT.get()))
                    .title(Component.translatable("creativetab.gilden_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GILDEN_ORE.get());
                        output.accept(ModItems.GILDEN_INGOT.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Mask_TAB = CREATIVE_MODE_TABS.register("mask_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MASK_OF_UNKNOWN_ITEM.get()))
                    .title(Component.translatable("creativetab.mask_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MASK_OF_UNKNOWN_ITEM.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Paradigm_Cooking_TAB = CREATIVE_MODE_TABS.register("paradigm_cooking_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASTRAVEN_LEAF.get()))
                    .title(Component.translatable("creativetab.paradigm_cooking_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASTRAVEN_LEAF.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Plushie_TAB = CREATIVE_MODE_TABS.register("plushie_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASTRAVEN_LEAF.get()))
                    .title(Component.translatable("creativetab.plushie_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASTRAVEN_LEAF.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Soul_Items_TAB = CREATIVE_MODE_TABS.register("soul_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SOUL_ITEM.get()))
                    .title(Component.translatable("creativetab.soul_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SOUL_ITEM.get());
                        output.accept(ModItems.SOUL_EXTRACTOR.get());
                        output.accept(ModBlocks.SOUL_LANTERN.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> WIP_TAB = CREATIVE_MODE_TABS.register("wip_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NULL_ITEM.get()))
                    .title(Component.translatable("creativetab.wip_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SMILE_ITEM.get());
                        output.accept(ModItems.NULL_ITEM.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
