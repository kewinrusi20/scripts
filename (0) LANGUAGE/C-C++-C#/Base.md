# Comments
- // Single Line
- /* Multi Line */

# check file
```c
// check the file
gcc -E file.c 
```

# IF-Condition

## Example
```c
#ifdef MYCALC   // if MYCALC is defined 
#ifndef MYCALC  // if MYCALC is NOT defined
#if MYCALC == 42 // if MYCALC content equals to 42

#else   // else
#elif   // else if

#endif  // close if condition
```

## Array Length
```c++
    for (int i = 0; i < (sizeof(m_Element) / sizeof(float)); i++) {
        this->m_Element[i] += v.m_Element[i];
    }
```