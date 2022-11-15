public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;
    private int length = 0;

    public void add(T data) {
        this.root = this.add(data, this.root);
    }

    public void remove(T data) {
        this.root = this.remove(data, this.root);
    }

    public int getLength() {
        return this.length;
    }

    public void print() {
        this.print(this.root);
    }

    private Node<T> add(T data, Node<T> node) {
        if (node == null) {
            this.length = this.length + 1;
            return new Node<>(data);
        }

        int cmp = data.compareTo(node.data);

        if (cmp < 0) {
            node.lower = this.add(data, node.lower);
        } else if (cmp > 0) {
            node.higher = this.add(data, node.higher);
        }

        return node;
    }

    private void print(Node<T> node) {
        if (node == null) {
            return;
        }

        print(node.lower);

        System.out.println(node.data);

        print(node.higher);
    }

    private Node<T> remove(T data, Node<T> node) {
        if (node == null) {
            return null;
        }

        int cmp = data.compareTo(node.data);

        if (cmp < 0) {
            node.lower = this.add(data, node.lower);
        } else if (cmp > 0) {
            node.higher = this.add(data, node.higher);
        } else {
            this.length = this.length - 1;
            return null;
        }

        return node;
    }

}
