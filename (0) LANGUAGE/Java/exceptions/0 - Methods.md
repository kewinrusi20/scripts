# Class Throwable
```java
public class Throwable implements Serializable {
    public Throwable() { ... }
    public Throwable(String message)  { ... }
    public Throwable(String message, Throwable cause) { ... }
    public Throwable(Throwable cause)  { ... }
	
    public String getMessage()  { ... }
    public String getLocalizedMessage()  { ... }
	
    public Throwable getCause()  { ... }
	
    public void printStackTrace()  { ... }
    public void printStackTrace(PrintStream s)  { ... }
    public void printStackTrace(PrintWriter s)  { ... }
	
    public synchronized native Throwable fillInStackTrace();
    public StackTraceElement[] getStackTrace()  { ... }
}
```
- `Exception` extends Throwable, but it doesn't introduce any new methods


`Expection e`:
- `e.printStackTrace`
- `System.out.println(e.toString())`


idk:
- `e.getLocalizedMessage()`
