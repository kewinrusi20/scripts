

```java
public class Zahlenraten implements Comparable<Integer> {  
    int zahl;  
    int bound;  
    public Zahlenraten() {  
        bound = 100 + (new Random()).nextInt(200);  
        zahl = (new Random()).nextInt(101);  
    }  
  
    public final int getUpperBound() {  
        return bound;  
    }  
  
    public final int getZahl() {  
        return zahl;  
    }  
  
    // < 0: number in is higher  
    //   0: number found    
    // > 0: number is lower    public int compareTo(Integer x) {  
        return x - zahl;  
    }  
      
    public boolean check(int x) {  
        return zahl == x;  
    }  
}
```

```java 
Zahlenraten z = new Zahlenraten();  
int lower = 0;  
int upper = z.getUpperBound();  
int mitte = (upper - lower) / 2;  
  
System.out.printf("Start: finde %d\n", z.getZahl());  
System.out.printf("lower: %d, upper: %d, mitte: %d\n-------\n", lower, upper, mitte);  
  
Loop:  
while (true) {  
    mitte = lower + ((upper - lower) / 2);  
    System.out.printf("%d ... %d, mitte: %d\n", lower, upper, mitte);  
      
    if (z.check(mitte)) {  
        System.out.println("gefunden");  
        break Loop;  
    } else if (z.compareTo(mitte) < 0) {  
        // number is higher, set lower bound  
        lower = mitte;  
    } else {  
        // number is lower, set upper bound  
        upper = mitte;  
    }  
}
```