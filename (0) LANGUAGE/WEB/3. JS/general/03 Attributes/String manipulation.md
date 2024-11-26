```js
// REPLACE
let temp_a = foodType.replace(/ /g, "");

// SPLIT
let foodType2 = temp_a.split("_")[1]; // only the first '_'

// ADD
temp_a = 'Let_'.concat(" ",temp_a);

// STRING to VARIABLE NAME
let foodList = eval(`List_${temp_a}`); // added 'List_' to the string
```