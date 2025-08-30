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

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("fluid/dead_water");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("fluid/dead_water");
    public static final ResourceLocation SOAP_OVERLAY_RL = new ResourceLocation(Paradigm.MODID, "fluid/dead_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Paradigm.MODID);

    public static final RegistryObject<FluidType> DEAD_WATER_FLUID_TYPE = register("dead_water_fluid",
            FluidType.Properties.create().lightLevel(0).density(1400).viscosity(2000).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));

    public static final RegistryObject<FluidType> VOYD_ESSENCE_FLUID_TYPE = register("voyd_assense_fluid",
            FluidType.Properties.create().lightLevel(0).density(1400).viscosity(2000).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));


    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, SOAP_OVERLAY_RL,
                0xA12c2c2c, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
