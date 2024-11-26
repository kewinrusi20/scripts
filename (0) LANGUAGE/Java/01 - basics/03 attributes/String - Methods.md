
## Length
```java
String[] colors = {"red","blue","green"};
```
- `colors.length;`  // --> 3
	- (**!**) length is a attribute (variable)


---
## Index
```java
String s = "Carl Sucks";
```
- `s.indexOf(T);`
	- `'S'`         // 5
	- `"Suc"`      // 5
- `s.startsWith(T);`
	- `"a"`       // false
	- `"C"`       // true
	- `"Carl"`  // true
	- `"a"`       // false
	- `"Suc"`   //  false
- `s.charAt(0);`  // C



## Replace
```java
String s = "Carl Sucks";
```
- `a.replace('c', 'S');`  // Carl SuSks
- `s.toUpperCase();`         // CARL SUCKS
- `s.toLowerCase();`         // carl sucks

## Compare
```java
String s1 = "Carl Sucks";
String s1 = "Carl Sucks";
String s2 = "carl sucks";
```
- `s1 == s2`                              // false (true only in case of memory optimisation)
- `s1.equals(s2)`                     // true
- `s1.equalsIgnoreCase(s3)`  // true
- `s1.contains("Carl")`           // true

---
Yes, the `compareTo()` method is indeed part of the `String` class in Java. This method is used to compare two strings lexicographically.

### Syntax:

```java
`int result = str1.compareTo(str2);`
```

### How `compareTo()` Works:

- **Returns `0`** if `str1` is equal to `str2`.
- **Returns a positive integer** if `str1` is lexicographically greater than `str2`.
- **Returns a negative integer** if `str1` is lexicographically less than `str2`.

### Example:
```java
String str1 = "apple"; 
String str2 = "banana"; 
String str3 = "apple";  int result1 = str1.compareTo(str2); 
// result1 will be negative int result2 = str1.compareTo(str3); 
// result2 will be 0 int result3 = str2.compareTo(str1); 
// result3 will be positive`

```

### Explanation:
- `str1.compareTo(str2)` gives a negative result because "apple" is lexicographically less than "banana".
- `str1.compareTo(str3)` gives `0` because the strings are equal.
- `str2.compareTo(str1)` gives a positive result because "banana" is lexicographically greater than "apple".

The `compareTo()` method is particularly useful for sorting strings in natural alphabetical order.



---
## Split
```java
String s = "Carl Sucks Bad";
```
- `String[] a = s.split(" ");` // `[Carl, Sucks, Bad]`
- `String s2 = s.split(T)[n]`
	- `s.split("Sucks")[0]`      // "Carl "
	- `s.split("Sucks")[1]`      // " Bad"
	- `s.split("Sucks")[2]`      // `indexOutOfBound`
	- `s.split("0")[0]`             // Carl
	- `s.split("0")[1]`             // Sucks
	- `s.split("0")[2]`             // Bad
- `char[] a = s.toCharArray()`                     // C, a, r, l,  , S, u, c, k, s,  , B, a, d
- `s.substring(5)`                      // Sucks Bad
- `s.substring(5, 9)`                // Sucks


```java
String s = "   Carl Sucks   "; 
```
- `s.trim();`  // "Carl Sucks"

## Join
```java
String[] colors = {"red","blue","green"};
```
- `String.join("-",colors);`  // --> red-blue-green
- use StringBuilder



# idk
- Specific position `.codePointAt()`
```java
String s = "Hello";  
int i = s2.codePointAt(0);  // -> 72
// it converts the charter into ascii code
```

- Copy (partial) `.substring()`
```java
String s = "Hello";
String singleCharStr = s.substring(0, 1);  // -> He
```

- Length is 0  `.isEmpty()`
```java
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();

if (input.isEmpty()) ...
```

