public class Main {
    public static void tryOutTree(BinaryTree<Integer> tree) {
        tree.add(5);
        tree.add(8);
        tree.add(2);
        tree.add(9);
        tree.add(5);
        tree.add(9);
        tree.add(5);

        System.out.println("After addition: ");
        tree.print();

        System.out.println("After removal: ");
        tree.remove(5);
        tree.remove(5);
        tree.remove(9);

        tree.print();
    }

    public static void main(String[] args) {
        System.out.println("-- Single value binary tree --");
        tryOutTree(new BinarySingleValueTree<>());

        System.out.println("-- Multi value binary tree --");
        tryOutTree(new BinaryMultiValueTree<>());
    }
}