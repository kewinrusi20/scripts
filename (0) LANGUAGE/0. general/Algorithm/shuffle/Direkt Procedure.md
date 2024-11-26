```java
public void shuffle(String[] data) {
    Random random = new Random();
    int n = data.length;
    String[] result = new String[n];

    var positionsToCopy = new LinkedList<Integer>();

    for (int i = 0; i < n; i++) {
        positionsToCopy.add(i);
    }

    for (int i = 0; i < n; i++) {
        int z = random.nextInt(n - i);
	        result[i] = data[positionsToCopy.get(z)];
        positionToCopy.remove(z);
    }

    System.arraycopy(result, 0, data, 0, n);
}
```

a | a
-- | :--:
Complexity: | `O(n²)`
Best Case: | 
Worst Case: | 
Average Case (successful): | 
Average Case (<ins>un</ins>successful): | 

