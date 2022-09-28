public class JapaneseCalendar {
    public static String yearToColor(int cycleYear) {
        int lastDigit = (cycleYear - 4) % 10;

        return switch (lastDigit) {
            case 0, 1 -> "Green";
            case 2, 3 -> "Red";
            case 4, 5 -> "Yellow";
            case 6, 7 -> "White";
            case 8, 9 -> "Black";
            default -> "Unknown";
        };
    }
}
