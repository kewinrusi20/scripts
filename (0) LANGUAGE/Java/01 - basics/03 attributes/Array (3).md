
# Using an Array

An array is a fixed-size collection of elements. If you know the exact number of `Ore` objects you will have, you can use an array.
```java
// Declare and initialize an array of Ores
Ore[] ores = new Ore[2]; // Size 2 array

// Assign Ores to the array
ores[0] = item1;
ores[1] = item2;
```



# Using an ArrayList

If you need a more flexible collection that can dynamically grow as you add elements, use an `ArrayList`.
```java
import java.util.ArrayList;
import java.util.List;

public class HeavenOnHigh implements ModInitializer {
    public Ore item1;
    public Ore item2;
    OreBlock block1;
    OreBlock block2;
    
    // Declare an ArrayList of Ores
    List<Ore> ores;

    public void onInitialize() {
        item1 = new Ore(
                "pink_garnet",
                new Item(new Item.Settings()),
                ItemGroups.INGREDIENTS);

        item2 = new Ore(
                "raw_pink_garnet",
                new Item(new Item.Settings()),
                ItemGroups.INGREDIENTS);

        Block block1Settings = new Block(AbstractBlock.Settings
                .create()
                .strength(4f)
                .requiresTool()
                .sounds(BlockSoundGroup.AMETHYST_BLOCK));
        block1 = new OreBlock(
                "pink_garnet_block",
                block1Settings,
                new BlockItem(block1Settings, new Item.Settings()),
                ItemGroups.BUILDING_BLOCKS
        );

        Block block2Settings = new Block(AbstractBlock.Settings
                .create()
                .strength(4f)
                .requiresTool()
                .sounds(BlockSoundGroup.AMETHYST_BLOCK));
        block2 = new OreBlock(
                "raw_pink_garnet_block",
                block2Settings,
                new BlockItem(block2Settings, new Item.Settings()),
                ItemGroups.BUILDING_BLOCKS
        );

        // Initialize the ArrayList and add Ores to it
        ores = new ArrayList<>();
        ores.add(item1);
        ores.add(item2);

        ItemGroupTab group1 = new ItemGroupTab(item1, item2);
    }
}

```