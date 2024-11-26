> C/C++
Global Variable
```cpp
int counter = 0;

void func(int counter) {
	::counter = counter; // --> 51
}
```



> Only C++
Global Variable2
```cpp
int counter = 0;

int func(int counter) {
	this->counter = counter;
}
```