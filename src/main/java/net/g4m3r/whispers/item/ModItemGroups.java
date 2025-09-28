package net.g4m3r.whispers.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.g4m3r.whispers.Whispers;
import net.g4m3r.whispers.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Whispers.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.whispers.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.PINK_GARNET);
                      entries.add(ModItems.RAW_PINK_GARNET);
                      entries.add(ModItems.CHISEL);
                      entries.add(ModItems.CAULIFLOWER);
                      entries.add(ModItems.STARLIGHT_ASHES);

                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Whispers.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.whispers.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModBlocks.PINK_GARNET_BLOCK);
                      entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                    }).build());

    public static final ItemGroup FURRY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Whispers.MOD_ID, "furry"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FURRY))
                    .displayName(Text.translatable("itemgroup.whispers.furry"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.FURRY);
                      entries.add(ModBlocks.FURRY_BLOCK);


                    }).build());

    public static void registerItemGroups() {
        Whispers.LOGGER.info("Registering Item Groups for " + Whispers.MOD_ID);
    }
}
