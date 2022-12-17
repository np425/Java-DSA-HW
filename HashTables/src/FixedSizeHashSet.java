public class FixedSizeHashSet<T> {
    Object[] items;

    public Object[] getItems() {
        return this.items;
    }

    // Recommended to use large buffer, so to avoid collisions, thus increasing performance dramatically
    public FixedSizeHashSet(int size) {
        items = new Object[size];
    }

    public void put(T value) {
        int idx = locateEmpty(value);

        // Found empty space
        if (idx < this.items.length) {
            this.items[idx] = value;
        }
        // Otherwise, we couldn't find a place for our value ;(
    }

    public boolean contains(T value) {
        // At this point we either found the value or we iterated past the array bounds
        return locateExisting(value) < this.items.length;
    }

    public void remove(T value) {
        int idx = locateExisting(value);

        // At this point we either found the value or we iterated past the array bounds
        if (idx < this.items.length) {
            this.items[idx] = null;
        }
    }

    private int locateEmpty(T value) {
        int idx = this.getHash(value, this.items.length);

        // Attempt to find an empty space from this point onwards to the right
        while (idx < this.items.length && this.items[idx] != null) {
            idx = idx + 1;
        }

        return idx;
    }

    private int locateExisting(T value) {
        int idx = this.getHash(value, this.items.length);

        // Attempt to find the value from this point onwards to the right
        while (idx < this.items.length && (this.items[idx] == null || !this.items[idx].equals(value))) {
            idx = idx + 1;
        }

        return idx;
    }

    private int getHash(T value, int size) {
        return Math.abs(value.hashCode()) % size;
    }
}
