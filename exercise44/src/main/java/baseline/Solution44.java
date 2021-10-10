/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
 /*
 * Create a program that takes a product name as input and
 * retrieves the current price and quantity for that product.
 * The product data is in a data file in the JSON format
 * and looks like this (you will create this file as `exercise44_input.json`):
  */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution44 {
    public static void main(String[] args) throws Exception {
        String search;
        String notFound = "not found";
        String output = "not found";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //inventory object, responsible for matching the inventory listed on json file
        productInventory inventory = new productInventory("data/exercise44_input.json");

        //keep looping until a product was found
        while(notFound.equals(output)){
            //prompts the user for the product name
            System.out.print("What is the product name? ");
            //stores the product to 'search'
            search = bufferedReader.readLine();
            //calls the method findProduct inside the inventory object by passing 'search'
            output = inventory.findProduct(search);
        }

        //will display the final output
        System.out.println(output);

    }
}

