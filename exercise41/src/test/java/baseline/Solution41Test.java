package baseline;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    //check if the expected output will match
    void sortNames() throws Exception{
        Solution41 sol41 = new Solution41();
        Scanner input = new Scanner(new File("data/exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<>();

        String expected = "Total of 7 names\n" +
                "--------------------\n" +
                "Johnson, Jim\n" +
                "Jones, Aaron\n" +
                "Jones, Chris\n" +
                "Ling, Mai\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong\n" +
                "Zarnecki, Sabrina\n";

        sol41.sortNames(input, names);
        String actual = sol41.outputNames(names);

        assertEquals(expected, actual);
    }
}