import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, plane.getCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(80000, plane.getTotalWeight());
    }
}
