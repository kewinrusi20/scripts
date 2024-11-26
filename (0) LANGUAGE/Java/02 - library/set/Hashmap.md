https://wiki.byte-welt.net/wiki/HashMap_(Java_API)
```java
import java.util.HashMap;
HashMap<KeyType,ValueType> nameHM = new HashMap<KeyType,ValueType>();

Map<Character, Integer> last = new HashMap<>();
```


# Layout
```java
System.out.print(nameHM) // print the entire HashMap

nameHM.put(keyName,value);
nameHM.replace(keyName,value);
nameHM.remove(keyName);
nameHM.clear();


nameHM.get(keyName);    // only specific key
nameHM.keySet();        // list of all the keys
nameHM.values();        // list of all the values
nameHM.entrySet();      // idk

nameHM.containsKey(keyName)  // check if attributes exists | -> true or false
nameHM.containsValue(value)  // check if attributes exists | -> true or false

nameHM.size();
```

<span style="color:red">Note:</span> 
HashMaps don't have an order, if u replace the value of a key, u will that key will move at the bottom of the list.


# Example 1
```java
int a = 10;
int b = 3;
int c = 88;

HashMap<String, Integer> myData = new HashMap<String, Integer>();
    
myData.put("Andrea",18);
myData.put("Marc",18);
myData.put("Lucas",18);

System.out.println(myData.get("Lucas"));
System.out.println(myData);
```


# Example Print
```java
public String getInventarMedien() {
	StringBuilder medienAusgabe;
	
	
	for (Medium m : inventarMedien.values()) {
	System.out.println(m.getName());
	}
	
	//System.out.println(inventarMedien.values());
	
	return "Medienliste:";
}
```