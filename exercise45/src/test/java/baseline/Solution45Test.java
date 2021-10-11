package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {
    @Test
    //replace utilize with use
    void test() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        readFile read = new readFile("data/exercise45_input.txt");
        list = read.read(list);

        //expected output
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                    "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                    "uses an IDE to write her Java programs\".\n";

        fileWriter writer = new fileWriter("exercise45_testing.txt", list);
        //actual output
        String actual = writer.writer("utilize", "use");

        assertEquals(expected,actual);
    }

    @Test
    //replace she with he
    void test2() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        readFile read = new readFile("data/exercise45_input.txt");
        list = read.read(list);

        //expected output
        String expected = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"He uses an IDE to write her Java programs\" instead of \"He\n" +
                "utilizes an IDE to write her Java programs\".\n";

        fileWriter writer = new fileWriter("exercise45_testing(1).txt", list);
        //actual output
        String actual = writer.writer("She", "He");

        assertEquals(expected,actual);
    }

}