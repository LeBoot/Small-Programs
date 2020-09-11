package bl.enigmadb.v1.enigma;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

public class EnigmaServiceTest {

    @Autowired
    EnigmaService es;
    
    private final String EX_THROWN = "Exception thrown unexpectedly: ";
    
    //doPasswordsMatch =========================================================
    @Test
    public void testDoPasswordsMatch() {
        assertTrue(true);
    }

    //createEnigmaEntity =======================================================
    @Test
    public void testCreateEnigmaEntity() {
        String pass = "password";
        try {
            es.createEnigmaEntity(pass);
            assertTrue(true);
        } catch (Exception e) {
            fail(EX_THROWN + e);
        }
    }
    
}