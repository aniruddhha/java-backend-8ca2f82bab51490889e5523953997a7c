import exception.NumDivider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumDividerTests {

    @DisplayName("Test for complete numbers")
    @Test
    void testCompleteNumbers() {
        var dvDr = new NumDivider();
        var num1 = 10;
        var num2 = 10;
        var expected = 1;
        var actual = dvDr.divideNumbers(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Test for precision point numbers")
    @Test
    void testPrecisionNumbers() {
        var dvDr = new NumDivider();
        var num1 = 4.2;
        var num2 = 2.2;
        var expected = 1.9090;
        var actual = dvDr.divideNumbers(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Test for Unexpected Numbers")
    @Test
    void testUnexpectedNumbers() {
        var num1 = 4.5;
        var num2 = 0;

        var dvDr = new NumDivider();
        var expected = 0;
        var actual = dvDr.divideNumbers(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Testing Exceptions")
    @Test
    void testUnexpectedNumbersWithException() {
        var num1 = 4.5;
        var num2 = 0;

        Assertions.assertThrows(RuntimeException.class, () -> {
            var dvDr = new NumDivider();
            dvDr.divideNumbersException(num1, num2);
        });
    }
}
