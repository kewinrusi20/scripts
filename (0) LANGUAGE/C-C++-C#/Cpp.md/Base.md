# Classes
## Syntax 
to use methods of other classes:
```C++
<className>::<methodName>();
```

## Example
```c++
#include <iostream>

class hello {
    public:
        static void kuenstlichesMain() {
            std::cout << "Hello world!";    
}; // (!) close the class with };


// 1:16
int main(int argc, char* argv[]) {
    hello::kuenstlichesMain();              
    return 0;
}
```