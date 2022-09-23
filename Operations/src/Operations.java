import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point a = InputReader.readPoint(scanner, "1");
        Point b = InputReader.readPoint(scanner, "2");

        Rectangle rect = new Rectangle(a, b);

        System.out.println("s=" + rect.getArea());
        System.out.println("p=" + rect.getPerimeter());
    }
}