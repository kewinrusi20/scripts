
# Start
```java
String s;
s = new String();
```



# To Know
- Strings are immutable Objects.
- Every time you modify a String, you end up creating a new one (not actually modifying it).
- To compare the content use `s1.equals(s2)` or `s1.comprareTo(s2)` methods, not `==`.


# Literal: `=` &  `+`
```java
String s1 = "Ein Literal";
String s2 = "Ein verkettetes\n"
            + "Literal";
String s3 = """
     Ein mehrzeiliger
     String""";
```
- By using `\ln` or `"""`, you print in multiple lines

```java
String a = "Hello";
String b = a + " World";

System.out.println(a);  // Hello
System.out.println(b);  // Hello World
```


# More
```java
"Java ist toll".split("av")[1]  // --> a ist toll
```