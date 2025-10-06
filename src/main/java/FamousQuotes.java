import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String input = "";
        int selection;
        // Creating a String array called Quotes with 3 values.
        String[] quotes = {"That wizard came from the Moon.", "I am a wall. And walls don't move. Because walls don't care.", "I don't have time to explain why I don't have time to explain."};

        System.out.print("Please input a number from 1 to 3 to select a quote: "); // Using myScanner to read user input and make a selection
        input = myScanner.nextLine();
        selection = Integer.parseInt(input);

        try {
            System.out.println("Here is your selected quote: \"" + quotes[selection - 1] + '"'); // Prints the selected quote
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The number you entered was out of the requested range.");
            e.printStackTrace();
        }
    }
}
