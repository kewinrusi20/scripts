> Source: Chat GPT

Call by reference is a method of passing arguments to a function in which a reference to the argument is passed to the function. This means that when a function is called, the memory address of the argument is passed to the function rather than a copy of the value.

In C++, call by reference is achieved by passing a reference to an object as a parameter to a function, rather than passing the object directly. A reference is denoted by the "&" symbol.

For example, consider the following C++ code:

```cpp
void add_one(int& x) {
    x++;
}
int main() {
    int a = 5;
    add_one(a);
    cout << a << endl;
    return 0;
}

```

In this example, the function "add_one" takes a reference to an integer argument "x" and increments its value. When the function is called in the main function, the memory address of the variable "a" is passed to the function as the argument "x".

Because the function is working with a reference to the original variable, any changes made to the argument within the function will affect the original variable outside of the function.

In a call by reference, the function receives a reference to the argument, not a copy of it, so any changes made to the argument within the function will affect the original value. It should be noted that, in C++, references must be initialized when they are defined. Once a reference is initialized, it cannot be made to refer to a different object.

Call by reference is useful when you want to modify the original value or want to avoid the overhead of copying large objects. It's also useful for passing large structures or classes to a function without incurring the overhead of copying the entire object.