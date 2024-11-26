
# Vererbung von Abstrakte Klassen
![](Pasted%20image%2020230404141436.png)
Only wenn all the Abstract Classes are implemented, you can open a normal Class

(c) Sub Klassen können abstarkte Methoden hinzufügen

(c) `A a = new B();` // ERROR (!)

---
# Abstrakte Classen

Man kann keine Objekte von Abstrakte Klasse erzeugen.
(c) eine Abstrakte Methode kann nur in eine Abstrakte Klasse sein.
(c) Abstrakte Variablen

```java
public abstract class Mitarbeiter {

    public final double bonus() {
        return zielbonus() * zielerreichung();
    }

    public abstract double zielerreichung();
    public abstract double zielbonus();
}
```
Eine Abstrakte Classe kann ein Konstruktor haben, die Abstrakte Methoden abruft, das später müssen implementiert werden