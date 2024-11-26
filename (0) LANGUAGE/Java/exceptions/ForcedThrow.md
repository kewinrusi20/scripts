
# Forced Throw Exception
A force exception is when:<br>
instead of creating a class "Exception" there you write your own exception conditions<br>
the forced throw exception, is when the condition, is written within the main code

# Example
```java
main() throw Exception {
    ...
    convert(sc.nextline);
}
```

```java
class kwLibrary {
    public int convert(String imput) {
        // if the imput isn't good, stop the method
        if (imput == ...) 
            return throw Exception;

        return Interger.parseInt(imput);
    }
}

```