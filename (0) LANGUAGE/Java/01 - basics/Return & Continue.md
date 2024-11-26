
```java
Scanner sc = new Scanner(System.in);  
String s1;  
String s2;  
  
while (true) {  
    System.out.println("Eingabe:");  
    s1 = sc.nextLine();  
  
    if (s1.equals("a")) {  
        continue;  
    } else if (s1.equals("b")) {  
         s2 = sc.nextLine();  
    } else {  
        break;  
    }  
    System.out.println("nice one");  
}
```
