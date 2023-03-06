import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndLists {

    public static void main(String[] args) {

        //***************************************
        // Fix the code. What's going on with the number in the square brackets?
        //***************************************
        int[] myNewArray = {1, 2, 3, 4};
        int theThirdNumber = myNewArray[3];
        System.out.println("The expected number is 3: " + theThirdNumber);


        //***************************************
        // Complete the array to 10, and work out how to output it
        //***************************************
        int[] arrayOfTen = new int[10];
        arrayOfTen[0] = 1;
        arrayOfTen[1] = 2;
        System.out.println(arrayOfTen);


        //***************************************
        // Print out "Hello, World" using the array
        //***************************************
        String[] words = {"World", "Hello", ", "};


        //***************************************
        // print out the second item in the List
        // Hint: can you find a method to _get_ something from this list?
        //***************************************
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);


        //***************************************
        // Add in a statement to get rid of the last number before printing it out
        //***************************************
        List<Integer> mySimpleList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(mySimpleList);

    }

}
