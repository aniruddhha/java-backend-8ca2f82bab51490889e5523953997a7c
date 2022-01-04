import clsobj.Bmw;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BmwTests {

    @DisplayName("Testing Object Nullability")
    @Test
    void testInValidObject() {
        Bmw bmw = null;
        Assertions.assertNull(bmw);
    }

    @DisplayName("Testing Object Validity")
    @Test
    void testValidObject() {
        Bmw bmw = new Bmw();

        Assertions.assertNotNull(bmw);

        int expectedSpeed = 10;
        int actualSpeed = bmw.speed;
        Assertions.assertEquals(expectedSpeed, actualSpeed);
    }
}
