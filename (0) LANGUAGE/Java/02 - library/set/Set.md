# Set 
<span style="color:green">Pro (unique):</span>
it doesn't allow duplications.

<span style="color:red">Note:</span>
Only values(numbers(?)) allowed.
```java
import java.util.*;
Set<Integer> nameHS = new HashSet<>();
Set<Integer> nameTS = new TreeSet<>();
Set<Integer> nameLS = new LinkedHashSet<>();

```


```java
nameHS.add(value);

System.out.print(nameHS);



```


# Example 1
```java
Set<Integer> nameHS = new HashSet<>();

nameHS.add(4);
nameHS.add(1);
nameHS.add(4);

System.out.print(nameHS);       // -> [1, 4]

```