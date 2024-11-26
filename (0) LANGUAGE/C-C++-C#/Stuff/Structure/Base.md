Structure are present in C and also in C++
> Structure are Methodless Classes

## Example
```c++
struct StudentRecord {
    chat* name;     /* student name */
    double hw[3];   /* homeword grades */
    double test[2]  /* test grades */
    double ave;     /* final average */
}; // close with semicolon
```
<span style="color:red">(!)</span>
Dont forget the semicolon !!<br>
(?) You may put a modifier

```c++
// initialize a structure
struct StudentRecord stuC; // C and C++
StudentRecord stuCpp // C++
```

# Asign Value
```c++
struct StudentRecord sth;
stu.ave = 42.0;
```
You can direclty asign a value, without the "new" like in Java


# idk
```c++
cout << stu.ave << endl;
```