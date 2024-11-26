
```java
public static int reverseNumber(int n){
	String s_n = String.valueOf(n);
	StringBuilder n_rev = new StringBuilder();
	
	for (int i = s_n.length() - 1; i >= 0; i--){
		n_rev.append(s_n.charAt(i));
	}
}
```
