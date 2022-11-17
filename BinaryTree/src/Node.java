public interface Node<T> {
    T getValue();
    void setValue(T value);
    void removeValue();
    boolean hasValue();
    Node<T> getLower();
    Node<T> getHigher();
    void setLower(Node<T> node);
    void setHigher(Node<T> node);
}
