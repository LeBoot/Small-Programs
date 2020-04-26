package bl.engimaprodv1.security;

import bl.engimaprodv1.security.exception.InvalidKeyException;
import bl.engimaprodv1.security.exception.InvalidPasswordException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class EnigmaTest {
    
    Enigma enigma = new Enigma();
    
    private String buildLength(int len) {
        String returnMe = "";
        for (int i = 1; i <= len; i++) {
            returnMe += "A";
        }
        return returnMe;
    }

    
    /*
    AUTOGENERATE PASSWORD ======================================================
    */
    @Test //minimum length should be 4
    public void testAutogeneratePassword_1() {
        int input = -1;
        assertEquals(4, enigma.autogeneratePassword(input).length());
    }
    
    @Test //minimum length should be 4
    public void testAutogeneratePassword_2() {
        int input = 0;
        assertEquals(4, enigma.autogeneratePassword(input).length());
    }
    
    @Test //minimum length should be 4
    public void testAutogeneratePassword_3() {
        int input = 3;
        assertEquals(4, enigma.autogeneratePassword(input).length());
    }
    
    @Test //length should be input length
    public void testAutogeneratePassword_4() {
        int input = 4;
        assertEquals(4, enigma.autogeneratePassword(input).length());
    }
    
    @Test //length should be input length
    public void testAutogeneratePassword_5() {
        int input = 5;
        assertEquals(input, enigma.autogeneratePassword(input).length());
    }
    
    @Test //length should be input length
    public void testAutogeneratePassword_6() {
        int input = 10;
        assertEquals(input, enigma.autogeneratePassword(input).length());
    }
    
    @Test //length should be input length
    public void testAutogeneratePassword_7() {
        int input = 15;
        assertEquals(input, enigma.autogeneratePassword(input).length());
    }
    
    @Test //length should be input length
    public void testAutogeneratePassword_8() {
        int input = 20;
        assertEquals(input, enigma.autogeneratePassword(input).length());
    }
    
    @Test //for inputs > 20, length should be 10
    public void testAutogeneratePassword_9() {
        int input = 21;
        assertEquals(10, enigma.autogeneratePassword(input).length());
    }
    
    @Test //password should be encryptable
    public void testAutogeneratePassword_10() {
        for (int i = 0; i < 100; i++) {
            String newPass = enigma.autogeneratePassword(i);
            try {
                enigma.encryptPassword(newPass);
            } catch (InvalidPasswordException | InvalidKeyException ex) {
                fail("Exception thrown unexpectedly: " + ex);
            }
        }
        assertTrue(true);
    }    
    
    
    /*
    ENCRYPT PASSWORD ===========================================================
    */
    @Test //throw exception for input of length 0
    public void testEncryptPassword_1() {
        String input = "";
        try {
            enigma.encryptPassword(input);
            fail("Did not catch exception.");
        } catch (InvalidPasswordException ex) {
            assertTrue(true);
        } catch (InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //do not throw exception for input of length 1
    public void testEncryptPassword_2() {
        String input = "A";
        try {
            enigma.encryptPassword(input);
            assertTrue(true);
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //throw exception for input of length 65
    public void testEncryptPassword_3() {
        String input = buildLength(65);
        try {
            enigma.encryptPassword(input);
            fail("Did not catch exception.");
        } catch (InvalidPasswordException ex) {
            assertTrue(true);
        } catch (InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //do not throw exception for input of length 64
    public void testEncryptPassword_4() {
        String input = buildLength(64);
        try {
            enigma.encryptPassword(input);
            assertTrue(true);
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //throw exception for invalid character
    public void testEncryptPassword_5() {
        String input = "abcd*";
        try {
            enigma.encryptPassword(input);
            fail("Did not catch exception.");
        } catch (InvalidPasswordException ex) {
            assertTrue(true);
        } catch (InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //throw exception for invalid character
    public void testEncryptPassword_6() {
        String input = "abcd>";
        try {
            enigma.encryptPassword(input);
            fail("Did not catch exception.");
        } catch (InvalidPasswordException ex) {
            assertTrue(true);
        } catch (InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //throw exception for invalid character
    public void testEncryptPassword_7() {
        String input = "ab cd";
        try {
            enigma.encryptPassword(input);
            fail("Did not catch exception.");
        } catch (InvalidPasswordException ex) {
            assertTrue(true);
        } catch (InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //do not throw exception for first valid character
    public void testEncryptPassword_8() {
        String input = "0000";
        try {
            enigma.encryptPassword(input);
            assertTrue(true);
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //do not throw exception for last valid character
    public void testEncryptPassword_9() {
        String input = "????";
        try {
            enigma.encryptPassword(input);
            assertTrue(true);
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //return encrypted password of length 64
    public void testEncryptPassword_10() {
        String input = "myPassword1!";
        try {
            String[] output = enigma.encryptPassword(input);
            assertEquals(64, output[0].length());
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //return key of length <200 and >130
    public void testEncryptPassword_11() {
        String input = "myPassword1!";
        try {
            for (int i = 0; i < 500; i++) {
                String[] output = enigma.encryptPassword(input);
                if (output[1].length() > 200) {
                    fail("Key length greater than 200");
                }
                if (output[1].length() < 130) {
                    fail("Key length less than than 130");
                }
                
            }            
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
        assertTrue(true);
    }
    
    @Test //key's first character should not be ":"
    public void testEncryptPassword_12() {
        String input = "myPassword1!";
        try {
            String[] output = enigma.encryptPassword(input);
            assertFalse(output[1].startsWith(":"));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //key's last character should not be ":"
    public void testEncryptPassword_13() {
        String input = "myPassword1!";
        try {
            String[] output = enigma.encryptPassword(input);
            assertFalse(output[1].endsWith(":"));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //key should contain ":"
    public void testEncryptPassword_14() {
        String input = "myPassword1!";
        try {
            String[] output = enigma.encryptPassword(input);
            assertTrue(output[1].contains(":"));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //encrypted password should not contain ":"
    public void testEncryptPassword_15() {
        String input = "myPassword1!";
        try {
            String[] output = enigma.encryptPassword(input);
            assertFalse(output[0].contains(":"));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    

    /*
    DOES PASSWORD MATCH ========================================================
    */
    @Test //Passwords should match
    public void testDoesPasswordMatch_1() {
        String password1 = "myPassword1!";
        String password2 = password1;
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertTrue(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //Passwords should match
    public void testDoesPasswordMatch_2() {
        String password1 = "m0R3EComplicAAteDPs5$#d";
        String password2 = password1;
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertTrue(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //Passwords should match
    public void testDoesPasswordMatch_3() {
        String password1 = "easy";
        String password2 = password1;
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertTrue(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //Passwords should not match
    public void testDoesPasswordMatch_4() {
        String password1 = "easy";
        String password2 = "Easy";
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertFalse(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //Passwords should not match
    public void testDoesPasswordMatch_5() {
        String password1 = "123";
        String password2 = "abc";
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertFalse(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //Passwords should not match
    public void testDoesPasswordMatch_6() {
        String password1 = "m0R3EComplicAAteDPs5$#d";
        String password2 = password1 + "8";
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertFalse(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //Passwords should not match
    public void testDoesPasswordMatch_7() {
        String password1 = "m0R3EComplicAAteDPs5$#d";
        String password2 = password1 + " ";
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertFalse(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //Passwords should not match
    public void testDoesPasswordMatch_8() {
        String password1 = "m0R3EComplicAAteDPs5$#d";
        String password2 = "";
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertFalse(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //Passwords should not match
    public void testDoesPasswordMatch_9() {
        String password1 = "m0R3EComplicAAteDPs5$#d";
        String password2 = "*>%";
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertFalse(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
    
    @Test //Passwords should not match
    public void testDoesPasswordMatch_10() {
        String password1 = "m0R3EComplicAAteDPs5$#d";
        String password2 = buildLength(65);
        
        try {
            String[] encryption = enigma.encryptPassword(password1);
            assertFalse(enigma.doesPasswordMatch(password2, encryption[0], encryption[1]));
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            fail("Exception thrown unexpectedly: " + ex);
        }
    }
}
