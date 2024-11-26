Example
```java
// Try to add an element using addFirst() when the linked list is full 
try { 
	... 
} catch (IllegalStateException e) { 
	... 
} catch (... e) { 
	... 
} finally {

}
```



# Example
```java
import java.util.Scanner;
import java.io.IOException;

public class myProgram {
    public static void main(String[] args) throws IOException {
        int eingabe = 0;
        while (true) {
            // restart the scanner
            Scanner sc = new Scanner(System.in);
            try {
                // register imput from keyboard
                eingabe = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong input");
                
                // restart loop from imput
                continue;
            }
            // stop loop
            break; 
        }; // close while loop
        System.out.println(eingabe);
    }
}
```

Example
```java
// Try to add an element using addFirst() when the linked list is full 
try { 
	... 
} catch (IllegalStateException e) { 
	System.out.println("exception: " + e.getMessage()); 
}
```