import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Words {

    public static void main(String[] args) {

        //***************************************
        // Print out the words "Hello, World"
        //***************************************
        String sHello = "Hello, World";
        System.out.println(sHello);


        //***************************************
        // Use an array this time
        //***************************************
        char[] aHello = {'H','e','l','l','o',',','W','o','r','l','d'};
        System.out.println(new String(aHello));


        //***************************************
        // Print out the words "Hello, World!" in uppercase, fixing / adding to the commented out line
        // Add the sout statement
        // Hint: If you put a full stop at the end of "lowercaseHello" it gives you a list of things you can do
        //***************************************
        String lowercaseHello = "Hello, World";
        String uppercaseHello = lowercaseHello.toLowerCase();
        System.out.println(uppercaseHello + "!");


        //***************************************
        // Print out just the words "Hello, World!" from the string, fixing / adding to the commented out line
        // Add the sout statement
        // Hint: the text you want is a sub string of the whole text
        //***************************************
        String longHelloWorld = "Well... Hello, World, fancy meeting you here";
        String desiredText = longHelloWorld.substring(8, 20);

        System.out.println(desiredText);


    }


}
