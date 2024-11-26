```
function randperm(n)
  P = zeroes(n)          // Ergebnispermutation mit Nullen initialisieren
  N = [1:n]              // Feld mit den Zahlen von 1 bis n
  for i = 1 to n         // Schleife über die Einträge von P
    z = random(n-i+1)    // Gleichverteilte Zufallszahl zwischen 1 und n-i+1
    P(i) = N(z)          // Wähle als nächsten Eintrag die z-te verbleibende Zahl
    N = setdiff(N,N(z))  // Entferne diese Zahl aus den verbleibenden Zahlen
  end
  return P
```

```java
public int search(int e, int[] data) {
    for (int i = 0; i < data.length; i++) {
        if (e == data[i]) {
            return i;
        }
    }

    return NOT_FOUND;
}
```

a | a
-- | :--:
Complexity: | `O(n)`
Best Case: | 1
Worst Case: | n
Average Case (successful): | (n+1)/2
Average Case (<ins>un</ins>successful): | n

