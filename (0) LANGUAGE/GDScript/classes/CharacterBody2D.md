> PhysicsBody2D < CollisionObject2D < Node2D < CanvasItem < Node < Object

[CharacterBody2D - Godot Docs](https://docs.godotengine.org/en/4.2/classes/class_characterbody2d.html)


---
# Properties (Attributes)
```python
Vector2 velocity #default: Vector2(0, 0)

# e.g.:
velocity = direction * speed
```


---
# Methods (Functions)
```python
bool move_and_slide()
	# return true if collided
	# return false if not
```
- base function to move the character
- (<span style="color: #AA0000">!</span>) need to set the `velocity` variable
```python
var speed = 400
var direction: Vector2 = Input.get_vector("ui_left", "ui_right", "ui_up", "ui_down")
velocity = direction * speed
```


## Position Difference
Vector2
```
position_goal - position
```

Hypothenuse
```
position.distance_to(position_goal)
```