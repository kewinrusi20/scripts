# Style
## Write
```js
// Within Html
<tag style="background-color: #6A0009"></tag>
```

### CSS
```
tag {
	cursor: pointer;
    text-align: center;
    font-size: 25px;
    border: 1px solid red;
    padding: 25px ;
                 
    color: #FFFFFF;
    opacity: 0.5;
    background-color: #FFFFFF;
    background-color: rgb(255,255,255);
    background-color: rgba(255,255,255,0.5);
                 
    width: 40px;
    width: 100%;
    hight: 50px;
                
    box-shadow: 0 6px 6px rgba(0, 0, 0, 0.6);
}
```
## Hover
```js
<!-- mouse over link -->
a:hover {...}

<!-- selected link -->
a:active {...}
```

### Show hidden elements
```js
<div class="myDIV">Hover over me.</div>
<div class="hide">I am shown when someone hovers over the div above.</div>
.hide {display: none;}
.myDIV:hover + .hide {display: block;}
```

The adjacent sibling selector (+) selects all elements that are the adjacent siblings of a specified element. The word "adjacent" means "immediately following", and the example above selects all elements with class=".hide", that are placed immediately after elements with class=".myDIV", on hover.


# Link
```js
<!-- you can add this to a text -->
<a>link to a side</a>
<img src="https://... .jpg">
<a href="./anotherpage.html">

<!-- unvisited link -->
a:link {...}

<!-- visited link -->
a:visited {...}
```

# Trenner
```js
<br>
<hr>
```
