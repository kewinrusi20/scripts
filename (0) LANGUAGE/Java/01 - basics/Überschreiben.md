Überschreiben von Methoden vs Variablen
```java
class A {  
    int j = 20;  
  
    void f() {  
        System.out.println("a");  
    }  
}  
  
class B extends A {  
    int j = 3000;  
  
    void f() {  
        System.out.println("b");  
    }  
  
    void g() {  
        System.out.println("b");  
    }  
  
    public static void main(String[] args) {  
        A o1 = new A();  // 20  
        A o2 = new B();  // 3000  
        B o3 = new B();  //  3000  
        B o4 = new B();  // 3000  
        A o5 = (A) o4;   // 20  
        System.out.printf("%d %d %d %d %d%n", o1.j, o2.j, o3.j, o4.j, o5.j);  
  
        o1.f();  //a  
        o2.f();  //b  
        o3.f();  //b  
        o4.f();  //b  
        o5.f();  //b  
    }  
}
```
