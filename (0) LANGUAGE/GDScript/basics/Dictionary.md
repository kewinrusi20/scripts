> [Dictionary - Godot Doc](https://docs.godotengine.org/en/stable/classes/class_dictionary.html) here for more

```python
var my_dict = {} # Creates an empty dictionary.

var dict_variable_key = "Another key name"
var dict_variable_value = "value2"
var another_dict = {
	"Some key name": "value1",
	dict_variable_key: dict_variable_value,
}

var points_dict = {"White": 50, "Yellow": 75, "Orange": 100}
```
[source](https://docs.godotengine.org/en/stable/classes/class_dictionary.html)
## Alternative Lua-style syntax
```python
# Doesn't require quotes around keys, but only string constants can be used as key names.
# Additionally, key names must start with a letter or an underscore.
# Here, `some_key` is a string literal, not a variable!
another_dict = {
	some_key = 42,
}
```
[source](https://docs.godotengine.org/en/stable/classes/class_dictionary.html)

