package kata;

import java.util.Arrays;


public class AverageMean {
    public static int getAverage(int[] marks) {
        return (int) Arrays.stream(marks).average().getAsDouble();
    }
}
