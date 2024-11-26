- mostly used for global variable/functions
- you can not create 2 global variable with the same name
- same for 2 global 2 function with the same name

```cpp
// but you can do so:
// file 1:
int counter = 17;

// file 2:
extern int counter;
cout << counter; // --> 17

// here you say, that there is already a variable name counter, and you are going to take that content
```

or you can use static

```cpp

// file 1:
static int counter = 17;

// file 2:
extern int counter = 80;
cout << counter; // --> 80

// now, only the file 1 can see that variable marked with static
```

