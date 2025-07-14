package paradigm.killerkrow.paradigm.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import paradigm.killerkrow.paradigm.Paradigm;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Paradigm.MODID);

    public static final RegistryObject<CreativeModeTab> Paradigm_TAB = CREATIVE_MODE_TABS.register("paradigm_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ASTRAVEN.get()))
                    .title(Component.translatable("creativetab.paradigm_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ASTRAVEN.get());
                        output.accept(ModItems.ASTRAVEN_LEAF.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
