public class Fish extends Animal {
    int finAmount;

    public int getFinAmount() {
        return finAmount;
    }

    public void setFinAmount(int finAmount) {
        this.finAmount = finAmount;
    }

    public Fish(String name) {
        super(name, "Fish");
    }

    @Override
    public String toString() {
        return String.format("Fish. Name: %s, Fin amount: %d", this.getName(), this.finAmount);
    }
}
