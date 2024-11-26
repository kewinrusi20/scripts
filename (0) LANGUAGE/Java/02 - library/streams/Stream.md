
```java
Stream<String> Orginal = Stream.of("asd", "aa bb", a2fc);
Stream<String> wordCollection;
Stream<String> word_lowerCase;
```

```java
wordCollection.flatMap(temp -> Array.stream(temp.split(",")));
word_lowerCase.map(temp -> temp.toLowerCase());
word_lowerCase.forEach(temp -> System.out.println(temp));
```
