package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {
    @Test
    //replace utilize with use
    void test() throws IOException {
        List<String> list = new ArrayList<>();
        readFile read = new readFile("data/exercise45_input.txt");
        list = read.read(list);

        //expected output
        String expected = """
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".
                """;

        fileWriter writer = new fileWriter("exercise45_testing.txt", list);
        //actual output
        String actual = writer.writer("utilize", "use");

        assertEquals(expected,actual);
    }

    @Test
    //replace she with he
    void test2() throws IOException {
        List<String> list = new ArrayList<>();
        readFile read = new readFile("data/exercise45_input.txt");
        list = read.read(list);

        //expected output
        String expected = """
                One should never utilize the word "utilize" in writing. Use "use" instead.
                For example, "He uses an IDE to write her Java programs" instead of "He
                utilizes an IDE to write her Java programs".
                """;

        fileWriter writer = new fileWriter("exercise45_testing(1).txt", list);
        //actual output
        //change the word She to He
        String actual = writer.writer("She", "He");

        assertEquals(expected,actual);
    }

}