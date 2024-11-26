
# Linked List
> Useful to create List with No Specified Length
> [LinkedList (Java SE 20 & JDK 20) (oracle.com)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/LinkedList.html)


```java
import java.util.LinkedList;
LinkedList<Integer> myList = new LinkedList<>();
LinkedList<String> myList = new LinkedList<>();
var index = new LinkedList<Integer>();
```

```java
.set(index,element) // replace
int = .size()

.clone()
.toArray()
.toArray(HashMap[] hm) // specifie Collection Type
```

---
# Add Elements
```java
.add(index,element)

// .add(e) --> return `IllegalStateException` or `UnsupportedOperationException`
// .push(e) --> return `void`
.addFirst(e)/*or*/.push(e)
.addLast(e)/*or*/.add(e)


// .offer(e) --> return `boolean`
.offerFirst(e)
.offerLast(e)/*or*/.offer(e)
```

```java
.addAll(index,collection)
.addAll(collection)
```

---
# Get Elements
```java
// return `NoSuchElementException`
e = .get(index)
e = .getFirst()/*or*/.element()
e = .getLast()


// .peek() --> return `null`
e = .peek()/*or*/.peekFirst()
e = .peekLast()
```

More:
```java
System.out.println(myList)
// -> [..., ..., ...]


.contains() // return boolean value


.indexOf(e) // return position of the first element
.lastIndexOf(e) // return position of the last element
```

---
# Remove Elements
```java
// return `NoSuchElementException`
// .removeFirstOccurrence(e) return `boolean`

.remove(index)
.remove(element)
.remove() // first element

e = .removeFirst()
e = .removeLast()

boolean = .removeFirstOccurrence(e)
boolean = .removeLastOccurrence(e)


// first Element
e = .pop() // return `NoSuchElementException`
e = .pollFirst()/*or*/e = .poll() // return `null`
e = .pollLast()
```

More: 
```java
.clear();
.remove(Integer.valueOf(...));
```

---
# Example
```java
import java.util.LinkedList;
LinkedList<String> myList = new LinkedList<>();

// Add elements to the linked list 
myList.add("apple"); 
myList.add("banana"); 
myList.add("cherry");

System.out.println(myList);
// -> [apple, banana, cherry]
```