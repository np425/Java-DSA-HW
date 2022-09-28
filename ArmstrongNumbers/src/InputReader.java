import java.util.Scanner;

public class InputReader {
    public static int readNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number;

        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Enter a number: ");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= Settings.RANGE_START);

        return number;
    }
}