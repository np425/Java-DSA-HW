public class Node<T extends Comparable<T>> {
    public Node<T> lower;
    public Node<T> higher;
    public T data;

    public Node(T data) {
        this.data = data;
    }
}
