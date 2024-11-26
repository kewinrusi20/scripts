
```java
class Hero {
	private static Hero h;
	public static Hero getInstance() {
		if (Hero == null) 
			return new Hero();
		return h;
		
	private Hero() {...}
}
```

```java
public static void main(String[] args) {
	Hero h = Hero.getInstance();
}
```
