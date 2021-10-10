package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {
    @Test
    public void testFound() throws Exception{
        productInventory pi = new productInventory("data/exercise44_input.json");
        String expectedResults = "Name: Thing\n" +
                "Price: $15.00\n" +
                "Quantity On Hand: 5\n";

        String searchResults = pi.findProduct("Thing");

        assertEquals(expectedResults, searchResults);
    }

    @Test
    public void testNotFound() throws Exception{
        productInventory pi = new productInventory("data/exercise44_input.json");
        String expectedResults = "not found";

        String searchResults = pi.findProduct("Pencil");

        assertEquals(expectedResults, searchResults);
    }
}