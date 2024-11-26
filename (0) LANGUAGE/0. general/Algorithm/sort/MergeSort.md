![](merge_sort.jpg)

```java
void msort(int[] array, int le, int ri, int[] helper) {
    int i, j, k;
    if (ri > le) {
        // zu sortierendes Feld teilen
        int mid = (ri + le) / 2;

        // Teilfelder sortieren
        msort(array, le, mid, helper);
        msort(array, mid + 1, ri, helper);

        // Hilfsfeld aufbauen
        for (k = le; k <= mid; k++) {
          helper[k] = array[k];
        }

        for (k = mid; k < ri; k++)  {
          helper[ri + mid - k] = array[k + 1];
        }
```