# Priority Queue <span style="color:red">(!)</span>
<span style="color:red">To replace:</span>
number with value of index.

```java
import java.util.PriorityQueue;
```

```java
PriorityQueue<Integer> prioQ = new PriorityQueue<>();

prioQ.offer(number);
prioQ.poll();                       // it can be printed

prioQ.();
prioQ.();
prioQ.();
prioQ.();
prioQ.();
prioQ.();

```

The Priority Queue will always(?) select the smallest number
## Example 1
```java
PriorityQueue<Integer> someNumbers = new PriorityQueue<>();
someNumbers.offer(2);
someNumbers.offer(5);
someNumbers.offer(4);

System.out.println(someNumbers.poll());     // -> 2
System.out.println(someNumbers.poll());     // -> 4
```

## Example 2 (Objects)
```java
import java.util.PriorityQueue;
import java.util.Comparator;

Class User {
    private int = age;
    y>
    public void setAge(int age){ this.age = age; }
    public int getAge() { return this.age; }

}

Class Main {
    public static void main(String[] args){
        PriorityQueue<User> userQueue = new PriorityQueue<>(
            Comparator.comparing((UserProfile u) -> u.age)
        );
        userQueue.offer(new User(25));
        userQueue.offer(new User(47));
        userQueue.offer(new User(29));

        System.out.println(userQueue.poll().age);       // -> 25
    }
}
```