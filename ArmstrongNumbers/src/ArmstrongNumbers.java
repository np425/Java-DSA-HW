import java.util.ArrayList;

public class ArmstrongNumbers {
    public static ArrayList<Integer> getArmstrongNumbersInRange(int rangeStart, int rangeEnd) {
        ArrayList<Integer> armstrongNumbers = new ArrayList<>();

        for (int i = rangeStart; i <= rangeEnd; ++i) {
            if (isArmstrongNumber(i)) {
                armstrongNumbers.add(i);
            }
        }

        return armstrongNumbers;
    }
    private static ArrayList<Integer> intToDigits(int number) {
        ArrayList<Integer> digits = new ArrayList<>();

        do {
            digits.add(number % 10);
            number /= 10;
        } while (number != 0);

        return digits;
    }

    private static int calcArmstrongDigitSum(ArrayList<Integer> digits) {
        int sum = 0;
        int power = digits.size();

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum;
    }

    private static boolean isArmstrongNumber(int number) {
        ArrayList<Integer> digits = intToDigits(number);
        return calcArmstrongDigitSum(digits) == number;
    }
}
