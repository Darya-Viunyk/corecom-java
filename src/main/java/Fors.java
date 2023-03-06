import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fors {

    public static void main(String[] args) {

        //***************************************
        // Get this to count to 10
        //***************************************
        int count = 1;
        for (int i = 0;i < count;i++){
            System.out.println(i);
        }

        //***************************************
        // Get this to count to 10
        // Can you make sense of how each for loop works?
        //***************************************
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        for (int number : numbers){
            System.out.println(number);
        }


        //***************************************
        // Can you work out how many items will be in the list?
        // Add some code to check your answer!
        //***************************************
        ArrayList<Integer> myNewList = new ArrayList<>();
        for (int i = 0; i < 12 ; i++){
            for (int j = 0; j < 12 ; j++){
                myNewList.add(i+j);
            }
        }


    }

}
