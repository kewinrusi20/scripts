# Header Guards
> The Header Guards are used to prevent double or more calls for the header file in the preprocess phase.

---
## Example "VSCode"
> Syntax: `__<headerFileName>_<headerExtentionName>`
```c++
#ifdef __VECTOR_HEADER__
#define __VECTOR_HEADER__

...

#endif //__VECTOR_HEADER__
```

```c++

#ifndef FUNC_H
#define FUNC_H

...

#endif //FUNC_H
```

## Example "CLion"
> Syntax: `<directoryName/projectName>_<headerFileName>_<headerExtention>`
```c++
#ifdef HCLASS_MATRIX_H
#define HCLASS_MATRIX_H

...

#endif // HCLASS_MATRIX_H
```
