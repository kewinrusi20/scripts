> MVP

The Algorithm start searching the Pattern at the beginning of the text by its last Letter.
If the Letter is inside the Pattern, it will look, how many position it has to move, in order to find the next match.

![](ts_boyer_1.jpg)
![](ts_boyer_2.jpg)

a | a
-- | :--:
Complexity: | `O(h+n)`
h = Text length
n = Word length

---
```java
public int boyerMoore(String haystack, String needle) {
    char[] textChars = haystack.toCharArray();
    char[] patternChars = needle.toCharArray();
    int textLength = textChars.length;
    int patternLength = patternChars.length;


    // set all chars, by default, to -1
    Map<Character, Integer> last = new HashMap<>();
    for (char c : textChars) 
        last.put(c, -1);
    
    // update last seen positions
    for (int i = 0; i < patternLength; i++) 
        last.put(pattern[i], i);


    //Start with the end of the pattern aligned at index patternLength-1 in the text.
    int i = patternLength - 1; // index into text
    int j = patternLength - 1; // index into pattern
    

    // match! return i if complete match; otherwise, keep checking
    while (i < textLength) {
        if (textChars[i] == patternChars[j]) {
            if (j == 0) return i; // stop loop, word found
            i--; j--;
        } else { // jump step + restart at end of pattern
            i += patternLength - Math.min(j, 1 + last.get(text[i])); //iterate over text
            j = patternLength - 1; // restart pattern
        }
    }
    
    // not found
    return NOT_FOUND;
}
```
