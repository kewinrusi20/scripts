
```java
wordCollection.flatMap(temp -> Array.stream(temp.split(",")));
word_lowerCase.map(temp -> temp.toLowerCase());
word_lowerCase.forEach(temp -> System.out.println(temp));
word_lowerCase.filter(temp -> temp.startsWith("a"));

int counter = streamInt.count;
```

---
```java
List<Integer> li = Arrays.asList(0,1,2,234,233);
li.forEach( (Integer i) -> {System.out.println(i);} );

---
IntStream.range(1,50).forEach(System.out::println);
IntStream.rangeClosed(1,50).forEach(System.out::println);
IntStream.iterate(0, i->i+5).limit(10).forEach(System.out::println);
IntStream.range(1,50).filter(n -> n%2==0).forEach(System.out::println);
```
