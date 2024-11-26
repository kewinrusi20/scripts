Content:
- **Function inside Variables**
- **Function inside HTML Elements**


# Function inside Variables
## Function Expression
```tsx
const myFunction = function() {
    console.log("Hello from myFunction!");
};

// Call the function
myFunction();
```

## Arrow Function
```tsx
const myArrowFunction = () => {
    console.log("Hello from myArrowFunction!");
};

// Call the function
myArrowFunction();
```

## Named Function
```tsx
const myNamedFunction = function namedFunction() {
    console.log("Hello from namedFunction!");
};

// Call the function
myNamedFunction();
```


---
# Function inside HTML Elements
```html
<li onClick={() => console.log('Clicked')}></li>)}
```