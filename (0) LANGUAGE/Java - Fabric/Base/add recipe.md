add `<Crafting Item Name>.json`
- under `/src/resources/data/<Your Mod Name>/recipe.`


```json
{
  "type": "minecraft:crafting_shapeless",
  "category": "building",
  "ingredients": [
    {
      "item": "tutorialmod:pink_garnet_block"
    }
  ],
  "result": {
    "count": 9,
    "id": "tutorialmod:pink_garnet"
  }
}
```
Here, you use `ingredients` to be able to put the item in any position and archive the result


Example with 2 Ingredients:
```json
{
  "type": "minecraft:crafting_shaped",
  "pattern": [
    " D ",
    " G ",
    "   "
  ],
  "key": {
    "D": {
      "item": "minecraft:diamond"
    },
    "G": {
      "item": "minecraft:glass_bottle"
    }
  },
  "result": {
    "item": "mymod:healing_item",
    "count": 1
  }
}
```

Example with 2 Ingredients and no patterns:
```json
{  
  "type": "minecraft:crafting_shapeless",  
  "ingredients": [  
    {  
      "item": "heavenonhigh:pink_garnet"  
    },  
    {  
      "item": "minecraft:glass_bottle"  
    }  
  ],  
  "result": {  
    "count": 1,  
    "id": "minecraft:experience_bottle"  
  }  
}
```

```json
{  
  "type": "minecraft:crafting_shaped",  
  "category": "misc",  
  "key": {  
    "#": {  
      "item": "heavenonhigh:pink_garnet"  
    }  
  },  
  "pattern": [  
    "###",  
    "###",  
    "###"  
  ],  
  "result": {  
    "count": 1,  
    "id": "heavenonhigh:pink_garnet_block"  
  }  
}
```



Here, you use a combination between `key` and `pattern` to create a defined recipe


## Blasting

```json
{
  "type": "minecraft:blasting",
  "category": "misc",
  "cookingtime": 100,
  "experience": 0.2,
  "group": "pink_garnet",
  "ingredient": {
    "item": "tutorialmod:raw_pink_garnet"
  },
  "result": {
    "id": "tutorialmod:pink_garnet"
  }
}
```

## Smelting
```json
{
  "type": "minecraft:smelting",
  "category": "misc",
  "cookingtime": 200,
  "experience": 0.2,
  "group": "pink_garnet",
  "ingredient": {
    "item": "tutorialmod:raw_pink_garnet"
  },
  "result": {
    "id": "tutorialmod:pink_garnet"
  }
}
```

# Tipps
- You can see al the Minecraft Vanilla recipes in the `External Libraries > Gradle: net_minecraft:minecraft-merged-c2b31d...`
- You can create 2 recipes for the same item, just by changing it's name
	- `ping_garnet_from_nuggets.json`
	- `pink_garnet_from_block.json`
