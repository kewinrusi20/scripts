# Border
## Types:
```css
border: none;
border: hidden;
border: solid;
border: double;
border: dotted;
border: dashed;

border: inset;
border: outset;
border: groove;
border: ridge;
```
<span style="color:red">Note:</span> if did't work, try with "border-style: ..."

---
## Location Specification
```css

border: Top-Left Bottom-Right;
border: Top Left-Right Bottom;
border: Top Right Bottom Left;

border-top: ;
border-right: ;
border-bottom: ;
border-left: ;
```


## Global vs Computed Value
```css
/* Global Values */
border: inherit;
border: initial;
border: revert;
border: revert-layer;
border: unset;

/* Computed Value */
border-bottom: as specified;
border-left: as specified;
border-right: as specified;
border-top: as specified;w

```

---

<div style="
    background-color: #3F4247;
    border: 1px solid orange;
    border-radius: 6px; 
    padding: 10px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 650;">
<span style="color:#C03000">border-radius</span>: 15px;<br>
border-radius: <span style="color:#C03000">15px 50px</span>;<br>
border-radius: <span style="color:#C03000">15px 50px 30px</span>;<br>
border-radius: <span style="color:#C03000">15px 50px 30px 5px</span>;
</div>

