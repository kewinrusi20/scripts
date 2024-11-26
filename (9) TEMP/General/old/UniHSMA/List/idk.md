 - ![[Pasted image 20220619160427.png]]
- LinearList (?)
 - 
 ```java
 package experiments;  
  
import java.util.List;  
  
public class ListElement {  
    int content;  
    ListElement next = new ListElement();  
}  
  
class LinealList {  
    ListElement first;  
  
    public void addFirst(int value){  
        ListElement n = new ListElement();  
        n.content = value;  
        n.next = first;  
        first = n;  
    }  
  
    public void removeFirst(){  
        if (first != null)  
            first = first.next;  
    }  
}
```

- ![[Pasted image 20220619170322.png]]
- 