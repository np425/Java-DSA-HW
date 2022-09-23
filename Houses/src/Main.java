import java.io.File;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "input.txt";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File(FILE_NAME));

        HouseCollection houses = new HouseCollection(scanner);
        HouseInformation info = houses.getHouseInformation();

        System.out.println("Total people: " + info.getTotalPeople());
        System.out.println("People on the left: " + info.getLeftPeople());
        System.out.println("People on the right: " + info.getRightPeople());
        System.out.println("Average people on the left: " + info.getAvgLeftPeople());
        System.out.println("Average people on the right: " + info.getAvgRightPeople());
    }
}