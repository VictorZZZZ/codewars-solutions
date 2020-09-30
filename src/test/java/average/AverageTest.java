package average;

import kata.average.AverageMean;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageTest {

    @Test
    public void simpleTest() {
        assertEquals(2, AverageMean.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,AverageMean.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,AverageMean.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }

}
