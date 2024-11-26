
```java
ArrayList<String> s;
s = new ArrayList<>();
s.add(17);

ArrayList<int> i;  // error
ArrayList<Integer> i2;  // correct
```

```java
ArrayList<Integer> i;
i = new ArrayList<>();
i.add(17);  // Correct
i.add(62L);  // Error: only int allowed
```

```java
ArrayList<Long> i;
i = new ArrayList<>();
i.add(17);  // Error: only long allowed
i.add(62L);  // Correct: due of Literal
i.add((long) 43);  // Correct: due of casting
```

