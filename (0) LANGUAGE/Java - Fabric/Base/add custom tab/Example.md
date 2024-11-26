# **Java Directory**
## *Group Tab* File
Directory: `/src/main/java/net/kw/heavenonhigh/itemGroups/ModItemGroups.java`
### v1
```java
package net.kaupenjoe.tutorialmod.item;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                        entries.add(ModItems.CHISEL);
                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
```

### v2
```java
package net.kw.heavenonhigh.itemGroup;  
  
public class ModItemGroups {  
    public final static RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_1 = initializeGroupTab(  
            "pink_garnet_items_group",   
            "itemgroup.heavenonhigh.pink_garnet_items_group",  
            ModItems.PINK_GARNET  
    );  
  
  
    public static RegistryKey<ItemGroup> initializeGroupTab(String id, String groupName, Item icon) {  
        Identifier idConverted = Identifier.of(HeavenOnHigh.MOD_ID, id);  
        RegistryKey<ItemGroup> itemGroupKey = RegistryKey.of(Registries.ITEM_GROUP.getKey(), idConverted);  

        ItemGroup settings = FabricItemGroup  
                .builder()  
                .icon(() -> new ItemStack(icon))  
                .displayName(Text.translatable(groupName))  
                .build();  
  
        Registry.register(Registries.ITEM_GROUP, itemGroupKey, settings);  
  
        return itemGroupKey;  
    }  
  
}
```