package paradigm.killerkrow.paradigm.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import paradigm.killerkrow.paradigm.Paradigm;
import paradigm.killerkrow.paradigm.block.custom.ModHangingSignBlock;
import paradigm.killerkrow.paradigm.block.custom.ModStandingSignBlock;
import paradigm.killerkrow.paradigm.block.custom.ModWallHangingSignBlock;
import paradigm.killerkrow.paradigm.block.custom.ModWallSignBlock;
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
    public static final RegistryObject<Block> SOUL_LANTERN = registerBlock("soul_lantern",
            () -> new SoulLanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN).noOcclusion()));
    public static final RegistryObject<Block> BAG_OF_REVERENCE_BERRIES = registerBlock("bag_of_reverence_berries",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    public static final RegistryObject<LiquidBlock> DEAD_WATER_BLOCK = BLOCKS.register("dead_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_DEAD_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> VOYD_ESSENCE_BLOCK = BLOCKS.register("voyd_essence_block",
            () -> new LiquidBlock(VoydFluids.SOURCE_VOYD_ESSENCE_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<Block> PINE_SIGN = BLOCKS.register("pine_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), WoodType.OAK));
    public static final RegistryObject<Block> PINE_WALL_SIGN = BLOCKS.register("pine_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), WoodType.OAK));

    public static final RegistryObject<Block> PINE_HANGING_SIGN = BLOCKS.register("pine_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), WoodType.OAK));
    public static final RegistryObject<Block> PINE_WALL_HANGING_SIGN = BLOCKS.register("pine_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), WoodType.OAK));

    public static final RegistryObject<Block> PINE_PLANKS = registerBlock("pine_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

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
