> Input < Object

[Input - Godot Doc](https://docs.godotengine.org/en/latest/classes/class_input.html)

# Methods (Functions)
---
Input Keyboard
```python
bool is_action_pressed("ui_left"): 
	# returns true, the moment you press the button
	# and it continues till you release it
```

```python
bool is_action_just_pressed("ui_left"): 
	# returns true, the moment you press the button
bool is_action_just_released("ui_left"): 
	# returns true, the moment you release the button
```

---
Capture Direction
```python
Vector2 get_vector(
	StringName negative_x, 
	StringName positive_x, 
	StringName negative_y, 
	StringName positive_y, 
	float deadzone=-1.0
) const
```

Example
```

```