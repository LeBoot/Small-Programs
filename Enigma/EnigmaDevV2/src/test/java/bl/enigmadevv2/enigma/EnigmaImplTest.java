/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigmadevv2.enigma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class EnigmaImplTest {
    
    Enigma enigma = new EnigmaImpl();
    
    public String buildString(int length, String myChar) {
        String output = "";
        for (int i = 1; i <= length; i++) {
            output += myChar;
        }
        return output;
    }

    /*
    doPasswordsMatch ===========================================================
    ----------------------------------------------------------------------------
    */
    @Test //Test repeats 100 times
    public void testDoPasswordsMatch_1() {
        for (int i = 0; i < 100; i++) {
            String input = "root";
            EnigmaEntity ee = null;

            try {
                ee = enigma.encryptPassword(input);
            } catch (EnigmaException ex) {
                fail(ex.getLocalizedMessage());
            }
            
            if (!enigma.doPasswordsMatch(input, ee)) {
                fail();
            }
            //assertTrue(enigma.doPasswordsMatch(input, ee));
        }
        assertTrue(true);
    }
    
    @Test
    public void testDoPasswordsMatch_2() {
        String input = "aaaa";
        String wrongPass = "aaa";
        EnigmaEntity ee = null;
        
        try {
            ee = enigma.encryptPassword(input);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
        
        assertFalse(enigma.doPasswordsMatch(wrongPass, ee));        
    }
    
    @Test
    public void testDoPasswordsMatch_3() {
        String input = "aaaa";
        String wrongPass = "aaaaa";
        EnigmaEntity ee = null;
        
        try {
            ee = enigma.encryptPassword(input);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
        
        assertFalse(enigma.doPasswordsMatch(wrongPass, ee));        
    }
    
    @Test
    public void testDoPasswordsMatch_4() {
        String input = "aaaa";
        String wrongPass = "abcd*";
        EnigmaEntity ee = null;
        
        try {
            ee = enigma.encryptPassword(input);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
        
        assertFalse(enigma.doPasswordsMatch(wrongPass, ee));        
    }
    
    @Test
    public void testDoPasswordsMatch_5() {
        String input = "aaaa";
        String wrongPass = "abcd edf";
        EnigmaEntity ee = null;
        
        try {
            ee = enigma.encryptPassword(input);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
        
        assertFalse(enigma.doPasswordsMatch(wrongPass, ee));        
    }
    
    @Test
    public void testDoPasswordsMatch_6() {
        String input = "aaaa";
        String wrongPass = " ";
        EnigmaEntity ee = null;
        
        try {
            ee = enigma.encryptPassword(input);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
        
        assertFalse(enigma.doPasswordsMatch(wrongPass, ee));        
    }
    
    @Test
    public void testDoPasswordsMatch_7() {
        String input = "aaaa";
        String wrongPass = "";
        EnigmaEntity ee = null;
        
        try {
            ee = enigma.encryptPassword(input);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
        
        assertFalse(enigma.doPasswordsMatch(wrongPass, ee));        
    }
    
    @Test
    public void testDoPasswordsMatch_8() {
        String input = "aaaa";
        String wrongPass = buildString(65, "u");
        EnigmaEntity ee = null;
        
        try {
            ee = enigma.encryptPassword(input);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
        
        assertFalse(enigma.doPasswordsMatch(wrongPass, ee));        
    }
    

    /*
    encryptPassword ============================================================
    ----------------------------------------------------------------------------
    */
    @Test //Input length zero --> Should fail
    public void testEncryptPassword_1() {
        String input = "";
        try {
            enigma.encryptPassword(input);
            fail("Exception not thrown.");
        } catch (EnigmaException ex) {
            assertTrue(true);
        }
    }
    
    @Test //Input length 3 --> Should fail
    public void testEncryptPassword_2() {
        String input = buildString(3, "a");
        try {
            enigma.encryptPassword(input);
            fail("Exception not thrown.");
        } catch (EnigmaException ex) {
            assertTrue(true);
        }
    }
    
    @Test //Input invalid character --> Should fail
    public void testEncryptPassword_3() {
        String input = "abcdefg*";
        try {
            enigma.encryptPassword(input);
            fail("Exception not thrown.");
        } catch (EnigmaException ex) {
            assertTrue(true);
        }
    }
    
    @Test //Input length 65 --> Should fail
    public void testEncryptPassword_4() {
        String input = buildString(65, "a");
        try {
            enigma.encryptPassword(input);
            fail("Exception not thrown.");
        } catch (EnigmaException ex) {
            assertTrue(true);
        }
    }
    
    @Test //Input length 4 --> Should succeed
    public void testEncryptPassword_5() {
        String input = buildString(4, "a");
        try {
            enigma.encryptPassword(input);
            assertTrue(true);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
    }
    
    @Test //Input length 63 --> Should succeed
    public void testEncryptPassword_6() {
        String input = buildString(63, "a");
        try {
            enigma.encryptPassword(input);
            assertTrue(true);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
    }
    
    @Test //Input length 30 --> Should succeed
    public void testEncryptPassword_7() {
        String input = buildString(30, "a");
        try {
            enigma.encryptPassword(input);
            assertTrue(true);
        } catch (EnigmaException ex) {
            fail(ex.getLocalizedMessage());
        }
    }
    
    @Test //Input with a space --> Should fail
    public void testEncryptPassword_8() {
        String input = "abcd edf";
        try {
            enigma.encryptPassword(input);
            fail("Exception not thrown.");
        } catch (EnigmaException ex) {
            assertTrue(true);
        }
    }
    
}
