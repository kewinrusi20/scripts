
```java
int twoDim [][] = new int [4][];
twoDim[0] = new int[2];
twoDim[1] = new int[4];
twoDim[2] = new int[6];
twoDim[3] = new int[8];
```

```
x  x  x  x 
x  x  x  x
   x  x  x
   x  x  x
      x  x
      x  x
         x
         x
```




## 3x3 Matrix
```java
int matrix [][] = new int [3][3];
matrix[0][0] = 1;
matrix[0][1] = 2;
matrix[0][2] = 3;
matrix[1][0] = 4;
matrix[1][1] = 5;
matrix[1][2] = 6;
matrix[2][0] = 7;
matrix[2][1] = 8;
matrix[2][2] = 9;
```

```java
int[][] matrix3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
```

```java
int[][] matrix2 = {  
        {1, 2, 3},  
        {4, 5, 6},  
        {7, 8, 9}  
};
```



# Print
```java
Arrays.stream(matrix)  
        .map(Arrays::toString)  
        .forEach(System.out::println);  
//      .forEach(x -> System.out.println(x));
```

Result
```
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
```


- `.deepToString()`
```java
String s = Arrays.deepToString(matrix);
System.out.println(s);
```

Result
```
[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
```


- `for` *i*
```java
for (int i = 0; i < matrix.length; i++) {  
    for (int j = 0; j < matrix[i].length; j++) {  
        System.out.println(matrix[i][j]);  
    }  
}
```

Result
```
1
2
3
4
5
6
7
8
9
```


- `for` *each*
```java
for (int[] first: matrix) {  
    for (int second: first) {  
        System.out.println(second);  
    }  
}
```

Result
```
1
2
3
4
5
6
7
8
9
```
