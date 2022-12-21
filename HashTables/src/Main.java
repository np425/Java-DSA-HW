import java.util.stream.Collectors;

public class Main {
    private static final int SET_SIZE = 10;

    public static void main(String[] args) {
        FixedSizeHashSet<String> set = new FixedSizeHashSet<>(SET_SIZE);

        set.put("Labas");
        set.put("Viso");
        set.put("Vakaras");
        set.put("Naujas");
        set.put("Senas");
        set.put("Kazkas");
        set.put("Antanas");
        set.put("Petras");
        set.put("Gediminas");
        set.put("Jonas");
        set.put("Zilvinas");

        System.out.println("After adding elements:");
        printHashSet(set);

        System.out.println("Zilvinas is in set: " + set.contains("Zilvinas"));

        set.remove("Zilvinas");

        System.out.println("After removing elements:");
        printHashSet(set);

        System.out.println("Zilvinas is in set: " + set.contains("Zilvinas"));
    }

    private static <T> void printHashSet(FixedSizeHashSet<T> set) {
        System.out.println("-------------- Items in set beginning");

        // FIXME: Performance issues due to allocations for each inner list when producing comma delimited string
        // SOLUTION: Just print it out like a normal human being
        String delimitedItems = set.getItems()
                .stream()
                .map(list -> list.stream()
                        .map(T::toString)
                        .collect(Collectors.joining(", ")))
                .collect(Collectors.joining("\n"));

        System.out.println(delimitedItems);
        System.out.println("-------------- Items in set end");
    }

}
