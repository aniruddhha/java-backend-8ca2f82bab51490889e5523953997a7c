import db.Connectivity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectivityTests {

    @DisplayName("Testing database connection")
    @Test
    void testConnectivity() {
        Assertions.assertDoesNotThrow( () -> {
            Connectivity con = new Connectivity();
            Assertions.assertNotNull(con.getConnection());
        });
    }
}
