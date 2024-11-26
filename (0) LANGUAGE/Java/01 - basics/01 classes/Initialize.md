If you want to access `item1.itemRegistered` from another class without making it `static`, you need to pass an instance of `HeavenOnHigh` to the `ItemGroupTab` class. This approach avoids using `static` variables and allows you to work with instances.

Here’s how you can do it:

### 1. Keep `item1` and `item2` Non-Static in File 1 (`HeavenOnHigh.java`):

```java
package net.kw.heavenonhigh;

import net.fabricmc.api.ModInitializer;
import net.kw.heavenonhigh.block.OreBlock;
import net.kw.heavenonhigh.item.Ore;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.sound.BlockSoundGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeavenOnHigh implements ModInitializer {
    public static final String MOD_ID = "heavenonhigh";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public Ore item1;
    public Ore item2;

    @Override
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
        OreBlock block1 = new OreBlock(
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
        OreBlock block2 = new OreBlock(
                "raw_pink_garnet_block",
                block2Settings,
                new BlockItem(block2Settings, new Item.Settings()),
                ItemGroups.BUILDING_BLOCKS
        );

        // Example usage
        new ItemGroupTab(this).initialize();
    }
}
```

### 2. Modify the `ItemGroupTab` Class to Accept an Instance of `HeavenOnHigh`:

In `ItemGroupTab.java`, modify the constructor to accept a `HeavenOnHigh` instance:

```java
package net.kw.heavenonhigh.itemGroupTab;

import net.kw.heavenonhigh.HeavenOnHigh;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ItemGroupTab {
    private final HeavenOnHigh modInstance;

    public ItemGroupTab(HeavenOnHigh modInstance) {
        this.modInstance = modInstance;

        ItemGroup itemGroupTab = Registry.register(
                Registries.ITEM_GROUP,
                Identifier.of(modInstance.MOD_ID, "pink_garnet_items_group"),
                FabricItemGroup
                        .builder()
                        .icon(() -> new ItemStack(modInstance.item1.itemRegistered))
                        .displayName(Text.translatable("itemgroup.heavenonhigh.pink_garnet_items_group"))
                        .entries((displayContext, entries) -> {
                            entries.add(modInstance.item1.itemRegistered);
                            entries.add(modInstance.item2.itemRegistered);
                        })
                        .build()
        );
    }

    public void initialize() {
        // Any additional initialization code
    }
}
```

### 3. Pass the `HeavenOnHigh` Instance When Creating `ItemGroupTab`:

In `HeavenOnHigh.java`, when creating an `ItemGroupTab`, pass `this` to the constructor to provide the current instance of `HeavenOnHigh`:

```java
@Override
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
    OreBlock block1 = new OreBlock(
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
    OreBlock block2 = new OreBlock(
            "raw_pink_garnet_block",
            block2Settings,
            new BlockItem(block2Settings, new Item.Settings()),
            ItemGroups.BUILDING_BLOCKS
    );

    // Pass this instance of HeavenOnHigh to ItemGroupTab
    new ItemGroupTab(this).initialize();
}
```

### Summary

- **Non-Static Variables**: Keep `item1` and `item2` non-static in `HeavenOnHigh.java`.
- **Instance Passing**: Pass the instance of `HeavenOnHigh` to `ItemGroupTab` through its constructor.
- **Accessing Instance Variables**: Use the passed instance (`modInstance`) in `ItemGroupTab` to access `item1.itemRegistered`.

This approach maintains the integrity of object-oriented principles by avoiding the use of static variables and instead works with object instances.