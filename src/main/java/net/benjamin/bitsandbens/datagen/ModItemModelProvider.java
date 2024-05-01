package net.benjamin.bitsandbens.datagen;

import net.benjamin.bitsandbens.BitsAndBensMod;
import net.benjamin.bitsandbens.item.BitsAndBensModTab;
import net.benjamin.bitsandbens.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BitsAndBensMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_PLATINUM);
        simpleItem(ModItems.PLATINUM_NUGGET);
        simpleItem(ModItems.PLATINUM_INGOT);

        simpleItem(ModItems.PLATINUM_PICKAXE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BitsAndBensMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
