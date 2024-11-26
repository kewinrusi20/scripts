
# Installation in Terminal
```shell
pip install pyautogui
pip install keyboard
```

```python
import pyautogui
import time
import keayboard

print(pyautogui.size())

time.sleep(1)
print(pyautogui.position())
pyautogui.click(907,1060)


message = input('type the massage in the terminal')



pyautogui.typewrite(message)
```


# Execute Macro
```shell
python Main.py
```
