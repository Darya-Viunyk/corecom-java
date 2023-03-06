import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Words {

    public static void main(String[] args) {

        //***************************************
        // Print out the words "Hello, World"
        //***************************************
        String sHello = "";
        System.out.println(sHello);


        //***************************************
        // Use an array this time
        //***************************************
        char[] aHello = {'H',' ',' '};
        System.out.println(aHello);


        //***************************************
        // Print out the words "Hello, World!" in uppercase, fixing / adding to the commented out line
        // Add the sout statement
        // Hint: maybe there's a method on string objects you could use?
        //***************************************
        String lowercaseHello = "Hello, World";
        //String uppercaseHello = lowercaseHello;


        //***************************************
        // Print out just the words "Hello, World!" from the string, fixing / adding to the commented out line
        // Add the sout statement
        // Hint: the text you want is a sub string of the whole text
        //***************************************
        String longHelloWorld = "Well... Hello, World, fancy meeting you here";
        //String correctHelloWorld = longHelloWorld.substring(8,20);


    }


}
