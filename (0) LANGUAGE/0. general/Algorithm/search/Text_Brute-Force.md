> the Algorithm that only NASAs PC can use

![](ts_bruteforce.jpg)

---
<ins>A</ins> <ins>B</ins> <ins>C</ins> D E F D = 7
DEF = 5

i = 7 - 5 = 2
search only the first 3 slots (from 0 to 2)

a | a
-- | :--:
Complexity: | `O(m*n)`
m = Pattern length
n = Text length

---
```java
public int bruteForce(String haystack, String needle) {
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
	    
        int j;
        for (j = 0; j < needle.length(); j++) {
            if (haystack.charAt(i + j) != needle.charAt(j)) {
                break;
            }
        }
        
        if (j == needle.length()) {
            return i;
        }
    }
    return NOT_FOUND;
}
```
