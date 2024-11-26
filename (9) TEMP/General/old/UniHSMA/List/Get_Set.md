Create 2 Funktion to :
- write a new name **(set)**
- ask the name **(get)**

```java
package Playersnames;  
public class Player {  
  
    private String nickName;  

    public void setNickName(String nickName){  
        this.nickName = nickName;  
    }  
  
    public String getNickName(){  
        return this.nickName;  
    }  
}
```
---
```java
package Playersnames;  
public class Main {  
    public static void main(String[] args){  
  
        Player player1 = new Player();;  
        Player secondOne = new Player();  
  
        player1.setNickName("Andrea");  
        secondOne.setNickName("Giovanni");  
  
        System.out.println(player1.getNickName());  
        System.out.println(secondOne.getNickName());  
    }  
}
```