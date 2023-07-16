import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArraysAndLists {

    public static void main(String[] args) {

        //***************************************
        // Fix the code. What's going on with the number in the square brackets?
        //***************************************
        int[] myNewArray = {1, 2, 3, 4};
        int theThirdNumber = myNewArray[2];
        System.out.println("The expected number is 3: " + theThirdNumber);


        //***************************************
        // Complete the array to 10, and work out how to output it
        //***************************************
        int[] arrayOfTen = new int[10];
        for (int i=0; i< 10; i++) {
            arrayOfTen[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayOfTen));


        //***************************************
        // Print out "Hello, World" using the array
        //***************************************
        String[] words = {"World", "Hello", ", "};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =1; i>=0; i--) {
            stringBuilder.append(words[i]);
        }
        System.out.println(stringBuilder.toString());

        //***************************************
        // print out the second item in the List
        // Hint: can you find a method to _get_ something from this list?
        //***************************************
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        int secondItem = numbers.get(1);
        System.out.println(secondItem);


        //***************************************
        // Add in a statement to get rid of the last number before printing it out
        //***************************************
        List<Integer> mySimpleList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        mySimpleList.remove(mySimpleList.size() -1);

        System.out.println(mySimpleList);

    }

}
