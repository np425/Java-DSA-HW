import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rangeEnd = InputReader.readNumber(scanner);

        ArrayList<Integer> armstrongNumbers;

        try {
            armstrongNumbers = ArmstrongNumbers.getArmstrongNumbersInRange(Settings.RANGE_START, rangeEnd);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            return;
        }

        if (armstrongNumbers.isEmpty()) {
            System.out.println("No armstrong numbers found in range");
            return;
        }

        for (int number : armstrongNumbers) {
            System.out.println(number);
        }
    }

}