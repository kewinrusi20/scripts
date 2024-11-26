## Example with **Static**
```java
public class BankZentrale {  
    public static KontoZentrale konto;   
}
```

```java
public class KontoZentrale {  
    public static void statusWartbarkeit(String password) {  
        if (password.equals("0000")) {  
            System.out.println("ez");  
        }  
    }  
}
```

**Main** Class
```java
BankZentrale.konto.statusWartbarkeit("0000");
```

## Example with an **Object**
```java
public class BankZentrale {  
    public KontoZentrale konto;  
}
```

```java
public class KontoZentrale {  
    public void statusWartbarkeit(String password) {  
        if (password.equals("0000")) {  
            System.out.println("ez");  
        }  
    }  
}
```

**Main** Class
```java
BankZentrale bank = new BankZentrale();
bank.konto = new KontoZentrale();
bank.konto.statusWartbarkeit("0000");






```

