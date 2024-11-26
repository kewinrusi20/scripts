Syntax:
- `class Vehicle<T> {}`: T can be anything (even an array)
	```java
	Vehicle train = new Vehicle<Civil[]>();
	train.setPassenger(new Civil[] {new Civil(), new Hero(), new Worker()});
	```
- `class Vehicle<T Civil> {}`: T can only be Civil ((!) in theory)
- `class Vehicle<T extends Civil> {}`: T must be at least Civil or a *lower class* from Civil
- `class Vehicle<T super Civil> {}`: (!) ERROR


- `var v = new Vehicle<Hero>`: T can be only Hero now
