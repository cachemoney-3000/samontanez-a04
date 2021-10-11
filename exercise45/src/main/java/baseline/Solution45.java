/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
* Given an input file named `exercise45_input.txt`,
* read the file and look for all occurrences of the word utilize.
* Replace each occurrence with use. Write the modified file to a new file.
 */

public class Solution45 {
    public static void main(String[] args) throws IOException {
        //scanner to scan the user input
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        //prompt user for the name of the output file also the file type
        System.out.print("Enter the output file: ");
        String output = scanner.nextLine();

        //make an object that will read the file
        readFile read = new readFile("data/exercise45_input.txt");
        //will store the lines inside the text using the array list
        //responsible for scanning the file
        list = read.read(list);

        //make an object that will write a new file
        fileWriter writer = new fileWriter(output, list);
        System.out.println("\nFinal output: ");
        //will store the string after the words have been replaced
        String display = writer.writer("utilize", "use");
        //prints out a text were the word "utilized" was replaced by "use"
        System.out.println(display);

    }
}
