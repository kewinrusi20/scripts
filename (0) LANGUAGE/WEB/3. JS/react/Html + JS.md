```tsx
function App() {  
    const name = 'Bob'  
    return <div><Message name={name} /></div>  
}
```

```tsx
function Welcome({name}){
	return <h1>Welcome {name}</h1>
}
```

---
```tsx
function Welcome(){
	const name = Bob
	return <h1>Welcome {name}</h1>
}
```

---
```tsx
function Welcome(){
	return <h1>Welcome {GetName()}</h1>
}
```
