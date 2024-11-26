Functions:
- `insertBefore()`
- `insertAdjacentHTML()`

Context:
```html
<div id="parent">  
    <p id="firstParagraph">This is the first paragraph.</p>
    <p id="secondParagraph">This is the second paragraph.</p>
    <p id="thirdParagraph">This is the third paragraph.</p>
</div>  
<button id="addButton">Insert New Paragraph</button>
<button id="removeButton">Remove Paragraph</button>
```

```js
const parent = document.getElementById("parent");
const first_paragraph = document.getElementById("first_paragraph");
const second_paragraph = document.getElementById("second_paragraph");
const third_paragraph = document.getElementById("third_paragraph");
const addButton = document.getElementById("addButton");
const removeButton = document.getElementById("removeButton");
```

# `insertBefore()`
- First Position: `<ElementReference>.firstChild`
- Any Position: `<ElementReference>`
- Last Position: `<ElementReference>.lastChild`

Example:
```js
addButton.addEventListener("click", function() {
	const newParagraph = document.createElement("p");
	newParagraph.textContent = "This is a new paragraph.";
    container.insertBefore(newParagraph, container.firstChild);
    //paragraphsParent.appendChild(newParagraph);
    //paragraphsParent.insertBefore(newParagraph, paragraphsParent.lastChild);
});
```


# `insertAdjacentHTML()`
Add Element to **Relative Position**

Within the Element:
- First Position: `afterbegin`
- Last Position: `beforeend`

Outside the Element:
- Before Element: `beforebegin
- After Element: `afterend`

Example:
```js
const container = document.getElementById("parent_paragraph");
const position = "afterbegin";
const content = "<p>This is a new paragraph.</p>";

addButton.addEventListener("click", function() {
	container.insertAdjacentHTML(position, content);
});
```


# `prepend()`
Add Element to **First Position**

Example:
```js
addButton.addEventListener("click", function() {
	addChild = document.createElement("p"); // Create Element
	addChild.textContent = "This is a new paragraph.";
	
    parent.prepend(addChild); // Add Element
});
```


# `appendChild()`
Add Element to **Last Position**

Example:
```js
addButton.addEventListener("click", function() {
	addChild = document.createElement("p"); // Create Element
	addChild.textContent = "This is a new paragraph.";
	
    parent.appendChild(addChild); // Add Element
});
```


# `removeChild()`

Example: 
```js
removeButtton = document.getElementById("removeButton");

removeButton.addEventListener("click", function() {
	removeChild = parent.firstChild; // Select Element
	parent.removeChild(removeChild) // Erase Element
});
```

# `write()`
Don't use this, pls

```js
document.write("Hello World");
document.write("<h1>Hello World</h1>");

// ERROR
let name = "Carl"
document.write(<h1>"Hello " + name + " !!"</h1>);
	// This may not work
	// The content within the h1 tag must be a string
```


---
# Tipps
to add an element to the main body:
```js
document.body.appendChild(...)
```
