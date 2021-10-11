/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.io.FileNotFoundException;
import java.util.HashMap;

/*
* Create a program that reads in a file named `exercise46_input.txt`
* and counts the frequency of words in the file.
* Then construct a histogram displaying the words and the frequency,
* and display the histogram to the screen.
 */

public class Solution46 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> list = new HashMap<>();

        //class that will be responsible for reading the text file
        //it will also scan the lines and store it into an array list of strings
        //takes a parameter of the pathname of the input file
        readFile read = new readFile("data/exercise46_input.txt");
        list = read.read(list);

        //class that will be responsible for counting the occurrences of a word
        countInstance count = new countInstance(list);
        //stores the result from counting the numbers in a tempWord array
        String[] tempWord = count.counter();

        //for displaying the final output
        System.out.println("Final output: \n");
        //calls the display function by passing tempWord, and list
        String output = display(tempWord, list);
        //will print the histogram
        System.out.println(output);
    }

    //method for displaying the histogram
    public static String display(String[] tempWord, HashMap<String, Integer> list){
        StringBuilder sb = new StringBuilder();
        //iterate through the hashmap
        for(int i = 0; i < list.size(); i++) {
            //set the 'value' equals to the values from the tempWord
            int value = list.get(tempWord[i]);
            //add it the word into a String builder
            sb.append(tempWord[i]).append(" : \t");
            //add the stars into a string builder depending on the count of the word
            sb.append("*".repeat(Math.max(0, value)));
            //next line
            sb.append("\n");
        }
        //returns a string
        return sb.toString();
    }
}
