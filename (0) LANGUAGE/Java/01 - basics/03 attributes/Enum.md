
Example 1
```java
public enum DayOfTheWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SONDAY;
}

public static void main(String[] args) {
	CurrentDay cd = CurrentDay.TUESDAY;

	if (cd = CurrentDay.TUESDAY)
		syso("it is Tuesday");

	for (CurrentDay e : CurrentDay.values())
		syso("Day: " + e);
}
```

---
Example 2
```java
public class Roemisch {  
    public enum Roman {  
        I(1), V(5), X(20), L(50), C(100),  
        D(500), M(1000);  
        private final int wert;  
  
        Roman(int wert) {  
            this.wert = wert; }  
  
        public int getWert() {  
            return wert; }  
    }  
    public static void main(String [] args) {  
        for(Roman r : Roman.values()) {  
            System.out.println(r.getWert()  
                    + "\t" + r.ordinal());  
        }  
    }  
}
```