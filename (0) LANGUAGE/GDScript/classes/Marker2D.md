Random Locations
```
func idk():
	var laser_marker = $Lasers.get_children()
	var selecter_laser = laser_marker[randi() laser_markers.size()]
	laser.emit(selecter_laser.global_position)
```
- $Lasers are of type Marker2D
