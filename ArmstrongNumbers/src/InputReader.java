import java.util.Scanner;

public class InputReader {
    public static int readNumber(Scanner scanner) {
        System.out.print("Enter 3 digit number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter 3 digit number: ");
            scanner.next();
        }

        return scanner.nextInt();
    }
}