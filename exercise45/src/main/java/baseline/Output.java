package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Output {
    private final java.io.FileWriter writer;
    private final List<String> list;

    //constructor that will help to determine where to store the output file
    public Output(String name, List<String> list) throws IOException {
        //will create a new file
        //passing the parameters of the pathname where to store the new file
        writer = new java.io.FileWriter("data/" + name);
        //stores the contents collected from the readFile class
        this.list = list;
    }

    public String writer (String toReplace, String replacement) throws IOException {
        StringBuilder sb = new StringBuilder();
        //will continue looping until the list is null
        for (String temp : list) {
            //will replace the word "utilize" with "use"
            temp = temp.replace(toReplace, replacement);
            //string builder for displaying the output
            sb.append(temp).append("\n");
            //will put the contents inside the file
            writer.write(temp + "\n");
        }
        //close the file
        writer.close();
        //return a string where all the words have been replaced
        return sb.toString();
    }
}
