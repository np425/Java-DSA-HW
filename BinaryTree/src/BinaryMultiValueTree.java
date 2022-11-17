public class BinaryMultiValueTree<T extends Comparable<T>> implements BinaryTree<T> {
    private NodeMultiValue<T> root;
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

    private NodeMultiValue<T> add(T data, NodeMultiValue<T> node) {
        if (node == null) {
            this.length = this.length + 1;
            return new NodeMultiValue<>(data);
        }

        int cmp = data.compareTo(node.value);

        if (cmp < 0) {
            node.lower = this.add(data, node.lower);
        } else if (cmp > 0) {
            node.higher = this.add(data, node.higher);
        } else {
            node.addValue(data);
        }

        return node;
    }


    private NodeSingleValue<T> remove(T data, NodeSingleValue<T> node) {
        if (node == null) {
            return null;
        }

        int cmp = data.compareTo(node.value);

        if (cmp < 0) {
            node.lower = this.remove(data, node.lower);
        } else if (cmp > 0) {
            node.higher = this.remove(data, node.higher);
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
