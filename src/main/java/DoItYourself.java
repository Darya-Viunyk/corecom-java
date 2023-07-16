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
         for(int number : numbers){
           if(number >= 3 && number <= 7) {
            System.out.println(number);
        }
        }
//        for (int i = 0;i < numbers.size();i++) {
//            if (numbers.get(i) > 3 && numbers.get(i) < 7){
//                System.out.println(numbers.get(i));
//            }
//            System.out.println(i);
//        }

        //***************************************
        // Write some code to compare these two arrays and output true or false depending on if they are the same
        //***************************************
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b));


        //***************************************
        // What is this code doing?
        // Can you find the bug in this code?
        // Assign different values to the number variable to test it
        //***************************************
        int number = 7;
        boolean result = true;
        for(int i=2;i<number;i++) {
            if(number%i==0)
                result = false;
        }
        System.out.println(result);

    }

}
