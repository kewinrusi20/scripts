Inside `/src/java/resources/assets/<mod id here>/models/item`
```json
{  
  "parent": "minecraft:item/generated",  
  "textures": {  
    "layer0": "heavenonhigh:item/pink_garnet"  
  }  
}
```
- Parent Types:
	- generated
	- handheld


- Composting Item `CompostableItemRegistry`:
```java
// Add the suspicious substance to the composting registry with a 30% chance of increasing the composter's level.
CompostingChanceRegistry.INSTANCE.add(ModItems.SUSPICIOUS_SUBSTANCE, 0.3f);
```

- Fuel Item `FuelRegistry`:
```java
// Add the suspicious substance to the flammable block registry with a burn time of 30 seconds.
// Remember, Minecraft deals with logical based-time using ticks.
// 20 ticks = 1 second.
FuelRegistry.INSTANCE.add(ModItems.GUIDITE_SWORD, 30 * 20);
```

# Example
```java
public class Ore {
	public Ore() {
		String id = "raw_pink_garnet";
		Item settings = new Item(new Item.Settings());
	    
	    Item item = register(id, settings);
	    initialize(item);
	    registry(item);  
	}
	
	public void registry(Item settings) {  
	    //FuelRegistry.INSTANCE.add(settings, 30 * 20);  
	    //CompostingChanceRegistry.INSTANCE.add(settings, 0.3f);}
	}
}
```