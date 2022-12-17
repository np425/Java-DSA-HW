public class Main {
    public static void main(String[] args) {
        FixedSizeHashSet<String> set = new FixedSizeHashSet<>(16);

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

        printHashSet(set);

        System.out.println("Zilvinas is in set: " + set.contains("Zilvinas"));

        set.remove("Zilvinas");

        printHashSet(set);

        System.out.println("Zilvinas is in set: " + set.contains("Zilvinas"));
    }

    private static void printHashSet(FixedSizeHashSet<?> set) {
        System.out.println("------------------ Set items list beginning");

        for (Object e : set.getItems()) {
            if (e == null) {
                System.out.println("NULL");
                continue;
            }
            System.out.println(e);
        }

        System.out.println("------------------ Set items list end");
    }

}