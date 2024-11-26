# C
> C = Base, Structured, Procedural<br>
> and there are <ins>no object</ins>

```c
#include <stdio.h> 
    // import a file named stdio.h
    // h stand for header, the head of the file like:
    // name, input and output

    // stdtio wird innerhalb das verzeichniss gesucht
    // 
    // import = include (?)
int main (int argc, char* argv[]) { // the c of argc stand for counter
    printf("Hello World");
    return 0;           // return an "ok" statemant because of the 0
}
```


# C++ 
> C++ = Expanded, Object available

## Class version
```C++
#include <iostream>

class hello {
    public:
        static void kuenstlichesMain() {
            std::cout << "Hello world!";   
        } 
}; // (!) close the class with };


// 1:16
int main(int argc, char* argv[]) {
    hello::kuenstlichesMain();              
    return 0;
}
```

## No Class Version
```C++
#include <iostream>
using namespace std;

int main(int argc, char* argv[]){
    cout << "Hello World"  // cout -> c out
    return 0;
}
```

<span style="color:red">Note:</span>
An extra `;` is required at the end of the class to close it.


# C\#
> C# = Java, Object only
```C#

```