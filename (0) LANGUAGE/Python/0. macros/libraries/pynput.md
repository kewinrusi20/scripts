# Mouse Library `pynput`
```python
pip install pynput
```


---
## Functions
Register Click
```python
def on_click(x, y, button, pressed):
    if button == mouse.Button.left and pressed:
        print('x =', x, 'y =', y)
```
- `on_click()`:

Event Listener
```python
# v1
listener = mouse.Listener(on_click=on_click)
listener.start()


# v2
# Join the Listener: Keeps the program running until the listener is stopped.
with mouse.Listener(on_click=on_click) as listener:
    listener.join()
```
- `Listener()`
- `Listener().start()`
- `Listener().join()`
