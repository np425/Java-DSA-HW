import java.io.File;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "input.txt";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        SoundSignalBuilder signalBuilder = new SoundSignalBuilder(scanner);
        signalBuilder.average();
        int[] soundArray = signalBuilder.getSoundArray();
        for (int sound : soundArray) {
            System.out.print(sound + " ");
        }
    }
}