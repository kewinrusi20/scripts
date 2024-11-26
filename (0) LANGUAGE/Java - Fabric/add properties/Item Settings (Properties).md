> Example Code

```java
static String itemID = "pink_garnet";  
static Item itemSetting = new Item(new Item.Settings());  
public static final Item PINK_GARNET = register(itemID, itemSetting);
```



# Copy Properties

- `static Item itemSetting = new Item(new Item.Settings.copy(Block.STONE));`
The Block will have the same properties of stone



# Create own Properties
`static Item itemSetting = new Item(new Item.Settings.create());`
