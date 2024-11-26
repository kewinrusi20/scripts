
# Properties
*Constructors*:
- none

*Variables*:
- All Variables are in default `public static final`
- Has no Attributes, only `final` konstant

*Methods*:
- All Methods are in default  `public abstract`
- To create non Abstract Methods, add `default`
- **Konkrete**: (?)
- **Abstrakte**: (?)

*More*:
+ Interfaces can `inheritance` multiples other Interfaces with `extends`
+ Can not inherit Classes
+ Class can `implement` multiple interfaces



# Interface
Interfaces are the bind between the Functions and the Game Actions<br>
Youtube: [Java Interfaces in 8 min - Java Programmieren Lernen Deutsch - 36](https://www.youtube.com/watch?v=GcqQDuFUqg8)



# Example 01
## Interface File
```java
interface KillerCatInterface {
    public static Hashmap[] attack() {}
    public static Hashmap[] def() {}
}
```
<span style="color:red">Note:</span>
Methods inside an Interface has a bodies.


## Class File
```java
public class AngryCat extends Animals implements KillerCatInterface, DogInterface {
    @Overwrite
    public Hashmap attack() { ... }
	
    @Overwrite
    public Hashmap def() { ... }
}
```

# Example 02
![Interface_example_01.png](Interface_example_01.png)

```java
public interface Flieger {
    static void start() {}
    public void land();     // #1
    abstract void fly();    // #1
}
```

```java
public class Airplane implements Flieger {
    @Override               // #1
    public void land() {}

    @Override               // #1
    public void fly() {}
}
```
- <span style="color:green">#1</span>
You must Override normal and abstract classes, because we absence of a body
