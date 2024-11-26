

```cpp
Person* p[2];
```
"Person* p[2]" is an array of two pointers to Person objects. It creates an array of 2 elements and each element is a pointer to an object of type Person.

```cpp
p[0] = new Person();
p[1] = new Person()
```

This creates two new Person objects on the heap and assigns the addresses of those objects to the elements of the array `p`. You can then use the pointers in the array to access the objects they point to.

```cpp
// "setName" is a function of class Person.
p[0]->setName("John");
p[1]->setName("Jane");
```

Remember, when you use new to allocate memory dynamically, it is important to use delete to deallocate it when you are done with it.

```cpp
delete p[0];
delete p[1];
```