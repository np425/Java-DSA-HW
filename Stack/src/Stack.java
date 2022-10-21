public class Stack<T> {
    private StackNode<T> lastNode;
    private int length = 0;

    public void add(T value) {
        if (this.lastNode == null) {
            this.lastNode = new StackNode<>(value);
        } else {
            StackNode<T> node = new StackNode<>(value);
            node.setPrev(this.lastNode);
            this.lastNode = node;
        }

        ++this.length;
    }

    public T peek() {
        return this.lastNode == null ? null : this.lastNode.getValue();
    }

    public boolean contains(T value) {
        if (this.lastNode == null) {
            return false;
        }

        StackNode<T> node = this.lastNode.findNode(value);
        return node != null && node.getValue() == value;
    }

    public T get(int idx) {
        return idx >= this.length ? null : this.lastNode.nth(idx).getValue();
    }

    public void remove(int idx) {
        if (idx >= this.length) {
            return;
        }

        if (idx == 0) {

            this.lastNode = this.lastNode.getPrev();
        } else {
            StackNode<T> priorNode = this.lastNode.nth(idx - 1);

            StackNode<T> targetNode = priorNode.getPrev();

            priorNode.setPrev(targetNode.getPrev());
        }

        --this.length;
    }
}
