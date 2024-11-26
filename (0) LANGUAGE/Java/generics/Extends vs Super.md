# Example
```java
class Civil {}
class Worker extends Civil {}
class Hero extends Worker {}

class Vehicle<Worker, Civil> {}
class Batmobil<Hero, Civil> {}
```

- `extends`: T must be at least Worker or a lower class
	```java
	void takeAlong(? ,? extends Civil) {
		passenger = T.getPassenger();
	}
	```

- `super`: T must be at least Worker or an upper class
	```java
	void handOver(?, ? super Civil) {
		T.setPassenger(passenger);
	}
	```
