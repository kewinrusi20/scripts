The `try-with-resources` statement in Java is a way to ensure that resources (like files, database connections, network sockets, etc.) are automatically closed after they are used, without needing an explicit `finally` block. Introduced in Java 7, this feature helps prevent resource leaks by ensuring that resources are closed when they are no longer needed, even if an exception is thrown during resource processing.

### How It Works:
In a `try-with-resources` block, resources that need to be closed must implement the `AutoCloseable` interface (or its subinterface, `Closeable`). When the try block completes (either successfully or due to an exception), the `try-with-resources` automatically calls the `close()` method on each declared resource, in reverse order of declaration.

### Syntax:
```java
try (ResourceType resource = new ResourceType()) {
    // Code that uses the resource
} catch (Exception e) {
    // Handle exceptions
}
```

### Example with File Handling:

Here’s a basic example that reads a file using `try-with-resources`. The `BufferedReader` automatically closes when the try block completes.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Explanation:
1. **Declaration of Resource**: `BufferedReader` is declared inside the parentheses of the `try` statement.
2. **Automatic Closing**: When the `try` block finishes (whether it succeeds or an exception occurs), `BufferedReader`’s `close()` method is automatically called.
3. **Error Handling**: The `catch` block handles any `IOException` that might be thrown while reading the file.

### Why Use `try-with-resources`?
- **Automatic Resource Management**: It ensures resources are closed, making the code cleaner and less error-prone.
- **Error Handling**: Any exceptions during resource closing are suppressed rather than ignored. You can access these suppressed exceptions with `getSuppressed()` if needed.
- **Cleaner Code**: It eliminates the need for explicit `finally` blocks just to close resources.

In general, `try-with-resources` is a best practice when working with any resources that require closing, as it reduces the likelihood of resource leaks and simplifies error handling.