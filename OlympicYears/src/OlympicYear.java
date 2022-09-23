import java.util.Scanner;

public class OlympicYear {
    private static final int FIRST_OLYMPIC_YEAR = 1896;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = InputReader.readYear(scanner);

        if (year >= FIRST_OLYMPIC_YEAR && year % 4 == 0) {
            int olympicCount = (year - FIRST_OLYMPIC_YEAR) / 4 + 1;

            System.out.println(year + " is olympic year, no. " + olympicCount);
        } else {
            System.out.println(year + " is not olympic year");
        }
    }
}