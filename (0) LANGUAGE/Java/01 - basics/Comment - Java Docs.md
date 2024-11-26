
> [How to Write Doc Comments](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)

# Start
Single Line
```java
/** Here comes JavaDoc */
```

Multiline
```java
/**
	* Most used tags:
	* 
	* @param Variables
	* @return The return value of a method
	* @throw or @exception Any exceptions a method might throw
	*/
```



# Special Tags
- `@param`: Variables
	(methods and constructors only)
- `@return`: Return value of a method
	(methods only)
- `@throws`: Any exceptions a method might throw
- `@exception`: Old and unused version of `@throws`
- `@deprecated`: Marks a method as deprecated (to no longer to be used)
- `@see`: Provides links to related other classes, methods, or fields.
- `@since`
- `@serial`
- `@version`: Version of the class or method.
	(classes and interfaces only, required)
- `@since`: The version when the method/class was added.
- `@author`: Author of the code.
	(classes and interfaces only, required)



# Examples
- `@param`
- `@return`
```java
/**
 * Calculates the sum of two integers.
 *
 * @param a is the first integer
 * @param b is the second integer
 * @return the sum of a and b
 */
public int sum(int a, int b) {
    return a + b;
}
```

- `@@throw`
```java
/**
 * Both type of exceptions
 * 
 * @throws InsufficientFundsException ...
 * @throws IOException ...
 */

public Object withdraw(...) throws InsufficientFundsException {
	try {	
		if (...) {
			throw new InsufficientFundsException("Insufficient funds!");
		}
	}
	
	catch (IOException e) {
		...
	}
}
```

- `@see`
```java
@see #field
@see #Constructor(Type, Type...)
@see #Constructor(Type id, Type id...)
@see #method(Type, Type,...)
@see #method(Type id, Type, id...)
@see Class
@see Class#field
@see Class#Constructor(Type, Type...)
@see Class#Constructor(Type id, Type id)
@see Class#method(Type, Type,...)
@see Class#method(Type id, Type id,...)
@see package.Class
@see package.Class#field
@see package.Class#Constructor(Type, Type...)
@see package.Class#Constructor(Type id, Type id)
@see package.Class#method(Type, Type,...)
@see package.Class#method(Type id, Type, id)
@see package
```
