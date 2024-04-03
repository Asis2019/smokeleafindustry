package net.micaxs.smokeleafindustry.block;

import net.micaxs.smokeleafindustry.SmokeleafIndustryMod;
import net.micaxs.smokeleafindustry.block.custom.*;
import net.micaxs.smokeleafindustry.fluid.ModFluids;
import net.micaxs.smokeleafindustry.item.ModItems;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SmokeleafIndustryMod.MOD_ID);



    // Weed Crop Variants
    public static final RegistryObject<Block> WHITE_WIDOW_CROP = BLOCKS.register("white_widow_crop",
            () -> new BaseWeedCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission(), ModItems::getWhiteWidowSeeds));
    public static final RegistryObject<Block> BUBBLE_KUSH_CROP = BLOCKS.register("bubble_kush_crop",
            () -> new BaseWeedCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission(), ModItems::getBubbleKushSeeds));
    public static final RegistryObject<Block> LEMON_HAZE_CROP = BLOCKS.register("lemon_haze_crop",
            () -> new BaseWeedCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission(), ModItems::getLemonHazeSeeds));
    public static final RegistryObject<Block> SOUR_DIESEL_CROP = BLOCKS.register("sour_diesel_crop",
            () -> new BaseWeedCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission(), ModItems::getSourDieselSeeds));
    public static final RegistryObject<Block> BLUE_ICE_CROP = BLOCKS.register("blue_ice_crop",
            () -> new BaseWeedCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission(), ModItems::getBlueIceSeeds));
    public static final RegistryObject<Block> BUBBLEGUM_CROP = BLOCKS.register("bubblegum_crop",
            () -> new BaseWeedCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission(), ModItems::getBubblegumSeeds));


    // Machines
    public static final RegistryObject<Block> HERB_GRINDER_STATION = registerBlock("herb_grinder_station",
            () -> new HerbGrinderStationBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> HERB_EXTRACTOR = registerBlock("herb_extractor",
            () -> new HerbExtractorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> HERB_GENERATOR = registerBlock("herb_generator",
            () -> new HerbGeneratorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> HERB_MUTATION = registerBlock("herb_mutation",
            () -> new HerbMutationBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));



    // Custom Modded Blocks
    public static final RegistryObject<Block> HEMP_STONE = registerBlock("hemp_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HEMP_PLANKS = registerBlock("hemp_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));



    // Fluid Stuff
    public static final RegistryObject<LiquidBlock> HASH_OIL_BLOCK = BLOCKS.register("hash_oil_block",
            () -> new LiquidBlock(ModFluids.SOURCE_HASH_OIL, BlockBehaviour.Properties.copy(Blocks.WATER)));



    // Other Shit
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        System.out.println("Registering block: " + name);
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        System.out.println("Registering block item: " + name);
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public  static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
