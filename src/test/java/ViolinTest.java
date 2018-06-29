import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void setUp() throws Exception {
        violin = new Violin("Black", "Violin", "Wood", 4);
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Violin is playing", violin.play());
    }


}
