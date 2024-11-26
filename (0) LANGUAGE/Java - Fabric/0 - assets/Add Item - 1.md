File: `ModItems`
```java
package net.kw.heavenonhigh.item;

public class Ore {
    static String id = "pink_garnet";
    static Item properties = new Item(new Item.Settings());
    public static final Item PINK_GARNET = register(id, properties);
	
	
    public static Item register(String itemID, Item properties) {
        Identifier itemIDConverted = Identifier.of(HeavenOnHigh.MOD_ID, itemID);
        Item itemRegistered = Registry.register(Registries.ITEM, itemIDConverted, properties);

        return itemRegistered;
    }
	
	
    public static void initialize() {
	
        // Add Item to a Section
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((entries) -> entries.add(PINK_GARNET));
    }
}
```

File: `Heaven on High`
```java
package net.kw.heavenonhigh;  

public class HeavenOnHigh implements ModInitializer {  
    public static final String MOD_ID = "heavenonhigh";  
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);  
	
    @Override  
    public void onInitialize() {  
       ModItems.initialize();  
    }  
}
```
