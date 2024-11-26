# Debug
```c
#ifdef DEBUG
	#define DEBUGMACRO(text) printf(text)
#else
	#define DEBUGMACRO(text)
#endif
```