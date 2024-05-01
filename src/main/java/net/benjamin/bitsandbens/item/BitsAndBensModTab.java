package net.benjamin.bitsandbens.item;

import net.benjamin.bitsandbens.BitsAndBensMod;
import net.benjamin.bitsandbens.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BitsAndBensModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BitsAndBensMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BITS_AND_BENS
            = CREATIVE_MODE_TABS.register("bits_and_bens", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.PLATINUM_INGOT.get()))
            .title(Component.translatable("creativetab.bits_and_bens_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.RAW_PLATINUM.get());
                pOutput.accept(ModItems.PLATINUM_INGOT.get());
                pOutput.accept(ModItems.PLATINUM_NUGGET.get());

                pOutput.accept(ModItems.PLATINUM_PICKAXE.get());
                pOutput.accept(ModItems.PLATINUM_AXE.get());
                pOutput.accept(ModItems.PLATINUM_SHOVEL.get());
                pOutput.accept(ModItems.PLATINUM_SWORD.get());
                pOutput.accept(ModItems.PLATINUM_HOE.get());

                pOutput.accept(ModBlocks.PLATINUM_BLOCK.get());
                pOutput.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
