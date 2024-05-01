package net.benjamin.bitsandbens.item;

import net.benjamin.bitsandbens.BitsAndBensMod;
import net.benjamin.bitsandbens.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier PLATINUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 500, 1.5f, 3f, 10,
                ModTags.Blocks.NEEDS_PLATINUM_TOOL, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
            new ResourceLocation(BitsAndBensMod.MOD_ID, "platinum_ingot"), List.of(Tiers.IRON), List.of()
    );
}
