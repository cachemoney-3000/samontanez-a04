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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        productInventory inventory = new productInventory("data/exercise44_input.json");
        String notFound = "not found";
        String output = "not found";

        while(notFound.equals(output)){
            System.out.print("What is the product name? ");
            search = bufferedReader.readLine();
            output = inventory.findProduct(search);
        }

        System.out.println(output);

    }
}

