# **Java Directory**
## *Main* File
Directory: `/src/main/java/net/kw/heavenonhigh/HeavenOnHigh.java`
```java
package net.kw.heavenonhigh;

public class HeavenOnHigh implements ModInitializer {
    public static final String MOD_ID = "heavenonhigh";


    public void onInitialize() {  
		ModBlock.mainModBlocks();
    }
}
```

## *Item* File
Directory: `/src/main/java/net/kw/heavenonhigh/block/ModBlocks.java`
```java
ackage net.kw.heavenonhigh.block;

public class ModBlock {
    public static Block PINK_GARNEET_BLOCK;
    public static Item PINK_GARNEET_BLOCK_ITEM;
	
	
    public static void mainModBlocks() {
        PINK_GARNEET_BLOCK = initializeBlock(
                "pink_garnet_block",
                new Block(AbstractBlock.Settings
                        .create()
                        .strength(4f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.AMETHYST_BLOCK))
        );
        
        PINK_GARNEET_BLOCK_ITEM = initializeBlockItem(
                "pink_garnet_block",
                new BlockItem(PINK_GARNEET_BLOCK, new Item.Settings())
        );
        
        List<RegistryKey<ItemGroup>> pinkGarnetBlock_groupTab = new ArrayList<>();
        pinkGarnetBlock_groupTab.add(ItemGroups.BUILDING_BLOCKS);
        pinkGarnetBlock_groupTab.add(ModItemGroups.CUSTOM_ITEM_GROUP_1);
        registerToGroup(PINK_GARNEET_BLOCK, pinkGarnetBlock_groupTab);
    }
	
	
	
    public static Block initializeBlock(String id, Block block) {
        Identifier idConverted = Identifier.of(HeavenOnHigh.MOD_ID, id);
        Block initialization = Registry.register(Registries.BLOCK, idConverted, block);
		
        return initialization;
    }

    public static Item initializeBlockItem(String id, BlockItem blockItem) {
        Identifier idConverted = Identifier.of(HeavenOnHigh.MOD_ID, id);
        Item initialization = Registry.register(Registries.ITEM, idConverted, blockItem);
		
        return initialization;
    }
	
	
    public static void registerToGroup(Block registration, List<RegistryKey<ItemGroup>> groups) {
        // Add Item inside a group tab
        for (RegistryKey<ItemGroup> group : groups) {
            ItemGroupEvents
                    .modifyEntriesEvent(group)
                    .register((entries) -> entries.add(registration));
        }
    }
}

```


### Ore Block Example
```java
String pinkGarnetOreID = "pink_garnet_ore";  
PINK_GARNET_ORE = initializeBlock(  
        pinkGarnetOreID,  
        new ExperienceDroppingBlock(  
                UniformIntProvider.create(2, 5),  
                AbstractBlock.Settings  
                        .create()  
                        .strength(3f)  
                        .requiresTool()  
        )  
);  
  
PINK_GARNET_ORE_ITEM = initializeBlockItem(  
        pinkGarnetOreID,  
        new BlockItem(PINK_GARNET_ORE, new Item.Settings())  
);
```


# **Resources Directory**
## *Block State* File
Directory: `/src/main/resources/assets/heavenonhigh/blockstates/pink_garnet_block.json`
```java
{  
  "variants": {  
    "": {  
      "model": "heavenonhigh:block/pink_garnet_block"  
    }  
  }  
}
```

## *Lang* File
Directory: `/src/main/resources/assets/heavenonhigh/lang/en_us.json` 
```java
{
  "block.heavenonhigh.pink_garnet_block": "Pink Garnet Block",
}
```

## *Model Block* File
Directory: `/src/main/resources/assets/heavenonhigh/model/block/pink_garnet_block.json` 
```java
{  
  "parent": "minecraft:block/cube_all",  
  "textures": {  
    "all": "heavenonhigh:block/pink_garnet_block"  
  }  
}
```

## *Model Item* File
Directory: `/src/main/resources/assets/heavenonhigh/model/item/pink_garnet_block.json` 
```java
{  
  "parent": "heavenonhigh:block/pink_garnet_block"  
}
```

# *Texture* File
Directory: `src/main/resources/assets/heavenonhigh/textures/blocks/pink_garnet_block.png`

