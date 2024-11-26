Switch State though the index position
```tsx
// City: Initial State  
const cities_initialState = [  
    {name:'New York', className: 'list-group-item'},  
    {name:'San Francisco', className: 'list-group-item'},  
    {name:'Tokyo', className: 'list-group-item'},  
    {name:'London', className: 'list-group-item'},  
    {name:'Paris', className: 'list-group-item'}  
]  


// City: Live State  
const [cities_liveState, setCities_liveState] = useState(cities_initialState)  


// City: Modified State  
const handleItemClick = (index: number) => {  
    // 1. Take Original List  
    const city_modifiedState = cities_initialState.slice()  
  
    // 2. Modify the List  
    city_modifiedState[index].className = 'list-group-item active'  
  
    // 3. Update the Live List  
    setCities_liveState(city_modifiedState)  
} 
```


Render List
```tsx
const renderListContent = () => {  
    if (cities_liveState.length > 0) {  
        return (  
            <ul className="list-group">  
                {cities_liveState.map((item, index) =>  
                    <li className={item.className}  
                        key={item.name}  
                        onClick={() => handleItemClick(index)}  
                    >Index: {index} | {item.name}</li>  
                )}  
            </ul>  
        )  
    } else {  
        return (<p>no items found</p>)  
    }  
}
```
