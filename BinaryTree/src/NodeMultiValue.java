public class NodeMultiValue<T extends Comparable<T>> {
    public NodeMultiValue<T> lower;
    public NodeMultiValue<T> higher;
    private T value;
    private int length;

    public NodeMultiValue(T value) {
        this.value = value;
        this.length = 1;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        if (this.value == value) {
            this.length = this.length + 1;
        } else {
            this.value = value;
            this.length = 1;
        }
    }

    public void removeValue() {
        if (this.length == 1) {
            this.value = null;
        }

        this.length = this.length - 1;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return this.value.toString() + " (" + this.length + ")";
    }
}
