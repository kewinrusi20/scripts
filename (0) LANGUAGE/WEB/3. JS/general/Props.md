
File `App.tsx`:
```tsx
function App () { 
    const cities = ['New York', 'San Francisco', 'Tokyo', 'London', 'Paris']  
	
    return <>  
        <ListGroup items={cities} heading='Cities'/>  
    </>}
```


## v1
File `List.tsx`:
```tsx
interface ListGroupProps {  
    items: string[];  
    heading: string;  
}

function List(props: ListProps){
	console.log({ListPros.heading})
	console.log({ListPros.name})
}
```

## v2
File `List.tsx`:
```tsx
interface ListGroupProps {  
    items: string[];  
    heading: string;  
}

function List({items, heading}: ListProps){
	console.log({heading})
	console.log({name})
}
```
