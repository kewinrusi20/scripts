
![[IMG_20241125_145949.jpg]]

```java
A a = new B();
A[] aa = new B[10];
//aa[0] = new A(); -> ArrayStoreException zur Laufzeit
```

```java
//G<A> ga = new G<B>(); //-> Compile-Fehler
G<? extends A> ga = new G<B>();
```
