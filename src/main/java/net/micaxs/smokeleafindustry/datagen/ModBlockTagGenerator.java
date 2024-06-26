package net.micaxs.smokeleafindustry.datagen;

import net.micaxs.smokeleafindustry.SmokeleafIndustryMod;
import net.micaxs.smokeleafindustry.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SmokeleafIndustryMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.HERB_GRINDER_STATION.get())
                .add(ModBlocks.HERB_EXTRACTOR.get())
                .add(ModBlocks.HERB_GENERATOR.get())
                .add(ModBlocks.HERB_EVAPORATOR.get())
                .add(ModBlocks.HERB_MUTATION.get())
                .add(ModBlocks.HEMP_WEAVER.get())
                .add(ModBlocks.HEMP_SPINNER.get())
                .add(ModBlocks.HEMP_STONE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.HERB_GRINDER_STATION.get())
                .add(ModBlocks.HERB_EXTRACTOR.get())
                .add(ModBlocks.HERB_GENERATOR.get())
                .add(ModBlocks.HERB_EVAPORATOR.get())
                .add(ModBlocks.HERB_MUTATION.get())
                .add(ModBlocks.HEMP_WEAVER.get())
                .add(ModBlocks.HEMP_SPINNER.get())
                .add(ModBlocks.HEMP_STONE.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.HEMP_PLANKS.get());

        this.tag(BlockTags.CROPS)
                .add(ModBlocks.BLUE_ICE_CROP.get())
                .add(ModBlocks.BUBBLE_KUSH_CROP.get())
                .add(ModBlocks.BUBBLEGUM_CROP.get())
                .add(ModBlocks.LEMON_HAZE_CROP.get())
                .add(ModBlocks.PURPLE_HAZE_CROP.get())
                .add(ModBlocks.SOUR_DIESEL_CROP.get())
                .add(ModBlocks.WHITE_WIDOW_CROP.get());
    }
}
