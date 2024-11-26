1. Ternary operator **v1**:
```javascript
// Syntax
condition ? expressionIfTrue : expressionIfFalse;

// Example
status_light ? "It's ON" : "It's OFF";
```

2. Ternary operation **v2**:
```tsx
condition && expressionThatsAlwaysTrue
// return always the first statament
```

More:
- `true && 'Tree'` result is **Tree**
- `false && 'Tree'` result is **false**

# Example in React
```tsx
<h1>List Group</h1>  

{cities.length === 0 && <p>no items found</p>}
// **in theory**
// is the list is empty
// the if statment will return false
// an the part below will not be rendered

<ul className="list-group">  
    {cities.map((item, index) =>  
        <li>Name: {name}</li>)}  
</ul>
```