import behaviours.IPlay;
import instruments.Guitar;
import instruments.Material;
import instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Blue", Type.STRINGS, Material.WOOD, 10, 50, "Bang", 4);
    }

    @Test
    public void canMakeSound() {
        assertEquals("Bang", guitar.makeSound());
    }

    @Test
    public void canGetMarkupPrice() {
        assertEquals(40, guitar.calculateMarkup(), 0.1);
    }
}
