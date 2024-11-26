```java
class PasswordCheck { 
	static boolean checkPassword(String password){ 
	//... 
	}
}
```

## assertTrue/False
```java
@Test 
void withoutSmallChar(){ assertFalse(PasswordCheck.checkPassword("AABBCC"));
} 

@Test 
void withSmallChar(){ 
assertTrue(PasswordCheck.checkPassword("AaBbCc"));
}
```

## assertEquals
```java 
@Test
void withoutSmallChar(){
	assertEquals(false, PasswordCheck.checkPassword("AB01!AA1"));
}

@Test
void withSmallChar(){
	assertEquals(true, PasswordCheck.checkPassword("AB01!Aa1"));
}
```

assertFalse ==> if the result must be false<br>
assertTrue ==> if the result must be true

## assertNotNull
```java
@Test
void smokeTest() {
	assertNotNull(objectCar);
}
```
