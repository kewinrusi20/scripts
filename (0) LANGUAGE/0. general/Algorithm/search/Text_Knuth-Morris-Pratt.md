> Optimized to search long patterns

![](ts_knuth.jpg)
a | a
-- | :--:
Complexity: | `O(n)`
m = Pattern length
n = Text length
---

```java
public static int knuthMorri(String haystack, String needle) {
	int[] patternInt = computeLPS(needle);
	int iText = 0, iPattern = 0;
	
	while (iText < haystack.length()) {
		if (needle.charAt(iPattern) == haystack.charAt(iText)) { // Character found, check the next char of text and of pattern
			iText++;
			iPattern++;
		}
		if (iPattern == needle.length()) { // (!) WORD FOUND, stop program
			return iText - iPattern;
		} else if (iText < haystack.length() && needle.charAt(iPattern) != haystack.charAt(iText)) { // Character mismatch
			if (iPattern != 0) { // if one character is already found
				iPattern = patternInt[iPattern - 1]; // check if to restart from the beginning (of the Pattern) or already from the next position 
			} else {
				iText++;
			}
		}
	}
	return -1;
}
```


# ComputeLPS: Calculation or next-Table

![](ts_next_table.jpg)

```java
public static int[] computeLPS(String pattern) {
	int[] patternInt = new int[pattern.length()];
	int j = 0;
	for (int i = 1; i < pattern.length();) {
		if (pattern.charAt(i) == pattern.charAt(j)) {
			patternInt[i] = j + 1;
			i++;
			j++;
		} else {
			if (j != 0) {
				j = patternInt[j - 1];
			} else {
				patternInt[i] = 0;
				i++;
			}
		}
	}
	return patternInt;
}
```