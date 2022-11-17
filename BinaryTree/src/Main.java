public class Main {
    public static void main(String[] args) {
        BinarySingleValueTree<Integer> tree = new BinarySingleValueTree<>();
        tree.add(5);
        tree.add(8);
        tree.add(2);
        tree.add(9);
        tree.add(5);
        tree.add(9);
        tree.add(5);

        tree.remove(5);

        tree.print();
    }
}