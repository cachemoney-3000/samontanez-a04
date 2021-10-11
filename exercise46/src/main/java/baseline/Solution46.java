/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

/*
* Create a program that reads in a file named `exercise46_input.txt`
* and counts the frequency of words in the file.
* Then construct a histogram displaying the words and the frequency,
* and display the histogram to the screen.
 */
public class Solution46 {
    public static void main(String[] args) {
        //class that will be responsible for reading the text file
        //it will also scan the lines and store it into an array list of strings
        //takes a parameter of the pathname of the input file
        readFile read = new readFile();

        //class that will be responsible for counting the occurrences of a word
        countInstance counter = new countInstance();

        //display the histogram
        display();
    }

    public static void display(){
        //will display the histogram
    }
}
