# Variables within Functions
```java
public static void main(String[] args) {  
    int i = 5;  // Value
    String s = "safe";  // Value
    int[] a = {9, 0}; // Reference
    
    change(i, s, a);  
    System.out.println(i);  // --> 5
    System.out.println(s);  // --> safe
    System.out.println(a[0] + a[1]);  // --> 0
}
  
public static void change(int i, String s, int[] a) {  
    i = 42;  
    s = "rip";  
    a[0] = 0;  
}
```
- Primitiv data type: call by value
- Strings: call by value
- Arrays: call by reference

## Example with a **Variable**
```java
public static void main(String[] args) {  
    int a = 5;  
    int b = 1;  
    System.out.printf("a: %d, b: %d\n", a, b);  
    swap(a, b);  
    System.out.printf("a: %d, b: %d\n\n", a, b);  
  
    int[] i = {7, 1};  
    System.out.printf("a: %d, b: %d\n", i[0], i[1]);  
    swap(i);  
    System.out.printf("a: %d, b: %d\n", i[0], i[1]);  
}  
  
public static void swap(int a, int b) {  
    int temp = b;  
    b = a;  
    a = temp;  
}  
  
public static void swap(int[] i) {  
    int temp = i[0];  
    i[0] = i[1];  
    i[1] = temp;  
}
```

## Example with an **Array**

![[Pasted image 20241031132129.png]]

