public class Stack<T> {
    private class Node {
        T value;
        Node prev;

        Node(T value) {
            this.value = value;
        }

        Node nth(int n) {
            Node node = this;
            int i = 0;

            while (i < n && node != null) {
                node = node.prev;
                ++i;
            }

            return node;
        }

        Node findNode(T value) {
            Node node = this;

            while (node != null && node.value != value) {
                node = node.prev;
            }

            return node;
        }
    }

    private Node lastNode = null;
    private int length = 0;

    public void add(T value) {
        if (this.lastNode != null) {
            Node node = new Node(value);
            node.prev = this.lastNode;
            this.lastNode = node;
        } else {
            this.lastNode = new Node(value);
        }

        ++this.length;
    }

    public void remove(int idx) {
        if (idx >= this.length) {
            return;
        }

        if (idx != 0) {
            Node priorNode = this.lastNode.nth(idx - 1);
            Node targetNode = priorNode.prev;

            priorNode.prev = targetNode.prev;
        } else {
            this.lastNode = this.lastNode.prev;
        }

        --this.length;
    }

    public T peek() {
        return this.lastNode == null ? null : this.lastNode.value;
    }

    public boolean contains(T value) {
        if (this.lastNode == null) {
            return false;
        }

        Node node = this.lastNode.findNode(value);
        return node != null && node.value == value;
    }

    public T get(int idx) {
        return idx >= this.length ? null : this.lastNode.nth(idx).value;
    }

}
