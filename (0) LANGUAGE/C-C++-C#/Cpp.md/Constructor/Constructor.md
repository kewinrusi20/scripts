
```c++
Matrix::Matrix(int an_m_Zeilen, int an_m_Spalten)
: name(), age(), gender() {
    name = this-> name;
    age = this-> age;
    gender = this-> gender;
}
```
In C, do not auto initialize the member variables.

```c++
studenRecord* sr = new StudenRecord(5,5); // save the Object on the Heap
studenRecord sr(5,5); // Save the Object on the Stack
```

```cpp
Person a,b;

a=b;
```

# on Stack
```cpp
Data a;
a.start();

```

# on Heap
```cpp
Data* b = new Data;
Data* b2 = new Data(2,5);
b->start();
delete b; // have to delete
```