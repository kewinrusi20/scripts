![[Pasted image 20240103224900.png]]
[source](https://www.youtube.com/watch?v=nAh_Kx5Zh5Q&t=4425s)

## Example
```
var ratation_speed

func rotate_the_shit(delta):
	ratation_speed = (80 * delta)
	rotation_degrees += ratation_speed
```


---
# Disable Delta Value
Before
```
func _process(_delta)
```

After
```
func _process(_delta)
```
