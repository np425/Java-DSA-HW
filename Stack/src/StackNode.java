public class StackNode<T> {
    private final T value;
    private StackNode<T> prev;

    public StackNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setPrev(StackNode<T> node) {
        this.prev = node;
    }

    public StackNode<T> getPrev() {
        return this.prev;
    }

    public StackNode<T> nth(int n) {
        StackNode<T> node = this;
        int i = 0;

        while (i < n && node != null) {
            node = node.prev;
            ++i;
        }

        return node;
    }

    public StackNode<T> findNode(T value) {
        StackNode<T> node = this;

        while (node != null && node.value != value) {
            node = node.prev;
        }

        return node;
    }
}
