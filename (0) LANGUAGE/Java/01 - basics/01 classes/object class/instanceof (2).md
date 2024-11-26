![](Pasted%20image%2020230404145511.png)
```java
A a = new A();
B b = new B();
System.out.println(a instanceof I1); // --> true
System.out.println(a instanceof I2); // --> false
System.out.println(b instanceof A);  // --> true
System.out.println(b instanceof I1); // --> true
System.out.println(b instanceof I2); // --> true
```

---

```java
public void fuettern(Tier t) {

    if (t instanceof Hund) {
        ((Hund) t).fressen();
    }
    else if (t instanceof Ente) {
        ((Ente) t).fressen();
    }
}
```


abstrakt Methoden können nur innerhalb abstrakte Klasse sein (?)
