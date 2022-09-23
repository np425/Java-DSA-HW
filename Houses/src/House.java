public class House {
    private final int houseNo;
    private final int peopleCount;

    public House(int houseNo, int peopleCount) {
        this.houseNo = houseNo;
        this.peopleCount = peopleCount;
    }

    public boolean isRight() {
        return houseNo % 2 == 0;
    }

    public int getPeopleCount() {
        return peopleCount;
    }
}
