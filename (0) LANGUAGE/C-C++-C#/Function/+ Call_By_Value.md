> Source: Chat GPT

Call by value is a method of passing arguments to a function in which the value of the argument is passed to the function. This means that when a function is called, a copy of the argument is made and passed to the function.

For example, consider the following C++ code:

```cpp
void print_number(int x) {     
	cout << x << endl;
} 
int main() {
	int a = 5;
	print_number(a);
	return 0;
}
```

In this example, the function "print_number" takes an integer argument "x" and prints its value. When the function is called in the main function, the value of the variable "a" is passed to the function. A copy of the value of "a" is made and passed to the function as the argument "x".

Because the function is working with a copy of the argument, any changes made to the argument within the function will not affect the original variable outside of the function.

In a call by value, the function receives a copy of the argument, not the original object, so any changes made to the argument within the function will not affect the original value.

It is important to note that call by value is the default way of passing arguments in C++ and other programming languages.