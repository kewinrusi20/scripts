
Properties:
- Try with resources will automatically close 
- To use try with resources you need to implement the Interface `AutoCloseable`



# Example
```java
try(FileInputStream fis = new FileInputStream("/tmp/file1");
   FileOutputStream fos = new FileOutputStream("/tmp/file2")) {

    int i = fis.read();
    fos.write(i);
}
catch (IOException e) {
    // Ausnahme behandeln
}

```



# Example: Normal vs Resources
Normal Version
```java
Scanner sc = new Scanner(System.in);
int eingabe = 0;
try {
	eingabe = sc.nextInt();
} catch (Exception e) {
	System.out.println("Wrong Character, try again");
} finally {
	sc.close();
}
```

Resources Version
```java
int eingabe = 0;
try (Scanner sc2 = new Scanner(System.in)) {
	eingabe = sc2.nextInt();
} catch (Exception e) {
	System.out.println("Wrong Character, try again");
}
```
