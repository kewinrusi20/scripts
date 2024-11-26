package Class_and_this;

public class Recipes {
    public static int productsCounter = 0;
    private double price  = 0.0d;
    private String[] products = new String[]{};



    public Recipes(){
        System.out.println("Scontrino creato");
        Recipes.productsCounter++;
    }

    public String productsToString(){
        String output = "";

        for (String product : products){
            output += product + ", ";
        }

        return output;
    }

    public void addProduct(String newProduct){
        String[] products = new String[this.products.length + 1];

        // copy first list, to the second one
        for (int index = 0; index < this.products.length; index++)
            products[index] = this.products[index];

        // add new value
        products[products.length - 1] = newProduct;

        // replace products with the new products list
        this.products = products;
    }


    public void addToCart(String newProduct, double newPrice){
        this.addProduct(newProduct);
        this.price += newPrice;
    }

    public double getPrice(){
        return this.price;
    }

}

