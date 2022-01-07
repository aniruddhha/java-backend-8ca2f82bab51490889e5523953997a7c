import factory.Atm;
import factory.CardProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class AtmTests {

    @Test
    void testAtmSwipe() {
        Atm atm = new Atm();
        CardProvider provider = atm.swipe("pqr");
        Assertions.assertEquals("pqr", provider.getBank());
    }
}
