/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.util.ArrayList;

/*
* Create a program that reads in the following list of names
* from a file called `exercise41_input.txt`
* and sorts the list alphabetically:
 */
public class Solution41 {
    public final String firstName;
    public final String lastName;
    public final int numNames = 0;
    //constructor that will help store the data correctly
    public Solution41(String firstName, String lastName, int counter){
        this.firstName = firstName;
        this.lastName = lastName;
        numNames = counter++; //counts the number of names
    }
    public static void main(String[] args) {
        //method that will read the file input
        readInput();
        //prints "Total of <numNames> names"
        //method that will sort the data to the correct string
        sortData();
        //method that will sort by last name
        sortLastNames();
        //method that will print the output
        output();


    }
    //will read the input file
    private static void readInput(){

    }

    //method that will be responsible on distributing the data
    public static ArrayList<Solution41> sortData(){

    }

    //getters and setters
    public String getFirstName(){
        return firstName;
    }

    public int getNumNames() {
        return numNames;
    }

    public String getLastName(){
        return lastName;
    }

    //method that will sort the data by their lastname
    public static void sortLastNames(String lastName){

    }

    //prints out the output
    public static void output(){

    }

}
