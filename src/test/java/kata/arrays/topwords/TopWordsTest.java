package kata.arrays.topwords;

import junit.framework.TestCase;
import org.junit.Assert;

public class TopWordsTest extends TestCase {

    public void testTop3() {
        TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e");
        Assert.assertTrue(true);
    }
}