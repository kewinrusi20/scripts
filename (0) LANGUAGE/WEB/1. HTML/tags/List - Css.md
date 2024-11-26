# Shortcut
> with `list-style`, you can combine: **Style**, **Position** and **Image**, all in once.
```css
list-style: square inside ult("sqpurple.git");
```

# Position
> Position of the dot/number
```css
ul {
	list-style-position: outside; /* Default */
	list-style-position: inside;
}
```

# Style

## Default Ordered List
```css
list-style-stype: decimal; /* List */
list-style-stype: lower-roman; /* Sub-List */
```
- `none` Hidden one
- `symbol()` Custom
More:
- `decimal-leading-zero`
- `armenian`
- `georgian`
- `upper-alpha` / `lower-alpha`
- `upper-greek` / `lower-greek`
- `upper-latin` / `lower-latin`

## Default Unordered List
```css
list-style-stype: disc; /* List */
list-style-stype: cirle; /* Sub-List */
```
- `none` Hidden one
- `symbol()` Custom
More:
- `square`

---
# Image
> The `list-style-image` property specifies an image as the list item marker:

```css
list-style-image: url('sqpurple.gif');
```