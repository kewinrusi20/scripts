
![[Pasted image 20241112215324.png]]

![[Pasted image 20241115181140.png]]



Errors:
- `OutOfMemoryError`

(Checked)Exceptions:
- `InvocationTargetException`
- `InterruptedException`
- `NumberFormatException`
- `NullPointerException`
- `NegativeArraySizeException`
- `SecurityException`

- `IOException`
    - Thrown when an I/O operation fails or is interrupted.
    - Subclasses:
        - `FileNotFoundException`: File not found or cannot be opened.
        - `EOFException`: End of file reached unexpectedly.
- `SQLException`
    - Thrown when a database access error occurs.
    - Examples include invalid SQL statements, connection issues, or database inconsistencies.
- `ClassNotFoundException`
    - Thrown when an application tries to load a class through its name (e.g., using `Class.forName()`), but the class cannot be found.
- `InvocationTargetException`
    - Thrown when a method invoked by reflection (e.g., `Method.invoke()`) throws an exception.
- `InterruptedException`
    - Thrown when a thread is interrupted while it is waiting, sleeping, or otherwise occupied.
- `MalformedURLException`
    - Thrown when a malformed URL occurs (e.g., invalid protocol or missing resource).
- `URISyntaxException`
    - Thrown when a string cannot be parsed as a URI reference.
- `NoSuchMethodException`
    - Thrown when a particular method cannot be found in a class.
- `NoSuchFieldException`
    - Thrown when a particular field cannot be found in a class.
- `InstantiationException`
    - Thrown when trying to create an instance of a class that is abstract or does not have a no-arg constructor.
- `IllegalAccessException`
    - Thrown when an application tries to reflectively access a field, method, or class that it does not have access to.
- `ParseException`
    - Thrown when an error occurs while parsing a string (e.g., parsing a date or number).
- `CloneNotSupportedException`
    - Thrown when the `Object.clone()` method is called on an object that does not implement the `Cloneable` interface.
- `TimeoutException`
    - Thrown when a blocking operation times out (common in multithreading or asynchronous programming).
- `FileNotFoundException`
    - A subclass of `IOException`, specifically for missing files.
- `DataFormatException`
    - Thrown when data does not match the expected format.


Run Time Exceptions:
- `ArithmeticException` (divide by null)
- `ArrayIndexOutOfBoundsException`
- `ClassCastException`
- `IllegalArgumentException`
- `IllegalStateException`
- `NullPointerException`
- `NumberFormatException`
- `ArrayStoreException`
- `UnsupportedOperationException`
- `NegativeArraySizeException`
- `ConcurrentModificationException`
- `IllegalMonitorStateException`
- `StringIndexOutOfBoundsException`
- `ClassNotFoundException`
- `NoSuchElementException`
- `IllegalThreadStateException`
- `SecurityException`
- `StackOverflowError`
- `OutOfMemoryError`
- `IndexOutOfBoundsException`
- `RuntimeException`


- `CloneNotSupportedException`
```java
@Override 
public Object clone() throws CloneNotSupportedException { 
	return super.clone();
}
```

```java
public static void createFile() throws IOException {
	File f = new File("C:\\Users\\broski\\Desktop\\teamA");
	f.createNewFile();
}
```
