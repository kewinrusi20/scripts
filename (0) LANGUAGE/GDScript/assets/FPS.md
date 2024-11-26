Move after x frames
```python
func _process(delta):
	if Engine.get_process_frames() % 2 == 0:
		pass  # Run expensive logic only once every 2 process (render) frames here.
```
[source](https://docs.godotengine.org/en/latest/classes/class_engine.html)

```python
func _physics_process(delta):
	if Engine.get_physics_frames() % 2 == 0:
		pass  # Run expensive logic only once every 2 physics frames here.
```
[source](https://docs.godotengine.org/en/latest/classes/class_engine.html)

---
# Display FPS

1. First create a CanvasLayer, inside it a Control, and inside Control a Label
2. Bind a Script to the Label
```python
func _process(delta):
	var fps = Engine.get_frames_per_second()
	self.text = "FPS: "+str(fps)
```
[source](https://docs.godotengine.org/en/latest/classes/class_engine.html)
