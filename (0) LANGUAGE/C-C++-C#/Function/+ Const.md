> Only C++

# Function, send Value

<span style="color:red">Note:</span><br>
- it send a copy of the Variable and protect the original one
- will not overload the memory

---

```cpp
void printPerson(Person const &p) {} // v1
void printPerson(const Person &p) {} // v2

// here, you did not copy the give Variable/Object, but a copy of the Pointer
// and you can not change the content of the give Variable/Object
// it is good to not overload the memory
```

---
# Function, return Value

Good Use (is with <span style="color:green">Getter</span>):
```cpp
const myObject & getObject() {
	return myObject;
}

// const here meanst that you copy the pointer that can change the content
```

# Function, inner Values

```cpp
const Person & getPerson() const {}
// here you will protect the content of the function
// so that nothing within the function can be changed
// NOTE: the first const is mandatory
```
