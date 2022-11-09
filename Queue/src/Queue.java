public class Queue<T> {
    private class Node {
        Node prev;
        Node next;
        T data;

        private Node(T data) {
            this.data = data;
        }

        private void setPrev(Node prev) {
            prev.next = this;
            this.prev = prev;
        }

        private void setNext(Node next) {
            next.prev = this;
            this.next = next;
        }

        public Node unlinkNeighbours() {
            if (this.prev != null) {
                this.prev.next = this.next;
            }

            if (this.next != null) {
                this.next.prev = this.prev;
            }

            return this;
        }

        public Node nthNode(int idx) {
            Node node = this;

            int i = 0;
            while (i < idx && node != null) {
                node = node.next;
                i = i + 1;
            }

            return node;
        }
    }

    Node firstNode;
    Node lastNode;
    int length;

    public Queue() {
        this.firstNode = null;
        this.lastNode = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int count() {
        return this.length;
    }

    // enQueue, deQueue, isEmpty, printReverse, count, add(idx), remove(idx)
    public void enQueue(T data) {
        Node node = new Node(data);

        if (this.lastNode != null) {
            node.setPrev(this.lastNode);
        }

        this.lastNode = node;
        this.length = this.length + 1;

        // If firstNode is empty, that means prior data addition the queue was empty,
        // and now the last node is also the first node
        if (this.firstNode == null) {
            this.firstNode = this.lastNode;
        }
    }

    public T deQueue() {
        if (isEmpty()) {
            return null;
        }

        T data = this.firstNode.data;

        // If length is 1, lastNode will be looking at firstNode, and to remove the first node no references
        // must be looking at the node (including lastNode)
        if (this.length == 1) {
            this.lastNode = null;
        }

        this.firstNode = this.firstNode.unlinkNeighbours().next;
        this.length = this.length - 1;

        return data;
    }

    public void printReverse() {
        Node node = this.lastNode;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.prev;
        }

        System.out.println();
    }

    // If index exceeds queue length, adds element to the end
    public void add(T data, int idx) {
        Node node = new Node(data);
        this.length = this.length + 1;

        Node prev = null;
        Node next = null;

        if (idx <= 0) {
            next = this.firstNode;
        } else  if (idx >= this.length - 1) {
            prev = this.lastNode;
        } else {
            prev = this.firstNode.nthNode(idx-1);
            next = prev != null ? prev.next : null;
        }

        if (prev != null) {
            node.setPrev(prev);
        } else {
            this.firstNode = node;
        }

        if (next != null) {
            node.setNext(next);
        } else {
            this.lastNode = node;
        }
    }

    public void remove(int idx) {
        if (idx >= this.length) {
            return;
        }

        Node node = this.firstNode.nthNode(idx).unlinkNeighbours();
        this.length = this.length - 1;

        // If node is first in the queue, update firstNode
        if (node.prev == null) {
            this.firstNode = node.next;
        }

        // If node is last in the queue, update lastNode
        if (node.next == null) {
            this.lastNode = node.prev;
        }
    }
}
