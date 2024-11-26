
## Initialization
```java
// String
Stream<String> wordCollection = Stream.of("Adam","Noe","Alex");

// Primitive Data Type
IntStream streamInt1 = Array.stream(num).boxed; // version 1
Stream<Integer> streamInt2 = Arrays.stream(num).mapToObj(temp -> (Integer)temp); // version 2
Stream<Character> streamChar2 = Arrays.stream(num).mapToObj(temp -> (char)temp); // version char
```


## Cast
### List >> Stream
```java
List<String> name = Arrays.asList("Adam","Noe","Alex");
name.stream()
```

### Array >> Stream
```java
int[] aNum = {81,51,231,8,1};
IntStream sNum = IntStream.of(aNum);                // cast and save
IntStream.of(aNum).forEach(System.out::println);    // cast and print

// idk
IntStream sNum = Arrays.stream(aNum).boxed();         // cast
```

### List >> ArrayList
```java
List<Integer> li = Arrays.asList(0,1,2,234,233);
ArrayList<Integer> ali = new ArrayList<>();

// version 1
li.forEach(i -> {
    ali.add(i);
    System.out.println(i);
});

// version 2
al.addAll(li);
ali.forEach(e -> System.out.println(e));
```


## forEach
```java
stream.forEach(System.out::println)

// ---
List<String> name = Arrays.asList("Adam","Noe","Alex");
name.stream().forEach(tName -> System.out.println(tName));  // with Lambda

List<String> name = Arrays.asList("Adam","Noe","Alex");
name.stream().forEach(System.out::println);                 // with Method-Referenz
```


## Map
```java
stream.map(tName -> tName.toLowerCase());
sName.map(n -> n + n.length()).forEach(System.out::println);
sName.map(n -> new NameLaenge(n, n.length()).forEach(System.out::println));
sName.map(n -> n.length()).filter(z -> z > 4).map(z -> z*z).forEach(System.out::println));
sName.map(Schauspieler::getName);
```