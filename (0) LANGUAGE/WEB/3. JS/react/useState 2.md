Change status of a variable

## Example 1
```tsx
const [buttonPressed, setButtonPressed] = useState(false)

setButtonPressed(prevState => !prevState)  // v1
setButtonPressed(!buttonPressed)  // v2
```

## Example 2
```tsx
const [indexCities, setIndexCities] = useState(-1)

{cities.map((item, index) =>
	<li onClick={() => setIndexCities(index)}
	>{item}</li>}
```
