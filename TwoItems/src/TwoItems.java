public class TwoItems<A, B> {
    private A first;

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    private B second;

    public TwoItems(A firstItem, B secondItem) {
        this.first = firstItem;
        this.second = secondItem;
    }

    @Override
    public String toString() {
        return this.first.toString() + " " + this.second.toString();
    }
}
