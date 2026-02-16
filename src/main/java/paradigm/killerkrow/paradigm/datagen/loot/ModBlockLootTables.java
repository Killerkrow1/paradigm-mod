package paradigm.killerkrow.paradigm.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import paradigm.killerkrow.paradigm.block.ModBlocks;
import paradigm.killerkrow.paradigm.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {
            this.add(ModBlocks.PINE_SIGN.get(), block ->
    createSingleItemTable(ModItems.PINE_SIGN.get()));
        this.add(ModBlocks.PINE_WALL_SIGN.get(), block ->
    createSingleItemTable(ModItems.PINE_SIGN.get()));
        this.add(ModBlocks.PINE_HANGING_SIGN.get(), block ->
    createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));
        this.add(ModBlocks.PINE_WALL_HANGING_SIGN.get(), block ->
    createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));
}

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
