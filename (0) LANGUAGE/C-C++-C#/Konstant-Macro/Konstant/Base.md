# Syntax

```c
// Create Empty Constant
#define <name>
#define NEWKOSTANTNAME

// Define a Costant through the console
gcc -D<name> <value>
gcc -DKNEWONSTANTNAME

// Create Constant
#define <name> <value>
#define NEWKOSTANTNAME 42

// Create a Macro
#define <name>(<parameter>) <macroBody>
#define NEWMACRONAME(x) 2*(x)  //#1
```

- <span style="color:green">#0</span>
Constants are always in CAPSLOCK
- <span style="color:green">#1</span>
place a () around the parameter inside the value to prevent mathematical error<br>
and don't write ; because the parameter will appear inside the value like you write it.

