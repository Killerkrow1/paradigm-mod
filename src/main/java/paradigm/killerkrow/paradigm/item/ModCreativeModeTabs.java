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

                        output.accept(ModBlocks.VOYD_LIGHT.get());
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
                        output.accept(ModItems.ASTRAVEN_LEAF.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Gilden_TAB = CREATIVE_MODE_TABS.register("gilden_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASTRAVEN_LEAF.get()))
                    .title(Component.translatable("creativetab.gilden_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASTRAVEN_LEAF.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Mask_TAB = CREATIVE_MODE_TABS.register("mask_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASTRAVEN_LEAF.get()))
                    .title(Component.translatable("creativetab.mask_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASTRAVEN_LEAF.get());
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
                    .title(Component.translatable("creativetab.plushie_cooking_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASTRAVEN_LEAF.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Soul_Items_TAB = CREATIVE_MODE_TABS.register("soul_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASTRAVEN_LEAF.get()))
                    .title(Component.translatable("creativetab.soul_items_cooking_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASTRAVEN_LEAF.get());
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
