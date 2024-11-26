package Class_and_this;

public class Main {
    public static void main(String[] args){

        Recipes r1 = new Recipes();
        Recipes r2 = new Recipes();


        r1.addToCart("Miele", 2.99d);
        r1.addToCart("Banane", 1.47d);

        System.out.println(r1.productsToString());
        System.out.println(r1.getPrice());

        System.out.println(Recipes.productsCounter);


    }
}
