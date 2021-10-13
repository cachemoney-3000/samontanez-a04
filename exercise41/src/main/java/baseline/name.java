package baseline;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class name {
    public void sortNames(Scanner input, ArrayList<String> names) {
        //if the input file is empty, it will notify the user
        if (input == null) {
            System.out.println("File is empty");
        }
        //if we have a valid input file:
        else {
            //loop through the lines inside the input file until it is empty
            while (input.hasNextLine()) {
                //add the names inside the file to the array
                names.add(input.nextLine());
            }
            //sort the names in the file
            names.sort(String.CASE_INSENSITIVE_ORDER);
        }
    }

    //method that will print and make a file with a sorted names
    public String outputNames(ArrayList<String> names) {
        StringBuilder sb = new StringBuilder();
        //try the following block of commands until it throws an exception
        try {
            //make an output file
            FileWriter output = new FileWriter("data/exercise41_output.txt");

            //will print the following header inside the output file
            sb.append("Total of ").append(names.size()).append(" names\n");
            output.write("Total of " + names.size() + " names\n");
            sb.append("--------------------\n");
            output.write("--------------------\n");

            //loop through the names inside the arraylist 'names'
            for (String c : names) {
                //prints the sorted names into the output file
                sb.append(c + "\n");
                output.write(c + "\n");
            }
            //close the output file
            output.close();

        } catch (Exception e) {
            //if the program throws an error, print the error to let user know
            System.out.println(e);
        }

        //converts the string builder to string
        return sb.toString();
    }
}
