```java
public static void main(String[] args) {  
    Integer a = 500000;  
    Integer b = 300000;  
	
    //System.out.printf("a: %d, b: %d\n", a, b);  
    //swap(a, b);    
    //System.out.printf("a: %d, b: %d\n", a, b);  
    String s = "hmmm";  
    System.out.println(s.hashCode());  // 3206501
    changeString(s);  
    System.out.println(s.hashCode());  // 3206501
}  
  
public static void swap(Integer a, Integer b) {  
    System.out.printf("a: %d, b: %d\n", a, b);  
    Integer temp = a;  
    a = b;  
    b = temp;  
    System.out.printf("a: %d, b: %d\n", a, b);  
}  
  
public static void changeString(String s) {  
    System.out.println(s.hashCode());  // 3206501
    s = "lol";  
    System.out.println(s.hashCode());  // 107337
}
```