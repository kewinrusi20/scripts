```python
const SPEED: int = 300
var click_position = Vector2()
var target_position = Vector2()

func _ready():
	print(position)
	click_position = position

func _physics_process(delta):
	if Input.is_action_just_pressed("right_click"):
		click_position = get_global_mouse_position()
	
	if Input.is_action_just_pressed("left_click") && position.distance_to(click_position) < 200:
		click_position = position
	elif position.distance_to(click_position) > 3:
		target_position = (click_position - position).normalized()
		velocity = target_position * SPEED
		move_and_slide()

```