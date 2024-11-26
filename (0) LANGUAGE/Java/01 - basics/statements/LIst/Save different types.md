In Java, you can create a list that stores different types of variables using generics and the `Object` class. Since all classes in Java inherit from the `Object` class, you can store any type of object in a list of `Object`. However, you need to cast the objects back to their original type when retrieving them.

Here's an example:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list that can store different types of variables
        List<Object> list = new ArrayList<>();

        // Add different types of variables to the list
        list.add("Hello");  // String
        list.add(25);       // Integer
        list.add(3.14);     // Double
        list.add(true);     // Boolean
        list.add('A');      // Character

        // Retrieve and print the elements from the list
        for (Object obj : list) {
            System.out.println(obj);
        }

        // Casting objects back to their original type
        String str = (String) list.get(0);
        int num = (int) list.get(1);
        double decimal = (double) list.get(2);
        boolean bool = (boolean) list.get(3);
        char character = (char) list.get(4);

        // Print the casted variables
        System.out.println("String: " + str);
        System.out.println("Integer: " + num);
        System.out.println("Double: " + decimal);
        System.out.println("Boolean: " + bool);
        System.out.println("Character: " + character);
    }
}
```

### Explanation:
- `List<Object> list = new ArrayList<>();`: This creates a list that can store objects of any type.
- `list.add(...)`: Adds elements of different types (String, Integer, Double, Boolean, and Character) to the list.
- **Casting**: When retrieving elements from the list, you need to cast them back to their original types.

This approach allows you to store variables of different types in the same list. However, note that this can lead to runtime errors if you incorrectly cast objects to the wrong type.