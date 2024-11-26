The binary search is an algorithm for searching for a specific value in a sorted array. The algorithm works by dividing the array into smaller and smaller parts until the searched value is found or until it is determined that the value is not contained in the array

The Algorithm take the mid value of the List, and look if the Target is bigger (right) or smaller (left), then decide where to go next, till the mid value corresponds to the Target.

![](binary_search.png)

```java
public int search(int e, int[] data) {
    int untern = 0;
    int oben = data.length - 1;
    while (untern <= oben) {
        int mitte = (untern + oben) / 2;
		
		// Gefunden
        if (data[mitte] == e) {
            return mitte;
        }
		
        // Gesuchter Wert ist großer
        else if (e > data[mitte]) {
            untern = mitte + 1;
            // +1, weil, mitte nicht der Zahl ist
        }
        
        // Gesuchter Wert ist kleiner
        else {
            oben = mitte - 1;
            // -1, weil, mitte nicht der Zahl ist
        }
    }
	
    return NOT_FOUND;
}
```
- Alternative um die Funktion zu beenden wäre: unter = Mitte, weil int abrundet


a | a
-- | :--:
Complexity: | `O(log n)`
Best Case: | 1
Worst Case: | log2(n)
Average Case (successful): | log2(n)
Average Case (<ins>un</ins>successful): | log2(n)

