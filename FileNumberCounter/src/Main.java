import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "input.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));

        int even = 0, odd = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        }

        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}