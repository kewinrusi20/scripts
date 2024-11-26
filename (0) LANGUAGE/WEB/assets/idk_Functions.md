# Bind

### Id
```js
<tag id=”flowerBridge”></tag>
<tag for=”flowerBridge”></tag>
tag#id {...}

id.splite();
```

### Class
```js
<tag class=”flowers”></tag>
tag.flowers {...}

document.getElementById().classList
```

### An id within a class
```js
<tag class=”flowers” id=”Rose”></tag>
<tag class=”flowers” id=”Violett”></tag>
tag.class#id {...}
```

# Hide Element
```css
<tag> {
      visibility: hidden;
      visibility: visible;
      display: none;
      display: block;
}

.hiddenMsg {
      display: none;
}

.Weapon:hover + .hiddenMsg {
      display: block;
}
```


# Input

For text u can use:
```js
placeholder:“”;
<input id=”nameInput” type=”text” placeholder=”Enter Name...”>
<script type=”text/javascript”>
	const savedName = inpName.value;
	const savedAge = inpName.value;
	if(savedName && savedAge) = localStorage.setItem(savedName, savedAge);
</script>
```

# Append
```js
<div id=myField></div>
<script type=”text/javascipt”>
	const lsOutput = document.getElementById(“lsOutput”);
	const name = localStorage.getName;
	const value = localStorage.getValue;
	lsOutput.innerHTML += ‘${name}: ${value}’;
</script>
```

Source: [How to use Local Storage in JavaScript](https://youtu.be/k8yJCeuP6I8)


# Change content
```js
document.getElementById("myBtn").style.bottom = "100px";
```
