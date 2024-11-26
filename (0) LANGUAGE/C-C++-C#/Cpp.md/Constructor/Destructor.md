```c++
// header file
virtual ~Student();

// cpp file
Student::~Student() {}
```


```c++
class Base {
public:
    Base() { cout << "const. Base" << endl; }
    ~Base() { cout << "dest. Base" << endl; }
};

class Derived : public Base {
public:
    Derived() { cout << "const. Derived" << endl; }
    ~Derived() { cout << "dest. Derived" << endl; }
};
```

```c++
// Main
int main() {
    Derived derived;
    return 0;
}

// Printout:
// --> const. Base
// --> const. Derived
// --> dest. Derived
// --> dest. Base
```

delete[] = 