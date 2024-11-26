Max FPS
```
int max_fps = 0
void set_max_fps(int value)
int get_max_fps()
```

physics ticks per second
```
int physics_ticks_per_second = 60
void set_physics_ticks_per_second(int value)
int get_physics_ticks_per_second()
```


---
Get current Frame Rate
<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B5B4B4">
<span style="color: #F39E58">float</span> <span style="color: #49A8F4">get_frames_per_second()</span> <span style="color: #F39E58">const</span>
</div>

Get a small timer(frame timer) that start at the start of the app
<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B5B4B4">
<span style="color: #F39E58">int</span> <span style="color: #49A8F4">get_process_frames()</span> <span style="color: #F39E58">const</span>
<br>
<span style="color: #F39E58">int</span> <span style="color: #49A8F4">get_physics_frames()</span> <span style="color: #F39E58">const</span>
</div>

