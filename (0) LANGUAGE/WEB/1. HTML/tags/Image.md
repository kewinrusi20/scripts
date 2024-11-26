HTML
```html
<div id="divPortraid">
	<img src="./Ji-Hoon Park.jpeg" alt="Portraid Image">
</div>
```

CSS
```css
#divPortraid img{
    width: 100%;
    height: 100%;
    object-fit: cover;
}
```
- `contain`: The image is scaled to maintain its aspect ratio while fitting within the element's content box.
- `cover`: The image keeps its aspect ratio and fills the given dimension, potentially being clipped to fit.
- `fill`: The image is stretched to fill the element's content box, possibly distorting the image.
- `none`: The image is not resized.
- `scale-down`: The image is sized as if `none` or `contain` were specified, whichever would result in a smaller concrete object size.

