package paradigm.killerkrow.paradigm.event;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import paradigm.killerkrow.paradigm.block.entity.renderer.ModBlockEntities;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;

public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
}
}