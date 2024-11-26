- Exceptions sind Java Objekte, die im Fehlerfall erzeugt werden
- Alle Exceptions sind (indirekt) von `Throwable` abgeleitet



# Example
Problem:
```java
Scanner sc = new Scanner(System.in);  

int i = sc.nextInt();  // Error by wrong typing
System.out.println(i);  
```

Solution:
```java
Scanner sc = new Scanner(System.in);

try {
    int i = sc.nextInt();
    System.out.println(i); // by wrong input, this line will never be executed
} catch (Exception e) {
    System.err.println("Bruh");  
	e.printStackTrace();  // it prints the error
	sc = new Scanner(System.in);
} finally {
	System.out.println("End Program");
}
```




# Example 2
```java
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    // it appeared a throws IOException
        File f = new File("C://");
        f.createNewFile();
    }
}
```



# Try & Catch solution
```java
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f = new File("C://");
		
        // check if that part of the code crashes 
        try {
            f.createNewFile(); 
        }
		
        // if the code crashed, execute catch
        catch (IOException e) {     // exption type
            system.out.println("File couldn't be created");
        } 
		
        // finally with be always be executed
        finally {
            system.out.println("Check file creation done");
        }
    } // close method main
} // close class
```
> With an Try & Catch Exception, you are catching the Bug, and let the program keep going.

Within the `catch` part, you can add other "bug", that the exception will try to catch, so that the program can keep going.

System.exit(0);
