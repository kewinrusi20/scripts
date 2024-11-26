
# Example
```java
package net.kw.heavenonhigh.itemGroupTab;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kw.heavenonhigh.HeavenOnHigh;
import net.kw.heavenonhigh.item.Ore;
import net.kw.heavenonhigh.block.OreBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ItemGroupTab {
    ItemGroup itemGroupTab;

    public ItemGroupTab(List<?> items) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("The items list cannot be empty");
        }

        // Determine the type of the first item
        Object firstItem = items.get(0);
        boolean isOre = firstItem instanceof Ore;
        boolean isOreBlock = firstItem instanceof OreBlock;

        if (!isOre && !isOreBlock) {
            throw new IllegalArgumentException("The list must contain Ore or OreBlock instances");
        }

        this.itemGroupTab = Registry.register(
                Registries.ITEM_GROUP,
                new Identifier(HeavenOnHigh.MOD_ID, isOre ? "ores_group" : "ore_blocks_group"),
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(isOre ? ((Ore) firstItem).itemRegistered : ((OreBlock) firstItem).blockItemRegistered))
                        .displayName(Text.translatable(isOre ? "itemgroup.heavenonhigh.ores_group" : "itemgroup.heavenonhigh.ore_blocks_group"))
                        .entries((displayContext, entries) -> {
                            for (Object item : items) {
                                if (item instanceof Ore) {
                                    entries.add(((Ore) item).itemRegistered);
                                } else if (item instanceof OreBlock) {
                                    entries.add(((OreBlock) item).blockItemRegistered);
                                }
                            }
                        })
                        .build()
        );
    }
}

```