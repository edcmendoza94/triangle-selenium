import junit.framework.TestCase;

public class TriangleTest extends TestCase {
    public void testConstructor() {
        Triangle illuminati = new Triangle(3,5,7);

        assertTrue(illuminati.getSideA() == 3);
        assertTrue(illuminati.getSideB() == 5);
        assertTrue(illuminati.getSideC() == 7);
    }

    public void testIsValid() {
        Triangle illuminati = null;

        illuminati = new Triangle(-5, 3, 7);
        assertFalse(illuminati.isValid());

        illuminati = new Triangle(3, 5, 7);
        assertTrue(illuminati.isValid());
    }

    public void testAllNotEqual() {
        Triangle illuminati = null;

        illuminati = new Triangle(10, 5, 2);
        assertFalse(illuminati.allNotEqual());

        illuminati = new Triangle(5, 15, 2);
        assertFalse(illuminati.allNotEqual());

        illuminati = new Triangle(3,4, 7);
        assertFalse(illuminati.allNotEqual());

        illuminati = new Triangle(5, 6, 3);
        assertTrue(illuminati.allNotEqual());
    }
}
