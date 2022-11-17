public class NodeSingleValue<T extends Comparable<T>> {
    public NodeSingleValue<T> lower;
    public NodeSingleValue<T> higher;
    public T value;

    public NodeSingleValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
