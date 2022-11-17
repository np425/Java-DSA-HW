public class BinarySingleValueTree<T extends Comparable<T>, N extends Node<T>> {
    private N root;
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

    private void print(N node) {
        if (node == null) {
            return;
        }

        print(node.getLower());

        System.out.println(node);

        print(node.getHigher());
    }

    private N add(T data, N node) {
        if (node == null) {
            this.length = this.length + 1;
            return new N(data);
        }

        int cmp = data.compareTo(node.getValue());

        if (cmp < 0) {
            node.setLower(this.add(data, (N) node.getLower()));
        } else if (cmp > 0) {
            node.setHigher(this.add(data, node.getHigher()));
        } else {
            node.setValue(data);
        }

        return node;
    }


    private N remove(T data, N node) {
        if (node == null) {
            return null;
        }

        int cmp = data.compareTo(node.getValue());

        if (cmp < 0) {
            node.setLower(this.remove(data, node.getLower()));
        } else if (cmp > 0) {
            node.setHigher(this.remove(data, node.getHigher()));
        } else {
            this.length = this.length - 1;
            node.removeValue();

            if (node.hasValue()) {
                return node;
            }

            if (node.getHigher() == null) {
                return node.getLower();
            }

            if (node.getLower() == null) {
                return node.getHigher();
            }

            node.setValue(lowestValue(root.getHigher()));
            root.setHigher(remove(node.getValue(), root.getHigher()));
        }

        return node;
    }

    private T lowestValue(N node) {
        if (node == null) {
            return null;
        }

        while (node.getLower() != null) {
            node = node.getLower();
        }

        return node.getValue();
    }
}
