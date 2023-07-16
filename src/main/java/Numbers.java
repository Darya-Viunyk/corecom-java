public class Numbers {

    public static void main(String[] args) {

        //***************************************
        // Simple maths, update the number variable
        //***************************************
        int number = 2;
        int result1 = number + 3;
        System.out.println("The following number should be 5: " + result1);


        //***************************************
        // Still simple? Update number2, don't change the type
        //***************************************
        int number1 = 5;
        int number2 = 5;
        int result2 = number1 / number2;
        System.out.println("The following number should be 2: " + result2);


        //***************************************
        // What if we wanted the remainder this time, update number4
        //***************************************
        int number3 = 7;
        int number4 = 2;
        int result3 = number3 % number4;
        System.out.println("The following number should be 1: " + result3);


        //***************************************
        // Update number5 to get the expected number. What is ++ doing?
        //***************************************
        int number5 = 9;
        int result4 = ++number5;
        System.out.println("The following number should be 10: " + result4);


        //***************************************
        // Dealing with floating points means dealing with a different type, Update number6 to get the result
        // The power is just in there to confuse you, but what is it doing?
        //***************************************
        float number6 = 10f;
        int number7 = 4;
        double result5 = Math.pow(number7, 2) * number6;
        System.out.println("The following number should be 40: " + result5);


        //***************************************
        // Feel free to take a look at these and move on if you aren't getting anywhere
        //***************************************

        //***************************************
        // It _should_ be 128, but why not? What other type that we haven't used in this file could you use?
        // Extra points if you can work out why we need to cast back to a byte when the type was originally a byte (the byte in brackets)
        //***************************************
        byte number8 = 100;
        byte number9 = 28;
        int sum = number8 + number9;
        byte result6 = (byte) sum;
        System.out.println("The following number should be 128: " + result6);


        //***************************************
        // Remember that stuff about binary? OK, this one is probably a bit unfair!
        //***************************************
        int number10 = 3;
        int result7 = number10 << 1;
        System.out.println("The following number should be 24: " + result7);

    }

}
