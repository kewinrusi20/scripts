# How to apply
> Can be applied to: Images, Text

HTML
```html
<img class="clip-me" src="/images/image-to-be-clipped.png">
<p class="clip-me">I'll be clipped.</p>
```

CSS
```css
.clip-me {
	clip-path: polygon(50% 0%, 90% 20%, 100% 60%, 75% 100%, 25% 100%, 0% 60%, 10% 20%);
}
```

---
# Types
## Polygon
> Toolkit Webpage: [bennettfeely.com](https://bennettfeely.com/clippy/)

<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B5B4B4">
clip-path: <span style="color: #AA0000">polygon</span>(<span style="color: #FF6600">64% 11%</span>, <span style="color: #66BB6A">0 42%</span>, <span style="color: #FFBF4A">48% 55%</span>);
</div>
How it works:
- The system generates points (the amount is decided by the user)
- Every Points starts on the top-left corner (0% 0%)
	- Moving <ins>Right</ins>, increases the <ins>first</ins> value
	- Moving <ins>Down</ins>, increases the <ins>second</ins> value
- You need at least 3 points to display the inside of the content 

![[Pasted image 20231206182712.png]]

---
## Inset
<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B5B4B4">
clip-path: <span style="color: #AA0000">inset</span>(<span style="color: #FF6600">5%</span> <span style="color: #66BB6A">20%</span> <span style="color: #FFBF4A">15%</span> <span style="color: #49A8F4">22%</span>);
</div>

![[Pasted image 20231206182021.png]]


### v2
idk
```css
clip-path: inset(10px 20px 30px 40px)
```

### v3
Deprecated version
```css
position: absolute;
/* absolute or fixed positioning required */
clip: rect(110px, 160px, 170px, 60px);
/* or "auto" */
/* values descript a top/left point and bottom/right point */
```

---
## Circle
<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B5B4B4">
clip-path: <span style="color: #AA0000">circle</span>(<span style="color: #FF6600">35.7%</span> at <span style="color: #66BB6A">54% 38%</span>);
</div>
- First value, is the outside(orange) one
- Second value, is the inside(green) one
![[Pasted image 20231206182207.png]]

---
## Eclipse
<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B5B4B4">
clip-path: <span style="color: #AA0000">ellipse</span>(<span style="color: #FF6600">32%</span> <span style="color: #66BB6A">15%</span> at <span style="color: #FFBF4A">38% 40%</span>);
</div>

![[Pasted image 20231206183838.png]]