/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

/*
* Prompt for the name of the site.
* Prompt for the author of the site.
* Ask if the user wants a folder for JavaScript files.
* Ask if the user wants a folder for CSS files.
* Generate an index.html file that contains the name of the site inside
* the <title> tag and the author in a <meta> tag.
 */

import java.util.Scanner;

public class Solution43 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final websiteGenerator newWebsite = new websiteGenerator();

    public static void main(String[] args) {
        Solution43 sol43 = new Solution43();

        //prompts user to enter a website name
        String siteName = sol43.readValueFromUser("Site name: ");
        //prompts user to enter the name of the author
        String author = sol43.readValueFromUser("Author: ");
        //prompts user if they want to make a javascript folder
        String jsFolder = sol43.readValueFromUser("Do you want a folder for JavaScript? ");
        //prompts user if they want to make a CSS folder
        String cssFolder = sol43.readValueFromUser("Do you want a folder for CSS? ");

        //make the values accessible for the website generator class
        newWebsite.siteName = siteName;
        newWebsite.author = author;
        newWebsite.path = "./data/website/";

        //displays the final result of the program
        sol43.display(jsFolder, cssFolder);
    }

    //reads the input from the user
    private String readValueFromUser(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    //display the results
    private void display(String js, String css){
        //will print out the path of the new website, including the path
        System.out.println("Created " + newWebsite.makeWebsite());
        //will print out the path of the index.html, including the path
        System.out.println("Created " + newWebsite.makeHTML());

        //if the user wants to create a js folder
        if(js.equals("y") || js.equals("Y"))
            //it will print out that the js folder is created, including the path
            System.out.println("Created " + newWebsite.makeJS());

        //if the user wants to create a css folder
        if(css.equals("y") || css.equals("Y"))
            //it will print out that the cs folder is created, including the path
            System.out.println("Created " + newWebsite.makeCSS());
    }

}
