package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class readFile {
    private final Scanner scanner;

    // constructor
    public readFile(String pathname) throws FileNotFoundException {
        File file = new File(pathname);
        scanner = new Scanner(file);
    }

    //a method that will read the contents of the input file
    public HashMap<String, Integer> read(HashMap<String, Integer> list) {
        //use try-catch method to catch all the exceptions
        try {
            //while loop that will run until there are no lines
            while (scanner.hasNext()) {
                //will read the whole line inside the input file
                String input = scanner.nextLine();
                //split the lines from the input string and store it into an array
                String[] inputArray = input.split(" ");

                //loop through the inputArray
                for (String word : inputArray) {
                    //if the word is already in the hashmap
                    if (list.containsKey(word)) {
                        //update value by 1
                        int value = list.get(word);
                        value++;
                        //update the map
                        list.put(word, value);
                    }

                    //if the word is not yet in the hashmap, put it in the map
                    else
                        list.put(word, 1);
                }
            }
        }catch (Exception e){
            //will print out an exception if it catches it
            System.out.println(e);
        }
        //close the scanner
        scanner.close();
        return list;
    }

}




