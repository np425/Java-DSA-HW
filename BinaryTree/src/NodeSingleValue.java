public class NodeSingleValue<T extends Comparable<T>> implements Node<T> {
    private Node<T> lower;
    private Node<T> higher;
    protected T value;

    public NodeSingleValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void removeValue() {
        this.value = null;
    }

    @Override
    public boolean hasValue() {
        return value != null;
    }

    @Override
    public Node<T> getLower() {
        return this.lower;
    }

    @Override
    public Node<T> getHigher() {
        return this.higher;
    }

    @Override
    public void setLower(Node<T> node) {
        this.lower = node;
    }

    @Override
    public void setHigher(Node<T> node) {
        this.higher = node;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
