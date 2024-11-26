
- Once closed with `.close()`, it can not be reopened
- While using Try & Catch, you need to reopen the Scanner for every loop (in case of wrong input):
```java
Scanner sc;

@SuppressWarnings("resource")
public int catchInput() {
	int eingabe = 0;
try {
	eingabe = (new Scanner(System.in)).nextInt();
} catch (Exception e) {
	System.out.println("Wrong Character, try again");
}
	return eingabe;
}
```
