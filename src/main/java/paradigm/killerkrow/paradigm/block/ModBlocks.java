package paradigm.killerkrow.paradigm.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import paradigm.killerkrow.paradigm.Paradigm;
import paradigm.killerkrow.paradigm.fluid.ModFluids;
import paradigm.killerkrow.paradigm.fluid.VoydFluids;
import paradigm.killerkrow.paradigm.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Paradigm.MODID);

    public static final RegistryObject<Block> VOYD_LIGHT = registerBlock("voyd_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> VOYD_DARKNESS = registerBlock("voyd_darkness",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> CASTIEL_SOUL_LANTERN = registerBlock("castiel_soul_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN).requiresCorrectToolForDrops().sound(SoundType.LANTERN)));

    public static final RegistryObject<LiquidBlock> DEAD_WATER_BLOCK = BLOCKS.register("dead_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_DEAD_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> VOYD_ESSENCE_BLOCK = BLOCKS.register("voyd_essence_block",
            () -> new LiquidBlock(VoydFluids.SOURCE_VOYD_ESSENCE_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
