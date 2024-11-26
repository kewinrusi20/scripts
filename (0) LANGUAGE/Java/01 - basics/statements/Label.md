# Label
Our label here, is named **closeTheLoop**.

It is used after a break or a continue, to restart at a specific point
It help you restart the loop after you used a break.

```java
closeTheLoop:
    while () {
        ...
        switch () {
            ...
            case 99:
                break closeTheLoop;
        }
    }

```