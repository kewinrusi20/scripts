
# Cool to know

### Combo: Program started and directly focused
```python
<Event(32774-WindowShown {'window': None})>
<Event(32768-ActiveEvent {'gain': 1, 'state': 2})>
<Event(32785-WindowFocusGained {'window': None})>
<Event(770-TextEditing {'text': '', 'start': 0, 'length': 0, 'window': None})>
<Event(32770-VideoExpose {})>
<Event(32776-WindowExposed {'window': None})>
<Event(4352-AudioDeviceAdded {'which': 0, 'iscapture': 0})>
```

## alt tabing windows
### 'alt' key registered
```python
<Event(768-KeyDown {'unicode': '', 'key': 1073742050, 'mod': 256, 'scancode': 226, 'window': None})>
<Event(769-KeyUp {'unicode': '', 'key': 1073742050, 'mod': 0, 'scancode': 226, 'window': None})>
```

### losed focus on the windows (by pressing tab)
```python
<Event(32768-ActiveEvent {'gain': 0, 'state': 2})>
<Event(32786-WindowFocusLost {'window': None})>
<Event(770-TextEditing {'text': '', 'start': 0, 'length': 0, 'window': None})>
```

## Closed Windows as not focused
```python
<Event(32768-ActiveEvent {'gain': 1, 'state': 2})>
<Event(32785-WindowFocusGained {'window': None})>
<Event(32787-WindowClose {'window': None})>
<Event(256-Quit {})>
<Event(32770-VideoExpose {})>
<Event(32776-WindowExposed {'window': None})>
```

## Closing windows from the Task Manager
```python
#first the windows need to be unfocused
#then standard closure
<Event(32787-WindowClose {'window': None})>
<Event(256-Quit {})>
```

### Program Closed, but never get focused in the first place
```python
<Event(32774-WindowShown {'window': None})>
<Event(32770-VideoExpose {})>
<Event(32776-WindowExposed {'window': None})>
<Event(4352-AudioDeviceAdded {'which': 0, 'iscapture': 0})>
```
### ...
```python
<Event(32787-WindowClose {'window': None})>
<Event(256-Quit {})>
```

