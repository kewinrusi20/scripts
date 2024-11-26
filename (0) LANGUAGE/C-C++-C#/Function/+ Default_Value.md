> C/C++

<span style="color:red">Note:</span><br>
- The Default Value, must be place only after the other one<br>
- Better if the Default Value are in the Header files<br>
	- If they are already in the Header file, you can not repeat it in the cpp file
- Default value for the parameter should be assigned to the parameter that comes after the non-default parameters


```cpp
void func(int a, int b = 2) {}
```

Example Default Value:
```cpp
void showstring(char *str = "Hello World!\n") {
	printf(str);
}

func();             // --> Hello World!
func("Hey Bro!\n"); // --> Hey Bro!
```

## Objects
Example:
```cpp
void waschen(Auto a = Auto(1200, 230, "Tesla")) {}
```

## Combinations
```cpp
void two_ints(int a = 1, int b = 4) {}

two_ints();    // Argumente: 1, 4 
two_ints(20);    // Argumente: 20, 4 
two_ints(20, 5); // Argumente: 20, 5
```

## Header file
```cpp
// Header File
void two_ints(int a = 1, int b = 4); // v1
void two_ints(int = 1, int = 4);     // v2

// C/Cpp File
void two_ints (int a, int b) {}
```