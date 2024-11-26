

---
![](Pasted%20image%2020230404143531.png)
Sub Classes inherit the interface of the Upper Class

```java
Schwimmer s;
s = new Ente();
s = new WasserFlugzeug();
s.schwimmen();

Flieger f ;
f = new Ente();
f = new Flugzeug();
f = new Superman();
f = new WasserFlugzeug();
f = new Airbus();
f.fliegen();
```

---
# Multiple of Abstrakt Methods
![](Pasted%20image%2020230404144307.png)
#

Classes, can implement multiplies time the same Abstract Methods from different Interfaces/Abstract Classes
Because they are empty one;

---

```java
interface UserManage {
	void setName();
	String getName();


interface UserReadOnly {
	String getName();
}

class User implements UserManage, UserReadOnly{
	...
	void setName() {...}
	String getName() {...}
}
```

```java
public static void main(String[] args) {
	UserManage u1_Manage = new User();
	u1_Manage.setName("Gio");
	u1_Manage.getName(); // --> Gio
	
	UserReadOnly u1_Read = (UserReadOnly) u1_Manage;
	u1_Read.setName("Carl"); // ERROR
	u1_Read.getName(); // --> Gio
}
```
By Casting the Instance to an Interface, you will be able to use only the Methods inside that Interface

---

