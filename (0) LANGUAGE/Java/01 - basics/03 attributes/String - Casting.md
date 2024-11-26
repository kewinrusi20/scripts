# To String
- With Operator `+ ""`
```java
double value = 42.5;
String str = value + "";  // "42.5"
```

- `String.valueOf()`
```java
int num = 100;
String str = String.valueOf(num);  // "100"
```

- `.toString()` for **Objects** only
```java
Integer numObj = 100;
String str = numObj.toString();  // "100"
```
- This works by using the `toString()` method of each Wrapper Objects.
- For primitives, you'll need to wrap them in their corresponding wrapper classes (like `Integer`, `Double`, etc.).



# To Primitive type or Objects
- parse
```java
int num = Integer.parseInt(str);  // 123
double value = Double.parseDouble(str); // 45.67
boolean flag = Boolean.parseBoolean(str); // true
```
