![](.\polymorph.png)

in order to create Polyphorm one method in another class, you have to recreate also the revious one

```c++
// Class 1
void setSalary(int a);
```

```c++
// Class 2
void Class2::setSalary(int a) { Class1::setSalary(a) };
void setSalary(int a, int b) { ... };
```