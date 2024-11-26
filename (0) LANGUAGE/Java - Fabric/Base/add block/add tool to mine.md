# **Java Directory**
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
        );
    }
}
```
add `requiresTool()` variable to the settings of the block



# **Resources Directory**
## File
Directory: `/src/main/resources/data/minecraft/tags/block/minable/pickaxe.json`
```json
{  
  "replace": false,  
  "values": [  
    "heavenonhigh:pink_garnet_block",  
    "heavenonhigh:raw_pink_garnet_block",  
    "heavenonhigh:pink_garnet_ore",  
    "heavenonhigh:pink_garnet_deepslate_ore"  
  ]  
}
```

Directory: `/src/main/resources/data/minecraft/tags/block/need_diamond_tool.json`
```json
{  
  "replace": false,
  "values": [
    "heavenonhigh:pink_garnet_deepslate_ore"  
  ]  
}
```

Directory: `/src/main/resources/data/minecraft/tags/block/need_iron_tool.json`
```json
{  
  "replace": false,  
  "values": [  
    "heavenonhigh:pink_garnet_block",  
    "heavenonhigh:raw_pink_garnet_block",  
    "heavenonhigh:pink_garnet_ore"
  ]  
}
```
