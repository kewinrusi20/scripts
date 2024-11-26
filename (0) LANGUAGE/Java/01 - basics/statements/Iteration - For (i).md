
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
		
        // Basic for loop to iterate through the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}
```
