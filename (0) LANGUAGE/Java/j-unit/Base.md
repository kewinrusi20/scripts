```java
assertArrayEquals(<expectedResult>, <currentTestInput>, <allowed delta>)
```
- **expectedResult**: the Result the I expect
- **currentTestInput**: the Value that i will put in
- **allowed delta**: set a range for some result (like fload/double)



# @Annotation
- `@Test`
- `@DisplayName("my test description")`
- `@Disable`
- `@Before`
- `@BeforeEach`
- `@AfterEach`
- `@AfterAll`



# assert()

| Assertion | Explanation |
| :------ | :------ |
| assertArrayEquals() | Elemente des Arrays sind gleich |
| assertEquals() | Paramenter are equals |
| assertNotEquals() | Paramenter different |
| assertSame() | Objekte are the same |
| assertNotSame() | Objekte different |
| assertNull() | Referenz is null |
| assertNotNull() | **Referenz** is not null |
| assertTrue() | Bedingung ist wahr |
| assertFalse() | Bedingung ist falsch |
| fail() | Schägt auf jeden Fall fehl |


# To Know
**Regressions Tests**:
are test created for old version of the code, to validate the integrity/functionality of the old features