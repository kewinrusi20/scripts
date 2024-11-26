
# Many Returns
```tsx
function AddElements(){ 
	...
	
	if (...) {
		return ...
	}
	if (...) {
		return ...
	}
	if (...) {
		return ...
	} else {
		return ...
	}
}
```

Return with Condition
```tsx
function ListGroup(){  
    return (<>  
        <h1>Cities</h1>    
        {cities.length === 0 ? null : <p>List not empty</p>}  
		<!-- if list empty, stop the function -->
		
		<!-- if list not empty -->
        <ul className="list-group">  
            {cities.map(item => 
	            <li key={item} className="list-group-item">{item}</li>
	        )}  
        </ul>  
    </>)
}
```
(!) Not sure it works

---
# 1 Element, multiple line
```tsx
function AddElements(){ 
	...
	return ( 
		...
	)
}
```

Example
```tsx
function ListGroup(){  
    return (
        <ul className="list-group">  
            <li>An item</li>  
            <li>A second item</li>  
            <li>A third item</li>  
        </ul>    
    )
}
```


---
# Multiple Elements
## v1 `div`
```tsx
function AddElements(){ 
	...
	return <div>
		...
	</div>
}
```

Example
```tsx
function ListGroup(){  
    return 
	    <div>
		    <h1>My List></h1>
	        <ul className="list-group">  
	            <li>An item</li>  
	            <li>A second item</li>  
	            <li>A third item</li>  
	        </ul>    
	    </div>
}
```



## v2 `Fragment`
```tsx
function AddElements(){ 
	...
	return <Fragment>
		...
	</Fragment>
}
```

Example
```tsx
function ListGroup(){  
    return 
	    <Fragment>
		    <h1>My List></h1>
	        <ul className="list-group">  
	            <li>An item</li>  
	            <li>A second item</li>  
	            <li>A third item</li>  
	        </ul>    
	    </Fragment>
}
```



## v3 `<> ... </>`
```tsx
function AddElements(){  
    return <>
		...  
    </>
}
```

Example
```tsx
function ListGroup(){  
    return (
	    <>
		    <h1>My List></h1>
	        <ul className="list-group">  
	            <li>An item</li>  
	            <li>A second item</li>  
	            <li>A third item</li>
	        </ul>    
	    </>
    )
}
```


