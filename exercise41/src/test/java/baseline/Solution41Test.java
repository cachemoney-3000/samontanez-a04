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

        String expected =
                """
                        Total of 7 names
                        --------------------
                        Johnson, Jim
                        Jones, Aaron
                        Jones, Chris
                        Ling, Mai
                        Swift, Geoffrey
                        Xiong, Fong
                        Zarnecki, Sabrina
                        """;

        sol41.sortNames(input, names);
        String actual = sol41.outputNames(names);

        assertEquals(expected, actual);
    }
}