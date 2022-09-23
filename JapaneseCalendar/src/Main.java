import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = InputReader.readYear(scanner);

        JapaneseCalendar calendar = new JapaneseCalendar(year);

        System.out.println("Cycle year: " + calendar.getCycleYear());
        System.out.println("Colour: " + calendar.getColour());
    }
}