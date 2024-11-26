

<div style="
    background-color: #1d1f21;
    border: 0.001em solid #5A5A5A;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B5B4B4;">

public class Finally {<br>
&nbsp&nbsp&nbsp&nbsp public static boolean f() {<br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp try {<br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp return true;<br>
&nbsp&nbsp&nbsp&nbsp } finally {<br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <span style="color: #AA0000">return false;<br></span>
&nbsp&nbsp&nbsp&nbsp }<br>
&emsp }<br>
<br>
public static void main(String[] args) {<br>
 System.out.println(f());<br>
 }<br>
}<br></div>

```shell
x -> false;
```

---
<div style="
    background-color: #1d1f21;
    border-radius: 6px; 
    padding: 6px 15px 10px 15px;
    font-family: 'Segoe UI';
    font-weight: 450;
    color: #B5B4B4">

public class Finally {
public stativ int x = 0;
public static int f() {
try {
return x++;
} finally {
x++; //++x //String
// return x++; //++x //String
}
}
  
public static void main(String[] args) {
System.out.println(f());
System.out.println(x)
}
}
</div>

```shell
x -> 
````

&emsp l


\u2003 This is an example.


Finally:
- No Exception
- No Return

---
# Alternative
> alternative: try-with-resources

![[Try-with-resources#Try-with-resources vs Finally]]]