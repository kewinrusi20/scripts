# Try-with-resources vs Finally

^db6609

Try-with-resources Version
```java
try(FileInputStream fis = new FileInputStream("/tmp/file1");
   FileOutputStream fos = new FileOutputStream("/tmp/file2")) {
  
    int i = fis.read();
    fos.write(i);
}
catch (IOException e) {
    // Ausnahme behandeln
}

  
FileInputStream fis = new FileInputStream("/tmp/file1");
FileOutputStream fos = new FileOutputStream("/tmp/file2");
```

Finally Version
```java
try {
    int i = fis.read();
    fos.write(i);
}
catch (IOException e) {
    // Ausnahme behandeln
}
finally {
    try {
        fis.close();
    }
    catch (IOException e) { /* ignore */ }
  
    try {
        fos.close();
    }
    catch (IOException e) { /* ignore */ }
}
```
---
