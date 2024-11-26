
# Array List
> it saves(locate) the elements one after another in the memory

```java
import java.util.ArrayList;
ArrayList<String> arrayName = new ArrayList<>();
```

## Methods
```java
arrayName.add(valueOfVariableType);
arrayName.set(<.Index>,<.Element>); // Replace element
arrayName.contains(valueOfVariableType);

arrayName.get(<.Index>); 
arrayName.size();  // Get list size

arrayName.remove(valueOfVariableType);
arrayName.clear();
arrayName.isEmpty();

Arrays.sort(arrayName);
```

# Fixed Length
```java
List<Object> blockGroups = new ArrayList<>(3);  
blockGroups.set(group1Key);  
blockGroups.set(INGREDIENTS);  
blockGroups.set(BUILDING_BLOCKS);
```


# Add Elements
## Normal one
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
        System.out.println(list);
    }
}
```

## Using Double Brace Initialization
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() {{
            add("Apple");
            add("Banana");
            add("Orange");
        }};
        System.out.println(list);
    }
}
```

## Using `Arrays.asList()` Method
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println(list);
    }
}
```

## Using a `List.of()` Method **Creates an immutable list !!**
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Apple", "Banana", "Orange"));
        System.out.println(list);
    }
}
```


## Using `Collections.addAll()` Method
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Apple", "Banana", "Orange");
        System.out.println(list);
    }
}
```


# Example idk
```java
ArrayList<Student> sd = new ArrayList<>();
Student s1 = new Student("Jonas","Mayer","IB");
sd.add(s1);

// Hashmap version
HashMap<Interger,Student> hm = new Hashmap<>();
hm.put(s1.getMatrikel(),s1);
Student jm = hm.get(12345);


// ArrayList version
for (Student s : sd) {
    if (s.getMatrikel()==12345)
        return s;
}
```