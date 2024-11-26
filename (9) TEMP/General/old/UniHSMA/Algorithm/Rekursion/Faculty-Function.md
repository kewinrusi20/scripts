## Example
![[Faculty-Function.png]]
```java
static int faculty ( int n ) { 
	if (n == 0) 
		return 1; 
	else 
		return n * faculty( n-1 ); 
}
```

### Soluzion
```java
faculty( 4 ) 
→ faculty( 4 * faculty( 3 ) ) 
→ faculty( 4 * faculty( 3 * faculty( 2 ) ) ) 
→ faculty( 4 * faculty( 3 * faculty( 2 * faculty( 1 ) ) ) ) 
→ faculty( 4 * faculty( 3 * faculty( 2 * faculty( 1 * faculty( 0 ) ) ) ) ) 

= 24
```