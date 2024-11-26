

```c++
#define MYMACRO(b) 178+a+b*b

int main() {
    return MYMACRO(x+1);
    // retrun 178+a+x+1*x+1);
}
```