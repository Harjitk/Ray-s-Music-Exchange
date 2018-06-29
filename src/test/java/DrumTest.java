import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void SetUp(){
      drum = new Drum("Brown", "Percussion", "Wood", "Round");

    }

    @Test
    public void getColour() {
        assertEquals("Brown", drum.getColour());
    }

    @Test
    public void getType() {
        assertEquals("Percussion", drum.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", drum.getMaterial());
    }

    @Test
    public void getShape() {
        assertEquals("Round", drum.getShape());
    }

    @Test
    public void canPlay(){
        assertEquals("Drums are playing", drum.play());
    }
}


