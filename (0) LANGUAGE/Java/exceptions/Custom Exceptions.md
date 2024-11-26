- If you Override a Method, you also need to write the throws
	- kann: kein, wenige oder gleiche exceptions werden, aber nicht mehr/neue
	- `RuntimeException` is a unchecked exception: you can declare it or not
	- you can add subclasses exception

```java
// checked Exception class
class myException extends Exception {}          
public void myMethod() thrown myException {}
```

```java
// unchecked Exception class
class myException extends RuntimeException {}   
public void myMethod() {}
```



# Example
```java
public class IllegalKeyException extends Exception {
	String s = "Bruh";
	
	public IllegalKeyException () {}
	
	public IllegalKeyException(String message) {
		System.err.println(s);
		System.err.println(message);
		//super(message);  // v2
	}
}
```

Main
```java
public class Decrypt{
	public static void main(String[] args) throws IllegalKeyException {
		if (...) {
			throw new IllegalKeyException;
		} else if (...) {
			throw new IllegalKeyException(...);
		}
	}
}
```



# Example 2
```java
class myException extends RuntimeException {
    myExceptionForAge(String message){
        super(message);
    }
}
```

```java
class myAge {
    static main () {
        int age = 20;
        validateAge(age);
    }

    static void validateAge(int age) {
        if (age < 0)
            throw new myExceptionForAge("Bro wtf");
    }
}
```
