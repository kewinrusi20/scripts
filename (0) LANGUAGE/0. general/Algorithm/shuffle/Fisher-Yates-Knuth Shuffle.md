**Maker**: Fisher, Yates and Knuth

**Function**: The Fisher-Yates algorithm works by iterating through the array from the <u>last element</u> to the first, swapping each element with a randomly selected element that comes before it (including itself). 


Example 1
```c#
using System;

static void FisherYatesShuffle(int[] arr) {
	Random random = new Random();
	int n = arr.Length;
	
	for (int i = n - 1; i > 0; i--) {
		// Generate a random index between 0 and i (inclusive)
		int j = random.Next(0, i + 1);
		
		// Swap the elements at positions i and j
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} // close function: FisherYatesShuffle
```

 Example 2
```java
private static void shuffle(String[] data) {
    Random random = new Random();

    for (int i = 0; i < data.length-1; i++) {
	    int indexToSwap = random.nextInt(data.length);
		
		// Swap  indexCurrent with indexRandom
        String temp = data[indexToSwap];
        data[indexToSwap] = data[i];
        data[i] = temp;
    }
}
```

# Data

a | a
-- | :--:
Complexity: | `O(n)`
Best Case: | 
Worst Case: | 
Average Case (successful): | 
Average Case (<ins>un</ins>successful): | 












































[^1]: This is the footnote.