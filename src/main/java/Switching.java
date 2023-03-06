public class Switching {

    public static void main(String[] args) {

        //***************************************
        // Update the switch statement to take a string that represents the month and add in the other months
        // What happens if you supply something that isn't a valid month, is there a way to deal with it?
        //***************************************
        int month = 1;
        String forecast = "";
        switch (month) {
            case 1:
                forecast = "Snow";
                break;
            case 2:
                forecast = "Less snow";
                break;
        }
        System.out.println(forecast);
    }


}
