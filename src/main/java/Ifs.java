public class Ifs {

    public static void main(String[] args) {

        //***************************************
        // If statements only deal with truthiness
        //***************************************
        boolean trueorfalse = true;
        if (trueorfalse == true) {
            //do nothing
        } else {
            System.out.println("It's working!");
        }


        //***************************************
        // Get it to output "Thomas is the best"
        // What is && doing?
        //***************************************
        String name = "thomas";
        int age = 21;
        if (!name.equals("thomas") && age == 40) {
            System.out.println("Thomas is the best");
        }


        //***************************************
        // Get it to output "Thomas is the best"
        // Did you notice the new operator
        //***************************************
        String myName = "Thomas";
        int myAge = 21;
        if (!myName.equals("Thomas")) {
            if (myAge != 21) {
                System.out.println("Thomas is the best");
            }
        }

        //***************************************
        // Can you fix this so the grades are correct / make more sense, without changing the numbers
        //***************************************
        int score = 65; //should be a grade c
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score < 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score <= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

    }

}
