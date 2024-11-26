The `Scanner` class in Java is a versatile tool for reading and parsing different types of input from various sources like user input, files, or strings. Here's a comprehensive list of its commonly used methods:

---

### **Creating a Scanner Object**

```java
Scanner sc = new Scanner(System.in); // For standard input
Scanner sc = new Scanner("string input"); // For string input
Scanner sc = new Scanner(new File("file.txt")); // For reading from a file
```

---

### **General Methods**

- **`boolean hasNext()`**  
    Checks if there is another token available.
    
- **`String next()`**  
    Returns the next token as a `String`.
    
- **`String nextLine()`**  
    Reads the entire line until the end-of-line delimiter.
    
- **`boolean hasNextLine()`**  
    Checks if there is another line of input available.
    

---

### **Methods for Primitives**

#### Checking Availability

- **`boolean hasNextInt()`**  
    Checks if the next token can be interpreted as an integer.
    
- **`boolean hasNextDouble()`**  
    Checks if the next token can be interpreted as a double.
    
- **`boolean hasNextLong()`**  
    Checks if the next token can be interpreted as a long.
    
- **`boolean hasNextFloat()`**  
    Checks if the next token can be interpreted as a float.
    
- **`boolean hasNextShort()`**  
    Checks if the next token can be interpreted as a short.
    
- **`boolean hasNextByte()`**  
    Checks if the next token can be interpreted as a byte.
    

#### Reading Values

- **`int nextInt()`**  
    Reads the next token as an integer.
    
- **`double nextDouble()`**  
    Reads the next token as a double.
    
- **`long nextLong()`**  
    Reads the next token as a long.
    
- **`float nextFloat()`**  
    Reads the next token as a float.
    
- **`short nextShort()`**  
    Reads the next token as a short.
    
- **`byte nextByte()`**  
    Reads the next token as a byte.
    

---

### **Methods for Other Data Types**

- **`String next()`**  
    Reads the next token as a `String`.
    
- **`String nextLine()`**  
    Reads an entire line.
    
- **`BigInteger nextBigInteger()`**  
    Reads the next token as a `BigInteger`.
    
- **`BigDecimal nextBigDecimal()`**  
    Reads the next token as a `BigDecimal`.
    

---

### **Matching Input with Patterns**

- **`boolean hasNext(String pattern)`**  
    Checks if the next token matches a specific regular expression.
    
- **`String next(String pattern)`**  
    Returns the next token matching a specific regular expression.
    
- **`Pattern delimiter()`**  
    Returns the current delimiter used by the scanner.
    
- **`Scanner useDelimiter(String pattern)`**  
    Sets the scanner to use a specific regular expression as the delimiter.
    
- **`Scanner useDelimiter(Pattern pattern)`**  
    Sets the scanner to use a specific `Pattern` object as the delimiter.
    

---

### **Skipping Input**

- **`void skip(String pattern)`**  
    Skips input that matches the specified pattern.
    
- **`void skip(Pattern pattern)`**  
    Skips input matching the provided `Pattern`.
    

---

### **Stream-Related Methods**

- **`Stream<String> tokens()`**  
    Returns a `Stream` of tokens from the scanner.

---

### **Locale Configuration**

- **`Locale locale()`**  
    Gets the locale currently used by the scanner.
    
- **`Scanner useLocale(Locale locale)`**  
    Sets the scanner to use a specific locale, affecting how numeric values are interpreted.
    

---

### **Closing the Scanner**

- **`void close()`**  
    Closes the scanner to free resources. It's particularly important when working with files.

---

### **Examples**

#### Reading an Integer

```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
if (sc.hasNextInt()) {
    int num = sc.nextInt();
    System.out.println("You entered: " + num);
} else {
    System.out.println("Invalid input!");
}
```

#### Reading a Line

```java
System.out.print("Enter a sentence: ");
String line = sc.nextLine();
System.out.println("You entered: " + line);
```

#### Custom Delimiter

```java
Scanner sc = new Scanner("apple,banana,orange");
sc.useDelimiter(",");
while (sc.hasNext()) {
    System.out.println(sc.next());
}
```

---

The `Scanner` class is part of `java.util` and offers robust input-handling capabilities. Always remember to close the scanner if working with files or other resources to avoid resource leaks.