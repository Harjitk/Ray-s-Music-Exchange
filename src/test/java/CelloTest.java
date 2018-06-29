import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {


    Cello cello;

    @Before
    public void setUp() throws Exception {
        cello = new Cello("Light Brown", "Violin", "Carved Wood", 48);
    }

    @Test
    public void getSize() {
        assertEquals(48, cello.getSize());
    }

    @Test
    public void canPlay(){
        assertEquals("Cello is playing", cello.play());
    }
}
