



# Cast

## NormalCast(?)
```cpp

Downcast
Worker* w;
Manager m;


w = &m; // Up Cast
m = (Manager*) w // Down Cast
```


## Dynamic Cast
```cpp
Worker* w;
Manager* m;

m = dynamic_cast<Manager *>(w);
```



```cpp
A a;
B b;

b.getNew();
a=b;
a.setAlt(17);
b.getAlt(); // c++ -> 0; java -> 17

// version 2
A a;
B b;

b.getNew();
a = &b:   // did a became a pointer?
(*a).setAlt(17)
b.getAlt(); // c++ -> 17


A a2;
a2 = b;
a2.setAlt(22); // it will call the method from A and not from B, (only if A is a pointer works)
```




## Abstract Method
```cpp
sirtual void setAlt(int) = 0; // (?)

```