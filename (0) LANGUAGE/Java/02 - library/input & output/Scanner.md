```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

String text;
text = sc.next();
text = sc.next("\\D+"); // Register only symbols


sc = new Scanner(System.in).useDelimiter("-");  // Register till "-"


sc.close();
```

## Example: Capture only number
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
			
        // Check if the next input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("That's not a valid integer!");
        }
		
        // Close the scanner
        scanner.close();
    }
}
```

- **`.hasNextInt()`**
- **`.nextInt()`**
- **`.next()`**:
    - It only reads input up to the next space, so if the input is `Hello World`, calling `next()` would return `"Hello"` on the first call, and `"World"` on the second call.
    - It **does not** move the scanner to the next line after reading a word.
- **`.nextLine()`**:
    - It reads the entire line of input, meaning that if the input is `Hello World`, calling `nextLine()` would return `"Hello World"`.
    - It **consumes the newline character** as part of the input, moving the scanner to the next line after reading.
