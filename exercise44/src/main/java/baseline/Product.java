package baseline;

public class Product {
    private final String name;
    private final double price;
    private final long quantity;

    //constructor that will store the data from jsonParser
    public Product(String name, double price, long quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //get the name of the product for displaying output purposes
    public String getName() {
        return name;
    }

    //get the price of the product for displaying output purposes
    public double getPrice() {
        return price;
    }

    //get the quantity of the product for displaying output purposes
    public long getQuantity() {
        return quantity;
    }
}
