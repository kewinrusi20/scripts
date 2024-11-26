# Signals
```
body_entered(body: Node2D)
```



---
# Custom Signal
## Example 1
Platform Node
```
signal entered_body(body)

func _on_platform_white_area_body_entered(body):
	entered_body.emit(body) 
		# body says with object (Node) entered the area
```

World Node
```
func _on_platform_white_entered_body(body):
	print("Save Point Entered")
```

## Example 2
Player Node
```
func _process(_delta):
	register_skill_1()

signal skill_1

func register_skill_1():
	skill_1.emit()
```

World Node
```
func _on_player_skill_1():
	print("skill 1 fired")
```