## Example
```c
#define GIBTSNICHT
// or define the konstant inside the terminal "gcc -DGIBTSNICHT"

float calc(int x) {
    #ifdef GIBTSNICHT
        printf(GIBTSNICHT);
    #else
        return RECHNE(1+1);
    #endif
}
```