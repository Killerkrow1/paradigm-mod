package paradigm.killerkrow.paradigm.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;
import paradigm.killerkrow.paradigm.Paradigm;

public class VoydEssenceFluid {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation(Paradigm.MODID,"block/voydla_creek_essence");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation(Paradigm.MODID,"block/voydla_creek_essence");
    public static final ResourceLocation SOAP_OVERLAY_RL = new ResourceLocation(Paradigm.MODID, "misc/in_soap_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Paradigm.MODID);

    public static final RegistryObject<FluidType> VOYD_ESSENCE_FLUID_TYPE = register("voyd_essence_fluid",
            FluidType.Properties.create().lightLevel(0).density(1400).viscosity(2000).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));


    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, SOAP_OVERLAY_RL,
                0xA15c149c, new Vector3f(224f / 20f, 56f / 20f, 208f / 20f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
