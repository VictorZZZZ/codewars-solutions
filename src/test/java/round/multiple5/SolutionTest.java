package round.multiple5;

import kata.roundtonextmultiple5.RoundToTheNextMultipleOf5;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        int[][] arr = {
                {0, 0},
                {1, 5},
                {3, 5},
                {5, 5},
                {7, 10},
                {39, 40},
                {-2,0},
                {-6,-5},
                {-52,-50}
        };
        Arrays.stream(arr)
                .forEach(
                        (testCase) -> {
                            System.out.println(testCase[0]+ " - "+testCase[1]);
                            assertEquals(
                                    "Input: " + testCase[0],
                                    testCase[1],
                                    RoundToTheNextMultipleOf5.roundToNext5(testCase[0]));
                        });
    }
}
