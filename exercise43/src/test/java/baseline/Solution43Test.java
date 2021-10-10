package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    @Test
    void makeHTMLTest(){
        //Use the function and save the return value.
        websiteGenerator wg = new websiteGenerator();

        wg.path = "./data/website/";
        wg.siteName = "testwebsite.com";
        wg.author = "Joshua Samontanez";

        String expected = "./data/website/testwebsite.com/index.html";
        String actual = wg.makeHTML();

        assertEquals(expected, actual);
    }

    @Test
    void makeCSSFolderTest(){
        //checks if it will generate a css folder assuming the user put "y" on the prompt
        websiteGenerator wg = new websiteGenerator();
        wg.path = "./data/website/";
        wg.siteName = "testwebsite.com";
        wg.author = "Joshua Samontanez";

        String expected = "./data/website/testwebsite.com/css";
        String actual = wg.makeCSS();

        assertEquals(expected, actual);
    }

    @Test
    void makeJsFolderTest(){
        //checks if it will generate a css folder assuming the user put "y" on the prompt
        websiteGenerator wg = new websiteGenerator();
        wg.path = "./data/website/";
        wg.siteName = "testwebsite.com";
        wg.author = "Joshua Samontanez";

        String expected = "./data/website/testwebsite.com/js";
        String actual = wg.makeJS();

        assertEquals(expected, actual);
    }

}