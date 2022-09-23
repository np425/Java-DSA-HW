public class JapaneseCalendar {
    private static final int REF_CYCLE_START = 1984;
    private static final int CYCLE_LENGTH = 60;

    private final String colour;
    private final int cycleYear;

    public JapaneseCalendar(int year) {
        this.cycleYear = calculateCycleYear(year);
        this.colour = calculateCycleColor(cycleYear);
    }

    private static int calculateCycleYear(int year) {
        if (year >= REF_CYCLE_START) {
            return (year - REF_CYCLE_START) % CYCLE_LENGTH + 1;
        }

        return (CYCLE_LENGTH - ((REF_CYCLE_START - year) - 1) % CYCLE_LENGTH);
    }

    private String calculateCycleColor(int cycleYear) {
        int lastDigit = cycleYear % 10;

        return switch (lastDigit) {
            case 1, 2 -> "Green";
            case 3, 4 -> "Red";
            case 5, 6 -> "Yellow";
            case 7, 8 -> "White";
            case 9, 0 -> "Black";
            default -> "Unknown";
        };
    }

    public String getColour() {
        return this.colour;
    }

    public int getCycleYear() {
        return this.cycleYear;
    }
}
