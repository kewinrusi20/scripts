
# Case 1: **Overwriting Variables**

```java
public abstract class Worker {  
    double salary = 50;  // Starting salary
}

class Manager extends Worker {  
    double salary = 200;  // Starting salary
}
```

Main:
```java
Worker w1 = new Manager();
Worker w2 = new Manager();

System.out.println(w1.salary);
System.out.println(((Manager) w2).salary);
```

Result:
```java
50   // Expected 200
200  // Expected 200
```



# Case 2: **Inherited Methods**
> Access the variable using the Getter from the upper-class

```java
abstract class Worker {
    double salary = 50;  // Starting salary
    public double getSalary() { return salary; }
}

class Manager extends Worker {
    double salary = 200;  // Starting salary
    // Getter for the upper-class
}
```

Main:
```java
Worker w1 = new Manager();
Worker w2 = new Manager();  
Manager m1 = new Manager();

System.out.println(w1.getSalary());  
System.out.println(((Manager)w2).getSalary());  
System.out.println(m1.getSalary());
```

Result:
```java
50  // Expected: 200
50  // Expected: 200
50  // Expected: 200
```



# Case 3: **Overwriting (not) Abstract Methods**
> Access the variable by overwriting the Getter

```java
public abstract class Worker {
    double salary = 50;  // Starting salary
    public double getSalary() { return salary; }
}

public class Manager extends Worker {
    double salary = 200;  // Starting salary
    public double getSalary() { return salary; }
}
```

Main:
```java
Worker w1 = new Manager();
Worker w2 = new Manager();

System.out.println(w1.getSalary());
System.out.println(w2.getSalary());
```

Result:
```java
200  // Expected: 200
200  // Expected: 200
```



# Case 4: **Change Visibility**
```java
class A {  
    protected void printSomething() { ... }  
}  
  
class B extends A {  
    @Override  
    public void printSomething() { ... }  // OK
	
    @Override  
    private void printSomething() { ... }  // ERROR
}
```