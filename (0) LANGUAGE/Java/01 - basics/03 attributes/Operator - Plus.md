
# Integers
```java
int a = 0;
int b = (a++)++;
// ERROR
// (a++) is not a variable

a = 0
b = a++
// a = 1
// b = 0


a = 0
b = ++a
// a = 1
// b = 1
```

```java
// print i ++ till 10 --> Answer should 9
// print ++ i till 10 --> Answer should 10
```

```java
int a = 5;
System.out.println(a++);  // 5
System.out.println(a);  // 6

int b = 5;
System.out.println(++b);  // 6
System.out.println(b);  // 6
```


# Strings
```java
String a = "Hello";
String b = a + " World";

System.out.println(a);  // Hello
System.out.println(b);  // World
```
