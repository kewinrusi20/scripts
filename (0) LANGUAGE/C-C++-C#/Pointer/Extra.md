
# Adress of Temp DValue
do not give the adress of local variable back:
```c++
int * Mist() {
	int justDont = 41;
	return &justDont;
}

int* p = Mist(); // the value here, is the one of the next initialized variable
```
here, you will return the adress of a variable, that will be replaced late, because that adress, isnt reserved any more

whas passiert wenn wir