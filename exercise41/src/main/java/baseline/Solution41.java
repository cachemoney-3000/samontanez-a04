/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Samontanez
 */

package baseline;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Create a program that reads in the following list of names
 * from a file called `exercise41_input.txt`
 * and sorts the list alphabetically:
 */

public class Solution41 {
    //Array list to store the names from the input file
    private final ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        name name = new name();
        Solution41 sol41 = new Solution41();

        //scans the input file and takes the pathname where the file is located
        Scanner input = new Scanner(new File("data/exercise41_input.txt"));
        //method that will store the names to the arraylist
        //will also sort them in alphabetical order
        name.sortNames(input, sol41.names);
        //close the input file to not waste memory
        input.close();

        //will produce an output file, and written inside is a sorted names
        String s = name.outputNames(sol41.names);
        System.out.println(s);
    }
}