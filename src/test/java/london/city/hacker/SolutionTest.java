package london.city.hacker;

import kata.LondonCityHacker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void fixedTests() {
        
        assertEquals("£7.80", LondonCityHacker.londonCityHacker(new Object[] {12, "Central", "Circle", 21}));
        assertEquals("£3.90", LondonCityHacker.londonCityHacker(new Object[] {"Piccidilly", 56}));
        assertEquals("£7.20", LondonCityHacker.londonCityHacker(new Object[] {"Northern", "Central", "Circle"}));
        assertEquals("£5.40", LondonCityHacker.londonCityHacker(new Object[] {"Piccidilly", 56, 93, 243}));
        assertEquals("£3.00", LondonCityHacker.londonCityHacker(new Object[] {386, 56, 1, 876}));
        assertEquals("£6.90", LondonCityHacker.londonCityHacker(new Object[] {386, 56, 1, 876,155,"Picadilly"}));
        assertEquals("£8.40", LondonCityHacker.londonCityHacker(new Object[] {386, 56, 1, 876,155,"Picadilly",255}));
        assertEquals("£0.00", LondonCityHacker.londonCityHacker(new Object[0]));
    }
}

