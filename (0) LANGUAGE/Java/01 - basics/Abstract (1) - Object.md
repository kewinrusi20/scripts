# Properties
## Constructor
- yes

## Variables
- **Konkrete**: yes (?)
- **Abstrakte**: none (?)

## Methoden
- **Konkrete**: yes
- **Abstrakte**: yes
	- die Abstrakte Methoden müssen von den unteren Klassen implementiert werden
		(außer sind die selbst Abstrakt)
	- muss `abstract bleinen`
- Die Methoden können nur **public** oder **protected** sein


# Syntax
```java
class abstract Bird{        // #1
	String name;            // There are no abstract attributs
	
    abstract void sleep();  // Method: Abstract version
    void awake(){ ... }     // Method: Not abstract version
}
```

```java
class Duck extends Bird{
    void sleep(){ ... }
}
```
