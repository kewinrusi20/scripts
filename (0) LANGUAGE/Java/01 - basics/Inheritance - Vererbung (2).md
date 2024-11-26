# Inherit (Vererben)
```java
public class Animal { ... }
public class Panda extends Animal { ... }
```
<span style="color:red">Note 1:</span>
You can use 
<ins>one inherit pro class
</ins>.
But you can creare a
<span style="color:green">chain</span>
or
<span style="color:green">hierarchy</span>
of classes.


Use the command
<span style="color:green">super</span>
to call the 
<ins>upper class</ins>
.

the lower one is called "subclass".

<span style="color:red">Note 2:</span>
You also can't inherit the "
<span style="color:red">Constructor</span>
".


# Polymorphismos (Vielgestaltigkeit) 


# Static Variable/Methods
idk but it should work.

# Dynamic Bind
<span style="color:red">Note:</span>
it work mostly for hidden methods, not for hidden felder(?)/variables or attributes(?).

When UpperClass can also his Subclass

You can creare a new Object for the subclass, and give the parameter for his upper class.



# Prohibit inherit  (final)
```java
public final class myClass
```
> you can not inheirt final classes

---

When casting from sub class, to it upper class:
- it (hides) the new Attributes and Methods
- and also replace the attribute value from the sub classes


### Cast
Down-Cast / 
From Upper(Father) Class to Down Class

Up-Cast
From Down to Upper Class

# getInstanceof / getClass
![getInstanc_example_01.png](getInstanc_example_01.png)


# Abstract
If a Upper Class has an Abstract Method (must be empty)<br>
This mean that the Down Class has to recreate the method

## Example
```java
class Animal

```