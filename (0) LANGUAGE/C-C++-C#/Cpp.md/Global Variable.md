## Call Global Variables

You can call the Global Value by using `::VariableName`<br>
with "Global" is meat, a value that can be called from every File

Example:
```c++
int sum = 5;

char setName(int art = 0) {
	char* name = "Sum: " + ::value - value;
	return name;
}
```

## version
you can also use `this->variableName`
different: (?)

```c++
int status = 0;

void setstatus(int status) {
	this->status = status;
}
```