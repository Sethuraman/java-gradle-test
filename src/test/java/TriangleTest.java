import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void shouldReturn11AsThePerimeterForSides4_4_3() {
        assertEquals(11, new Triangle(4, 4, 3).perimeter());
    }

    @Test
    public void shouldReturnTrueForARightAngledTriangleWithSides3_4_5() {
        assertTrue(new Triangle(3, 4, 5).isRightAngled());
    }

    @Test
    public void shouldReturnFalseForANonRightAngledTriangleWithSides2_4_5() {
        assertFalse(new Triangle(2, 4, 5).isRightAngled());
    }

    @Test
    public void shouldReturnTrueARightAngledTriangleWithSides5_4_3() {
        assertFalse(new Triangle(5, 4, 3).isRightAngled());
    }

}