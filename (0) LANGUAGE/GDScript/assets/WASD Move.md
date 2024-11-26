
```python
const SPEED: int = 300

func _process(delta):
	let_him_move()


func let_him_move():
	velocity = register_direction() * SPEED
	move_and_slide()


func register_direction():
	return Input.get_vector("left", "right", "up", "down")


func move_body(direction, delta):
	position += direction * SPEED * delta

```
