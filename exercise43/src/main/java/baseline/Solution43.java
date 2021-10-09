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

public class Solution43 {

    public static void main(String[] args) {
        String website;
        String name;
        char answer;

        //ask for the website name
        //ask for the author
        //ask if they want a folder for javascript
        //ask if they want a folder for css

        //create an object for the website generator
        websiteGenerator web = new websiteGenerator();
        //prints out output
        output();
    }
}
