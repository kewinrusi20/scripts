
# Multiple Catch
- One try, can have multiple catches depending on the error
- But they also need to be ordered in a specific way:
	- from specific to general (e.g. below)
	- in case of 2 different Exceptions (e.g.: IO and SQL) the order doesn't matter
- The right catch will only be decide on the run time, not during the compiling

```java
try {
	System.out.println("A");
	...
} catch (FileNotFoundException e) {
	System.out.println("B");
} catch (IOException e) {
	System.out.println("C");
} catch (SQLException e) {
	System.out.println("D");
}
```

```java
try {
    ...
}
catch (FileNotFoundException | SQLException e) {
    System.out.println("Rip bozo...:" + e);
}

```


# Simulate Object
```java
assertThrows(IllegalMessageException.class, 
	() -> c.decrypt("C", klarText)
);

assertThrows(IllegaKeyException.class, 
	() -> c.decrypt("C", klarText)
);
```



# Finally
- Finally will **always** be executed after a `try`
```java 
try {  
	System.out.println("A");
	return;  
} catch (Exception e) {  
	System.out.println("B");  
	return;  
} finally {  
	System.out.println("C");
	return;
	System.out.prinln("D");
}
```

Answer
```java
// AC   // Best Case
// ABC  // Worst Case
```


- You can also use finally without `catch`
```java
Scanner sc = new Scanner(System.in);

try {
    ...
} finally {
	sc.close();
}
```



# Inheritance
- Leave declared exceptions unchanged, or
- Omit declared exceptions, or
- Replace declared exceptions with their subclasses, or
- Add exceptions that are subclasses of the declared ones

(Under no circumstances can you add new Checked Exceptions add)

# Example
```java
class A {
    public void method() throws IOException { ... }
}
class B extends A {
    public void method() throws IOException, FileNotFoundException { ... }
}
class C extends A {
    public void method() throws FileNotFoundException { ... }
}
class D extends A {
    public void method() { ... }
}
class E extends A {
    public void method() throws SQLException { ... } // FEHLER!!
}
```