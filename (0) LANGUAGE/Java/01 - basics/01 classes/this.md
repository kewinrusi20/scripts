# this
## 
<span style="color:red">Note:</span>
You can not use `this.` if the variable is static.

## Example 1
```java
public class Recipes {  
    public double price  = 0.0d;  
    public String[] products = new String[]{};  
  
    public String productsToString(){  
        String output = "";  
  
        for (String product : products){  
            output += product + ", ";  
        }  
  
        return output;  
    }  
  
    public void addProduct(String newProduct){  
        String[] newProductList = new String[products.length + 1];  
  
        // copy first list, to the second one  
        for (int index = 0; index < products.length; index++)  
            newProductList[index] = products[index];  
  
        // add new value  
        newProductList[newProductList.length - 1] = newProduct;  
  
        // replace products with the new products list  
        products = newProductList;  
    }  
  
    public void addProduct2(String newProduct){  
        String[] products = new String[this.products.length + 1];  
  
        // copy first list, to the second one  
        for (int index = 0; index < this.products.length; index++)  
            products[index] = this.products[index];  
  
        // add new value  
        products[products.length - 1] = newProduct;  
  
        // replace products with the new products list  
        this.products = products;  
    }  
}
´´´
