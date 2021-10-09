package baseline;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class employee {

    public void sortEmployees(Scanner input, ArrayList<String> employee){
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

    public String output(ArrayList<String> employee){
        //string builder that will collect the output in one string
        StringBuilder sb = new StringBuilder();
        //formatter that will allow tab formatting
        Formatter format = new Formatter(sb);
        //standard format for this file
        String formatStr = "%-17s%-17s%-17s\n";

        //if the program don't give us an exception error, do the following:
        try{
            //create an output file
            FileWriter output = new FileWriter("data/exercise42_output.txt");

            //prints out the header with proper format
            format.format(String.format(formatStr,"Last", "First", "Salary"));
            output.write(String.format(formatStr,"Last", "First", "Salary"));
            sb.append("----------------------------------------\n");
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
            output.close();

        } catch (Exception e) {
            //prints out an error message if it catches an exception
            System.out.println(e);
        }

        //returns a string to the main method
        return sb.toString();
    }
}
