package net.zeicy1.mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zeicy1.mod.TemplateMod;

public class ModItems {

    public static final Item GOLDEN_BAMBOO = registerItem("golden_bamboo", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BAMBOO))); 

    private static void addItemsToFoodAndDrinksItemGroup (FabricItemGroupEntries entries) {
        entries.add(GOLDEN_BAMBOO); 
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
        TemplateMod.LOGGER.info("Registering Mod Items for " + TemplateMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems :: addItemsToFoodAndDrinksItemGroup);
    }
    
}