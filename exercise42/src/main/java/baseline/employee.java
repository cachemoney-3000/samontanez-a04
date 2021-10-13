package baseline;

import java.io.FileWriter;
import java.util.List;
import java.util.Formatter;
import java.util.Scanner;

public class employee {

    public void sortEmployees(Scanner input, List<String> employee){
        //if the input is null, print that the file is empty
        if(input == null){
            System.out.println("File is empty");
        }
        //else if the file have inputs
        else{
            //add all the data line by line to the 'employee' array list
            while(input.hasNextLine()){
                employee.add(input.nextLine());
            }
        }
        //sort the data by last name
        employee.sort(String.CASE_INSENSITIVE_ORDER);
    }

    public String output(List<String> employee){
        //string builder that will collect the output in one string
        StringBuilder display = new StringBuilder();

        //if the program don't give us an exception error, do the following:
        try (Formatter format = new Formatter(display);
             FileWriter output = new FileWriter("data/exercise42_output.txt")) {
            String formatStr = "%-17s%-17s%-17s\n";

            //prints out the header with proper format
            format.format(String.format(formatStr, "Last", "First", "Salary"));
            output.write(String.format(formatStr, "Last", "First", "Salary"));
            display.append("----------------------------------------\n");
            output.write("----------------------------------------\n");

            //prints out the employee's first name, last name and salary with proper formatting
            for (String c : employee) {
                //split the input if they have commas
                String[] temp = c.split(",");
                //will print out the employees data
                format.format(String.format(formatStr, temp[0], temp[1], temp[2]));
                output.write(String.format(formatStr, temp[0], temp[1], temp[2]));
            }
            //close the output file
        } catch (Exception e) {
            //prints out an error message if it catches an exception
            e.printStackTrace();
        }

        //returns a string to the main method
        return display.toString();
    }
}
