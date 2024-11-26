
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
		
        // Enhanced for loop to iterate through the list
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```
