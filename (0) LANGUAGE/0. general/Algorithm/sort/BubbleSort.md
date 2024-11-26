![](bubble_sort.png)

```java
public void sort(int[] data) {
    boolean swapped;
    do {
        swapped = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                // Elemente vertauschen
                swap(data, i, i + 1);
                swapped = true;
            }
        }
    } while (swapped);
}
```
