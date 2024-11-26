> Only C++



# Call By Reference<br>
<span style="color:red">Note:</span><br>
- Reference create a second name for a Variable
- You can **not** give more that one "Copy" of a Variable
- You can **not** create a Reference for a Reference

---

Example
```cpp
int i; 
int &j = i;

// here both have the same value
// if you change one, you will also change the other one
```


# Variables/Pointer Protection
> more: [Const Correctness, C++ FAQ (isocpp.org)](https://isocpp.org/wiki/faq/const-correctness)
## Value Protection
```cpp
const int len = 10; 
const int* pC = &len; // Ok
int* p = &len;       // Error: the other one must also be Const


*pC = 200; // Error: the value is protected
pC = NULL; // Ok
```

## Pointer Protection
```cpp
int a = 100;
int* const p = &a;

*p = 200; // ok
p = NULL; // Error: the pointer is protected

// here you protect the pointer
// but not the content
```

## 360 Protection
```cpp
const int a = 100;
const int* const p2 = &a;

*p2 = 200; // Error: the value is protected
p2 = NULL; // Error: the pointer is protected
```

# Remove Const

```cpp
void editTruck(const Truck* constTruck) { 
	Truck* nonConstTruck = const_cast(constTruck); 
	nonConstTruck->setWeight(22);
}
```
