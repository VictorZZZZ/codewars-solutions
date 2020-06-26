package reverse.words;

import kata.WordsReverse;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", WordsReverse.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", WordsReverse.reverseWords("apple"));
        assertEquals("a b c d", WordsReverse.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", WordsReverse.reverseWords("double  spaced  words"));
        assertEquals("    ", WordsReverse.reverseWords("    "));
    }
}
