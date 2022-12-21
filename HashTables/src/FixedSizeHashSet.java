import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FixedSizeHashSet<T> {
    List<LinkedList<T>> items;

    public List<LinkedList<T>> getItems() {
        return this.items;
    }

    // Recommended to use large buffer, so to avoid collisions, thus increasing performance dramatically
    public FixedSizeHashSet(int size) {
        this.items = Stream.generate(LinkedList<T>::new)
                .limit(size)
                .collect(Collectors.toList());
    }

    public void put(T data) {
        int idx = getHash(data, this.items.size());
        this.items.get(idx).addLast(data);
    }

    public boolean contains(T data) {
        int idx = getHash(data, this.items.size());
        return this.items.get(idx).contains(data);
    }

    public void remove(T data) {
        int idx = getHash(data, this.items.size());
        this.items.get(idx).remove(data);
    }

    private int getHash(T value, int size) {
        return Math.abs(value.hashCode()) % size;
    }
}
