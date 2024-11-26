
# Syntax
```java
class A {}
class B extends A {}
```

---
Private Attributes/Variables
```java
class A {  
     private void text(){  
        System.out.println("Text A");  
    }  
}

package polyw;  
  
class B extends A {  
    public void text(){  
        super.text(); // ERROR (!)
    }  
}
```
the sub class, does not inherit/see private method/variables

--- 
# More
Hidden Extension
```java
class Employer extends Object {}
```
Every Upper Class Inherit from Object

---
![](Pasted%20image%2020230411135410.png)
Adapter Class, implements all the Abstracted Methods to prevent other classes to became Abstract. if everything is not implemented (but the Adapter Class is also abstract). 

