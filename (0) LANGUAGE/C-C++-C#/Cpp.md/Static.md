Data members that are static must be declared and inizialised outside of the class (at global or file scope).

```h
class foo {
    static int cnt;
    ...
}
```


```c++
#include "foo.h"
int foo:cnt=0;
```
