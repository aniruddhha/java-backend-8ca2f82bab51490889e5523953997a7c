import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import singleton.CarSingleton;

public class CarSingletonTest {

    @DisplayName("Check Car Instance is Singleton")
    @Test
    void testCarSingleton() {
       var c1 =  CarSingleton.newInstance();
       var c2 = CarSingleton.newInstance();

        Assertions.assertEquals(
                c1.hashCode(),
                c2.hashCode()
        );
    }
}
