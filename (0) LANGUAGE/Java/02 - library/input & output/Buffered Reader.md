
```java
try {
	BufferedReader reader = new BefferedReader(new FileReader("test01a" + ".json"));
	
	String line;
	while ((line = reader.readLine()) != null) {
		System.out.println(line);
	}
	reader.close();
} catch (IOException e) {
	e.printStackTrace();
}
```