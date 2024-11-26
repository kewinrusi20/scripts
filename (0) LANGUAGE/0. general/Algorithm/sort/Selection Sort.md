This Algorithm iterates through the whole unsorted list, element by element, searching for the biggest/smallest element, and then positioning it to one side (right or left)

The Idea behind the Selection Sort Algorithm, is to iterate to the whole list , in search for the biggest/smallest element, then positioning it to one side (right or left).

By the implementation, you chose one side (e.g.: right) 

![](selection_sort.jpg)

```java
public void sort(int[] data) {
    int pos = data.length - 1;
    while (pos >= 0) {
        // bestimme größtes Element
        int indexMax = 0;
        for (int i = 0; i <= pos; i++) {
            if (data[i] > data[indexMax]) {
                indexMax = i;
            }
        }
        // tausche array[pos] mit diesem Element
        swap(data, pos, indexMax);
        pos--;
    }
}
```
