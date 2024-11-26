```html
<select name="my-select" id="fruit">
  <option value="opt1">Apples</option>
  <option value="opt2">Grapes</option>
  <option value="opt3">Pears</option>
</select>
```
https://developer.mozilla.org/en-US/docs/Web/CSS/:checked


--- 
Firefox only (?)
```html
<select id="gender">
  <option>male</option>
  <option>female</option>
  <option>others</option>
</select>  
```

```css
select#gender option[value="male"] { 
	background-image:url(male.png);
}

select#gender option[value="female"] { 
	background-image:url(female.png);
}

select#gender option[value="others"] {
	background-image:url(others.png);
}
```
In other browsers the only way of doing that would be using some JS widget library, like for example jQuery UI, e.g. using Selectable.
