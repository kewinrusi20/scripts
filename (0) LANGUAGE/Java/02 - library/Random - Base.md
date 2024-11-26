
[Link for more](https://www.educative.io/answers/how-to-generate-random-numbers-in-java)
[java.util.random](https://www.geeksforgeeks.org/java-util-random-class-java/)

```java
import java.util.Random;
Random random = new Random();

int x = random.nextInt();         // Any integer 
int x = random.nextInt(100);      //   0 <= x < 100
double x = random.nextDouble();   // 0.0 <= x < 1.0
boolean x = random.nextBoolean(); // true or false
```
