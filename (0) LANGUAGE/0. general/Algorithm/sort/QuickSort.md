![](quick_sort.png)

```java
int partition(int[] array, int u, int o, int p) {
    int pn = u;
    int pv = array[p];
    // Pivot-Element an das Ende verschieben
    swap(array, p, o);
    for (int i = u; i < o; i++) {
        if (array[i] <= pv) {
            swap(array, pn++, i);
        }
    }

    // Pivot-Element an die richtige Position kopieren
    swap(array, o, pn);

    // neue Pivot-Position zurückgeben
    return pn;
}
```

```java
void qsort(int[] array, int u, int o) {

    // Pivot-Element bestimmen
    int p = (u + o) / 2;
    if (o > u) {
        // Feld zerlegen
        int pn = partition(array, u, o, p);
        // und Partitionen sortieren
        qsort(array, u, pn - 1);
        qsort(array, pn + 1, o);
    }
}
```

```java
public void sort(int[] data) {
    qsort(data, 0, data.length - 1);
}
```