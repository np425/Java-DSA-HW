public class Main {
    public static void main(String[] args) {
        TwoItems<String, Integer> items = new TwoItems<>("Test", 123);

        System.out.println(items);
    }
}