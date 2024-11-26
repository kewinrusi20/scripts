# Attributes
- `BYTES`
- `MAX_VALUE`
- `MIN_VALUE`
- `SIZE`


# Compare
- `Integer.compare(x,y)`
- `Integer.compareUnsigned(x,y)`

- `Character.isLetter(char c);`
- `Character.isLetter(int CodePoint);`
- `Character.isLowerCase(char c);`
- `Character.isLowerCase(int codePoint);`
- `Character.isUpperCase(char c);`
- `Character.isUpperCase(int codePoint);`
- `Character.isAlphabetic(int codePoint);`
- `Character.isDigit(char c);`
- `Character.isDigit(int codePoint);`
- `Character.isLetterOrDigit(char c);`
- `Character.isLetterOrDigit(int codePoint);`

- `Boolean.logicalAnd(boolean a, boolean b);`
- `Boolean.logicalOr(boolean a, boolean b);`
- `Boolean.logicalXor(boolean a, boolean b);`



# Math
```java
Integer.max(4,1);  // 4
Integer.max(4,1);  // 1
Integer.sum(4,1);  // 5
Integer.divideUnsigned(10,2);  // 5
```


# Convert
Difference:
- `Integer.parseInt();` returns a primitive data type
- `Integer.valueOf()` returns an object

- Both `Integer.parseInt();` and `Integer.valueOf()`
```java
Integer.parseInt("4")  // 4
```

- Both `Integer.parseInt();` and `Integer.valueOf()`
```java
Integer bin1 = Integer.valueOf("101010101", 2);  // 341
int bin2 = Integer.parseInt("101010101", 2);  // 341
int bin3 = 0b101010101;                       // 341

Integer octal1 = Integer.valueOf("123", 8);  // 341)
int octal2 = Integer.parseInt("123", 8);      // 83
int octal3 = 0123;                            // 83

Integer hex2 = Integer.valueOf("1A", 16);  // 341)
int hex2 Integer.parseInt("1A", 16);          // 26
int hex3 = 0x1A;                              // 26
```

- Only for `Integer.parseInt();`
```java
Integer.parseInt("The value is: 101010101", 14, 23, 2);  // 341
```

- `Integer.parseUnsignedInt()`
```java
Integer.parseUnsignedInt("4294967295");  // -1  
Integer.parseInt("4294967295");  // NumberFormatException
Integer.parseInt("2147483647");  // 2147483647
```
It allows to convert un sign number to sign number


# Character
```java
Character.getNumericValue('0');  // 0
Character.getNumericValue('A');  // 10
Character.getNumericValue('a');  // 10
```

```java
Character.isLowerCase();
Character.isUpperCase();
Characteris
```