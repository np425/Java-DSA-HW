import java.util.Scanner;

public class InputReader {
    public static int readYear(Scanner scanner) {
        System.out.print("Enter year: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter year: ");
            scanner.next();
        }

        return scanner.nextInt();
    }
}
