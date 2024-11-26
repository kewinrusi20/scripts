# Method Chaining (*Methodenkette*)
Useful if you need to change the object (or create a new one, e.g.: Strings)

## Example 1
```java
public class Player {  
    public Player addPower(String powerType) {  
        ...
        return this;    
    }  
}
```

**Main** Class
```java
Player p1 = new Player();
p1.addPower("speed").addPower("damage").addPower("defence");
```


---
## Example 2
```java
public class Pizza {
    private String dough;
    private String sauce;
    private String cheese;
    private String topping1;
    private String topping2;
    private String topping3;
    private boolean extraCheese;
    private boolean glutenFree;
	
    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.topping1 = builder.topping1;
        this.topping2 = builder.topping2;
        this.topping3 = builder.topping3;
        this.extraCheese = builder.extraCheese;
        this.glutenFree = builder.glutenFree;
    }
	
    @Override
    public String toString() {
        return "Pizza {" +
                "Teig='" + dough + '\'' +
                ", Sauce='" + sauce + '\'' +
                ", Käse='" + cheese + '\'' +
                ", Topping1='" + topping1 + '\'' +
                ", Topping2='" + topping2 + '\'' +
                ", Topping3='" + topping3 + '\'' +
                ", Extra Käse=" + extraCheese +
                ", Glutenfrei=" + glutenFree +
                '}';
    }
	
    // Getter-Methoden können hier hinzugefügt werden
	
    // Der Builder als innerste Klasse
    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private String cheese;
        private String topping1;
        private String topping2;
        private String topping3;
        private boolean extraCheese;
        private boolean glutenFree;
		
        public PizzaBuilder setDough(String dough) {
            this.dough = dough;
            return this;
        }
		
        public PizzaBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
		
        public PizzaBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }
		
        public PizzaBuilder addTopping1(String topping) {
            this.topping1 = topping;
            return this;
        }
		
        public PizzaBuilder addTopping2(String topping) {
            this.topping2 = topping;
            return this;
        }
		
        public PizzaBuilder addTopping3(String topping) {
            this.topping3 = topping;
            return this;
        }
		
        public PizzaBuilder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }
		
        public PizzaBuilder setGlutenFree(boolean glutenFree) {
            this.glutenFree = glutenFree;
            return this;
        }
		
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
```

**Main** Class
```java
Pizza myPizza = new Pizza.PizzaBuilder()
	.setDough("Vollkornteig")
	.setSauce("Tomatensauce")
	.setCheese("Mozzarella")
	.addTopping1("Pepperoni")
	.addTopping2("Oliven")
	.addTopping3("Paprika")
	.setExtraCheese(true)
	.setGlutenFree(false)
	.build();
	
System.out.println(myPizza);
```

**Result**
```shell
Pizza {Teig='Vollkornteig', Sauce='Tomatensauce', Käse='Mozzarella', Topping1='Pepperoni', Topping2='Oliven', Topping3='Paprika', Extra Käse=true, Glutenfrei=false}
```


---
## Example 3


```java
public class QueryBuilder {
    private StringBuilder query;

    public QueryBuilder() {
        query = new StringBuilder();
    }

    public QueryBuilder select(String columns) {
        query.append("SELECT ").append(columns).append(" ");
        return this;
    }

    public QueryBuilder from(String table) {
        query.append("FROM ").append(table).append(" ");
        return this;
    }

    public QueryBuilder where(String condition) {
        query.append("WHERE ").append(condition).append(" ");
        return this;
    }

    public QueryBuilder orderBy(String column, String order) {
        query.append("ORDER BY ").append(column).append(" ").append(order).append(" ");
        return this;
    }

    public QueryBuilder limit(int count) {
        query.append("LIMIT ").append(count).append(" ");
        return this;
    }

    public String build() {
        return query.toString().trim() + ";";
    }
}
```

**Main** Class
```java
public class QueryExample {
    public static void main(String[] args) {
        QueryBuilder qb = new QueryBuilder();
        String sqlQuery = qb.select("id, name, email")
                            .from("users")
                            .where("age > 18")
                            .orderBy("name", "ASC")
                            .limit(10)
                            .build();

        System.out.println(sqlQuery);
    }
}
```

Result
```sql
SELECT id, name, email FROM users WHERE age > 18 ORDER BY name ASC LIMIT 10;
```





