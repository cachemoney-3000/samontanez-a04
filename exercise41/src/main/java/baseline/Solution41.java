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
        Solution41 sol41 = new Solution41();

        //scans the input file and takes the pathname where the file is located
        Scanner input = new Scanner(new File("data/exercise41_input.txt"));
        //method that will store the names to the arraylist
        //will also sort them in alphabetical order
        sol41.sortNames(input, sol41.names);
        //close the input file to not waste memory
        input.close();

        //will produce an output file, and written inside is a sorted names
        String s = sol41.outputNames(sol41.names);
        System.out.println(s);
    }

    public void sortNames(Scanner input, ArrayList<String> names) {
        //if the input file is empty, it will notify the user
        if (input == null) {
            System.out.println("File is empty");
        }
        //if we have a valid input file:
        else {
            //loop through the lines inside the input file until it is empty
            while (input.hasNextLine()) {
                //add the names inside the file to the array
                names.add(input.nextLine());
            }
            //sort the names in the file
            names.sort(String.CASE_INSENSITIVE_ORDER);
        }
    }

    //method that will print and make a file with a sorted names
    public String outputNames(ArrayList<String> names) {
        StringBuilder sb = new StringBuilder();
        //try the following block of commands until it throws an exception
        try {
            //make an output file
            FileWriter output = new FileWriter("data/exercise41_output.txt");

            //will print the following header inside the output file
            sb.append("Total of " + names.size() + " names\n");
            output.write("Total of " + names.size() + " names\n");
            sb.append("--------------------\n");
            output.write("--------------------\n");

            //loop through the names inside the arraylist 'names'
            for (String c : names) {
                //prints the sorted names into the output file
                sb.append(c + "\n");
                output.write(c + "\n");
            }
            //close the output file
            output.close();

        } catch (Exception e) {
            //if the program throws an error, print the error to let user know
            System.out.println(e);
        }

        //converts the string builder to string
        String out = sb.toString();
        return out;
    }
}