# Objects within Functions
> Call by reference

```java
public static void main(String[] args) {  
    Tree t = new Tree();  
    t.age = 500;  
    
    change(t);  
    System.out.println(t.age);  // --> 400
}
  
public static void change(Tree t) {  
    t.age = 400;  
}
```

# Objects within Variables
> Call by reference

```java
public static void main(String[] args) {  
    Tree t1 = new Tree();  
    t1.age = 500;
    
	Tree t2 = t1;  
	t1.age = 400;  
	t2.age = 300;
      
    System.out.println(t1.age);  // --> 300
    System.out.println(t2.age);  // --> 300
}
```
