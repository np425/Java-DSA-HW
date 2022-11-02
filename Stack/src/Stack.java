public class Stack<T> {
    private class Node {
        T value;
        Node prev;

        Node(T value) {
            this.value = value;
        }

        Node nth(int n) {
            if (n < 0) {
                return null;
            }

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

    public void push(T value) {
        Node node = new Node(value);
        node.prev = this.lastNode;
        this.lastNode = node;

        ++this.length;
    }

    public T pop() {
        if (this.lastNode == null){
            return null;
        }

        T value = this.lastNode.value;
        this.lastNode = this.lastNode.prev;
        --this.length;
        return value;
    }

    public T remove(int idx) {
        if (idx >= this.length) {
            return null;
        }

        T value;

        if (idx == 0) {
            value = this.lastNode.value;
            this.lastNode = this.lastNode.prev;
        } else {
            Node priorNode = this.lastNode.nth(idx - 1);
            if (priorNode == null) {
                return null;
            }

            Node targetNode = priorNode.prev;
            value = targetNode.value;

            priorNode.prev = targetNode.prev;
        }

        --this.length;
        return value;
    }

    public T peek() {
        return this.lastNode == null ? null : this.lastNode.value;
    }

    public boolean contains(T value) {
        if (this.lastNode == null) {
            return false;
        }

        Node node = this.lastNode.findNode(value);
        return node != null;
    }

    public T get(int idx) {
        if (idx >= this.length) {
            return null;
        }

        Node node = this.lastNode.nth(idx);
        return node == null ? null : node.value;
    }

}
