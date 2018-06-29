import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void setUp() throws Exception {
        drumSticks = new DrumSticks("type of percussion mallet used for playing a percussion instrument", 10, 15);
    }

    @Test
    public void testCalculateProfit() {
        assertEquals(5, drumSticks.calculateProfit());

    }
}
