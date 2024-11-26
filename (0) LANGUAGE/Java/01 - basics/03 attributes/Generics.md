
# Example
```java
package net.kw.heavenonhigh.itemGroupTab;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kw.heavenonhigh.HeavenOnHigh;
import net.kw.heavenonhigh.item.ModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ItemGroupTab {
    ItemGroup itemGroupTab;

    public <T extends ModItem> ItemGroupTab(List<T> items) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("The items list cannot be empty");
        }

        this.itemGroupTab = Registry.register(
                Registries.ITEM_GROUP,
                new Identifier(HeavenOnHigh.MOD_ID, "items_group"),
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(items.get(0).getItem()))
                        .displayName(Text.translatable("itemgroup.heavenonhigh.items_group"))
                        .entries((displayContext, entries) -> {
                            for (T item : items) {
                                entries.add(item.getItem());
                            }
                        })
                        .build()
        );
    }
}
```