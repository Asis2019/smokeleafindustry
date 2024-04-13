package net.micaxs.smokeleafindustry.item;

import net.micaxs.smokeleafindustry.SmokeleafIndustryMod;
import net.micaxs.smokeleafindustry.block.ModBlocks;
import net.micaxs.smokeleafindustry.fluid.ModFluids;
import net.micaxs.smokeleafindustry.item.custom.*;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SmokeleafIndustryMod.MOD_ID);


    /* Weed Buds, Weed & Seeds */
    // White Widow
    public static final RegistryObject<Item> WHITE_WIDOW_SEEDS = ITEMS.register("white_widow_seeds",
            () -> new ItemNameBlockItem(ModBlocks.WHITE_WIDOW_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_WIDOW_BUD = ITEMS.register("white_widow_bud",
            () -> new BaseBudItem(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_WIDOW_WEED = ITEMS.register("white_widow_weed",
            () -> new BaseWeedItem(new Item.Properties(), MobEffects.REGENERATION, 400, 1, 15, 12));


    // Bubble Kush
    public static final RegistryObject<Item> BUBBLE_KUSH_SEEDS = ITEMS.register("bubble_kush_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BUBBLE_KUSH_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> BUBBLE_KUSH_BUD = ITEMS.register("bubble_kush_bud",
            () -> new BaseBudItem(new Item.Properties()));
    public static final RegistryObject<Item> BUBBLE_KUSH_WEED = ITEMS.register("bubble_kush_weed",
            () -> new BaseWeedItem(new Item.Properties(), MobEffects.DIG_SPEED, 400, 1, 20, 6));


    // Lemon Haze
    public static final RegistryObject<Item> LEMON_HAZE_SEEDS = ITEMS.register("lemon_haze_seeds",
            () -> new ItemNameBlockItem(ModBlocks.LEMON_HAZE_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEMON_HAZE_BUD = ITEMS.register("lemon_haze_bud",
            () -> new BaseBudItem(new Item.Properties()));
    public static final RegistryObject<Item> LEMON_HAZE_WEED = ITEMS.register("lemon_haze_weed",
            () -> new BaseWeedItem(new Item.Properties(), MobEffects.JUMP, 400, 1, 19, 8));

    // Sour Diesel
    public static final RegistryObject<Item> SOUR_DIESEL_SEEDS = ITEMS.register("sour_diesel_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SOUR_DIESEL_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> SOUR_DIESEL_BUD = ITEMS.register("sour_diesel_bud",
            () -> new BaseBudItem(new Item.Properties()));
    public static final RegistryObject<Item> SOUR_DIESEL_WEED = ITEMS.register("sour_diesel_weed",
            () -> new BaseWeedItem(new Item.Properties(), MobEffects.SATURATION, 400, 1, 19, 0));

    // Blue Ice
    public static final RegistryObject<Item> BLUE_ICE_SEEDS = ITEMS.register("blue_ice_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUE_ICE_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ICE_BUD = ITEMS.register("blue_ice_bud",
            () -> new BaseBudItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ICE_WEED = ITEMS.register("blue_ice_weed",
            () -> new BaseWeedItem(new Item.Properties(), MobEffects.LUCK, 400, 1, 20, 10));

    // Bubblegum
    public static final RegistryObject<Item> BUBBLEGUM_SEEDS = ITEMS.register("bubblegum_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BUBBLEGUM_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> BUBBLEGUM_BUD = ITEMS.register("bubblegum_bud",
            () -> new BaseBudItem(new Item.Properties()));
    public static final RegistryObject<Item> BUBBLEGUM_WEED = ITEMS.register("bubblegum_weed",
            () -> new BaseWeedItem(new Item.Properties(), MobEffects.LEVITATION, 20, 1, 17, 8));

    // Purple Haze
    public static final RegistryObject<Item> PURPLE_HAZE_SEEDS = ITEMS.register("purple_haze_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PURPLE_HAZE_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_HAZE_BUD = ITEMS.register("purple_haze_bud",
            () -> new BaseBudItem(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_HAZE_WEED = ITEMS.register("purple_haze_weed",
            () -> new BaseWeedItem(new Item.Properties(), MobEffects.INVISIBILITY, 400, 1, 16, 0));



    /* Extracts */
    public static final RegistryObject<Item> BLUE_ICE_EXTRACT = ITEMS.register("blueice_extract",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BUBBLEGUM_EXTRACT = ITEMS.register("bubblegum_extract",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BUBBLE_KUSH_EXTRACT = ITEMS.register("bubblekush_extract",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> LEMON_HAZE_EXTRACT = ITEMS.register("lemonhaze_extract",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> PURPLE_HAZE_EXTRACT = ITEMS.register("purplehaze_extract",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SOUR_DIESEL_EXTRACT = ITEMS.register("sourdiesel_extract",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> WHITE_WIDOW_EXTRACT = ITEMS.register("whitewidow_extract",
            () -> new Item(new Item.Properties().stacksTo(64)));


    /* Baggies */
    public static final RegistryObject<Item> EMPTY_BAG = ITEMS.register("empty_bag",
            () -> new BaseBagItem(new Item.Properties().stacksTo(64), "tooltip.smokeleafindustry.empty_bag"));
    public static final RegistryObject<Item> WHITE_WIDOW_BAG = ITEMS.register("white_widow_bag",
            () -> new BaseBagItem(new Item.Properties().stacksTo(64), "tooltip.smokeleafindustry.white_widow_bag"));
    public static final RegistryObject<Item> BLUE_ICE_BAG = ITEMS.register("blue_ice_bag",
            () -> new BaseBagItem(new Item.Properties().stacksTo(64), "tooltip.smokeleafindustry.blue_ice_bag"));
    public static final RegistryObject<Item> BUBBLEGUM_BAG = ITEMS.register("bubblegum_bag",
            () -> new BaseBagItem(new Item.Properties().stacksTo(64), "tooltip.smokeleafindustry.bubblegum_bag"));
    public static final RegistryObject<Item> BUBBLE_KUSH_BAG = ITEMS.register("bubble_kush_bag",
            () -> new BaseBagItem(new Item.Properties().stacksTo(64), "tooltip.smokeleafindustry.bubble_kush_bag"));
    public static final RegistryObject<Item> LEMON_HAZE_BAG = ITEMS.register("lemon_haze_bag",
            () -> new BaseBagItem(new Item.Properties().stacksTo(64), "tooltip.smokeleafindustry.lemon_haze_bag"));
    public static final RegistryObject<Item> SOUR_DIESEL_BAG = ITEMS.register("sour_diesel_bag",
            () -> new BaseBagItem(new Item.Properties().stacksTo(64), "tooltip.smokeleafindustry.sour_diesel_bag"));
    public static final RegistryObject<Item> PURPLE_HAZE_BAG = ITEMS.register("purple_haze_bag",
            () -> new BaseBagItem(new Item.Properties().stacksTo(64), "tooltip.smokeleafindustry.purple_haze_bag"));


    /* Other Items */
    public static final RegistryObject<Item> HASH_OIL_BUCKET = ITEMS.register("hash_oil_bucket",
            () -> new BucketItem(ModFluids.SOURCE_HASH_OIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> GRINDER = ITEMS.register("grinder",
            () -> new ManualGrinder(new Item.Properties().stacksTo(1).durability(16)));
    public static final RegistryObject<Item> BONG = ITEMS.register("bong",
            () -> new BongItem(new Item.Properties().stacksTo(1).fireResistant()));
    public static final RegistryObject<Item> BLUNT = ITEMS.register("blunt",
            () -> new BluntItem(new Item.Properties().stacksTo(64)));


    public static final RegistryObject<Item> HERB_CAKE = ITEMS.register("herb_cake",
            () -> new Item(new Item.Properties().food(ModFoods.HERB_CAKE)));
    public static final RegistryObject<Item> HEMP_STICK = ITEMS.register("hemp_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEMP_CORE = ITEMS.register("hemp_core",
            () -> new Item(new Item.Properties()));


    // Clothing / Fabric System
    public static final RegistryObject<Item> HEMP_LEAF = ITEMS.register("hemp_leaf",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> HEMP_FIBERS = ITEMS.register("hemp_fibers",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> HEMP_FABRIC= ITEMS.register("hemp_fabric",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HEMP_HELMET_RED = ITEMS.register("hemp_helmet_red",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_RED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HEMP_CHESTPLATE_RED = ITEMS.register("hemp_chestplate_red",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_RED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HEMP_LEGGINGS_RED = ITEMS.register("hemp_leggings_red",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_RED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HEMP_BOOTS_RED = ITEMS.register("hemp_boots_red",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_RED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HEMP_HELMET_GREEN = ITEMS.register("hemp_helmet_green",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_GREEN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HEMP_CHESTPLATE_GREEN = ITEMS.register("hemp_chestplate_green",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_GREEN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HEMP_LEGGINGS_GREEN = ITEMS.register("hemp_leggings_green",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_GREEN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HEMP_BOOTS_GREEN = ITEMS.register("hemp_boots_green",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_GREEN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HEMP_HELMET_YELLOW = ITEMS.register("hemp_helmet_yellow",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_YELLOW, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HEMP_CHESTPLATE_YELLOW = ITEMS.register("hemp_chestplate_yellow",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_YELLOW, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HEMP_LEGGINGS_YELLOW = ITEMS.register("hemp_leggings_yellow",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_YELLOW, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HEMP_BOOTS_YELLOW = ITEMS.register("hemp_boots_yellow",
            () -> new ArmorItem(ModArmorMaterials.HEMP_FABRIC_YELLOW, ArmorItem.Type.BOOTS, new Item.Properties()));



    // Getters
    public static Item getWhiteWidowSeeds() {
        return WHITE_WIDOW_SEEDS.get();
    }
    public static Item getWhiteWidowBud() {
        return WHITE_WIDOW_BUD.get();
    }

    public static Item getBubbleKushSeeds() {
        return BUBBLE_KUSH_SEEDS.get(); // Return the actual Item from the registry object
    }
    public static Item getBubbleKushBud() {
        return BUBBLE_KUSH_BUD.get(); // Return the actual Item from the registry object
    }

    public static Item getLemonHazeSeeds() {
        return LEMON_HAZE_SEEDS.get(); // Return the actual Item from the registry object
    }
    public static Item getLemonHazeBud() {
        return LEMON_HAZE_BUD.get(); // Return the actual Item from the registry object
    }

    public static Item getSourDieselSeeds() {
        return SOUR_DIESEL_SEEDS.get(); // Return the actual Item from the registry object
    }
    public static Item getSourDieselBud() {
        return SOUR_DIESEL_BUD.get(); // Return the actual Item from the registry object
    }

    public static Item getBlueIceSeeds() {
        return BLUE_ICE_SEEDS.get(); // Return the actual Item from the registry object
    }
    public static Item getBlueIceBud() {
        return BLUE_ICE_BUD.get(); // Return the actual Item from the registry object
    }

    public static Item getBubblegumSeeds() {
        return BUBBLEGUM_SEEDS.get(); // Return the actual Item from the registry object
    }
    public static Item getBubblegumBud() {
        return BUBBLEGUM_BUD.get(); // Return the actual Item from the registry object
    }

    public static Item getPurpleHazeSeeds() {
        return PURPLE_HAZE_SEEDS.get(); // Return the actual Item from the registry object
    }
    public static Item getPurpleHazeBud() {
        return PURPLE_HAZE_BUD.get(); // Return the actual Item from the registry object
    }

    public static Item getHempLeaf() {
        return HEMP_LEAF.get();
    }


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
