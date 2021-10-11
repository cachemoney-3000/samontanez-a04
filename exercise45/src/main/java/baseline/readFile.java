package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {
    private final Scanner scanner;

    //method that will be use for scanning the file
    public readFile(String pathname) throws FileNotFoundException {
        //file reader will take the pathname of the text file
        File fileReader = new File(pathname);
        //used for scanning the file
        scanner = new Scanner(fileReader);
    }

    public ArrayList<String> read(ArrayList<String> list){
        //will keep looping until it will give us an exception error
        try{
            //will keep scanning the text file until there are no more lines left
            while(scanner.hasNext()){
                //stores the scanned line into 'data'
                String data = scanner.nextLine();
                //add the String 'data' into the array list, which collects all the contents of the txt file
                list.add(data);
            }
        }catch (Exception e){
            //will print out an exception message
            System.out.println(e);
        }
        //close the scanner
        scanner.close();

        //returns the finished array list
        return list;
    }
}
