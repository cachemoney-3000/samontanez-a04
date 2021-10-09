package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void sortNames() throws Exception {
        employee sol42 = new employee();
        Scanner input = new Scanner(new File("data/exercise42_input.txt"));
        ArrayList<String> employee = new ArrayList<>();

        String expected = "Last             First            Salary           \n" +
                "----------------------------------------\n" +
                "Johnson          Jim              56500            \n" +
                "Jones            Aaron            46000            \n" +
                "Jones            Chris            34500            \n" +
                "Ling             Mai              55900            \n" +
                "Swift            Geoffrey         14200            \n" +
                "Xiong            Fong             65000            \n" +
                "Zarnecki         Sabrina          51500            \n";


        sol42.sortEmployees(input, employee);
        String actual = sol42.output(employee);

        assertEquals(expected,actual);
    }
}