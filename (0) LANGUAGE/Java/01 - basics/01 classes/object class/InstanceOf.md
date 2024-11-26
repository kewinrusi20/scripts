
```java
class Bank {
    public Bank() {
        BankSystem bs = BankSystem.getInstance(); // #0
    }
}
```


```java
class BankSystem {
    private BankSystem() {} // #1
    private BankSystem bs = null; //#2
    public BankSystem getInstance() {
        if (bs == null) bs = new BankSystem(); // #2
        return bs;  // #3
    }
}
```` 
- #0 You can not open the Object, because the Constructor is set to Private.<br>
But, you can access to the static method, the will give you the Object
- #1 Close the Constructor of the BankSystem Class so you can not open the Object from other classes other the BankSystem Class itself.
- #2 Open the Object within the class, set it to empty<br>
then set an if Case that open the class, only if it isn't already open
- #3 Return the same Ojbect every time it will be asked