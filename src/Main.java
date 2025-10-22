import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List of numbers to pick from
        int[] numbers = {5, 4, 8, 9, 6, 3, 7, 4, 2, 85, 63, 45, 10};

        // Show all possible numbers
        System.out.print("Possible numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String choice;
        do {
            int randomIndex = random.nextInt(numbers.length);
            int result = numbers[randomIndex];
            System.out.println("🎲 Your generated random number is: " + result);

            System.out.print("Do you want to generate another number? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("Thank you for using the Random Number Generator!");
        scanner.close();
    }
}
