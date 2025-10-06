import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String input = "";
        int selection = 0;
        // Creating a String array called quotes with 3 values.
        String[] quotes = {"That wizard came from the Moon.", "I am a wall. And walls don't move. Because walls don't care.", "I don't have time to explain why I don't have time to explain."};

        do {

            System.out.print("Please input a number from 1 to 3 to select a quote, or input 4 for a random quote: "); // Using myScanner to read user input and make a selection
            input = myScanner.nextLine();
            selection = Integer.parseInt(input);

            try {
                if (selection > 0 && selection < 4) {
                    System.out.println("Here is your selected quote: \"" + quotes[selection - 1] + '"'); // Prints the selected quote
                } else if (selection == 4) {
                    System.out.println("Here is a random quote: \"" + quotes[(int) (Math.random() * 3)]);
                }
            } catch (
                    ArrayIndexOutOfBoundsException e) {            // Catches a number input out of range and prints this message
                System.out.println("The number you entered was out of the requested range.");
                e.printStackTrace();
            }
            System.out.print("Would you like to see another quote? 1 for yes, 2 for no: "); // Prompting to loop or not

            input = myScanner.nextLine();
            selection = Integer.parseInt(input);

        } while (selection == 1);

    }
}
