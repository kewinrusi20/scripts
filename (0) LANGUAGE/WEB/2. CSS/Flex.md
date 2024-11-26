> Doc: [css-tricks.com](https://css-tricks.com/snippets/css/a-guide-to-flexbox/)

```css
<div style="	
    display: flex;
	flex-wrap: wrap;
    align-content: flex-start;
    "
>
<div>
```

```html
<div id="flex_container">
	<div></div>
	<div></div>
	<div></div>
</div>
```

```css
#flex_container{
	display: flex;
}

```

---

```css
  .col-1 {
    flex-basis: 10%;
  }
  .col-2 {
    flex-basis: 40%;
  }
  .col-3 {
    flex-basis: 25%;
  }
  .col-4 {
    flex-basis: 25%;
  }
```


---
## Order
```css
.container {
	display: flex;
	flex-direction: row;
	.div1 {
		order: 1;
	}
	.div2 {
		order: 1;
	}
}
```