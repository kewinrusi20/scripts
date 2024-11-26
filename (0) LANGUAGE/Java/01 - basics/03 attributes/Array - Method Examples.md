

# Length
- *array*`.length`
```java
int[] nums = new int[10];
System.out.println(nums.length);  // --> 10
```



# Compare
- *array 1*` == `*array 2*: to compare **references** (the address)
```java
int[] a = { 1, 2, 3 };
int[] b = { 1, 2, 3 };
System.out.println(a == b);  // -> false
```


- *array 1*`.equals(`*array 2*`)`: a **custom compare methods** inherited from the class "Objects"
```java
int[] a = { 1, 2, 3 };
int[] b = { 1, 2, 3 };
System.out.println(a.equals(b));  // -> false
```


- `Arrays.equals(`*array 1*, *array 2*`)`: compare element **one by one** inside 2 arrays
```java
int[] a = { 1, 2, 3 };
int[] b = { 1, 2, 3 };
System.out.println(Arrays.equals(a, b));  // -> true
```
(**!**) Only this one compare che content


- for **partial compare**:
	`Arrays.equals(`*array 1*, *start index*, *num elements*, *array 2*, *start index, *num elements* `)`
	- *array 1*
	- *start index*
	- *num elements*
	- *array 2*
	- *start index*
	- *num elements*
```java
int[] i1 = {1, 2, 3};
int[] i2 = {1, 2, 5};

Arrays.equals(i1, i2):              // --> false
Arrays.equals(i1, 0, 2, i2, 0, 2);  // --> true
```


- `Arrays.deepEquals(`*nested array 1*, *nested array 2*`)` for **Nested Arrays**
```java
int[][] i1 = new int[3][3];
int[][] i2 = new int[3][3];

Arrays.deepEquals(i1, i2);
```


- `Arrays.compare(`*array 1*, *array 2*`)`: to **compare inside elements**
```java
int[] i1 = {1, 2, 3};
int[] i2 = {10, 20, 50};

Arrays.compare(i1, i2);      // -1
Arrays.compare(i1, i1Copy);  // 0
Arrays.compare(i2, i1)       // 1
```
- `-1` if first is *smaller*
- `0` if both a *equal*
- `1` if first is *bigger*

- `compareTo()`
```java
String s;
String[] as;

while (true) {
	if (s.comprareTo(as[mittel] == 0)) {
		return mitte;
	} else if (s.comprareTo(as[mittel] < 0)) {
		mitte = (mitte - 0) / 2;
	} else {
		mitte = mitte + (as.length - 1 - mitte) / 2;
	}
}
```

Example 2
```java
class Person implements Comparable<Person> {
    String name;
    int age;
	
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
    @Override
    public int compareTo(Person other) {
	    // Compare by age
        return Integer.compare(this.age, other.age);
    }
	
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        };
		
        // Sort the array by age (using Comparable)
        Arrays.sort(people);
		
        // Print the sorted array
        System.out.println(Arrays.toString(people));
        // Output: [Bob (25), Alice (30), Charlie (35)]
    }
}
```



# Copy
- `System.arraycopy(`*old array*, *start index*, *new array*, *start index*, *num of elements to copy*`)`
	- *old array*
	- *start index*
	- *new array*
	- *start index*
	- *num of elements to copy*
```java
// Original array to be copied  
int[] originalArray = {1, 2, 3, 4, 5};  
  
// Create a new array of the same length as the original  
int[] copiedArray = new int[originalArray.length + 3];

System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
// src      source array  
// srcPos   starting position in the source array  
// dest     destination array  
// destPos  starting position in the destination array  
// length   number of elements to copy  
```


- `Arrays.copyOf(`*array*, *length*`)`: partial copy Arrays
	- *array*: original array
	- *length*: length of the new array
```java
int[] array = new int[10];
int[] newArray = Array.copyOf(array,array + 2);
```



# Sort
- `Arrays.sort(`*array*`)`
```java
int[] array = {5, 2, 1, 9, 5};
Arrays.sort(array);
// --> [1, 2, 5, 5, 9]
```
In case of **Strings**, it will sort in alphabetical order.


- Sort in **descending order** for **Objects**
```java
Integer[] numbers = {5, 2, 1, 9, 5};
Arrays.sort(numbers, Collections.reverseOrder());
// --> [9, 5, 5, 2, 1]
```
It works only for Objects (Wrapper Classes)


- Sort a **custom range**
```java
int[] numbers = {5, 2, 1, 9, 5};
// Sort from index 1 to <4 (3)
Arrays.sort(numbers, 1, 4);
// --> [5, 1, 2, 9, 5]
```

 
- **Sorting Custom Objects** (example sorting custom objects by age):
```java
class Person implements Comparable<Person> {
    String name;
    int age;
	
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
    @Override
    public int compareTo(Person other) {
	    // Compare by age
        return Integer.compare(this.age, other.age);
    }
	
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        };
		
        // Sort the array by age (using Comparable)
        Arrays.sort(people);
		
        // Print the sorted array
        System.out.println(Arrays.toString(people));  
        // Output: [Bob (25), Alice (30), Charlie (35)]
    }
}
```
If you want to sort an array of custom objects (like a class `Person`), you need to implement the `Comparable` interface or use a custom `Comparator`.



# Search
- `Arrays.binarySearch(`*arrays*, *target*`)` to search a number inside an int sorted array
```java
int[] array = {5, 2, 1, 9, 5};  
Arrays.sort(array);  // --> [1, 2, 5, 5, 9]
  
Arrays.binarySearch(array, 5);  // --> Index of: 2  

// For value that are not present in the array
// the result will always be a guess,
// where that value would be placed
// but in negative value, and the index starts with 1 (not 0)
Arrays.binarySearch(array, -5));  // --> -1
Arrays.binarySearch(array, 0));  // --> -1
Arrays.binarySearch(array, 3));  // --> -3
Arrays.binarySearch(array, 6));  // --> -5
Arrays.binarySearch(array, 8));  // --> -5
Arrays.binarySearch(array, 20));  // --> -6
```
- (**!**) It only works with sorted arrays (otherwise it give strange numbers)



# Print
- `Arrays.toString(`*b*`)`
- *b*`.toString()`
```java
int[] b = new int[5];  
System.out.println(Arrays.toString(b));
System.out.println(b.toString());
```

Result
```java
[0, 0, 0, 0, 0]
[I@15aeb7ab
```



# Fill
- `Arrays.fill(`*array*, *value*`)`: Füllen eines Array mit Daten
	- *array*
	- *value*
```java
int[] array = new int[5];

Arrays.fill(array, 5);
// 5 is the value
// --> [5, 5, 5, 5, 5]

Arrays.fill(array, 1, 4, 5);
// fill from index 1 to index <4 (3)
// --> [0, 5, 5, 5, 0]

```



# More
`T[]` stands for the array
- `deepHashCode(T[])`
- `deepToString(T[])`
- `hashCode(T[])`
- `mismatch(T[], T[])`
- `parallelPrefix(`
	`T[] array, int fromIndex, int toIndex, BinaryOperator<T> o)`
- `parallelSort(T[])`
- `setAll(T[], UnaryOperator)`
