package baseline;

import java.io.IOException;
import java.util.Map;

public class ProductInventory {
    private final Map<String, Product> products;

    //this method will be called from the main method
    public ProductInventory(String filename) throws IOException {
        //will open the file
        products = Parser.readFile(filename);
    }

    //method that will search for the product
    public String findProduct(String name){
        Product product = products.get(name);

        //if the product is not found
        if (product == null){
            //print that it was not found
            System.out.println("Sorry, that product was not found in our inventory");
            //return a string "not found", so the program will ask again
            return "not found";
        }
        //if the product is found, it will print out its name, price and quantity
        else{
            return String.format("Name: %s\nPrice: $%.2f\nQuantity: %d\n", product.getName(), product.getPrice(),
                    product.getQuantity());
        }
    }

}
