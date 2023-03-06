import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DoItYourself {

    public static void main(String[] args) {

        //***************************************
        // Write some code to check through the list and if it's a number between 3 and 7, output it to sysout
        //***************************************
        List<Integer> numbers = Arrays.asList(4,8,12,9,2,6,8,1,5,4,7);


        //***************************************
        // Write some code to compare these two arrays and output true or false depending on if they are the same
        //***************************************
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};


        //***************************************
        // What is this code doing?
        // Can you find the bug in this code?
        // Assign different values to the number variable to test it
        //***************************************
        int number = 7;
        boolean result = true;
        for(int i=1;i<number;i++) {
            if(number%i==0)
                result = false;
        }
        System.out.println(result);

    }

}
