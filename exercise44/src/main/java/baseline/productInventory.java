package baseline;

import java.util.HashMap;

public class productInventory {
    private HashMap<String, Product> products;

    public productInventory(String filename) throws Exception{
        products = jsonParser.readFile(filename);
    }

    public String findProduct(String name){
        Product product = products.get(name);
        if (product == null){
            System.out.println("Sorry that product was not found in our inventory");
            return "not found";
        }
        else{
            return String.format("Name: %s\nPrice: $%.2f\nQuantity On Hand: %d\n", product.getName(), product.getPrice(),
                    product.getQuantity());
        }
    }

}
