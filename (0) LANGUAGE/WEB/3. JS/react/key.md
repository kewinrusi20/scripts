


```js
"orbit":  {
"title": "Orbit",
"sets": [
  [       // Error: same Key
	{ "name":"InfiniteCorridor", "type":"WeaponsEvolved" },
	{ "name":"ClockLancet", "type":"WeaponsBase" },
	{ "name":"SilverRing", "type":"Passive" },
	{ "name":"GoldRing", "type":"Passive" }
  ],[     // Error: same Key
	{ "name":"LaBorra", "type":"WeaponsEvolved" },
	{ "name":"SantaWater", "type":"WeaponsBase" },
	{ "name":"Attractorb", "type":"Passive" }
  ],[     // Error: same Key
	{ "name":"UnholyVespers", "type":"WeaponsEvolved" },
	{ "name":"KingBible", "type":"WeaponsBase" },
	{ "name":"Spellbinder", "type":"Passive" }
  ]
]}
```
- Error: `{categoryR.sets.map(setE => <SetF key={categoryR.title} setR={setE}/>)}`
- Good: `{categoryR.sets.map(setE => <SetF key={categoryR.title + (i++).toString()} setR={setE}/>)}`


---
```js
"orbit":  {
"title": "Orbit",
"sets": [
  [
	{ "name":"InfiniteCorridor", "type":"WeaponsEvolved" },
	{ "name":"ClockLancet", "type":"WeaponsBase" },
	{ "name":"GoldRing", "type":"Passive" }, // ERROR: same key
	{ "name":"GoldRing", "type":"Passive" }  // ERROR: same key
  ],[
	{ "name":"LaBorra", "type":"WeaponsEvolved" },
	{ "name":"SantaWater", "type":"WeaponsBase" },
	{ "name":"Attractorb", "type":"Passive" }
  ],[
	{ "name":"UnholyVespers", "type":"WeaponsEvolved" },
	{ "name":"KingBible", "type":"WeaponsBase" },
	{ "name":"Spellbinder", "type":"Passive" }
  ]
]}
```
- Error: `{setR.map(itemE => <Item key={itemE.name} itemR={itemE}/> )}`
- Good:
