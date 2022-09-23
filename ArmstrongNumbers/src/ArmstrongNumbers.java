import java.util.ArrayList;

public class ArmstrongNumbers {
    public static ArrayList<Integer> getArmstrongNumbersInRange(int rangeEnd) throws IndexOutOfBoundsException {
        if (rangeEnd < 100 || rangeEnd > 999) {
            throw new IndexOutOfBoundsException("Number must have exactly 3 digits");
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 100; i <= rangeEnd; ++i) {
            if (isArmstrongNumber(i)) {
                arr.add(i);
            }
        }
        return arr;
    }

    private static int calcArmstrongDigitSum(int number) {
        int sum = 0;
        do {
            sum += Math.pow(number % 10, 3);
            number /= 10;
        } while (number != 0);
        return sum;
    }

    private static boolean isArmstrongNumber(int number) {
        return calcArmstrongDigitSum(number) == number;
    }

}
