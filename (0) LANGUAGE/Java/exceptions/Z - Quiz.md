
# Quiz 1
```java
try {
    try {
        System.out.print("A");
        thrower();
        System.out.print("B");
        return;
    } catch (FileNotFoundException ex) {
        System.out.print("C");
    } finally {
        System.out.print("D");
    }
    System.out.print("E");
    return;
} finally {
    System.out.print("F");
}
```

Answer
```java
// ACDEF
```



# Quiz 2
```java
System.out.println("A");  
try {  
	System.out.println("B");  
	try {  
		System.out.println("C");  
		werfer();  
		System.out.println("D");  
		try {  
			System.out.println("E");  
			werfer();  
			System.out.println("F");  
		} catch (FileNotFoundException e) {  
			System.out.println("O");  
		}
	} catch (FileNotFoundException e) {  
		System.out.println("H");  
		return;  
	} finally {  
		System.out.println("I");  
	}  
} finally {  
	System.out.println("J");  
}
```

Answer
```java
// ABCHIJ
```



# Quiz 3
```java
System.out.println("A");  
try {  
	System.out.println("B");  
	try {  
		System.out.println("C");  
		return;  
		System.out.println("D");  
		try {  
			System.out.println("E");  
			werfer();  
			System.out.println("F");  
		} catch (FileNotFoundException e) {  
			System.out.println("O");  
		}
	} catch (FileNotFoundException e) {  
		System.out.println("H");  
		return;  
	} finally {  
		System.out.println("I");  
	}
} finally {  
	System.out.println("J");  
}
```

Answer
```java
ABCIJ
```



# Quiz 4
```java
try {
	System.out.println("A");
	...
} catch (IOException e) {
	System.out.println("B");
} catch (SQLException e) {
	System.out.println("C");
}
```

Answer
```java
// AB  // case 1
// AC  // case 2
```



# Quiz 5
```java
    public static boolean f() {
        try {
            return true;
        } finally {
            return false;
        }
    }
```

Answer
```java
false
```

---
```java
protected void methode() throws IOException { /* irrelevant */ }

protected void methode() throws IOException
protected void methode() throws FileNotFoundException, IOException
protected void methode() throws FileNotFoundException
protected void methode() throws Exception
protected void methode()
public void methode() throws FileNotFoundException, IOException
public void methode() throws FileNotFoundException
public void methode() throws Exception
public void methode()
private void methode() throws FileNotFoundException, IOException
private void methode() throws FileNotFoundException
private void methode() throws Exception
public void methode() throws ArrayIndexOutOfBoundsException
private void methode() throws ArrayIndexOutOfBoundsException
protected void methode() throws ArrayIndexOutOfBoundsException
protected int methode() throws IOException
```

Answer
```java
protected void methode() throws IOException { /* irrelevant */ }

protected void methode() throws IOException
protected void methode() throws FileNotFoundException, IOException
protected void methode() throws FileNotFoundException
protected void methode() throws Exception // FALSCH!!
protected void methode()
public void methode() throws FileNotFoundException, IOException
public void methode() throws FileNotFoundException
public void methode() throws Exception // FALSCH!!
public void methode()
private void methode() throws FileNotFoundException, IOException // FALSCH!!
private void methode() throws FileNotFoundException // FALSCH!!
private void methode() throws Exception // FALSCH!!
public void methode() throws ArrayIndexOutOfBoundsException
private void methode() throws ArrayIndexOutOfBoundsException // FALSCH!!
protected void methode() throws ArrayIndexOutOfBoundsException
protected int methode() throws IOException // FALSCH!!
```
