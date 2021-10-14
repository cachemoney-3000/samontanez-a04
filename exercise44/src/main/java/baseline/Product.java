package baseline;

public record Product(String name, double price, long quantity) {
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
