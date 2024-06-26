package net.micaxs.smokeleafindustry.recipe;

import net.micaxs.smokeleafindustry.SmokeleafIndustryMod;
import net.micaxs.smokeleafindustry.recipe.machines.*;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static  final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SmokeleafIndustryMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<HerbGrinderRecipe>> HERB_GRINDER_SERIALIZER =
            SERIALIZERS.register("herb_grinder", () -> HerbGrinderRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<HerbMutationRecipe>> HERB_MUTATION_SERIALIZER =
            SERIALIZERS.register("herb_mutation", () -> HerbMutationRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<HerbEvaporatorRecipe>> HERB_EVAPORATOR_SERIALIZER =
            SERIALIZERS.register("herb_evaporator", () -> HerbEvaporatorRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<ShapedWeedRecipe>> SHAPED_WEED_CRAFTING =
            SERIALIZERS.register("shaped_weed_crafting", () -> ShapedWeedRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<ShapelessWeedRecipe>> SHAPELESS_WEED_CRAFTING =
            SERIALIZERS.register("shapeless_weed_crafting", () -> ShapelessWeedRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<ManualGrinderRecipe>> MANUAL_GRINDER_SERIALIZER =
            SERIALIZERS.register("grinder", () -> ManualGrinderRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<HempSpinnerRecipe>> HEMP_SPINNER_SERIALIZER =
            SERIALIZERS.register("hemp_spinner", () -> HempSpinnerRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<HempWeaverRecipe>> HEMP_WEAVER_SERIALIZER =
            SERIALIZERS.register("hemp_weaver", () -> HempWeaverRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<HerbExtractorRecipe>> HERB_EXTRACTOR_SERIALIZER =
            SERIALIZERS.register("herb_extractor", () -> HerbExtractorRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<HerbGeneratorRecipe>> HERB_GENERATOR_SERIALIZER =
            SERIALIZERS.register("herb_generator", () -> HerbGeneratorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }

}
