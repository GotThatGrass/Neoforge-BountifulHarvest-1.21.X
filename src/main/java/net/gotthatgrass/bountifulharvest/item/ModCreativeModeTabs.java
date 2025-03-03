package net.gotthatgrass.bountifulharvest.item;

import net.gotthatgrass.bountifulharvest.BountifulHarvest;
import net.gotthatgrass.bountifulharvest.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BountifulHarvest.MOD_ID);

    public static final Supplier<CreativeModeTab> BOUNTIFUL_HARVEST_TAB = CREATIVE_MODE_TAB.register("bountiful_harvest_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CORN.get()))
                    .title(Component.translatable("creativetab.bountifulharvest.bountiful_harvest"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CORN);
                        output.accept(ModBlocks.WOODEN_CRATE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}