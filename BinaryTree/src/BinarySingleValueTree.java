public class BinarySingleValueTree<T extends Comparable<T>> implements BinaryTree<T> {
    private NodeSingleValue<T> root;
    private int length = 0;

    public void add(T data) {
        this.root = add(data, this.root);
    }

    public void remove(T data) {
        this.root = remove(data, this.root);
    }

    public int count() {
        return this.length;
    }

    public void print() {
        this.print(this.root);
    }

    private void print(NodeSingleValue<T> node) {
        if (node == null) {
            return;
        }

        print(node.lower);

        System.out.println(node);

        print(node.higher);
    }

    private NodeSingleValue<T> add(T value, NodeSingleValue<T> node) {
        if (node == null) {
            this.length = this.length + 1;
            return new NodeSingleValue<>(value);
        }

        int cmp = value.compareTo(node.value);

        if (cmp < 0) {
            node.lower = this.add(value, node.lower);
        } else if (cmp > 0) {
            node.higher = this.add(value, node.higher);
        }

        return node;
    }


    private NodeSingleValue<T> remove(T value, NodeSingleValue<T> node) {
        if (node == null) {
            return null;
        }

        int cmp = value.compareTo(node.value);

        if (cmp < 0) {
            node.lower = this.remove(value, node.lower);
        } else if (cmp > 0) {
            node.higher = this.remove(value, node.higher);
        } else {
            this.length = this.length - 1;

            if (node.higher == null) {
                return node.lower;
            }

            if (node.lower == null) {
                return node.higher;
            }

            node.value = lowestValue(root.higher);
            root.higher = remove(node.value, root.higher);
        }

        return node;
    }

    private T lowestValue(NodeSingleValue<T> node) {
        if (node == null) {
            return null;
        }

        while (node.lower != null) {
            node = node.lower;
        }

        return node.value;
    }
}
