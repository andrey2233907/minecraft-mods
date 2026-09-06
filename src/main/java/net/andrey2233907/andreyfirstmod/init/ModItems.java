package net.andrey2233907.andreyfirstmod.init;

import net.andrey2233907.andreyfirstmod.AndreyFirstMod;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Создаем регистратор для предметов
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(AndreyFirstMod.MOD_ID);

    // РЕГИСТРИРУЕМ ПЕРВЫЙ ПРЕДМЕТ
    public static final DeferredItem<Item> RUBY =
            ITEMS.registerSimpleItem("ruby", new Item.Properties());

    // Еще один предмет
    public static final DeferredItem<Item> RAW_RUBY =
            ITEMS.registerSimpleItem("raw_ruby", new Item.Properties());
}