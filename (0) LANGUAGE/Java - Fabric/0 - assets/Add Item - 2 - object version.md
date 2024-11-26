
Directory: `/scr/main/java/net/kw/heavenonhigh/item/ModItems.java`
```java
public class Ore {  
    public Ore(String id, Item settings, RegistryKey<ItemGroup> groupTab) {  
        Item itemRegistered = register(id, settings);
        registry(itemRegistered);
        initialize(itemRegistered, groupTab);
    }  
  
  
    public Item register(String id, Item settings) {  
        Identifier itemIDConverted1 = Identifier.of(  
                HeavenOnHigh.MOD_ID,  
                id);  
  
        Item itemRegistered = Registry.register(  
                Registries.ITEM,  
                itemIDConverted1,  
                settings);  
  
        return itemRegistered;  
    }  
  
  
    public void initialize(Item itemRegistered, RegistryKey<ItemGroup> groupTab) {  
        // Add Item to a Section  
        ItemGroupEvents  
                .modifyEntriesEvent(groupTab)  
                .register((entries) -> entries.add(itemRegistered));  
    }  
  
  
    public void registry(Item settings) {  
        //FuelRegistry.INSTANCE.add(settings, 30 * 20);  
        //CompostingChanceRegistry.INSTANCE.add(settings, 0.3f);    }  
}
```

Directory: `/scr/main/java/net/kw/heavenonhigh/HeavenOnHigh.java`
```java
public class HeavenOnHigh implements ModInitializer {
	...
	
    public void onInitialize() {  
       Ore item1 = new Ore("pink_garnet", new Item(new Item.Settings()));  
       Ore item2 = new Ore("raw_pink_garnet", new Item(new Item.Settings()));  
    }
}
```