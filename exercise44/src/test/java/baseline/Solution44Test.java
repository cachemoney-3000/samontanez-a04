package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {
    @Test
    void testFound() throws Exception{
        ProductInventory pi = new ProductInventory("data/exercise44_input.json");
        String expectedResults = """
                Name: Thing
                Price: $15.00
                Quantity: 5
                """;

        String searchResults = pi.findProduct("Thing");

        assertEquals(expectedResults, searchResults);
    }

    @Test
    void testNotFound() throws Exception{
        ProductInventory pi = new ProductInventory("data/exercise44_input.json");
        String expectedResults = "not found";

        String searchResults = pi.findProduct("Pencil");

        assertEquals(expectedResults, searchResults);
    }
}