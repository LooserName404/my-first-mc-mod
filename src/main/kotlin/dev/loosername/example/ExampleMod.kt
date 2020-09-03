package dev.loosername.example

import dev.loosername.example.items.FabricItem
import net.fabricmc.api.ModInitializer
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

// For support join https://discord.gg/v6v4pMv
class ExampleMod: ModInitializer {
    fun init() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        println("Hello Fabric world!")
    }

    val FABRIC_ITEM = FabricItem(Item.Settings().group(ItemGroup.MISC).maxCount(16))

    override fun onInitialize() {
        Registry.register(Registry.ITEM, Identifier("modid", "fabric_item"), FABRIC_ITEM)
    }
}