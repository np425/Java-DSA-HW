public class Hamster extends Animal {
    private int tailLength;
    private String color;

    public Hamster(String name) {
        super(name, "Hamster");
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Hamster. Name: %s, Tail length: %d cm, Color: %s", this.getName(), this.tailLength, this.color);
    }
}
