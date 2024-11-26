# Primitive Date Type
```java
// Integer- / Ordinal- / Kardinal-Type
byte b = 255b; // 8 Bit - 3 digits
// -2^{7} bis 2^{7} - 1
// sign: from -128 to 127

short s = 65_535s; // 16 Bit - 5 digits
// -2^{15} bis 2^{15} - 1
// sign: from -32.768 to 32.767

int i = 4_294_967_295 ; // 32 Bit - 10 digits - 4 GB (?)
// -2^{31} bis 2^{31} - 1
// sign: from -2.147.483.648 to 2.147.483.647
// default value 0

long l = 18_446_744_073_709_551_615L; // 64 Bit - 20 digits
// -2^{63} bis 2^{63} - 1
// sign: from –9.223.372.036.854.775.808
// to 9.223.372.036.854.775.807

// Floating numbers
float f = 10F; // 32 Bits - Mantis() Significant Stellen(7)
double d = 10; // 64 Bits - 

// Character (based on  Unicode)
char c = 'A';       // 16 Bit // 0 bis 2^{16}
char c = 97;        // ASCII-Code
char c = \u0001;    // Unicode
// default value: (strange sign)

// True/False // 1 Byte (8 Bit)
boolean w = true;
boolean w = false;
// defualt value: false
```
- for every *Integer* (expect int) and *Floating Points* Data Type, you always need to the **Literal Suffix** or **Type Suffix**, if not, I will seen as int
	e.g.:  `long num = 123L`


Get Max/Min Value
```java  
byte a = Byte.MAX_VALUE;  // = 127
byte b = Byte.MIN_VALUE;  // = -128
```



# Stack / Heap / Referenz
```java
int i = 10; // "i" is a Primitiv Date Type on the Stack

String s = "Hallo"; 
// "s" is a Referenz on the Stack
// "Hallo" is a Objct on the Heap

Date d1 = new Date(); // "d1" is a Referenz on the Stack
Date d2 = d1; // "d2" is a Referenz on the Stack
```

---

```java
double d = -1.0 / 0.0; // => -Infinity
int i = -1 / 0; // undefined
```

---

```java
public class Parameteruebergabe {

    void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }

    void testSwap() {
        String a = "A";
        String b = "B";
        swap(a, b);
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        new Parameteruebergabe().testSwap();
    }
}

// => A B
```



```java
byte b = -1  // -> 0xff
int i = -1  // -> 0xff ff ff ff

b == i = true
```



# Precise representation of **Decimal Numbers**

## Properties
1. **Precision**: `BigDecimal` can represent very large and very small numbers with great precision, which is important for applications that require exact decimal representation.
2. **Immutable**: Once a `BigDecimal` object is created, its value cannot be changed. Any operation that modifies its value will return a new `BigDecimal` instance.
3. - **Constructor Options**: You can create a `BigDecimal` from:
    - A `String`: This is the preferred way to avoid precision issues.
    - An `int`, `long`, or `double`: However, using `double` can lead to precision loss due to how floating-point numbers are represented in memory.
4. **Arithmetic Operations**: The class provides methods for arithmetic operations like addition, subtraction, multiplication, and division, which can also handle rounding modes.
5.  **Rounding**: You can specify different rounding modes when performing division to control how results are rounded.
6. **Comparison**: `BigDecimal` supports comparisons using methods like `compareTo`, which is better than using `equals` for numerical comparison.


## Example
```java
import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.50");
        BigDecimal num2 = new BigDecimal("3.75");

        // Addition
        BigDecimal sum = num1.add(num2);
        System.out.println("Sum: " + sum); // Output: Sum: 14.25

        // Multiplication
        BigDecimal product = num1.multiply(num2);
        System.out.println("Product: " + product); // Output: Product: 39.375

        // Division with rounding
        BigDecimal quotient = num1.divide(num2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Quotient: " + quotient); // Output: Quotient: 2.8
    }
}
```


### When to Use `BigDecimal`:
- **Financial Applications**: To handle currency values and calculations that require exact decimal representation.
- **Scientific Calculations**: When high precision is necessary for measurements or computations.


# Integer Literals (Literale für Ganzzahlen)
In Java, there are different ways to represent Integer numbers
- **Decimal (Base 10)**:
	- For example, `123`, `0`, `-456`.
- **Binary (Base 2)**: These literals start with `0b` or `0B`. 
	- For example, `0b1010` represents 10 in decimal.
- **Octal (Base 8)**: These literals start with `0` (without an additional `0` prefix). 
	- For example, `0123` represents 83 in decimal.
	- 0123 = (0 × 8³) + (1 × 8²) + (2 × 8¹) + (3 × 8⁰) = 83
- **Hexadecimal (Base 16)**: These literals start with `0x` or `0X`. 
	- For example, `0x1A` represents 26 in decimal.

(**!**) Remember to add the *Literal Suffix* or *Type Suffix*, for Integers other then int

## Example:
Exactly like for `char` variables:
```java
char c = 'A';       // 16 Bit // 0 bis 2^{16}
char c = 97;        // ASCII-Code
char c = \u0001;    // Unicode
```

The same work for **Integers** (byte, short, int, long):
```java
int decimal = 123;
int binary = 0b1010; // 10 in decimal
int octal = 0123;    // 83 in decimal
int hexadecimal = 0x1A; // 26 in decimal
long hexadecimal = 0x1A2B3C4DL; // Represents 439041101 in decimal
```


---
# Formal vs Actual Parameter
- `add(int a, int b)`: a & b are **formal parameter**
- `add(2, 3)`: a & b are **actual parameter**

# Static vs Dynamic Type
- `A a`: Static Type
- `new A()`: Dynamic Type
