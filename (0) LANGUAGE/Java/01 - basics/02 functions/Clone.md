


# Example
```java
class Giraffe implements Cloneable {
	public Object clone(Object o) throw CLoneNotSupportedException {
	return super.clone()
	}
}
```

Main throw Exception
```java
Giraffe g1 = new Giraffe();
Giraffe g2 = (Giraffe) g2.clone();
```


---
Shallow Copy
- Wenn man die clone methode anwendet, werden auch die darin enthaltene Variablen copiert?
- die clone Methode ruf nicht dir Constructer Klasse

# Example
```java
class Nase() implements Clonaeble {
	public Object clone() throw CloneNotSupportedException {
		return super.clone;
	}
}


publc class Giraffe implements Cloneable {
	public Object clone(Object o) throw CLoneNotSupportedException {
		Giraffe g = (Giraffe) super.clone();
		g.nase = (Nase) this.nase.clone();
		g.name = new String(name)
		return g;
	}
}
```

Main throw Exception
```java
Giraffe g1 = new Giraffe();
Giraffe g2 = (Giraffe) g2.clone();
System.out.println(toString(g1.nase));
System.out.println(toString(g2.nase));
```

