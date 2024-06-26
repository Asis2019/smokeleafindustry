package net.micaxs.smokeleafindustry.item.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class BaseBudItem extends Item {
    public int dry;
    public int dryingTime;

    public BaseBudItem(Properties pProperties, int iDry, int iDryingTime) {
        super(pProperties);
        this.dry = iDry;
        this.dryingTime = iDryingTime;
    }

    public boolean isDry() {
        return dry != 0;
    }

    @Override
    public Component getName(ItemStack itemStack) {
        Component baseName = super.getName(itemStack);

        CompoundTag nbt = itemStack.getTag();
        if (nbt != null && nbt.contains("dry") && nbt.getInt("dry") == 1) {
            return Component.translatable("tooltip.smokeleafindustry.dried").append(" ").append(baseName);
        } else if (nbt != null && nbt.contains("dry") && nbt.getInt("dry") == 0) {
            return Component.translatable("tooltip.smokeleafindustry.fresh").append(" ").append(baseName);
        } else {
            return baseName;
        }
    }

    @Override
    public @Nullable CompoundTag getShareTag(ItemStack stack) {
        CompoundTag tag = super.getShareTag(stack);
        if (tag == null) {
            tag = new CompoundTag();
        }

        tag.putInt("dry", this.dry);
        tag.putInt("dry_time", this.dryingTime);

        return tag;
    }

    @Override
    public void readShareTag(ItemStack stack, @Nullable CompoundTag nbt) {
        super.readShareTag(stack, nbt);

        if (nbt != null && nbt.contains("dry")) {
            this.dry = nbt.getInt("dry");
        }

        if (nbt != null && nbt.contains("dry_time")) {
            this.dryingTime = nbt.getInt("dry_time");
        }
    }
}
