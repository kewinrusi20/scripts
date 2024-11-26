A Dynamic Object is saved on the Heap, not on the Stack, and it will be not erased by the Garbage Collector.<br>
if too many Static Object are created, that it will occur a memory leak


# \[C] Reserve Memory on the Heap `malloc`& `free`
<span style="color:red">(!)</span> malloc did not call the constructor, new did

```c
#include <stdlib.h>
// malloc = mamory allocation
void* malloc(size_t size){} // #1
int *p;

ip = (int *) malloc(sizeof(int));
ip = (int *) malloc(sizeof(*p))   //alternative
```
- #1 size_t reserve the maximal size possible (in Bytes)
- the function will return `NULL`, when the size requested wasn't able to be reserved

## Free Memory
```c++
#include <stdlib.h>
free(void *) {};
free(p); // -> crash, if ip==NULL

ip = NULL; // maybe (?)
```


# \[C++] Reserve Memory on the Heap `new` & `delete`
```c++
int *ip; 
ip = new int; // c version: ip = (int *) malloc(sizeof(int));
```

```c++
detele ip; // it not crash if ip==NULL
```