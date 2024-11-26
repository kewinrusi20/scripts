

```c++
int i = 40;
int* p; // at an empty initialization, it will take a random adress spot from the stack

// change value(adress) within the pointer variable p
p = &i;

p = // change value
*p = // change address
// change value within saved adress (i);
*p += 22;       // i -> 42
int **p2 = &p;  // (?)

int j = *p      // j -> 42
```


```c++
int *p;
p = new int:

*p = 23;
MyClass *m = new MyClass(23);
(*m).get();                     // the () because the pointer dynamic is
m->get(); // use -> to use the adress
```


# Reference
> only (c++)

You can also five a Variable a second name by assigning a second Address to the Variable

Example:
```cpp
int a = 8;
int &a2 = a;

// a = 8 & a2 = 8
a = 5;
// a = 5 & a2 = 5
```

Example with a Function:
```cpp
int a = 0;

// old version
func(&a);
void func(int* a) {	*a = 1; }

// new version
func2(a);
void func2(int& a) { a = 1; }
```


# Create More Pointer at the same time
```c++

double * d;     //  1 pointer of double type
double * d[10]; // 10 pointer of double type
```

## pointers on Heap (?)
```c++
int ** dp = new int*(); // (?)

int a = 23;
*dp = &a;
**dp = 24;

// ---

int *dp2 = new int(n); // (?)
```