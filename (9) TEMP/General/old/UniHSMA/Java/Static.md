# Static
```java
class Person{
    public int age;

    public void setAge(int year){
        int currentDate = Date.now();
        int age = currentDate.year - year; 
        this.age = age;

 	}
}
```

To use `this.age = age` the class variable can't be `static`


```java
class Person{
    public int age;

    public void setAge(int year){
        int currentDate = Date.now();
        int age = currentDate.year - year; 
        Person.age = age;

    }
}
```

To use `Person.age = age` the class variable must be `static`

