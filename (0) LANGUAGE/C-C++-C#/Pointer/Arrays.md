## Arrays on Stack:
Syntax: \<dateType> \<dateName>[\<number>]<br>
```cpp
// Example 1:
int nums[2];
nums[0] = 45; // variation 1
*&nums[0] = 45 // variation 2
*nums = 45; // variation 3

*(nums+1) = 17; // is the same as the previous
nums[2] = 93; // (!) it still work

// Example 2:
char alph[] = "{'a','b','c',}";  // are the "" necessary?
char* alph2 = "asd";
char alp3[len+1]; // the last position symbolize the end of the array (also written as /0)
for
```

### Pointer
```cpp
// copy Address of Array
int nums[n]; // nums is a const pointer for the first value of the array
int* a = nums; // #1 copy the pointer of the array from the first position
int* a = &nums[0] // second variation
int* c = &nums[3]; // set the new pointer from the third 3

nums = a; // did not work, because a is a pointer variable, nums only a P.

// copy Adress only of one of the Array's elements
int* b = nums[1];
```
- #1 // this works, because arrays are also pointers




### Examples
```cpp
    int* p = &nums[1];
    nums[2] = 15;
    *(p + 3) = 99;
    nums[285] = 1;

    cout << "nums[0]" <<nums[0] << endl;
    cout << "p[-1]" << *(p-1) << endl; // 45

    cout << "nums[1]" << nums[1] << endl;    
    cout << "p[0]" << *p << endl; // 51

    cout << "nums[2]" << nums[2] << endl;
    cout << "p[1]" << p[1] << endl; // 15

    cout << "nums[3]" << nums[3] << endl;
    cout << "p[2]" << *(p+2) << endl; // 48

    cout << "nums[4]" << nums[4] << endl;
    cout << "p[3]" << p[3] << endl; // 99

    cout << "nums[5]" << nums[5] << endl;
    cout << "p[4]" << p[4] << endl; // some different int value

    cout << "p[284]" <<p[284] << endl;
    cout << "nums[285]" <<nums[285] << endl; // 1

```






### Arrays on Heap:
Syntax: \<dateType> \<dateName>[\<number>] = new \<dateType>[\<size>]<br> 
delete[] \<arrayName>



```cpp
double * arrheap = new double [n];
arrheap[0] = 170;
delete[] arrheap;

arrheap = array; // ok
array = arrheap; // no, beacuse array is constant
```
new give you a pointer/address back




```cpp
char s[6]; // s in a constant pointer
s = "Hello"; // it didnt work

s[0] = 'H'; // ok

strcpy(s,"Hello");
strcat // concatenate
char * s1 = "Hello";   // "Hello" is saved as an constant array
                       // s1 is not a pointer on the stack 
```

```cpp
char * s1;
s1 = Hallo;

char * s2 = "Welt";
char platz[10];

strcpy(platz, s1);
strcar(platz, s2);

strlen(s1);
strcmp(s1,s2);
```

# Array of Pointers for Objects
```cpp
myClass* mc[10]; // creates 10 Pointers on the stack
// but the Elements of this Pointers, are one the Heap (!)

mc[0] = new MyClass(); // Initialization of the Object
mc[0] -> getName();

myClass** myArrays = new MyClass*[10]; // save the Pointers(Arrays) on the Heap
```


# Matrix
```cpp
// Multidimentional Arrays
int(*nums)[4] = new int[2][4];  

int* myArray = new int[x+y];

myMatrix[xMax*y+yMax]
```

# Note
You can not ask the length of an Array

