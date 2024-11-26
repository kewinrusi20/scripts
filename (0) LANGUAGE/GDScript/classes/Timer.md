> Timer < Node < Object

[Timer - Godot Doc](https://docs.godotengine.org/en/latest/classes/class_timer.html#class-timer)


First, to use the methods or properties of the Node Timer,  you need to use `$Timer` inside the code

# Methods

```
void $Timer.start(float time_sec=-1)
void $Timer.stop()
bool $Timer.is_stopped() const
```

Setter
```
$Timer.set_wait_time(2)     # Set Timer
$Timer.set_one_shot(true)   # One Shot
$Timer.start()              # Start
$Timer.stop()               # Stop
```

Getter
```
$Timer.get_wait_time()      # Timer Setted
$Timer.get_time_left()      # Time Left
$Timer.is_stopped()         # Stop
```
