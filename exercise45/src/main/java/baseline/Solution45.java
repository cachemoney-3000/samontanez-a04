package baseline;

import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) {
        //scanner to scan the user input
        Scanner scanner = new Scanner(System.in);
        //prompt user for the name of the output file

        //make an object that will read the file
        readFile read = new readFile();

        //make an object that will replace the words
        replaceWords replace = new replaceWords();

        //make an object that will write a new file
        fileWriter writer = new fileWriter();
    }

    //method that will show the result
    public void display(){

    }
}
