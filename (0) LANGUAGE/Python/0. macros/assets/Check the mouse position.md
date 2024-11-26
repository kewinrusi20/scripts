
```python
import time
from pynput import mouse


def on_click(x, y, button, pressed):
    if button == mouse.Button.left and pressed:
        print('x =', x, 'y =', y)


# mouse listening v1
listener = mouse.Listener(on_click=on_click)
listener.start()

# mouse listening v2
# Join the Listener: Keeps the program running until the listener is stopped.
#with mouse.Listener(on_click=on_click) as listener:
#    listener.join()


while True:
	
    # check every x seconds
    time.sleep(3)
```
