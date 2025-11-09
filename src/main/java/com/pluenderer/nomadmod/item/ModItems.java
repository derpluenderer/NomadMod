package com.pluenderer.nomadmod.item;

import com.pluenderer.nomadmod.NomadMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NomadMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE =ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PACKINGBAG =ITEMS.register("packingbag",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WAGONCHASSIS =ITEMS.register("wagonchassis",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WAGONROOF =ITEMS.register("wagonroof",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
