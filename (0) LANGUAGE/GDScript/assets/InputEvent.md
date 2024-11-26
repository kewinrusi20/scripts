```python
func _input(event):
	if event.is_action_pressed("jump"):
		jump()


func _physics_process(delta):
	if Input.is_action_pressed("move_right"):
		# Move as long as the key/button is pressed.
		position.x += speed * delta
```
[source](https://docs.godotengine.org/en/latest/tutorials/inputs/input_examples.html#keyboard-events)

