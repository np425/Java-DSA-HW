public class HouseInformation {
    private final int leftPeople;
    private final int leftHouses;
    private final int rightHouses;
    private final int rightPeople;

    public HouseInformation(int leftHouses, int rightHouses, int leftPeople, int rightPeople) {
        this.leftHouses = leftHouses;
        this.rightHouses = rightHouses;
        this.leftPeople = leftPeople;
        this.rightPeople = rightPeople;
    }

    public int getTotalPeople() {
        return this.leftPeople + this.rightPeople;
    }

    public int getLeftPeople() {
        return this.leftPeople;
    }

    public int getRightPeople() {
        return this.rightPeople;
    }

    public double getAvgLeftPeople() {
        return (double) this.leftPeople / this.leftHouses;
    }

    public double getAvgRightPeople() {
        return (double) this.rightPeople / this.rightHouses;
    }
}
