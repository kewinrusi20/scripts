> Overload (Ueberladen)

# Method
You can create different Variation for the same Method name
```java
void setName() {}
```

```java
void setName() {}
void setName(String nameFirst, String nameLast) {}
void setName(String nameFirst, String name Second, String nameLast) {}

boolean setName() {}
String setName(String nameFirst, String nameLast) {}
Person setName(String nameFirst, String name Second, String nameLast) {}
```

---
return value
```java
public static void change() {  
	...
}  
  
  
public static int change() {  // error
	...
    return 1;  
}
```