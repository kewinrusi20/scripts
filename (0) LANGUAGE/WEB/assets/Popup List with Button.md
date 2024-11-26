
```tsx
// Element: Button  
const [buttonPressed, setButtonPressed] = useState(false)  
  
const renderListButton = () => {  
    return (  
        <>  
            <button className="btn btn-primary btn-sm"  
                onClick={() => setButtonPressed(!buttonPressed)}  
            >Display List  
            </button>  
        </>    )  
}
```

```tsx
  
{buttonPressed ? renderListContent() : null}
```