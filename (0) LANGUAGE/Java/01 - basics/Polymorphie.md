 > Polymorphie (Vielgestaltigkeit)

# Method
Polymorphie is basically (Override) but the difference lies on it usage.<br>
```java
Class Animal() {
	void makeSound() {}
}
```

```java
Class Cat() {
	void makeSound() { S.o.p("Meow"); }
}
Class Dog() {
	void makeSound() {S.o.p("Wuf");}
}
Class Bird() {
	void makeSound() {S.o.p("Chip");}
}
```
You have a main Upper Class, and it different Variation/Evolution in different Subclasses

```java
Anima c = new Cat(); c.makeSound(); // --> Meow
Anima d = new Dog(); c.makeSound(); // --> Wuf
Anima b = new Bird(); c.makeSound(); // --> Chip
```
And you use the Polymorphed Methods, to call them all in the same way, and look at their own output. (Mostly through a Cast).

---
# Dynamic & Static Binds
> Are the Address saved on the Heap

```java
Employer m = new Manager(); // Static: Employer | Dynamic: Manager
Employer m = new Employer(); // Static: Employer | Dynamic: Employer
```
After a Object is Create, you can Modifier it based its Bind type
- The `Static Bind` is <ins>un</ins>changeable
- The `Dynamic Bind` is changeable

```java
Employer c = new CEO() // OK
Employer m = new Manager(); // OK
Employer w = new Worker() // OK
// -- or --
Employer e;
e = new CEO(); // OK, the Dynamic Bind can be changed
e = new Manager(); // OK, the Dynamic Bind can be changed
e = new Worker(); // OK, the Dynamic Bind can be changed

CEO m = new Employer(); // ERROR (!)
Manager m = new Employer(); // ERROR (!)
Worker m = new Employer(); // ERROR (!)
```
The Static Bind is always the Upper Class, because:
- So you can group multiple Sub Classes in one Array
- And all of them will have the same Attributes/Methods (but with their variation)

## Cast
```java
Employer e;
Manager m;

// Down Cast
e = new Manager();
m = (Manager) e;

// Up Cast
m = new Manager();
e = (Employer) m;

e = (Manager) e; // ERROR (!)
    // `e` is already defined in the scope
    // and its Static Bind can not be changed
```
<span style="color:red">(!)</span>
All the extra/new Attributes/Methods will stay hidden/unusable till Down Cast

---
# More
```java
A a = new B();
B b = new A(); // error (!)
```
it did not work, the Object B has more information then A.
by using Polymorphie, you use only the already available information in A

---
## Der instanceof Operator
[Polymorphie - Programmieren 2 (PR2) (smits-net.de)](https://smits-net.de/files/pr2/html/04_vererbung/06_polymorphie.html#der-instanceof-operator)

## Spätes Binden
[Polymorphie - Programmieren 2 (PR2) (smits-net.de)](https://smits-net.de/files/pr2/html/04_vererbung/06_polymorphie.html#sp%C3%A4tes-binden)

---

## ERROR (!) = `NullPointerExeption`
```java
public class A {

    public A() {
        getDetails();
    }
	
    protected String getDetails() {
        System.out.println("Hans");
    }
}

public class B extends A {}
```

```java
main() {
	B b = new B(); // ERROR (!) = NullPointerExeption
}
```
Solution: make `getDetail` `final`

