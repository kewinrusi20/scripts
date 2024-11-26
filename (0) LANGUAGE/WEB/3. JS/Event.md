
```tsx
<h1>List Group</h1>  

{cities.length === 0 && <p>no items found</p>}  

<ul className="list-group">  
    {cities.map((item, index) =>  
        <li 
	        className="list-group-item"
	        key={item}
	        onClick={(event) => 
		        console.log('Clicked', item, index, event)}>Index: {index}
		</li>)}  
</ul>
```
