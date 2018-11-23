import instruments.Drums;
import instruments.Instrument;
import instruments.Material;
import instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void setUp() throws Exception {
        drums = new Drums ("Black", Type.PERCUSSION, Material.STEEL, 50, 220, "Bang!");
    }

    @Test
    public void canGetDrumMarkup() {
        assertEquals(34, drums.calculateMarkup(), 0.1);
    }
}
