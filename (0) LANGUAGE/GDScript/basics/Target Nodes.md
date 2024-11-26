You can target other nodes in 2 ways:
- `get_node("<node path>")`
- `$<node path>`


---
## Call Class
- Syntax: `@onready var <Var Name> = $<Node Name>`
- Example:
<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B4B4B4">
@onready <span style="color: #AA0000">var</span> <span style="color: #FFFFFF">my_boy</span> = $<span style="color: #E2D44D">Player</span><br>
<br>
<span style="color: #AA0000">func</span> <span style="color: #2196F3">_process(</span><span style="color: #FFFFFF">delta</span><span style="color: #2196F3">)</span>:<br>
&nbsp&nbsp <span style="color: #FFFFFF">my_boy</span>.<span style="color: #2196F3">rotate_the_shit()</span>
</div>
#ToChange

---
## Change Variable

<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B4B4B4">
<span style="color: #AA0000">func</span> <span style="color: #2196F3">_process()</span>:<br>
&nbsp&nbsp <span style="color: #2196F3">get_node(</span>"<span style="color: #E2D44D">Player</span>"<span style="color: #49A8F4">)</span>.<span style="color: #FFFFFF">rotation_degrees</span> += <span style="color: #B4B4B4">1</span>
</div>
#ToChange


v2
<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B4B4B4">
<span style="color: #AA0000">func</span> <span style="color: #2196F3">_process()</span>:<br>
&nbsp&nbsp $<span style="color: #E2D44D">Player</span><span style="color: #49A8F4"></span>.<span style="color: #FFFFFF">rotation_degrees</span> += <span style="color: #B4B4B4">1</span>
</div>
#ToChange


---
## Nodes ID
```
func _ready():
	print($Buddy) # This is a Sprite2D Node
		#<Sprite2D#27195868365>
		
	print($".") # This is a Node2D Node
		#<Node2D#27179091148>
```


---
## Target
1. Right Click on the Sprite (inside the Scene Menu)
2. Select the option `% Access as Unique Name`

Now, when you drag and drop a Node, it will have the `%` instead of the `$` sign.
- Before
```
$Buddy
```
- After
```
%Buddy
```
