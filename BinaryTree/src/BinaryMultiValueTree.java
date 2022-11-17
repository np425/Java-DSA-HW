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

    private void print(NodeMultiValue<T> node) {
        if (node == null) {
            return;
        }

        print(node.lower);

        System.out.println(node);

        print(node.higher);
    }

    private NodeMultiValue<T> add(T value, NodeMultiValue<T> node) {
        if (node == null) {
            this.length = this.length + 1;
            return new NodeMultiValue<>(value);
        }

        int cmp = value.compareTo(node.getValue());

        if (cmp < 0) {
            node.lower = this.add(value, node.lower);
        } else if (cmp > 0) {
            node.higher = this.add(value, node.higher);
        } else {
            node.setValue(value);
        }

        return node;
    }


    private NodeMultiValue<T> remove(T value, NodeMultiValue<T> node) {
        if (node == null) {
            return null;
        }

        T nodeValue = node.getValue();
        int cmp = value.compareTo(nodeValue);

        if (cmp < 0) {
            node.lower = this.remove(value, node.lower);
        } else if (cmp > 0) {
            node.higher = this.remove(value, node.higher);
        } else {
            this.length = this.length - 1;

            node.removeValue();
            if (node.getLength() > 0) {
                return node;
            }

            if (node.higher == null) {
                return node.lower;
            }

            if (node.lower == null) {
                return node.higher;
            }

            NodeMultiValue<T> lowestNode = lowestNode(root.higher);
            node.setValue(lowestNode.getValue());
            node.setLength(lowestNode.getLength());

            root.higher = remove(nodeValue, root.higher);
        }

        return node;
    }

    private NodeMultiValue<T> lowestNode(NodeMultiValue<T> node) {
        if (node == null) {
            return null;
        }

        while (node.lower != null) {
            node = node.lower;
        }

        return node;
    }
}
