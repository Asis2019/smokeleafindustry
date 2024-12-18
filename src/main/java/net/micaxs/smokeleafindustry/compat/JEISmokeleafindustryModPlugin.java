package net.micaxs.smokeleafindustry.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.forge.ForgeTypes;
import mezz.jei.api.registration.*;
import net.micaxs.smokeleafindustry.SmokeleafIndustryMod;
import net.micaxs.smokeleafindustry.block.ModBlocks;
import net.micaxs.smokeleafindustry.fluid.ModFluidTypes;
import net.micaxs.smokeleafindustry.fluid.ModFluids;
import net.micaxs.smokeleafindustry.item.ModItems;
import net.micaxs.smokeleafindustry.recipe.machines.*;
import net.micaxs.smokeleafindustry.screen.*;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraftforge.fluids.FluidStack;

import java.util.List;

@JeiPlugin
public class JEISmokeleafindustryModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(SmokeleafIndustryMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new HerbGrinderCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new HerbMutationCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new HerbEvaporatorCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new HempSpinnerCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new HempWeaverCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new HerbExtractorCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new HerbGeneratorCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<HerbGrinderRecipe> grinderRecipes = recipeManager.getAllRecipesFor(HerbGrinderRecipe.Type.INSTANCE);
        registration.addRecipes(HerbGrinderCategory.HERB_GRINDER_TYPE, grinderRecipes);

        List<HerbMutationRecipe> mutationRecipes = recipeManager.getAllRecipesFor(HerbMutationRecipe.Type.INSTANCE);
        registration.addRecipes(HerbMutationCategory.HERB_MUTATION_TYPE, mutationRecipes);

        List<HerbEvaporatorRecipe> evaporatorRecipes = recipeManager.getAllRecipesFor(HerbEvaporatorRecipe.Type.INSTANCE);
        registration.addRecipes(HerbEvaporatorCategory.HERB_EVAPORATOR_TYPE, evaporatorRecipes);

        List<HempSpinnerRecipe> spinnerRecipes = recipeManager.getAllRecipesFor(HempSpinnerRecipe.Type.INSTANCE);
        registration.addRecipes(HempSpinnerCategory.HEMP_SPINNER_TYPE, spinnerRecipes);

        List<HempWeaverRecipe> weaverRecipes = recipeManager.getAllRecipesFor(HempWeaverRecipe.Type.INSTANCE);
        registration.addRecipes(HempWeaverCategory.HEMP_WEAVER_TYPE, weaverRecipes);

        List<HerbExtractorRecipe> herbExtractorRecipes = recipeManager.getAllRecipesFor(HerbExtractorRecipe.Type.INSTANCE);
        registration.addRecipes(HerbExtractorCategory.HERB_EXTRACTOR_TYPE, herbExtractorRecipes);

        List<HerbGeneratorRecipe> herbGeneratorRecipes = recipeManager.getAllRecipesFor(HerbGeneratorRecipe.Type.INSTANCE);
        registration.addRecipes(HerbGeneratorCategory.HERB_GENERATOR_TYPE, herbGeneratorRecipes);

        registration.addItemStackInfo(
                ModItems.HASH_OIL_SLUDGE_BUCKET.get().getDefaultInstance(), Component.translatable("info.smokeleafindustry.hash_oil_sludge_bucket")
        );
        registration.addIngredientInfo(
                new FluidStack(ModFluids.SOURCE_HASH_OIL_SLUDGE.get(), 1000),
                ForgeTypes.FLUID_STACK,
                Component.translatable("info.smokeleafindustry.hash_oil_sludge")
        );
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(HerbGrinderStationScreen.class, 80, 30, 20, 30,
                HerbGrinderCategory.HERB_GRINDER_TYPE);

        registration.addRecipeClickArea(HempSpinnerScreen.class, 80, 30, 20, 30,
                HempSpinnerCategory.HEMP_SPINNER_TYPE);

        registration.addRecipeClickArea(HempWeaverScreen.class, 80, 30, 20, 30,
                HempWeaverCategory.HEMP_WEAVER_TYPE);

        registration.addRecipeClickArea(HerbMutationScreen.class, 80, 30, 40, 30,
                HerbMutationCategory.HERB_MUTATION_TYPE);

        registration.addRecipeClickArea(HerbEvaporatorScreen.class, 80, 30, 20, 30,
                HerbEvaporatorCategory.HERB_EVAPORATOR_TYPE);

        registration.addRecipeClickArea(HerbExtractorScreen.class, 59, 35, 54, 16,
                HerbExtractorCategory.HERB_EXTRACTOR_TYPE);

        registration.addRecipeClickArea(HerbGeneratorScreen.class, 80, 33, 18, 16,
                HerbGeneratorCategory.HERB_GENERATOR_TYPE);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.HERB_GRINDER_STATION.get()), HerbGrinderCategory.HERB_GRINDER_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.HEMP_SPINNER.get()), HempSpinnerCategory.HEMP_SPINNER_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.HEMP_WEAVER.get()), HempWeaverCategory.HEMP_WEAVER_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.HERB_MUTATION.get()), HerbMutationCategory.HERB_MUTATION_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.HERB_EVAPORATOR.get()), HerbEvaporatorCategory.HERB_EVAPORATOR_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.HERB_EXTRACTOR.get()), HerbExtractorCategory.HERB_EXTRACTOR_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.HERB_GENERATOR.get()), HerbGeneratorCategory.HERB_GENERATOR_TYPE);
    }

    @Override
    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
        registration.addRecipeTransferHandler(HerbGrinderStationMenu.class, ModMenuTypes.HERB_GRINDER_MENU.get(),
                HerbGrinderCategory.HERB_GRINDER_TYPE, 36, 1, 0, 36);

        registration.addRecipeTransferHandler(HempSpinnerMenu.class, ModMenuTypes.HEMP_SPINNER_MENU.get(),
                HempSpinnerCategory.HEMP_SPINNER_TYPE, 36, 1, 0, 36);

        registration.addRecipeTransferHandler(HerbEvaporatorMenu.class, ModMenuTypes.HERB_EVAPORATOR_MENU.get(),
                HerbEvaporatorCategory.HERB_EVAPORATOR_TYPE, 36, 1, 0, 36);

        registration.addRecipeTransferHandler(HerbExtractorMenu.class, ModMenuTypes.HERB_EXTRACTOR_MENU.get(),
                HerbExtractorCategory.HERB_EXTRACTOR_TYPE, 36, 1, 0, 36);

        registration.addRecipeTransferHandler(HerbGeneratorMenu.class, ModMenuTypes.HERB_GENERATOR_MENU.get(),
                HerbGeneratorCategory.HERB_GENERATOR_TYPE, 36, 1, 0, 36);

        // TODO: Mutator and weaver not implemented.
    }
}
