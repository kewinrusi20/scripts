
```java
     try {  
//BufferedWriter writer = new BufferedWriter(new FileWriter("mods/" + MOD_ID + ".txt"));  
         BufferedWriter writer = new BufferedWriter(new FileWriter("test01a" + ".json"));  
         writer.write("This is a test to create a json file");  
         writer.write("\nThis is a test to create a json file");  
           
         writer.close();  
     } catch (IOException e) {  
         throw new RuntimeException(e);  
     }
```