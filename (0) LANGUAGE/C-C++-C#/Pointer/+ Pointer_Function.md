> C/C++

# Function, send Value
```c
// Imitation of Call by Reference
void increase(int *valp) {
	*valp += 5;
} 

int x = 10; 
increase(&x); // --> x = 11

// You send the Pointer
// So that you can change the contante instantly
```
