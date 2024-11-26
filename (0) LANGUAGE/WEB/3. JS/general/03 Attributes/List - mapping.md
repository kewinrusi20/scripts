- `cities.map(item => ...)`

```tsx
function ListGroup(){  
    const cities = [  
        'New York',  
        'San Francisco',  
        'Tokjo',  
        'London',  
        'Paris'  
    ]  
      
    return <>  
        <ul className="list-group">  
            {cities.map(item => <li className="list-group-item">{item}</li>)}  
        </ul>  
    </>}  
  
export default ListGroup
```


# Length
- `cities.length`

```tsx
if (cities.length === 0)
```

# Empty List
- `cities = []`


# Index
```tsx
cities.map((item, index) =>  
    <li onClick={() => console.log('Clicked', item, index)}>{item}</li>)}
```
(!) It only works if used 2 elements, 'item' and then 'index'


