# Regex
```java
Import java.util.regex.*;    https://regexr.com/     https://regex101.com/ 
```

## Sintax
```java
<variableName>.matches("<...>"); 
”<String>”.matches("<...>"); 

"Hallo".matches("Hallo");      // true 
"Hello".matches("H[ae]llo");   // true   // [allowed] 
"Hallo".matches("H[^iou]llo"); // true   // [^not allowed] 
```


## Operators
```java
// Some operators are reserved:  /, ^, $, ., |, ?, *+, (), [], { .
// For this one, u have u put a (\\) double backslash, to make disable their function.
“1+1”.matches(“1+1”)   // false 
“1+1”.matches(“1\\+1”) // true 


// Any character “.”  	
“Hello?”.matches(“Hallo.”) //true 	
“Hello!”.matches(“Hallo.”) //true 	
“Hello1”.matches(“Hallo.”) //true 	
“Helloo”.matches(“Hallo.”) //true 	

// 0 or 1, no more characters “?”
“Hello?”.matches(“Hallo?”) //true
“Hello?”.matches(“Hallo?”) //idk
“Hello?”.matches(“Hallo?”) //idk
“Hello?”.matches(“Hallo?”) //idk
```


## Abbreviation
```java
// // for “number” and their opposite		
“2”.matches(“[0-9]”) // true 		
“2”.matches(“\\d”)   // true 		
“2”.matches(“\\D”)   // false 		

// >>> into >>> “word”  (and _underscore)
“a/A/1”.matches(“[a-zA-Z_0-9]”) // true
“a/A/1”.matches(“\\w”)          // true
“a/A/1”.matches(“\\W”)          // false

// >>> into >>> “space” 
“ ”.matches(“ ”)   // true 
“ ”.matches(“\\s”) // true
“ ”.matches(“\\S”) // false
```

## Length
```java
// “...{n}” the length is referred to the previous condition 
   ””.matches(“\\d{0}”)   // true 
”123”.matches(“\\d{1,4}”) // true between 1-4 | {1,} 1...
”ab3”.matches(“\\w{1,4}”) // true 


// “+” 1 or more characters 
“Bro12”.matches(“\\w+”)   // true 
   “Hi”.matches(“\\w+”)   // true 
   “y”.matches(“\\w\\w+”) // false 
```
