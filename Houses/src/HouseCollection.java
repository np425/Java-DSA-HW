import java.util.Scanner;

public class HouseCollection {
    private final HouseInformation houseInformation;

    public HouseCollection(Scanner scanner) throws Exception {
        int housesCount = scanner.nextInt();
        if (housesCount <= 0) {
            throw new Exception("Houses count must be positive");
        }

        House[] houses = readHouses(housesCount, scanner);
        this.houseInformation = readHouseInformation(houses);
    }

    private House[] readHouses(int housesCount, Scanner scanner) {
        House[] houses = new House[housesCount];
        for (int i = 0; i < housesCount; ++i) {
            int houseNo = scanner.nextInt();
            int peopleCount = scanner.nextInt();

            houses[i] = new House(houseNo, peopleCount);
        }
        return houses;
    }

    private HouseInformation readHouseInformation(House[] houses) {
        int leftHouses = 0, rightHouses = 0;
        int leftPeople = 0, rightPeople = 0;

        for (House house : houses) {
            if (house.isRight()) {
                rightHouses++;
                rightPeople += house.getPeopleCount();
            } else {
                leftHouses++;
                leftPeople += house.getPeopleCount();
            }
        }

        return new HouseInformation(leftHouses, rightHouses, leftPeople, rightPeople);
    }

    public HouseInformation getHouseInformation() {
        return this.houseInformation;
    }
}
