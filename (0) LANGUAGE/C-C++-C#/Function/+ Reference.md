> Only C++

# Function, send Value
>Call by Reference

```cpp
// True Call by Reference
void increase(int &value) {
	value++;
}

int x = 10;
increse(x); // --> x = 11

// You create modifie the Variable direcly
// Because you have created a second name for it
// but the content is the same one (on the memory)
```

Variation in C:
```c
// Imitation of Call by Reference
void increase(int *value) {
	*value ++;
} 

int x = 10; 
increase(&x); // --> x = 11

// You send the Pointer
// So that you can change the contante instantly
```

# Function, return Value
```cpp
int& func() {
	return value;
}
// return a copy of value
```

--- 
Example Chaotic Coding:
```cpp
int& func() {
	static int value = 10;
	return value;
}

func() = 20;
func() += func();
```

--- 
Example Ghost Value (Do Not Do):
```cpp
int& max(int a, int b) {
	if(a > b) return a;
	else return b;
}

int main() {
	int x = 11, y = 22;
	int &z = max(x,y);
}

// what happens here is that:
// you initialize a variable a and give it a new name
// but at the end of the function, the memory spot on a will be set free
// and you take an another value instead
```

