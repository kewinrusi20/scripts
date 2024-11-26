
# **Java Directory**
## *Main* File
Directory: `/src/main/java/net/kw/heavenonhigh/HeavenOnHigh.java`
```java
package net.kw.heavenonhigh;

public class HeavenOnHigh implements ModInitializer {
    public static final String MOD_ID = "heavenonhigh";
	
	
    public void onInitialize() {
        ModItems.mainModItems();
    }
}
```

## *Item* File
Directory: `/src/main/java/net/kw/heavenonhigh/item/ModItems.java`
```java
package net.kw.heavenonhigh.item;

public class ModItems {
    public static Item PINK_GARNET;

    public static void mainModItems() {
        PINK_GARNET = initializeItem(
                "pink_garnet",
                new Item(new Item.Settings())
        );
		List<RegistryKey<ItemGroup>> pinkGarnet_groupTab = new ArrayList<>();
        pinkGarnet_groupTab.add(ItemGroups.INGREDIENTS);
        pinkGarnet_groupTab.add(ModItemGroups.CUSTOM_ITEM_GROUP_1);
        registerToGroup(PINK_GARNET, pinkGarnet_groupTab);
    }
	
	
    public static Item initializeItem(String id, Item item) {
        Identifier idConverted = Identifier.of(HeavenOnHigh.MOD_ID, id);
        Item initializedItem = Registry.register(Registries.ITEM, idConverted, item);
		
        return initializedItem;
    }
	
	
//    public void extraPropertyItem(Item item) {
//        FuelRegistry.INSTANCE.add(item, 30 * 20);
//        CompostingChanceRegistry.INSTANCE.add(item, 0.3f);
//    }
	
	
    public static void registerToGroup(Item registration, List<RegistryKey<ItemGroup>> groups) {
        // Add Item to a Section
        for (RegistryKey<ItemGroup> group : groups) {
            ItemGroupEvents
                    .modifyEntriesEvent(group)
                    .register((entries) -> entries.add(registration));
        }
    }
	
}
```

# **Resources Directory**
## *Lang* File
Directory: `src/main/resources/assets/heavenonhigh/lang/en_us.json`
```json
{  
  "item.heavenonhigh.pink_garnet": "Pink Garnet",  
  "item.heavenonhigh.raw_pink_garnet": "Row Pink Garnet"  
}
```

# *Model* File
Directory: `src/main/resources/assets/heavenonhigh/models/items/pink_garnet.json`
```java
{  
  "parent": "minecraft:item/generated",  
  "textures": {  
    "layer0": "tutorialmod:item/pink_garnet"  
  }  
}
```

# *Texture* File
Directory: `src/main/resources/assets/heavenonhigh/textures/items/pink_garnet.png`

