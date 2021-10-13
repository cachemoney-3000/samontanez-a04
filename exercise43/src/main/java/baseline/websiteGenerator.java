package baseline;

import java.io.*;

public class websiteGenerator {
    //attributes
    String siteName;
    String author;
    String path;


    //will make a website directory
    public String makeWebsite() {
        //this will help to display the directory of the website
        String directory = path + siteName;
        File newFolder = new File(directory);
        //will make a new folder directory, useful for testing
        newFolder.mkdirs();
        return directory;
    }

    //will make a JS folder, if the user wanted to
    public String makeJS() {
        //this will help display the directory of the js folder
        String directory = path + siteName + "/js";
        File newFolder = new File(directory);
        //make a new folder for js, useful for testing
        newFolder.mkdirs();
        return directory;
    }

    //will make a CSS folder, only if the user wanted to
    public String makeCSS() {
        //this will help display directory of the css folder
        String directory = path + siteName + "/css";
        File newFolder = new File(directory);
        //make a new folder for css, useful for testing
        newFolder.mkdirs();
        return directory;
    }

    //will produce the index.html
    public String makeHTML() throws IOException {
        //will help display the directory of the index.html file
        String directory = path + siteName + "/index.html";
        //contents inside the html file

        //try the following block of code, catch all the error
        try (FileWriter output = new FileWriter(directory)) {
            String html =
                    "<!doctype html>\n" +
                            "\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "  <meta charset=\"utf-8\">\n" +
                            "  <title>" + siteName + "</title>\n" +
                            "  <meta name=\"" + author + "\">\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "   <p>This is an auto-generated website!</p>\n" +
                            "   <p><b>HELLO WORLD</b></p>\n" +
                            "</body>\n" +
                            "</html>";
            //will write the html template string into the html file
            output.write(html);
            //will return the directory of the index.html
            return directory;
        } catch (Exception ex) {
            return "Program failed, try again";
        }

    }
}
