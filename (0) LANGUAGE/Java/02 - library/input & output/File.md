```java
import java.io.File;

File f = new File("Home.txt");
Scanner s = new Scanner(f);

boolean lineExistence = s.hasNextLine();
String transcriptLine = s.nextLine(); 
	// it will go to the next line
	// and transfer it content into a String Object
```

```java
boolean fileExistens = myFile.exists();

String fileName = f.getName(); // --> Home.txt
String filePath = f.getAbsolutePath(); // C:\Users\MyName\Home.txt

boolean write = f.canWrite(); //
boolean read = f.canRead(); //
f.length(); // size of the file in bytes
```


---
File + Scanner
```java
File myObj = new File("filename.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
	String data = myReader.nextLine();
	System.out.println(data);
}
myReader.close()
```
