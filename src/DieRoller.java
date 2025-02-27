/*Create a program named DieRoller. Using java.util Random to generate
3 random values that represent 3 thrown die (1 – 6). Throw until you get
a triple (where each die has the same value). For each throw: Use printf
to neatly display in a table for each row
*/

import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {

        // Declare variables
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int firstDice = 0;
        int secondDice = 0;
        int thirdDice = 0;
        int sumOfDice = 0;

        int rollNumber = 0;

        boolean continueRolling = true;

        while (continueRolling) {
            rollNumber++;

            // Generate number 1-6 for each dice
            firstDice = generator.nextInt(6) + 1;
            secondDice = generator.nextInt(6) + 1;
            thirdDice = generator.nextInt(6) + 1;

            // calcualte sum of dice
            sumOfDice = firstDice + secondDice + thirdDice;

            // Print the result of the roll
            System.out.printf("Roll \tDice1 \tDice2 \tDice3 \tSum %n");
            System.out.printf("------------------------------------%n");
            System.out.printf("%d \t\t %d \t\t %d \t\t %d \t\t %d %n", rollNumber, firstDice, secondDice, thirdDice, sumOfDice);

            // Begin logic for if dice match
            if (firstDice == secondDice && secondDice == thirdDice) {
                System.out.println("\nThe three dice match!\n");
            }

            // Ask user to continue
            System.out.println("\nDo you want to play again? [1] for yes, [0] for no: ");

            // Validate input
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter [1] for yes or [0] for no.");
                in.next(); // Clear input
            }

            int userCont = in.nextInt();
            in.nextLine(); // Clear the buffer

            if (userCont == 1) {
                continueRolling = true;
            } else if (userCont == 0) {
                continueRolling = false;
            } else {
                System.out.println("Invalid input");
                continueRolling = false;
            }
        }

        System.out.println("\nThanks for playing!");
    }
}