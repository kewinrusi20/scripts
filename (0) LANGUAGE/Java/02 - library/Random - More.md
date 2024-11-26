# Seed
- The Class Random is deterministic, so it relies on a long integer value (called seed), to generate a value
- If no actual parameter is given to the constructor, it will use the system time (in milliseconds) as seed
- If you initialize the Object with a custom seed (e.g.: `new Random (42)`) it will always generate the same result (useful for debugging and/or testing)
```java
import java.util.Random

int a = new Random(42).nextInt();  // -> -1170105035
int b = new Random(42).nextInt();  // -> -1170105035
int c = new Random(42).nextInt();  // -> -1170105035
int d = new Random(42).nextInt();  // -> -1170105035
int e = new Random(42).nextInt();  // -> -1170105035
int f = new Random(42).nextInt();  // -> -1170105035
int g = new Random(42).nextInt();  // -> -1170105035
```
