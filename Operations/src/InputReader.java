import java.util.Scanner;

public class InputReader {
    public static Point readPoint(Scanner scanner, String axisSuffix) {
        return new Point(
                readAxisValue(scanner, "x" + axisSuffix),
                readAxisValue(scanner, "y" + axisSuffix)
        );
    }

    private static int readAxisValue(Scanner scanner, String axisIdentifier) {
        System.out.print(axisIdentifier + "=");
        while (!scanner.hasNext() || !scanner.hasNextInt()) {
            System.out.print(axisIdentifier + "=");
            scanner.nextLine();
        }

        return scanner.nextInt();
    }
}
