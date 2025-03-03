package net.gotthatgrass.bountifulharvest.item;

import net.gotthatgrass.bountifulharvest.BountifulHarvest;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BountifulHarvest.MOD_ID);

    public static final DeferredItem<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
