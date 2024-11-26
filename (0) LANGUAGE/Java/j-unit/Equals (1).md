## Template:
###### v1
```java
class MyTest {
	public static input;
	
	@Test
	void test01(){
		Assertions.assertEquals(
			<result>,<className>.<methodName>(<input>));
	}
}
```

#### Exemple
```java
class Math {
    static int add(int a, int b);
    static int sub(int a, int b);
    static int div(int a, int b);
    static int mult(int a, int b);
}

//----------------------------------------------

class MathTest {
    @Test
    void add() {
        assertEquals(3, Math.add(1,2));
        assertEquals(10000, Math.add(5000,5000));
        assertEquals(-3, Math.add(-5,2));
        assertEquals(8, Math.add(10,-2));
        assertEquals(-7, Math.add(-5,-2));
        assertEquals(-7000, Math.add(-5000,-2000));
    }
    @Test
    void sub() {
        assertEquals(-1, Math.sub(1,2));
        assertEquals(1, Math.sub(2,1));
        assertEquals(0, Math.sub(5000,5000));
        assertEquals(-7, Math.sub(-5,2));
        assertEquals(12, Math.sub(10,-2));
        assertEquals(-3, Math.sub(-5,-2));
        assertEquals(-3000, Math.sub(-5000,-2000));
    }

    @Test 
    void div_with_zero() {
        assertThrows(ArithmeticException.class, Math.div(5/0));
    }

    @Test 
    void div_without_zero() {
        assertEquals(2, Math.div(5/2));
        assertEquals(-2, Math.div(-5/2));
    }
}
```


## v2
```java
class MyTest {
	public static input;
	
	@Test
	void test01(){
		Assertions.assertEquals(
			<return>,<className>.<methodName>(<classTestName>.<input>));
	}
}
```


#### Exemple:
```java
package MyUtils;  
  
import org.junit.jupiter.api.*;  
import org.junit.jupiter.api.Assertions;  
  
class MyMath_Test {  
    public static int[] arr1 = {2, 34, 56, 12, 56};  
	public static int[] arr2 = {2, 2, 4, 8, 9};  
	public static int[] arr3 = {1, 3, 8, 8};  
	public static int[] arr4 = {-2, 33, 67, 89, 0, -42};
  
    @Test  
    void max_IntArr() {  
        Assertions.assertEquals(56, MyMath.max_IntArr(MyMath_Test.arr1));
        Assertions.assertEquals(9, MyMath.max_IntArr(MyMath_Test.arr2));
        Assertions.assertEquals(8, MyMath.max_IntArr(MyMath_Test.arr3));
        Assertions.assertEquals(89, MyMath.max_IntArr(MyMath_Test.arr4));
    } // close_method max_IntArr
} // close class
```

