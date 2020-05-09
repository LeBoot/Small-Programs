/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigma2.security;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class EnigmaTest {
    
    Enigma enigma = new Enigma();
    
    public EnigmaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /*
    ENCRYPT STRING =============================================================
    */
    @Test //Exception, too short
    public void testEncryptString_1() {
        String input = "";
        try {
            enigma.encryptString(input);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    
    @Test //Exception, too long
    public void testEncryptString_2() {
        String tenCharacters = "0123456789";
        String input = "";
        for (int i = 1; i <= 10; i++) {
            input += tenCharacters;
        }
        
        try {
            enigma.encryptString(input);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    
    @Test //Exception, bad character
    public void testEncryptString_3() {
        String input = "^";
        try {
            enigma.encryptString(input);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    
    @Test //Exception, bad character
    public void testEncryptString_4() {
        String input = ">";
        try {
            enigma.encryptString(input);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    
    @Test //Exception, bad character
    public void testEncryptString_5() {
        String input = "}";
        try {
            enigma.encryptString(input);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    
    @Test //Exception, bad character
    public void testEncryptString_6() {
        String input = "\"";
        try {
            enigma.encryptString(input);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    
    @Test //Exception, bad character
    public void testEncryptString_7() {
        String input = " ";
        try {
            enigma.encryptString(input);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    
    @Test //Length of output should be 64
    public void testEncryptString_8() {
        String input = "hello";
        try {
            String[] output = enigma.encryptString(input);
            assertEquals(64, output[0].length());
        } catch (Exception e) {
            fail("Exception thrown unexpectedly: " + e.getMessage());
        }
    }
    
    @Test //Length of output should be 64
    public void testEncryptString_9() {
        String input = "hello";
        try {
            String[] outputA = enigma.encryptString(input);
            String[] output = enigma.encryptString(outputA[0]);
            assertEquals(64, output[0].length());
        } catch (Exception e) {
            fail("Exception thrown unexpectedly: " + e.getMessage());
        }
    }

    /*
    MATCH STRING TO ENCRYPTED STRING ===========================================
    */
    @Test
    public void testMatchStringToEncryptedString_1() {
        try {
            String input = "hello";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(true, enigma.matchStringToEncryptedString(encrypted[0], input, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test
    public void testMatchStringToEncryptedString_2() {
        try {
            String input = "s0meComplicaTTEd49283$$";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(true, enigma.matchStringToEncryptedString(encrypted[0], input, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test
    public void testMatchStringToEncryptedString_3() {
        try {
            String input = "h";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(true, enigma.matchStringToEncryptedString(encrypted[0], input, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test
    public void testMatchStringToEncryptedString_4() {
        try {
            String input = "kKLDdkudkePOOI537#";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(true, enigma.matchStringToEncryptedString(encrypted[0], input, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test
    public void testMatchStringToEncryptedString_5() {
        try {
            String input = "0123456";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(true, enigma.matchStringToEncryptedString(encrypted[0], input, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test
    public void testMatchStringToEncryptedString_6() {
        try {
            String input = "0123456";
            String input2 = "kslkj;";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(false, enigma.matchStringToEncryptedString(encrypted[0], input2, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test
    public void testMatchStringToEncryptedString_7() {
        try {
            String input = "0123456";
            String input2 = "012345";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(false, enigma.matchStringToEncryptedString(encrypted[0], input2, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test
    public void testMatchStringToEncryptedString_8() {
        try {
            String input = "0123456";
            String input2 = " ";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(false, enigma.matchStringToEncryptedString(encrypted[0], input2, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test
    public void testMatchStringToEncryptedString_9() {
        try {
            String input = "0123456";
            String input2 = "^";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(false, enigma.matchStringToEncryptedString(encrypted[0], input2, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test
    public void testMatchStringToEncryptedString_10() {
        try {
            String input = "0123456";
            String input2 = "01010101>01010101";
            String[] encrypted = enigma.encryptString(input);
            assertEquals(false, enigma.matchStringToEncryptedString(encrypted[0], input2, encrypted[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }

    /**
     * Test of decryptString method, of class Enigma.
     */
    @Test
    public void testDecryptString() {
    }

    /*
    GENERATE KEY and DISSECT KEY ===============================================
    */
    @Test //Testing only the exception here
    public void testGenerateNewKeyANDtestDissectKey_1() {
        String input = "test";
        String key = enigma.generateNewKey(input);
        
        try {
            int[] keyAr = enigma.dissectKey(key);
        } catch (InvalidKeyException ex) {
            fail("Generated Key is not valid in dissection method");
        }
    }
    
    @Test //Testing number of tokens in key
    public void testGenerateNewKeyANDtestDissectKey_2() {
        String input = "test";
        String key = enigma.generateNewKey(input);
        
        try {
            int[] keyAr = enigma.dissectKey(key);
            assertEquals(65, keyAr.length);
        } catch (InvalidKeyException ex) {
            fail("Generated Key is not valid in dissection method");
        } 
    }
    
    @Test //Testing first key should be length of input
    public void testGenerateNewKeyANDtestDissectKey_3() {
        String input = "test";
        String key = enigma.generateNewKey(input);
        
        try {
            int[] keyAr = enigma.dissectKey(key);
            assertEquals(input.length(), keyAr[0]);
        } catch (InvalidKeyException ex) {
            fail("Generated Key is not valid in dissection method");
        } 
    }

    
}
