/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Construct a program that reads in the following data file
 * (you will need to create this data file yourself; name it `exercise42_input.txt`)
 */

public class Solution42 {
    //array list that will store the employee's data(firstname, lastname, salary)
    private final ArrayList<String> employee = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Solution42 sol42 = new Solution42();
        employee e = new employee();

        //will open the input file and scans them
        Scanner input = new Scanner(new File("data/exercise42_input.txt"));
        //will store the data to the array list 'employee' line by line
        e.sortEmployees(input, sol42.employee);

        //will print out the data as well as print it into an output file
        String display = e.output(sol42.employee);
        System.out.println(display);
    }
}
