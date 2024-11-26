# Feature: manage the body with JS
HTML
```html
<button id="switchButton"></button>
```

CSS
```css
#switchButton{
	left: 5px;
}
.animate{
	animation: ...;
}
```

JS
```js
var idSwitchButton = document.getElementById("switchButton");

if (idSwitchButton.classList == "animate") {return}   // check
idSwitchButton.classList.add("animate");              // add
idSwitchButton.classList.remove("animate");           // remove
idSwitchButton.getPropertyValue("left");              // get Value
```

---
# Examples:
HTML
```html
<body>
	<div id="character"></div>
</body>
```

CSS 
```css
#character{
	border-radius: 10px;
	background-color: grey;
	width: 20px;
	height: 50px;
	
	position: relative;
	top: 150px;
	left: 5px;
}
.animate{
	animation: jump 0.3s linear;
}
@keyframes jump{
    0%{top: 150px;}
    30%{top: 100px;}
    70%{top: 100px;}
    100%{top: 150px;}
}
```

JS
```js
var idCharacter = document.getElementById("character");

if (idCharacter.classList == "animate") {return}   // check
idCharacter.classList.add("animate");              // add
setTimeout(function(){
	idCharacter.classList.remove("animate");       // remove
}, 500);
```
