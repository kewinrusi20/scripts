Call the Function (that renders Elements) outside the return area:
```tsx
function ListGroup() {  
    const cities = [  
        'New York',  
        'San Francisco',  
        'Tokyo',  
        'London',  
        'Paris'  
    ]  
	  
    const renderList = () => { 
		// you have to use return here
		// because you want to render an HTML Element
        return ( 
            <p>  
                ...
            </p>  
        )  
    }  
  
    return (<>  
        <h1>List Group</h1>  
        {cities.length === 0 ? <p>no items found</p> : renderList()}  
    </>)  
}  

export default ListGroup
```
