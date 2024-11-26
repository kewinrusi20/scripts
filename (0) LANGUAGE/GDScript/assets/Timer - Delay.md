Goal: Shot after a set x Delay
```python
var delta_value
func _process(delta):
	delta_value = delta

	delated_shot_forward(600, Vector2.UP, 0.2)


var start_timer: bool = true
func delated_shot_forward(speed, direction, seconds):
	if start_timer:
		$Timer.set_wait_time(seconds)
		$Timer.set_one_shot(true)
		$Timer.start()
		start_timer = false
		
	if $Timer.is_stopped():
		position += speed * direction * delta_value
```