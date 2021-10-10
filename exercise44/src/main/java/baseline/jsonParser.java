package baseline;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class jsonParser {
    public static HashMap<String, Product> readFile(String filename) throws IOException {
        Object parser = JsonParser.parseReader(new FileReader(filename));
        JsonObject jsonObject = (JsonObject) parser;


        JsonArray jsonArray = (JsonArray) jsonObject.get("products");
        Iterator<JsonElement> iterator = jsonArray.iterator();
        HashMap<String, Product> productList = new HashMap<>();

        while(iterator.hasNext()){
            JsonObject productObject = (JsonObject) iterator.next();
            String name = productObject.get("name").getAsString();
            double price = productObject.get("price").getAsDouble();
            long quantity = productObject.get("quantity").getAsLong();
            Product product = new Product(name, price, quantity);
            productList.put(name, product);
        }
        return productList;
    }
}

