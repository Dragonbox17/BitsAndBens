package net.benjamin.bitsandbens.item;

import net.benjamin.bitsandbens.BitsAndBensMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BitsAndBensMod.MOD_ID);

    public static final RegistryObject<Item> RAW_PLATINUM =
            ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_INGOT =
            ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_NUGGET =
            ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
