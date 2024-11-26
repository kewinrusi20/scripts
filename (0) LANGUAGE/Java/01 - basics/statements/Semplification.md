
# Short write
## Array Scan
```java
for (int index = 0; index < matrikel_ID.length; index ++)
	System.out.print(matrikel_ID[index]);

// >>> into >>>

for (char c : matrikel_ID)
	System.out.print(c);
```


## Boolean
```java
if(prokura)  
    System.out.println("yes");
else
    System.out.println("no");


// v1 (?)
boolean prokura = imput == 2? true:false;

// v2
(<statement>)<trueResult>:<falseResult>
(prokura)?"yes":"no"
```

## Idk
```java
i = i + 1 ⇒ i++;
```

```java
if (w1 > w2)
    return w1
else
    return w2

// >>> into >>>

return w1>w2?w1:w2; 
```

```java
“2”.matches(“[0-9]”) 

// >>> into >>>

“2”.matches(“\\d”) 
```



```java
boolean freeSpots = true;
for (int rowE = 0; rowE < gameBoard.length; rowE++) {
   for (int columnE = 0; columnE < gameBoard[rowE].length; columnE++) {
       if ((gameBoard[rowE][columnE] == ' ')) freeSpots = false;
   }
}
// >>> into >>>
boolean freeSpots = true;
for (char[] chars : gameBoard) {
   for (char aChar : chars) {
       if ((aChar == ' ')) {
          freeSpots = false;
          break;
       }
   }
}
```

# Array
```java
for (int i = 0; i < Win.length; i++)
   if (Win[i]) {
       statusWon = true;
       System.out.println(":= Player " + player + " won");
   }

>>> into >>>
for (boolean i : Win)
   if (i) {
       statusWon = true;
       System.out.println(":= Player " + player + " won");
   }
```
```java
String s = "Hello World";
int a = s.replaceAll("[\\s]", "").length();
System.out.println(a);
```
