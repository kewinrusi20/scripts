# Token Operator
with the double ##, you can bind 2 parameters

## Example 1
```c
float x5 = 16.4:

#define (var, nr) cout << (var##nr)
show(x,5) // -> cout << (x5);
```

## Example 2
```c
#define makeget(type, var) typ get##var() { return var; }
makeget(int,X)       // -> int getX() { return X; }
```