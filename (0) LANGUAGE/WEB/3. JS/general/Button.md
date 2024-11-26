```js
<div onClick={OnClickFunc}></div>

function OnClickFunc() {
	console.log();
}
```
---
# Give Parameter

<span style="color:red">Error:</span> 
```js
<div onClick={OnClickFunc(name)}></div>

function OnClickFunc(name) {
	console.log(name);
}
```
this is wrong, because you will call the function without clicking at it

<span style="color:green">Solution:</span> 
```js
function ItemFunc({person}) {
  
    return (
        <div id={person.name} onClick=
	        { () => {OnClickFunc(person.name) }
        } ></div>
    )
}

  
function OnClickFunc(name) {
    console.log(name);
}
```
this works, because you are calling an anonymous function
