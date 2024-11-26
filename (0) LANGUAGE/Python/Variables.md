All Types:\

|   |   |
|---|---|
|Text Type:|`str`|
|Numeric Types:|`int`, `float`, `complex`|
|Sequence Types:|`list`, `tuple`, `range`|
|Mapping Type:|`dict`|
|Set Types:|`set`, `frozenset`|
|Boolean Type:|`bool`|
|Binary Types:|`bytes`, `bytearray`, `memoryview`|
|None Type:|`NoneType`|


Mutable Variable Types
- str
- int
- float
- bool
- byte
- tuple

Immutable Variable Types
- list
- set
- dict

?
- complex


---
Variables
```python
age = 41 # int
id: long = 18010515 # Manual type assignment to a variable
x = int(20) # You also can cast an empty Variable

name = 'Marc' # String
alive = True # boolean

# Floating Point
x = 35e3  
y = 12E4  
z = -87.7e100

x = range(6) # range

# Multiline String with ''' or """
a = '''Lorem ipsum dolor sit amet,  
consectetur adipiscing elit,  
sed do eiusmod tempor incididunt  
ut labore et dolore magna aliqua.'''

# Slice a String
welcome = 'Hello, World!'
betwwen = welcome[1:5] # c = 'ello' (!) you need to add +1 at the 2. part
start = welcome[:5] # start = 'Hello' (!) you need to add +1 at the 2. part
end = welcome[7:] # end = 'World!'
negative = welcome[-5:-2] # negative = 'orl'
```

```python
job = profession = 'Electricialn'
name, age = Marc, 25
x, y, z = coordiantes 
	# coordinates = [65, 12, 82] 
	# => x = 65, y = 12, z = 82
x, y, z = '651282' 
	# => x = 65, y = 12, z = 82
```

Arrays
```python
names = ('Andrea', 'John', 'Philip') # tuple
numbers = [1,2,3] # list
colors = { # dict
    'red' = True,
    'green' = True,
    'purple' = False,
    'blue' = True
}
fruits = {'apple', 'banana', 'strawberry'} # set
fruitsCold = frozenset({'apple', 'banana', 'strawberry'}) # frozen set
```

---
## Iteration though a Dictionary
```python
my_dict = {"a": 1, "b": 2, "c": 3}

result = [(key, value) for key, value in my_dict.items()]
print(result)
# => [('a', 1), ('b', 2), ('c', 3)]

# If you only need the values, you can do:
# values = [value for value in my_dict.values()]
```

```python
my_dict = {"a": 1, "b": 2, "c": 3}

for key, value in my_dict.items():
    print(f"Key: {key}, Value: {value}")
    
# => Key: a, Value: 1
# => Key: b, Value: 2
# => Key: c, Value: 3
```

### 2 Ways of Iteration
```python
menu_options = {
	'welcome' : {'text':'Yo'},
	'continue' : {'status':True, 'text':'Continue'},
	'new' : {'text':'Continue'},
	'load' : {'status':True, 'text':'Continue'},
	'setting' : {'text':'Continue'},
	'exit' : {'text':'Continue'}
}
font_color = (0, 0, 0)

count_options = len(menu_options)
list_options = []
```

Solution 1:
```python
for key, value in menu_options.items():
	if key == 'welcome':
		continue
	else:
		for sub_key, sub_value in value.items():
			if sub_key == 'status' and sub_value == False:
				count_options -= 1
			if sub_key == 'text':
				list_options.append(font.render(f"{sub_value}", True, font_color))
print(count_options)
```

Solution 2:
```python
for key, value in menu_options.items():
	if key == 'welcome':
		counter -= 1
	if 'status' in value and value['status'] == False:
		counter -= 1
	if 'text' in value:
		list_options.append(font.render(f"{value['text']}", True, font_color))
print(counter)
```

---
## Iteration through a List

**Problem**: Avoid the execution of the last line of code at the last iteration 

Solution 1:
```python
for element in menu_rendered:
	video_settings.screen.blit(element, (text_width_position, text_height_position))
	text_height_position += element.get_rect().height

text_height_position -= menu_rendered[0].get_rect().height
```

Solution 2:
```python
counter = 0 
for element in menu_rendered: 
	video_settings.screen.blit(element, (text_width_position, text_height_position))
	counter -= 1 if counter < len(menu_rendered):
	text_height_position += element.get_rect().height
```

Solution 3:
```python
for counter, element in enumerate(menu_rendered):
	video_settings.screen.blit(element, (text_width_position, text_height_position))
	print(counter)
	if counter < len(menu_rendered):
		text_height_position += element.get_rect().height
```

---
## Global Variables
Create Global Variable
```python
global x = 2 
# ERROR: 
# initialization and definition must be separated
```

_Create_ Global Variable (inside the local scope)
```python
def myFunc():
    global x
    x = 2
    print(x)

print(x) # ERROR: x not found
myFunc()
print(x) # => 2
```

_Modify_ Global Variable (inside the local scope)
```python
x = 2

def myFunc():
    global x
    x = 42

print(x) # => 2
myFunc()
print(x) # => 42
```
(?) is x now global?

---
Casting
```python
x = str(3)    # x will be '3'  
y = int(3)    # y will be 3  
z = float(3)  # z will be 3.0
```

Get Variable Type
```python
x = 42
print(x)
print(type(x)) # <class 'int'>
```

Get Variable Memory
```python
x = memoryview(bytes(5))
print(x) # => <memory at 0x01368FA0>
```

---
## Conversion
```python
def get_random_coordinates_for_spawn(self):  
    # Area that can spawn  
    self.x = random.randrange(0 - int(self.fly.get_rect().right * 0.5), video_settings.screen_width - int(self.fly.get_rect().right * 0.5), 1)
```

---
![[Screenshot_2023-10-11-18-55-17-02_f9ee0578fe1cc94de7482bd41accb329.jpg]]