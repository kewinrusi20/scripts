
> Example with the Project named **Dimensional Jump**

> Tutorial: [Fabric Modding Tutorial - Minecraft 1.21: Getting Started | #1 - YouTube](https://www.youtube.com/watch?v=oU8-qV-ZtUY)

> Documentation: [Introduction to Fabric and Modding | Fabric Documentation (fabricmc.net)](https://docs.fabricmc.net/develop/getting-started/introduction-to-fabric-and-modding)

1. Get the Template from the original webpage [fabricmc.net](https://fabricmc.net/develop/template/)
2. Create an ID variable inside `DimensionalJump`
	`public static final String MODID = "dimensionaljump";`
```java
package dimensionaljump.modid;  
import net.fabricmc.api.ModInitializer;  
  
blic class DimensionalJump implements ModInitializer {  
    public static final String MOD_ID = "dimensionaljump";  
    ...
}
```
3. Change information inside `fabric.mod.json`
```json
{  
    "schemaVersion": 1,  
    "id": "dimensionaljump",  
    "version": "${version}",  
    "name": "DimensionalJump",  
    "description": "Jump from one world to another",  
    "authors": [  
       "Kewin"  
    ],  
    "contact": {  
       "homepage": "https://kew.im/DimensionalJump",  
       "sources": "https://github.com/Kewin/DimensionalJump"  
    },  
    "license": "MIT"
}
```
- You can change the `environment` variable, depends, where you want the mod to run
	- `client`
	- `server`
	- `*` (for both)

4. Add `client` Class
```json
package net.kw.dimensionaljump;  
  
import net.fabricmc.api.ClientModInitializer;  
  
public class DimensionalJumpClient implements ClientModInitializer {  
    @Override  
    public void onInitializeClient() {}  
}
```
And client class `DimensionalJumpClient` under `/src/main/dimensionaljump/modid/`

Add the variable client to `entripoints` inside `/srs/main/resources/assets/fabric.mod.json`
```json
"entrypoints": {  
    "main": [  
       "net.kw.heavenonhigh.DimensionalJump"  
    ],  
    "fabric-datagen": [  
       "net.kw.heavenonhigh.DimensionalJumpDataGenerator"  
    ],  
    "client": [  
       "net.kw.heavenonhigh.DimensionalJumpClient"  
    ]  
},  
"mixins": [  
    "dimensionaljump.mixins.json"  
]
```
