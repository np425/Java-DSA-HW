import java.util.Scanner;

public class SoundSignalBuilder {
    private final int[] soundArr;

    public SoundSignalBuilder(Scanner scanner) throws Exception {
        int soundCount = scanner.nextInt();
        if (soundCount <= 0) {
            throw new Exception("No given sound");
        }

        this.soundArr = readSound(scanner, soundCount);
    }

    private int[] readSound(Scanner scanner, int soundCount) {
        int[] soundSignal = new int[soundCount];

        for (int i = 0; i < soundCount; ++i) {
            int sound = scanner.nextInt();
            soundSignal[i] = sound;
        }

        return soundSignal;
    }

    public void average() {
        if (soundArr.length <= 1) {
            return;
        }

        // Left end of the signal
        soundArr[0] = (soundArr[0] + soundArr[1]) / 2;

        // Middle of the signal
        for (int i = 1; i < soundArr.length - 1; ++i) {
            soundArr[i] = (soundArr[i - 1] + soundArr[i] + soundArr[i + 1]) / 3;
        }

        // Right end of the signal
        soundArr[soundArr.length - 1] = (soundArr[soundArr.length - 2] + soundArr[soundArr.length - 1]) / 2;
    }

    public int[] getSoundArray() {
        return soundArr;
    }
}
