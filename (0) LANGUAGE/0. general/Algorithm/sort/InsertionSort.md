![](insertion_sort.png)

```java
public void sort(int[] data) {
    for (int i = 1; i < data.length; i++) {
        int m = data[i];
        int j = i;
        while (j > 0) {
            if (data[j - 1] >= m) {
                /* Verschiebe data[j - 1] eine Position nach rechts */
                data[j] = data[j - 1];
                j--;
            }
            else {
                break;
            }
        }
        data[j] = m;
    }
}
```
