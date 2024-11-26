## Create Print
```java
System.out.print();
System.out.printf();
System.out.println(); // it will add a newline after that print


\" // will just put "

\n // next line
\r // carriage return: will replace the entire line
\f // from feed: will just go down, without going left


\t // tabulator: tab
\b // backspace: will take the position before this one

```

## Extra
```java
System.out.println(<Binärcode>)
System.out.println(<number>)



(“%.3f”) = 3 Werte nach dem komma zeigen. 

(“%10.f”) = 10 (Werte bzw. Leerzeichen) vor dem komma zeigen. 

  

(“%%”) = show “%” (?) 
(“n.f”) = (idk) 

  

(“%.2f %% %n”, 2.23423) = (idk) // ⇒ 2.23%

```

![[print extra.png]]

## Exeptions
```java
System.out.print(true) // true 
System.out.print(42)   // 42 
System.out.print(2+2)  // 4 
```

```java
More variable types mixed:
System.out.print(true+42)   // error // wrong, because the first time is Boolean and the second Int
System.out.print(”E:”+2+2)  // E:+2+2 
System.out.print(2+2+”E:”)  // 4E:
```