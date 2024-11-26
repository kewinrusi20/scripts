
- `fail()` / `assertTrue(true)`
# Try & Catch
```java
@Test
public void testAufAusnahme() {
	
	try {
		new String((String) null);
		fail();
		
	}
	catch (NullPointerException ex) {
		assertTrue(true);
	}
}
```

```java
@Test
public void testAufAusnahme() {
	Assertions.assertThrows(NullPointerException.class, () -> {
		new String((String) null);
	});
}
```
