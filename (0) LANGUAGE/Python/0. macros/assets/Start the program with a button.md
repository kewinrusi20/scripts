
```python
import time  
import keyboard  
  
  
loop_active = False  
def toggle_loop():  
    global loop_active  
    loop_active = not loop_active  
  
    if loop_active:  
        print("Program Pau Started")  
    else:  
        print("Program Pau Stopped")  
  
  
# F6 with start the program  
keyboard.add_hotkey('F6', toggle_loop)  
  
  
while True:  
    time.sleep(1)  # loop code every x seconds  
  
    if loop_active:  
        print("Program Pau is running...")
```
