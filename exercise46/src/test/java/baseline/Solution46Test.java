package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {
    @Test
    void test() throws FileNotFoundException {
        Map<String, Integer> list = new HashMap<>();
        readFile read = new readFile("data/exercise46_input.txt");
        list = read.read(list);

        String expected = """
                badger : \t*******
                mushroom : \t**
                snake : \t*
                """;
        countInstance count = new countInstance(list);
        String[] tempWord = count.counter();
        String actual = Solution46.display(tempWord, list);

        assertEquals(expected, actual);
    }

}