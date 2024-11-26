String are immutable Objects. That means, that at every change, you end up creating new Objects (that are immediately discarded). A more efficient e nicer way is to use `StringBuilder` or `StringBuffer`

## Properties
- Both are mutable Strings
- Both, like String, are build with `CharSequence`

## Example
```java
StringBuilder a = new StringBuilder();

a.append("Hello").append(' ').append("World");
System.out.println(a.toString()); // -> Hello World
```

---
# Comparison
Der Unterschied zwischen `StringBuilder` und `StringBuffer` liegt darin, dass `StringBuffer` _threadsicher_ ist und `StringBuilder` nicht. Wenn es zu keinem konkurrierenden Zugriff (siehe unten) durch mehrere Threads kommt, ist die Klasse `StringBuilder` vorzuziehen, weil sie effizienter Arbeitet.

(**!**) `equals` von `StringBuilder` und `StringBuffer` vergleicht nicht den Inhalt:
```java
var sb1 = new StringBuilder("Hallo");
var sb2 = new StringBuilder("Hallo");
System.out.println(sb1.equals(sb2)); // -> false
```

# More
```java
StringBuilder sb = new StringBuilder("Carl Sucks");
```
- `sb.setLength(4);`  // Carl
