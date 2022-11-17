public class NodeMultiValue<T extends Comparable<T>> extends NodeSingleValue<T> {
    int length = 0;

    public NodeMultiValue(T data) {
        super(data);
    }

    public void addValue(T value) {
        this.length = this.length + 1;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.length + ")";
    }

    public boolean removeValue() {
        if (this.length == 0) {
            return false;
        }

        this.length = this.length - 1;
        return true;
    }
}
