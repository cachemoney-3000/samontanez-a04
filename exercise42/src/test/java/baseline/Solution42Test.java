package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void sortNames() throws Exception {
        Employee sol42 = new Employee();
        Scanner input = new Scanner(new File("data/exercise42_input.txt"));
        ArrayList<String> employee = new ArrayList<>();

        String expected = """
                Last             First            Salary          \s
                ----------------------------------------
                Johnson          Jim              56500           \s
                Jones            Aaron            46000           \s
                Jones            Chris            34500           \s
                Ling             Mai              55900           \s
                Swift            Geoffrey         14200           \s
                Xiong            Fong             65000           \s
                Zarnecki         Sabrina          51500           \s
                """;


        sol42.sortEmployees(input, employee);
        String actual = sol42.output(employee);

        assertEquals(expected,actual);
    }
}