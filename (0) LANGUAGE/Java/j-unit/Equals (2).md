equals implementiert eine Äquivalenzrelation, mit folgenden Eigenschaften: o Reflexivität: Für jeden:
- Referenzwert x gilt: `x.equals(x) = true`.
- Symmetrie: Für die Referenzwerte x und y gilt: `x.equals(y) = y.equals(x)`.
- Transitivität: Für die Referenzwerte x, y und z gilt: Wenn `x.equals(y) = true` ∧ `y.equals(z) = true` ⇒ `x.equals(z) = true`.
- Konsistenz: Für die Referenzwerte x und y gilt, dass `x.equals(y)` bei mehrfachen Aufrufen immer dasselbe Ergebnis liefert – entweder true oder false, vorausgesetzt, dass keine von x und y in equals-Vergleichen verwendete Information verändert wurde.
- Für jeden Referenzwert x gilt `x.equals(null) = false`.

```java
class Base {
	protected int val;
	...
	public boolean equals (Object o) {
		if (!(o instanceof Base))
			return false;
			Base that = (Base) o;
			if (o == null) return false;
			else return this.val == that.val;
		}
	}
```