# 1 Interface & 2 Classes
![](Pasted%20image%2020230328141914.png)
```java
interface Dialog {
	void zeigeDialog();
}

class DialogDeutsch implements Dialog {
	void zeigeDialog() { ... }
}

class DialogEnglisch implements Dialog {
	void zeigeDialog() { ... }
}
```
---
# 2 Interfaces & 1 Class
```java
interface A {}
interface B {}

classe abc implements A,B {}
```

---
# Interface: Inheritance
![](Pasted%20image%2020230328142038.png)
```java
interface A {
	void methode1();
	void methode2();
}
interface B extendes A {
	void methode3();
}

class meineKlasse implements B {
	void methode1() {}
	void methode2() {}
	void methode3() {}
}
```

---
# Variable
```java
interface A {
	int num = 84;
}

class meineKlasse implements A {}

main() {
	System.out.println(mk.num); // --> 84
}
```
