```java
class TrainerTest {  
    Infomon infomon1Fire = new Infomon ("Mathemon", "Fire", 300, 300);  
    Trainer trainer1 = new Trainer("aaAwAz");  
  
    @Test  
    void attemptToCatch() {  
        // attempt to catch fire  
        assertTrue((new Trainer("aaAwAz")).attemptToCatch(new Infomon ("Mathemon", "Fire", 300, 300)));  
    }  
}
```