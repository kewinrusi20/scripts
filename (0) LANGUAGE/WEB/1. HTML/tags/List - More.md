# Combined List (1)
> Ordered + Unordered List
```css
<h3>To Do</h3>
<ol>
	<li>Do Paper Work</li>
	<li>Go Shopping</li>
		<ul>
			<li>Bananas</li>
			<li>Chicken Breast</li>
			<li>Water</li>
		</ul>
		<li>Wash Dishes</li>
	</ol>
```
- `<ol>` Ordered List
- `<ul>` Unordered List
- `<li>` List Element

## Result
```
### To Do
1. Do Paper Work
2. Go Shopping
	- Bananas
	- Chicken Breast
	- Water
4. Wash Dishes
```

---
# Combined List (2)
> Ordered + Unordered List + Description List
```html
<h3>Combined HTML List Example</h3>
  
<dl>
	<dt>To Do</dt>
		<ol>
			<li>Wash the Car</li>
			<ul>
				<li>Own Car</li>
				<li>Mom Car</li>
			</ul>
			<li>Go Shopping</li>
			<li>Do Paper Work</li>
			<dd>Task for the 07.12</dd>
			<dd>Task for the 08.12</dd>
		</ol>
	<dt>To Buy</dt>
	<dd>Buy them in Lidl</dd>
	<ul>
		<li>Water</li>
		<li>Apples</li>
		<li>Bread</li>
		<li>Eggs</li>
	</ul>
</dl>
```

## Result
```
## Combined HTML List Example
To Do
	1. Wash the Car
		- Own Car
		- Mom Car
	1. Go Shopping
	2. Do Paper Work
		Task for the 07.12
		Task for the 08.12
To Buy
	Buy them in Lidl
	- Water
	- Apples
	- Bread
	- Eggs
```

---
# Custom Style (with Symbols)
## HTML
```html
<!-- Custom List -->
<ul class="custom-list">
	<li>List Item 1</li>
	<li>List Item 2</li>
	<li>List Item 3</li>
	<li>List Item 4</li>
	<li>List Item 5</li>
</ul>
```

## CSS
```css
/* Reset Style Elements */
.custom-list {
    list-style-type: none; /* Removes default list style */
    padding-left: 0;      /* Removes default padding */
}

.custom-list li {
    position: relative;
    padding-left: 25px; /* Space for the symbol */
}

/* All Elements */
.custom-list li::before {
    content: "★"; /* Your custom symbol */
    position: absolute;
    left: 0;
    top: 0;
}

/* Second All Elements */
.custom-list li:nth-child(2)::before {
    content: "☆"; /* Different symbol for the second item */
}

/* Thrid Elements */
.custom-list li:nth-child(3)::before {
    content: "✦"; /* Different symbol for the third item */
}
```

## Result
![[Pasted image 20231206165824.png]]
