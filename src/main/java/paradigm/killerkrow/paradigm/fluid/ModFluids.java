package paradigm.killerkrow.paradigm.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import paradigm.killerkrow.paradigm.Paradigm;
import paradigm.killerkrow.paradigm.block.ModBlocks;
import paradigm.killerkrow.paradigm.item.ModItems;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Paradigm.MODID);

    public static final RegistryObject<FlowingFluid> SOURCE_DEAD_WATER = FLUIDS.register("dead_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DEAD_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DEAD_WATER = FLUIDS.register("flowing_dead_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DEAD_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties DEAD_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.DEAD_WATER_FLUID_TYPE, SOURCE_DEAD_WATER, FLOWING_DEAD_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(1).tickRate(25).block(ModBlocks.DEAD_WATER_BLOCK).bucket(ModItems.DEAD_WATER_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
