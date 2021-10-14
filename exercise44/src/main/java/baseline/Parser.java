package baseline;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

//responsible for reading the json file
public class Parser {
    //this class will return a Map value that it will store to the Product method
    public static Map<String, Product> readFile(String filename) throws IOException {
        //opening the parser object and parsing the file
        Object parser = com.google.gson.JsonParser.parseReader(new FileReader(filename));
        JsonObject jsonObject = (JsonObject) parser;

        //create an array to store the products inside the file
        JsonArray jsonArray = (JsonArray) jsonObject.get("products");
        //iterates through next element in the file
        Iterator<JsonElement> iterator = jsonArray.iterator();
        //stores the products and its corresponding info
        Map<String, Product> productList = new HashMap<>();

        //keep iterating until there is no line
        while(iterator.hasNext()){
            JsonObject productObject = (JsonObject) iterator.next();
            //get the product name in the file and store it to 'name'
            String name = productObject.get("name").getAsString();
            //get the price listed in the file and store it to 'price'
            double price = productObject.get("price").getAsDouble();
            //get the quantity of the product and store it to 'quantity'
            long quantity = productObject.get("quantity").getAsLong();

            //sort out the data and store it to a new method inside the Product class
            //to make it easier when retrieving the data
            Product product = new Product(name, price, quantity);
            //store the info into a hashmap
            productList.put(name, product);
        }
        return productList;
    }
}

