# To Know
- Once an Array is initialized, the *size* can not be changed
	The only way is to create a new Array and copy the content with `System.arraycopy()`
- Arrays are *Objects*, i.e. the variable name is a pointer/reference at the object
- The object "Array" has no methods, only:
	- One attribute/variable: `lenght`
	- All the Methods inherited from Object: (e.g.: `toString()`)
	- All the "Helping Methods" came form the *class Array* (java.util.Arrays)

# Initialization
- v1
```java
int[] i = new int[] {1, 5, 7, 9 ,11, 22, 0};
```

- v2
```java
int[] i = {1, 5, 7, 9 ,11, 22, 0};
char[] c = {'a', 'b', 'c'};
String[] s = {"Alfred", "Franz", "Peter"};
```

- v3
```java
int[] i = new int[10];
char[] c = new char[10];
String[] s = new String[10];
Person[] p = new Person[10];  // then: p[0] = new Person();

i[0] = 1;
i[9] = 82;
...
```


## Default Value 
Array always *initialize* with `new`, otherwise the value is `null`, `0` or *undeclared*

- **Primitive** Data-Type: `0`
```java
int[] i = new int[5];
i[0]  // -> 0
i[1]  // -> 0
i[2]  // -> 0
i[3]  // -> 0
i[4]  // -> 0
```

- **Objects**: `null`
```java
String[] s = new String[5];
s[0]  // -> null
s[1]  // -> null
s[2]  // -> null
s[3]  // -> null
s[4]  // -> null
```

- **Arrays** `adress`
```java
int[] a = new int[10];  
System.out.println(a);  // -> [I@15aeb7ab
  
int[] b = {1,2,3,4,5};  
System.out.println(b);  // -> [I@7b23ec81
```




---
Die Elemente eines Arrays von primitiven Typen können direkt Daten aufnehmen. Sie sind nach der Erzeugung mit dem Standard-Wert des jeweiligen Typs initialisiert. Bei Arrays von Objekttypen sind die Elemente `null` und die entsprechenden Objekte müssen erst noch angelegt werden.

Der Satz erklärt, wie Arrays in Java funktionieren, abhängig davon, ob sie primitive Datentypen oder Objekttypen enthalten:

1. **Primitive Typen**: Wenn du ein Array von primitiven Datentypen (wie `int`, `char`, `boolean` etc.) erstellst, werden die Elemente automatisch mit einem Standardwert initialisiert (z.B. `0` für `int`, `false` für `boolean`).

2. **Objekttypen**: Wenn du ein Array von Objekttypen (z.B. `String`, benutzerdefinierte Klassen) erstellst, sind die Elemente standardmäßig `null`. Das bedeutet, dass die Objekte, auf die diese Array-Elemente verweisen, noch nicht erstellt wurden; du musst sie manuell instanziieren.

Zusammengefasst: Primitive Arrays haben Standardwerte, während Objekttyp-Arrays initial `null` sind, bis du sie mit Objekten füllst.

---


```java
// v1
int[] a1 = {0,0};

// v2
int[] a2 = new int[2];
System.out.print(a2[0]) // --> 0

int[0] = 42;
System.out.print(a2[0]) // --> 42
```


# Operator: `+`
```java
public static void main(String[] args) {  
    String num = "num " + 5;  
    System.out.println(num);  // --> num 5
	
	int i = 5
    String num = "num " + i;  
    System.out.println(num);  // --> num 5

}
```



# Multi-dimensional Arrays
```java
int twoDim [][] = new int [4][];
twoDim[0] = new int[2];
twoDim[1] = new int[4];
twoDim[2] = new int[6];
twoDim[3] = new int[8];
```


# Print Array

```java
int[] originalArray = {1, 2, 3, 4, 5};

for (int num : originalArray) {  
    System.out.print(num + " ");  
}  
```


# Copy
```java
int[] a = new int[];

```
- `arrayCopy()`;
