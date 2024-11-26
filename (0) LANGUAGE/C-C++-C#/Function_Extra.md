# Pre-Defined Variables within Functions
if you create a Function:<br>
`setName(char* Name) {}`<br>
you have to send a Variable while calling the function.

Bu can also give the Variable of the Function a standard value with:<br>
`setName(char* Name = "unknown") {}`

it also work for predefine Objects
```c++
void Wash(Auto a) {};
void Wash2(Auto a = new Auto()) {};a
```

## Header
The declaration of the predefined Value are made in the Header file.<br>
Example:
```c++
// Header File
void stat(int a = 1, int b = 6) {} // version 1
void stat(int = 1, int = 6) {} // version 2
```

```c++
// C++ File
void stat(int a, int b) {}
```


## More
```c++
void score(int a = 1, int b = 4)

score(); // Argumente: 1, 4 
score(20); // Argumente: 20, 4 
score(20, 5); // Argumente: 20, 5

score(,6) // NO !!
```
You can let the previous Value empty, and skip direkt to the next