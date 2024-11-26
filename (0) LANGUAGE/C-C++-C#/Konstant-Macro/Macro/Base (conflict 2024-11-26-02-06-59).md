
# Syntax
```c
// Create a Macro
#define <name>(<parameter>) <macroBody>
#define NEWMACRONAME(x) 2*(x)  //#1
```

- <span style="color:green">#1</span>
place a () around the parameter, to prevent a mathematical error<br>
and don't write ; because the parameter will appear inside the value like you write it.

## Example
```c
#define CALC(x) 2*x
int main() { return CALC(1+1); }  	// CALC(1+1) 2*1+1 --> 3

#define CALC(x) 2*(x)	// with () around the parameter
int main() { return CALC(1+1); }  	// CALC(1+1) 2*(1+1) --> 4
```

<span style="color:red">Note:</span>
You can neither debug a macros nor you a recursion
