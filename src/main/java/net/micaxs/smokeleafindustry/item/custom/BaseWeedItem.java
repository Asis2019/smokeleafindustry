package net.micaxs.smokeleafindustry.item.custom;

import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BaseWeedItem extends Item {

    private final List<MobEffectInstance> effects = new ArrayList<>();
    public int duration;

    public BaseWeedItem(Properties pProperties, MobEffect effect, int iDuration, int iAmplifier) {
        super(pProperties);
        duration = iDuration;
        effects.add(new MobEffectInstance(effect, iDuration, iAmplifier));
    }

    public List<MobEffectInstance> getEffects() {
        return effects;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        pTooltipComponents.add(Component.translatable("tooltip.smokeleafindustry.effects").withStyle(ChatFormatting.GRAY));
        List<MobEffectInstance> weedEffects = getEffects();
        for (MobEffectInstance effect : weedEffects) {
            pTooltipComponents.add(getEffectText(effect));
        }
    }

    private Component getEffectText(MobEffectInstance effect) {
        MobEffect effectType = effect.getEffect();
        int duration = effect.getDuration() / 20; // Convert duration to seconds

        // Display effect name and duration in tooltip
        return Component.literal("- ")
                .append(Component.translatable(effectType.getDescriptionId()))
                .withStyle(ChatFormatting.GREEN)
                .append(" ")
                .append(Component.literal("(" + duration + "s)").withStyle(ChatFormatting.GRAY));
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public @Nullable CompoundTag getShareTag(ItemStack stack) {
        CompoundTag tag = super.getShareTag(stack);
        if (tag == null) {
            tag = new CompoundTag();
        }
        // Set the effect based on the actual effect of the BaseWeedItem
        if (!effects.isEmpty()) {
            MobEffect effect = effects.get(0).getEffect();
            ResourceLocation effectRegistryName = ForgeRegistries.MOB_EFFECTS.getKey(effect);
            if (effectRegistryName != null) {
                tag.putString("effect", effectRegistryName.toString());
            }
        }
        return tag;
    }

    @Override
    public void readShareTag(ItemStack stack, @Nullable CompoundTag nbt) {
        super.readShareTag(stack, nbt);
        if (nbt != null && nbt.contains("effects")) {
            effects.clear();
            ListTag effectsList = nbt.getList("effects", 10); // 10 is the NBT type for CompoundTag
            for (int i = 0; i < effectsList.size(); i++) {
                effects.add(MobEffectInstance.load(effectsList.getCompound(i)));
            }
        }
    }
}