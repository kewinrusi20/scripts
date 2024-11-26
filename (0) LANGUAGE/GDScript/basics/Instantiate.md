```
# Inside the Player Node

var big_laser: PackedScene = preload(.../laser.tcsn)

func create_laser(): # let this be a custom signal
	var laser = big_laser.instantiate() as StaticBody2D
	add_child(laser)
```


