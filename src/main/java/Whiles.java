public class Whiles {

    public static void main(String[] args) {

        //***************************************
        // Get this to count to 10
        // Is there a shorter way to increment it by 1? (there are a couple of ways actually)
        //***************************************
        int countFrom = 0;
        int countUpTo = 1;
        while (countFrom <= countUpTo){
            System.out.println(countFrom);
            countFrom = countFrom + 1;
        }

        //***************************************
        // Why is hello only printed 9 times? Can you fix it by just moving code around?
        // How can you make the while expression more concise?
        // Note the if statement without the curly brackets and body (that's not why it's counting up to 9)
        //***************************************
        boolean truthyness = true;
        int counter = 1;
        do {
            System.out.println("hello");
            counter++;
            if (counter==10) truthyness = false;
        } while (truthyness==true);

    }

}
